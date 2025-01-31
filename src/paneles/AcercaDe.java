/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneles;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import ventanas.VInicio;

/**
 *
 * @author rafae
 */
public class AcercaDe extends javax.swing.JPanel {

   private javax.swing.JDesktopPane dp;
    private VInicio vInicio;
    private JLabel carouselLabel;
    private ArrayList<ImageIcon> images;
    private int currentIndex = 0;
    private boolean running = true;

    public AcercaDe(VInicio ini) {
        initComponents();
        vInicio = ini;
        dp = vInicio.getDesktopPane();
    
    }

 
   

      
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        utileria1 = new utilerias.Utileria();
        utileria2 = new utilerias.Utileria();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        panelRedondeado1 = new utilerias.PanelRedondeado();
        panelRedondeado4 = new utilerias.PanelRedondeado();
        panelRedondeado5 = new utilerias.PanelRedondeado();
        jLabel22 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblDescargar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        helpCentro1 = new help.helpCentro();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(7, 20, 123));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1470, 10));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel19.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Tu solución para gestionar y organizar Salarios.");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 310, 60));

        panelRedondeado1.setBackground(new java.awt.Color(0, 0, 102));
        panelRedondeado1.setRoundBottomLeft(20);
        panelRedondeado1.setRoundBottomRight(20);
        panelRedondeado1.setRoundTopLeft(20);
        panelRedondeado1.setRoundTopRight(20);

        panelRedondeado4.setBackground(new java.awt.Color(248, 244, 244));
        panelRedondeado4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRedondeado5.setBackground(new java.awt.Color(248, 244, 244));
        panelRedondeado5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setBackground(new java.awt.Color(0, 0, 102));
        jLabel22.setFont(new java.awt.Font("Agrandir", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 102));
        jLabel22.setText("Descargar Información de la empresa");
        panelRedondeado5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 450, 70));

        panelRedondeado4.add(panelRedondeado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen_2024-12-08_040205685.png"))); // NOI18N
        panelRedondeado4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 110, 160));

        lblDescargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/descargar (1).png"))); // NOI18N
        lblDescargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDescargarMouseClicked(evt);
            }
        });
        panelRedondeado4.add(lblDescargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 40, 50));

        jLabel18.setBackground(new java.awt.Color(0, 0, 102));
        jLabel18.setFont(new java.awt.Font("Agrandir", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 102));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Grey minimalist business project presentation  (1).png"))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("version 0.0.1");

        javax.swing.GroupLayout panelRedondeado1Layout = new javax.swing.GroupLayout(panelRedondeado1);
        panelRedondeado1.setLayout(panelRedondeado1Layout);
        panelRedondeado1Layout.setHorizontalGroup(
            panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(panelRedondeado1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelRedondeado4, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelRedondeado1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRedondeado1Layout.setVerticalGroup(
            panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 394, Short.MAX_VALUE)
                    .addComponent(panelRedondeado4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(330, 330, 330)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(panelRedondeado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 1260, 440));

        jLabel21.setFont(new java.awt.Font("Agrandir", 0, 60)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("SaveBox");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bfc93e2a-7ed1-4ca6-a6a1-d8fbc45e021c (1) (1).jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));
        add(helpCentro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bfc93e2a-7ed1-4ca6-a6a1-d8fbc45e021c (1) (1).jpg"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void lblDescargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDescargarMouseClicked
         // Crear una instancia de la clase GenerarReporte
        GenerarReporte generarReporte = new GenerarReporte("Reporte_XAD_Code");

        // Ejecutar el hilo para generar el PDF
        generarReporte.start();
        }

        // Clase para generar el PDF
        class GenerarReporte extends Thread {

            private String nombre;

            public GenerarReporte(String nombre) {
                this.nombre = nombre;
            }

            @Override
            public void run() {
                try {
                    generarPDF();
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                } catch (DocumentException ex) {
                    Logger.getLogger(AcercaDe.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Reporte generado exitosamente.");
            }

            public void generarPDF() throws DocumentException {
                Document documento = new Document();
                String rutaArchivo = obtenerRuta();
                try {
                    // Crear archivo PDF
                    PdfWriter writer = PdfWriter.getInstance(documento, new FileOutputStream(rutaArchivo));
                    documento.open();

                    // Encabezado del documento
                    Paragraph encabezado = new Paragraph("XAD Code - Propietarios y Roles",
                        FontFactory.getFont(FontFactory.HELVETICA_BOLD, 20, BaseColor.BLUE));
                    encabezado.setAlignment(Paragraph.ALIGN_CENTER);
                    documento.add(encabezado);

                    // Espacio después del encabezado
                    documento.add(new Paragraph("\n"));

                    // Crear tabla para mostrar la información
                    PdfPTable tabla = new PdfPTable(2); // Dos columnas
                    tabla.setWidthPercentage(100); // Ancho completo
                    tabla.setSpacingBefore(10f);
                    tabla.setSpacingAfter(10f);

                    // Encabezados de la tabla
                    PdfPCell celdaEncabezado;

                    celdaEncabezado = new PdfPCell(new Phrase("Rol", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.WHITE)));
                    celdaEncabezado.setBackgroundColor(BaseColor.DARK_GRAY);
                    celdaEncabezado.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tabla.addCell(celdaEncabezado);

                    celdaEncabezado = new PdfPCell(new Phrase("Nombre", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.WHITE)));
                    celdaEncabezado.setBackgroundColor(BaseColor.DARK_GRAY);
                    celdaEncabezado.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tabla.addCell(celdaEncabezado);

                    // Filas de la tabla con los datos de los dueños de XAD Code
                    agregarCelda(tabla, "CEO", "Dax Naim Sánchez López");
                    agregarCelda(tabla, "Developer", "Jesús Aldahir Hernández Medina");
                    agregarCelda(tabla, "Developer", "Ángel Rafael Herrera Carvajal");

                    // Agregar tabla al documento
                    documento.add(tabla);

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
                PdfPCell celdaCampo = new PdfPCell(new Phrase(campo, FontFactory.getFont(FontFactory.HELVETICA, 12)));
                celdaCampo.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
                celdaCampo.setVerticalAlignment(PdfPCell.ALIGN_MIDDLE);
                celdaCampo.setPadding(5);
                tabla.addCell(celdaCampo);

                PdfPCell celdaValor = new PdfPCell(new Phrase(valor, FontFactory.getFont(FontFactory.HELVETICA, 12)));
                celdaValor.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
                celdaValor.setVerticalAlignment(PdfPCell.ALIGN_MIDDLE);
                celdaValor.setPadding(5);
                tabla.addCell(celdaValor);
            }

            // Método para obtener la ruta donde guardar el archivo PDF
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
    
    }//GEN-LAST:event_lblDescargarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private help.helpCentro helpCentro1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDescargar;
    private utilerias.PanelRedondeado panelRedondeado1;
    private utilerias.PanelRedondeado panelRedondeado4;
    private utilerias.PanelRedondeado panelRedondeado5;
    private utilerias.Utileria utileria1;
    private utilerias.Utileria utileria2;
    // End of variables declaration//GEN-END:variables
}
