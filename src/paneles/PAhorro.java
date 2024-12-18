package paneles;

import accionAhorro.AhorroAlerta;
import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;
import accionAhorro.TablaAccionCellEditor;
import accionAhorro.TablaAccionCellRender;
import accionAhorro.TablaAccionEvent;
import controladores.CAhorro;
import java.util.ArrayList;
import java.util.Date;
import modelos.Ahorro;
import utilerias.Utileria;
import ventanas.VDepositar;
import ventanas.VInicio;
import ventanas.VRetirar;

/**
 *
 * @author rafae
 */
public class PAhorro extends javax.swing.JPanel {

    private javax.swing.JDesktopPane dp;
    private VInicio vInicio;
    private DefaultTableModel tbl;
    private ArrayList<Ahorro> ahorros = new ArrayList<>();
    private TablaAccionEvent ev;
    private final int columnaEvento = 5;

    public PAhorro(VInicio ini) {
        initComponents();
        vInicio = ini;
        dp = vInicio.getDesktopPane();

        tbl = (DefaultTableModel) tblAhorros.getModel();
        ahorros = CAhorro.getAhorrosVigentes();
        tabla();
        accionTabla();
        rbVigente.setSelected(true);
        actualizarColumnas();
        tblAhorros.getColumnModel().getColumn(4).setCellRenderer(new AhorroAlerta());
    }

    private void tabla() {
        int filas = tbl.getRowCount();
        for (int i = 0; i < filas; i++) {
            tbl.removeRow(0);
        }
        for (int i = 0; ahorros.size() > i; i++) {
            String mesesAhorrado = mesesAhorrado(ahorros.get(i));
            String mesesFaltantes = mesesFaltantes(ahorros.get(i));
            tbl.addRow(new Object[]{
                ahorros.get(i).getSocio().getNombre() + " " + ahorros.get(i).getSocio().getApellidos(),
                ahorros.get(i).getMontoMensual(), mesesAhorrado, ahorros.get(i).getFechaApertura(), mesesFaltantes});
        }
    }

    private String mesesAhorrado(Ahorro ahorro) {
        String mesesAhorrado = null;
        Double ahorrado = ahorro.getAhorrado();
        double meses = ahorrado / ahorro.getMontoMensual();

        int mesEntero = 0;
        if (meses > 0 && meses < 1) {
            meses = 1;
            mesEntero = (int) meses;
        }
        mesEntero = (int) Math.round(meses);
        mesesAhorrado = ahorrado + " - Meses " + mesEntero;

        return mesesAhorrado;
    }

    private String mesesFaltantes(Ahorro ahorro) {
        String mesesFaltantes = null;
        Date fechaApertura = new Date(ahorro.getFechaApertura().getTime());
        int mesesSupuestoAhorro = (int) Utileria.diferenciaMeses(fechaApertura, new Date()) + 1;

        double supuestoAhorrado = ahorro.getMontoMensual() * mesesSupuestoAhorro;
        double ahorrado = ahorro.getAhorrado();
        double ahorradoFaltante = 0;
        if (supuestoAhorrado > ahorrado) {
            ahorradoFaltante = supuestoAhorrado - ahorrado;
        } else if (ahorrado >= supuestoAhorrado) {
            return "0";
        }
        double mesesAhorrado = ahorradoFaltante / ahorro.getMontoMensual();

        int mesEntero = 0;
        if (mesesAhorrado > 0 && mesesAhorrado < 1) {
            mesesAhorrado = 1;
            mesEntero = (int) mesesAhorrado;
        }
        mesEntero = (int) Math.round(mesesAhorrado);
        mesesFaltantes = ahorradoFaltante + " - Meses " + mesEntero;

        return ahorro.getEstatus() == 1 ? mesesFaltantes : "0";
    }

