package paneles;

import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;
import utilerias.TablaAccionCellEditor;
import utilerias.TablaAccionCellRender;
import utilerias.TablaAccionEvent;
import ventanas.VDepositar;
import ventanas.VRetirar;

/**
 *
 * @author rafae
 */
public class PAhorro extends javax.swing.JPanel {

    /**
     * Creates new form PPrestamos
     */
    private javax.swing.JDesktopPane dp;
    private DefaultTableModel tabla;

    public PAhorro(JDesktopPane desktopPane) {
        initComponents();

        dp = desktopPane;

        tabla = (DefaultTableModel) tblPrestamos.getModel();
        Object[] ob = new Object[4];
        ob[0] = "Juan Benítez Jiménez";
        ob[1] = "$300";
        ob[2] = "$1,200";
        ob[3] = "21/12/2024";
        tabla.addRow(ob);

        accionTabla();
    }

    private void accionTabla() {
        TablaAccionEvent ev = new TablaAccionEvent() {
            @Override
            public void onDepositar(int row) {
                VDepositar depositar = new VDepositar();
                depositar.setSize(412, 354);
                depositar.setVisible(true);

                if (dp != null) {
                    dp.add(depositar);
                    try {
                        depositar.setSelected(true);
                    } catch (java.beans.PropertyVetoException e) {
                        System.out.println(e);
                    }
                }
            }

            @Override
            public void onRetirar(int row) {
                VRetirar retirar = new VRetirar();
                retirar.setSize(412, 310);
                retirar.setVisible(true);

                if (dp != null) {
                    dp.add(retirar);
                    try {
                        retirar.setSelected(true);
                    } catch (java.beans.PropertyVetoException e) {
                        System.out.println(e);
                    }
                }
            }
        };

        tblPrestamos.getColumnModel().getColumn(4).setCellRenderer(new TablaAccionCellRender());
        tblPrestamos.getColumnModel().getColumn(4).setCellEditor(new TablaAccionCellEditor(ev));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        panelRedondeado2 = new utilerias.PanelRedondeado();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrestamos = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();

        setBackground(new java.awt.Color(7, 20, 123));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 73, 1270, 20));

        jLabel18.setFont(new java.awt.Font("Agrandir", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Ahorros");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, 50));

        panelRedondeado2.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado2.setRoundBottomLeft(22);
        panelRedondeado2.setRoundBottomRight(22);
        panelRedondeado2.setRoundTopLeft(22);
        panelRedondeado2.setRoundTopRight(22);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar (1).png"))); // NOI18N

        javax.swing.GroupLayout panelRedondeado2Layout = new javax.swing.GroupLayout(panelRedondeado2);
        panelRedondeado2.setLayout(panelRedondeado2Layout);
        panelRedondeado2Layout.setHorizontalGroup(
            panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(309, Short.MAX_VALUE))
        );
        panelRedondeado2Layout.setVerticalGroup(
            panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel2))
        );

        add(panelRedondeado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 340, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ahorro.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 60));

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
                "Socio", "Monto Mensual", "Ahorrado", "Próximo Pago", "Acciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPrestamos.setGridColor(new java.awt.Color(255, 255, 255));
        tblPrestamos.setRowHeight(50);
        tblPrestamos.setSelectionBackground(new java.awt.Color(7, 20, 123));
        tblPrestamos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tblPrestamos.getTableHeader().setResizingAllowed(false);
        tblPrestamos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblPrestamos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1300, 600));

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
        add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 30, 297, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarFocusGained
        txtBuscar.setText("");
    }//GEN-LAST:event_txtBuscarFocusGained

    private void txtBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarFocusLost
        txtBuscar.setText("Buscar");
    }//GEN-LAST:event_txtBuscarFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private utilerias.PanelRedondeado panelRedondeado2;
    private javax.swing.JTable tblPrestamos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
