package utilerias;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import modelos.Socios;

/**
 *
 * @author daxsa
 */
public class GenerarReporte extends Thread {

    private String nombre;
    private ArrayList<Socios> datos;

    public GenerarReporte(String nombre, ArrayList<Socios> datos) {
        this.nombre = nombre;
        this.datos = datos;
    }

    @Override
    public void run() {
        try {
            generarPDF();
            Thread.sleep(3000);// Simula reporte pesado
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
            PdfWriter.getInstance(documento, new FileOutputStream(rutaArchivo));
            documento.open();
            // Título
            documento.add(new Paragraph("Reporte de Datos"));

            for (Socios socio : datos) {
                StringBuilder sb = new StringBuilder();
                sb.append("Nombre: ").append(socio.getNombre()).append(" ")
                        .append(", Edad: ").append(socio.getEdad());
                // Nuevo párrafo para cada fila
                documento.add(new Paragraph(sb.toString().trim()));
            }

            documento.close();
            System.out.println("Reporte PDF generado con éxito en: " + rutaArchivo);
        } catch (FileNotFoundException e) {
            System.out.println("Error al crear el archivo PDF: " + e.getMessage());
        } catch (DocumentException e) {
            System.out.println("Error al crear el documento: " + e.getMessage());
        }
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