    private void accionTabla() {
        PAhorro pAhorro = this;
        ev = new TablaAccionEvent() {
            @Override
            public void onDepositar(int row) {
                VDepositar depositar = new VDepositar(pAhorro, ahorros.get(row));
                depositar.setSize(412, 450);
                depositar.setVisible(true);
                dp.setLayout(null);

                if (dp != null) {
                    vInicio.centrarInternalFrame(depositar, dp);
                    dp.add(depositar);
                    try {
                        depositar.setSelected(true);
                    } catch (java.beans.PropertyVetoException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }

            @Override
            public void onRetirar(int row) {
                VRetirar retirar = new VRetirar(pAhorro, ahorros.get(row));
                retirar.setSize(412, 310);
                retirar.setVisible(true);
                dp.setLayout(null);

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

        tblAhorros.getColumnModel().getColumn(columnaEvento).setCellRenderer(new TablaAccionCellRender());
        tblAhorros.getColumnModel().getColumn(columnaEvento).setCellEditor(new TablaAccionCellEditor(ev));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgFiltra = new javax.swing.ButtonGroup();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        panelRedondeado2 = new utilerias.PanelRedondeado();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAhorros = new javax.swing.JTable();
        helpCentro1 = new help.helpCentro();
        rbVigente = new javax.swing.JRadioButton();
        rbFinalizado = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(7, 20, 123));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1300, 20));

        jLabel18.setFont(new java.awt.Font("Agrandir", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Ahorros");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 50));

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
        panelRedondeado2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 270, 30));

        add(panelRedondeado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 340, 40));
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
                "Socio", "Monto Mensual", "Ahorrado", "Fecha apertura", "Meses Faltantes", "Acciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1300, 470));
        add(helpCentro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, -1, -1));

        rbVigente.setBackground(new java.awt.Color(7, 20, 123));
        bgFiltra.add(rbVigente);
        rbVigente.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        rbVigente.setForeground(new java.awt.Color(255, 255, 255));
        rbVigente.setSelected(true);
        rbVigente.setText("Vigentes");
        rbVigente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVigenteActionPerformed(evt);
            }
        });
        add(rbVigente, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 80, -1, -1));

        rbFinalizado.setBackground(new java.awt.Color(7, 20, 123));
        bgFiltra.add(rbFinalizado);
        rbFinalizado.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        rbFinalizado.setForeground(new java.awt.Color(255, 255, 255));
        rbFinalizado.setText("Finalizados");
        rbFinalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFinalizadoActionPerformed(evt);
            }
        });
        add(rbFinalizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 80, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        if (!txtBuscar.getText().isEmpty()) {
            buscar();
        } else {
            tblAhorros.clearSelection();
            if (rbVigente.isSelected()) {
                ahorros = CAhorro.getAhorrosVigentes();
            } else {
                ahorros = CAhorro.getAhorrosFinalizados();
            }
            tabla();
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarFocusGained
        txtBuscar.setText("");
    }//GEN-LAST:event_txtBuscarFocusGained

    private void rbFinalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFinalizadoActionPerformed
        ahorros = CAhorro.getAhorrosFinalizados();
        tabla();
        tblAhorros.getColumnModel().getColumn(columnaEvento).setCellRenderer(null);
        tblAhorros.getColumnModel().getColumn(columnaEvento).setCellEditor(null);
        actualizarColumnas();
        tblAhorros.clearSelection();
    }//GEN-LAST:event_rbFinalizadoActionPerformed

    private void rbVigenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVigenteActionPerformed
        ahorros = CAhorro.getAhorrosVigentes();
        tabla();
        tblAhorros.getColumnModel().getColumn(columnaEvento).setCellRenderer(new TablaAccionCellRender());
        tblAhorros.getColumnModel().getColumn(columnaEvento).setCellEditor(new TablaAccionCellEditor(ev));
        actualizarColumnas();
        tblAhorros.clearSelection();
    }//GEN-LAST:event_rbVigenteActionPerformed

    private void actualizarColumnas() {
        if (rbFinalizado.isSelected()) {
            tblAhorros.getColumnModel().getColumn(columnaEvento).setMinWidth(0);
            tblAhorros.getColumnModel().getColumn(columnaEvento).setMaxWidth(0);
            tblAhorros.getColumnModel().getColumn(columnaEvento).setPreferredWidth(0);
        } else {
            tblAhorros.getColumnModel().getColumn(columnaEvento).setMinWidth(75);
            tblAhorros.getColumnModel().getColumn(columnaEvento).setMaxWidth(150);
            tblAhorros.getColumnModel().getColumn(columnaEvento).setPreferredWidth(100);
        }
    }

    private void buscar() {
        ahorros = CAhorro.porNombreSocio(txtBuscar.getText(), rbVigente.isSelected() ? 1 : 0);
        tabla();
    }

    public void actualizarTabla() {
        tblAhorros.clearSelection();
        rbVigente.setSelected(true);
        ahorros = CAhorro.getAhorrosVigentes();
        tabla();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgFiltra;
    private help.helpCentro helpCentro1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private utilerias.PanelRedondeado panelRedondeado2;
    private javax.swing.JRadioButton rbFinalizado;
    private javax.swing.JRadioButton rbVigente;
    private javax.swing.JTable tblAhorros;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
