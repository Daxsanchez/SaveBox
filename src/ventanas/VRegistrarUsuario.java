package ventanas;

/**
 *
 * @author rafae
 */
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import paneles.PCuentaDatos;
import paneles.PInicio;
import paneles.PNombresDatos;

public class VRegistrarUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistrarUsurario
     */
    private PCuentaDatos pCDatos = null;
    private PNombresDatos pNDatos = null;

    public VRegistrarUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRedondeado14 = new utilerias.PanelRedondeado();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnSiguiente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelRedondeado1 = new utilerias.PanelRedondeado();
        jLabel3 = new javax.swing.JLabel();
        panelRedondeado19 = new utilerias.PanelRedondeado();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        panelEspacio = new javax.swing.JPanel();

        panelRedondeado14.setBackground(new java.awt.Color(7, 20, 123));
        panelRedondeado14.setRoundBottomLeft(16);
        panelRedondeado14.setRoundBottomRight(16);
        panelRedondeado14.setRoundTopLeft(16);
        panelRedondeado14.setRoundTopRight(16);

        javax.swing.GroupLayout panelRedondeado14Layout = new javax.swing.GroupLayout(panelRedondeado14);
        panelRedondeado14.setLayout(panelRedondeado14Layout);
        panelRedondeado14Layout.setHorizontalGroup(
            panelRedondeado14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );
        panelRedondeado14Layout.setVerticalGroup(
            panelRedondeado14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(null);
        setClosable(true);
        setForeground(java.awt.Color.darkGray);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSiguiente.setBackground(new java.awt.Color(51, 51, 51));
        btnSiguiente.setFont(new java.awt.Font("Agrandir", 1, 18)); // NOI18N
        btnSiguiente.setIcon(new javax.swing.ImageIcon("C:\\saveBox\\SaveBox\\src\\Icon\\flecha-correcta.png")); // NOI18N
        btnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiguienteMouseClicked(evt);
            }
        });
        jPanel2.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario (1).png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        panelRedondeado1.setBackground(new java.awt.Color(7, 20, 123));
        panelRedondeado1.setRoundBottomLeft(20);
        panelRedondeado1.setRoundBottomRight(20);
        panelRedondeado1.setRoundTopLeft(20);
        panelRedondeado1.setRoundTopRight(20);

        jLabel3.setFont(new java.awt.Font("Agrandir", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/agregar-usuario (1).png"))); // NOI18N
        jLabel3.setText("Nuevo Usuario");

        javax.swing.GroupLayout panelRedondeado1Layout = new javax.swing.GroupLayout(panelRedondeado1);
        panelRedondeado1.setLayout(panelRedondeado1Layout);
        panelRedondeado1Layout.setHorizontalGroup(
            panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(57, 57, 57))
        );
        panelRedondeado1Layout.setVerticalGroup(
            panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondeado1Layout.createSequentialGroup()
                .addGap(0, 44, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(panelRedondeado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 380, -1));

        panelRedondeado19.setBackground(new java.awt.Color(0, 51, 153));
        panelRedondeado19.setRoundBottomLeft(16);
        panelRedondeado19.setRoundBottomRight(16);
        panelRedondeado19.setRoundTopLeft(16);
        panelRedondeado19.setRoundTopRight(16);

        jLabel11.setBackground(new java.awt.Color(245, 245, 245));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Registrar");

        javax.swing.GroupLayout panelRedondeado19Layout = new javax.swing.GroupLayout(panelRedondeado19);
        panelRedondeado19.setLayout(panelRedondeado19Layout);
        panelRedondeado19Layout.setHorizontalGroup(
            panelRedondeado19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRedondeado19Layout.setVerticalGroup(
            panelRedondeado19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(panelRedondeado19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 610, 100, -1));

        jLabel12.setBackground(new java.awt.Color(51, 51, 51));
        jLabel12.setFont(new java.awt.Font("Agrandir", 1, 18)); // NOI18N
        jLabel12.setText("Ingrese los siguientes datos:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\saveBox\\SaveBox\\build\\classes\\imagenes\\Metallic Toad (1).png")); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 410, 670));

        jLabel13.setBackground(new java.awt.Color(51, 51, 51));
        jLabel13.setFont(new java.awt.Font("Agrandir", 1, 18)); // NOI18N
        jLabel13.setText("Ingrese los siguientes datos:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        javax.swing.GroupLayout panelEspacioLayout = new javax.swing.GroupLayout(panelEspacio);
        panelEspacio.setLayout(panelEspacioLayout);
        panelEspacioLayout.setHorizontalGroup(
            panelEspacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        panelEspacioLayout.setVerticalGroup(
            panelEspacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        jPanel2.add(panelEspacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 380, 270));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, -1, 670));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private int contador = 1; // Variable para controlar el paso actual
    private void btnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseClicked

        quitarPaneles(); // Limpia el espacio antes de agregar un nuevo panel

        if (contador == 1) { // Primer paso: mostrar PCuentaDatos
            if (pCDatos == null) {
                pCDatos = new PCuentaDatos(); // Instancia el panel
                pCDatos.setBounds(0, 0, panelEspacio.getWidth(), panelEspacio.getHeight());
            }
            panelEspacio.add(pCDatos); // Agrega el panel al contenedor
            panelEspacio.setComponentZOrder(pCDatos, 0); // Trae el panel al frente
            panelEspacio.repaint();
            panelEspacio.revalidate();
            contador++; // Avanza al siguiente paso
        } else if (contador == 2) { // Segundo paso: mostrar PNombresDatos
            if (pNDatos == null) {
                pNDatos = new PNombresDatos(); // Instancia el panel
                pNDatos.setBounds(0, 0, panelEspacio.getWidth(), panelEspacio.getHeight());
            }
            panelEspacio.add(pNDatos); // Agrega el panel al contenedor
            panelEspacio.setComponentZOrder(pNDatos, 0); // Trae el panel al frente
            panelEspacio.repaint();
            panelEspacio.revalidate();
            contador = 1;
        }


    }//GEN-LAST:event_btnSiguienteMouseClicked

    public void quitarPaneles() {
        panelEspacio.removeAll(); // Elimina todos los componentes del contenedor
        panelEspacio.invalidate();
        panelEspacio.validate();
        panelEspacio.repaint();
    }

    private void entraPanel(JPanel panel, JLabel lb) {
        panel.setBackground(Color.WHITE);
        lb.setForeground(Color.decode("#07147b"));
    }

    private void salePanel(JPanel panel, JLabel lb) {
        panel.setBackground(Color.decode("#07147b"));
        lb.setForeground(Color.WHITE);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelEspacio;
    private utilerias.PanelRedondeado panelRedondeado1;
    private utilerias.PanelRedondeado panelRedondeado14;
    private utilerias.PanelRedondeado panelRedondeado19;
    // End of variables declaration//GEN-END:variables
}
