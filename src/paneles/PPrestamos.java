package paneles;

import accionPrestamo.TablaAccionCellEditorP;
import accionPrestamo.TablaAccionCellRenderP;
import accionPrestamo.TablaAccionEventP;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import utilerias.IconCellRenderer;
import ventanas.VAbonoPrestamo;
import ventanas.VInicio;

/**
 *
 * @author rafae
 */
public class PPrestamos extends javax.swing.JPanel {

    /**
     * Creates new form PPrestamos
     */
    private javax.swing.JDesktopPane dp;
    private DefaultTableModel tabla;
    private VInicio vInicio = null;

    public PPrestamos(VInicio vIni) {
        initComponents();
        vInicio = vIni;
        dp = vIni.getDesktopPane();

        tabla = (DefaultTableModel) tblPrestamos.getModel();
        Object[] ob = new Object[5];
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/avatarAzul.png"));
        ob[0] = icon;
        ob[1] = "Luis Ramírez Flores";
        ob[2] = "$10,000";
        ob[3] = "$5,000";
        ob[4] = "21/12/2024";
        tabla.addRow(ob);

        tblPrestamos.getColumnModel().getColumn(0).setCellRenderer(new IconCellRenderer());
        accionTabla();
    }

    private void accionTabla() {
        TablaAccionEventP ev = new TablaAccionEventP() {
            @Override
            public void onAbonar(int row) {
                VAbonoPrestamo abonar = new VAbonoPrestamo();
                abonar.setSize(412, 482);
                abonar.setVisible(true);
                System.out.println("Entró "+ row);

                if (dp != null) {
                    vInicio.centrarInternalFrame(abonar, dp);
                    dp.add(abonar);
                    try {
                        abonar.setSelected(true);
                    } catch (java.beans.PropertyVetoException e) {
                        System.out.println(e);
                    }
                }
            }
        };
        tblPrestamos.getColumnModel().getColumn(5).setCellRenderer(new TablaAccionCellRenderP());
        tblPrestamos.getColumnModel().getColumn(5).setCellEditor(new TablaAccionCellEditorP(ev));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        panelRedondeado2 = new utilerias.PanelRedondeado();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrestamos = new javax.swing.JTable();

        setBackground(new java.awt.Color(7, 20, 123));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 73, 1110, 20));

        jLabel18.setFont(new java.awt.Font("Agrandir", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Prestamos Efectuados");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 50));

        panelRedondeado2.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado2.setRoundBottomLeft(22);
        panelRedondeado2.setRoundBottomRight(22);
        panelRedondeado2.setRoundTopLeft(22);
        panelRedondeado2.setRoundTopRight(22);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar (1).png"))); // NOI18N

        txtBuscar.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(7, 20, 123));
        txtBuscar.setText("Buscar");
        txtBuscar.setBorder(null);
        txtBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarFocusLost(evt);
            }
        });
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRedondeado2Layout = new javax.swing.GroupLayout(panelRedondeado2);
        panelRedondeado2.setLayout(panelRedondeado2Layout);
        panelRedondeado2Layout.setHorizontalGroup(
            panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRedondeado2Layout.setVerticalGroup(
            panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel2))
            .addGroup(panelRedondeado2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(panelRedondeado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 340, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/prestamo.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/prestamo2.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 10, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(7, 20, 123));
        jScrollPane1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jScrollPane1.setOpaque(false);

        tblPrestamos.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        tblPrestamos.setForeground(new java.awt.Color(7, 20, 123));
        tblPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Foto", "Nombre", "Monto", "Abonado", "Próximo Pago", "Acciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPrestamos.setGridColor(new java.awt.Color(255, 255, 255));
        tblPrestamos.setRowHeight(50);
        tblPrestamos.setSelectionBackground(new java.awt.Color(7, 20, 123));
        tblPrestamos.getTableHeader().setResizingAllowed(false);
        tblPrestamos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblPrestamos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1340, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarFocusGained
        txtBuscar.setText("");
    }//GEN-LAST:event_txtBuscarFocusGained

    private void txtBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarFocusLost
        txtBuscar.setText("Buscar");
    }//GEN-LAST:event_txtBuscarFocusLost

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        vInicio.abrirRealizarPrestamo();
    }//GEN-LAST:event_jLabel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private utilerias.PanelRedondeado panelRedondeado2;
    private javax.swing.JTable tblPrestamos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
