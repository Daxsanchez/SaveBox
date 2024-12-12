package paneles;

import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;
import accionAhorro.TablaAccionCellEditor;
import accionAhorro.TablaAccionCellRender;
import accionAhorro.TablaAccionEvent;
import controladores.CAhorro;
import java.util.ArrayList;
import modelos.Ahorro;
import ventanas.VDepositar;
import ventanas.VInicio;
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
    private VInicio vInicio;
    private DefaultTableModel tbl;
    private ArrayList<Ahorro> ahorros = new ArrayList<>();

    public PAhorro(VInicio ini) {
        initComponents();
        vInicio = ini;
        dp = vInicio.getDesktopPane();

        tbl = (DefaultTableModel) tblAhorros.getModel();
        ahorros = CAhorro.getRegistros();
        tabla();
        accionTabla();
    }

    private void tabla() {
        int filas = tbl.getRowCount();
        for (int i = 0; i < filas; i++) {
            tbl.removeRow(0);
        }
        for (int i = 0; ahorros.size() > i; i++) {
            tbl.addRow(new Object[]{
                ahorros.get(i).getSocio().getNombre() + " " + ahorros.get(i).getSocio().getApellidos(),
                ahorros.get(i).getMontoMensual(), ahorros.get(i).getAhorrado()});
        }
    }

    private void accionTabla() {
        PAhorro pAhorro = this;
        TablaAccionEvent ev = new TablaAccionEvent() {
            @Override
            public void onDepositar(int row) {
                VDepositar depositar = new VDepositar(pAhorro, ahorros.get(row));
                depositar.setSize(412, 354);
                depositar.setVisible(true);
                dp.setLayout(null);

                if (dp != null) {
                    vInicio.centrarInternalFrame(depositar, dp);
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
                VRetirar retirar = new VRetirar(pAhorro, ahorros.get(row));
                retirar.setSize(412, 310);
                retirar.setVisible(true);

                if (dp != null) {
                    vInicio.centrarInternalFrame(retirar, dp);
                    dp.add(retirar);
                    try {
                        retirar.setSelected(true);
                    } catch (java.beans.PropertyVetoException e) {
                        System.out.println(e);
                    }
                }
            }
        };

        tblAhorros.getColumnModel().getColumn(3).setCellRenderer(new TablaAccionCellRender());
        tblAhorros.getColumnModel().getColumn(3).setCellEditor(new TablaAccionCellEditor(ev));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAhorros = new javax.swing.JTable();
        helpCentro1 = new help.helpCentro();

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
        panelRedondeado2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar (1).png"))); // NOI18N
        panelRedondeado2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 5, -1, -1));

        txtBuscar.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(7, 20, 123));
        txtBuscar.setText("Buscar");
        txtBuscar.setBorder(null);
        txtBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarFocusGained(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        panelRedondeado2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 290, 30));

        add(panelRedondeado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 340, 30));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 60));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(7, 20, 123));
        jScrollPane1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jScrollPane1.setOpaque(false);

        tblAhorros.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        tblAhorros.setForeground(new java.awt.Color(7, 20, 123));
        tblAhorros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Socio", "Monto Mensual", "Ahorrado", "Acciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAhorros.setGridColor(new java.awt.Color(255, 255, 255));
        tblAhorros.setRowHeight(50);
        tblAhorros.setSelectionBackground(new java.awt.Color(7, 20, 123));
        tblAhorros.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tblAhorros.getTableHeader().setResizingAllowed(false);
        tblAhorros.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblAhorros);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1300, 600));
        add(helpCentro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        if (!txtBuscar.getText().isEmpty()) {
            buscar();
        } else {
            ahorros = CAhorro.getRegistros();
            tabla();
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarFocusGained
        txtBuscar.setText("");
    }//GEN-LAST:event_txtBuscarFocusGained

    private void buscar() {
        ahorros = CAhorro.porNombreSocio(txtBuscar.getText());
        tabla();
    }

    public void actualizarTabla() {
        tblAhorros.clearSelection();
        ahorros = CAhorro.getRegistros();
        tabla();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private help.helpCentro helpCentro1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private utilerias.PanelRedondeado panelRedondeado2;
    private javax.swing.JTable tblAhorros;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
