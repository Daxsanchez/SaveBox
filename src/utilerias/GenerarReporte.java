package utilerias;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import modelos.Prestamo;
import modelos.Socio;

/**
 *
 * @author daxsa
 */
public class GenerarReporte extends Thread {

    private String nombre;
    private Prestamo prestamo;

    public GenerarReporte(String nombre, Prestamo p) {
        this.nombre = nombre;
        prestamo = p;
    }

    @Override
    public void run() {
        try {
            generarPDF();
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Reporte " + nombre + " generado exitosamente.");
    }

public void generarPDF() {
    Document documento = new Document();
    String rutaArchivo = obtenerRuta();
    try {
        // Crear archivo
        PdfWriter writer = PdfWriter.getInstance(documento, new FileOutputStream(rutaArchivo));
        documento.open();

        // Agregar un encabezado empresarial
        Paragraph encabezado = new Paragraph("Reporte Empresarial de Préstamos", 
                FontFactory.getFont(FontFactory.HELVETICA_BOLD, 20, BaseColor.BLUE));
        encabezado.setAlignment(Paragraph.ALIGN_CENTER);
        documento.add(encabezado);

        // Espacio después del encabezado
        documento.add(new Paragraph("\n"));

        // Subtítulo
        Paragraph subtitulo = new Paragraph("Detalles del Préstamo", 
                FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14, BaseColor.DARK_GRAY));
        subtitulo.setAlignment(Paragraph.ALIGN_LEFT);
        documento.add(subtitulo);

        // Espacio después del subtítulo
        documento.add(new Paragraph("\n"));

        // Crear tabla para el contenido
        PdfPTable tabla = new PdfPTable(2); // Dos columnas
        tabla.setWidthPercentage(100); // Ancho completo
        tabla.setSpacingBefore(10f);
        tabla.setSpacingAfter(10f);

        // Encabezados de la tabla
        com.itextpdf.text.Font headerFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.WHITE);
        PdfPCell celdaEncabezado;

        celdaEncabezado = new PdfPCell(new Phrase("Campo", headerFont));
        celdaEncabezado.setBackgroundColor(BaseColor.DARK_GRAY);
        celdaEncabezado.setHorizontalAlignment(Element.ALIGN_CENTER);
        tabla.addCell(celdaEncabezado);

        celdaEncabezado = new PdfPCell(new Phrase("Valor", headerFont));
        celdaEncabezado.setBackgroundColor(BaseColor.DARK_GRAY);
        celdaEncabezado.setHorizontalAlignment(Element.ALIGN_CENTER);
        tabla.addCell(celdaEncabezado);

        // Contenido de la tabla
        agregarCelda(tabla, "Nombre del Socio", prestamo.getSocio().getNombre() + " " + prestamo.getSocio().getApellidos());
        agregarCelda(tabla, "Monto del Préstamo", String.valueOf(prestamo.getMonto()));
        agregarCelda(tabla, "Usuario que aprobó", prestamo.getUsuario().getNombre());
        agregarCelda(tabla, "Tasa de Intereses", String.valueOf((char) prestamo.getIntereses()));
        agregarCelda(tabla, "Fecha de Aprobación", prestamo.getFechaAprobacion().toString());
        // Agregar tabla al documento
        documento.add(tabla);

        // Agregar pie de página
        Paragraph pie = new Paragraph("Este documento es confidencial y propiedad de la empresa.",
                FontFactory.getFont(FontFactory.HELVETICA, 10, BaseColor.GRAY));
        pie.setAlignment(Paragraph.ALIGN_CENTER);
        documento.add(pie);

        // Cerrar el documento
        documento.close();
        writer.close();
        System.out.println("Reporte PDF generado con éxito en: " + rutaArchivo);
    } catch (FileNotFoundException e) {
        System.out.println("Error al crear el archivo PDF: " + e.getMessage());
    } catch (DocumentException e) {
        System.out.println("Error al crear el documento: " + e.getMessage());
    }
}

// Método para agregar celdas a la tabla
private void agregarCelda(PdfPTable tabla, String campo, String valor) {
        com.itextpdf.text.Font font = FontFactory.getFont(FontFactory.HELVETICA, 12);

    PdfPCell celdaCampo = new PdfPCell(new Phrase(campo, font));
    celdaCampo.setHorizontalAlignment(Element.ALIGN_LEFT);
    celdaCampo.setVerticalAlignment(Element.ALIGN_MIDDLE);
    celdaCampo.setPadding(5);
    tabla.addCell(celdaCampo);

    PdfPCell celdaValor = new PdfPCell(new Phrase(valor, font));
    celdaValor.setHorizontalAlignment(Element.ALIGN_LEFT);
    celdaValor.setVerticalAlignment(Element.ALIGN_MIDDLE);
    celdaValor.setPadding(5);
    tabla.addCell(celdaValor);
}


    private String obtenerRuta() {
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Guardar PDF");
        chooser.setSelectedFile(new java.io.File(nombre + ".pdf"));

        int userSelection = chooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            return chooser.getSelectedFile().getAbsolutePath();
        }
        return null;
    }
}
