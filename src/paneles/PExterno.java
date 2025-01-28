package paneles;

import accionPrestamo.InteresAlerta;
import accionPrestamo.TablaAccionCellEditorP;
import accionPrestamo.TablaAccionCellRenderP;
import accionPrestamo.TablaAccionEventP;
import controladores.CPrestamo;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.Prestamo;
import ventanas.VAbonoPrestamo;
import ventanas.VInicio;

/**
 *
 * @author daxsa
 */
public class PExterno extends javax.swing.JPanel {

    private VInicio vInicio = null;
    private javax.swing.JDesktopPane dp;
    private DefaultTableModel tbl;
    private ArrayList<Prestamo> prestamos = new ArrayList<>();
    private TablaAccionEventP ev;

    public PExterno(VInicio vIni) {
        initComponents();
        vInicio = vIni;

        dp = vIni.getDesktopPane();

        prestamos = CPrestamo.getPrestamosAprobadosExterno();
        tbl = (DefaultTableModel) tblPrestamos.getModel();
        tabla();
        accionTabla();
        tblPrestamos.getColumnModel().getColumn(4).setCellRenderer(new InteresAlerta());
    }

    private void tabla() {
        int filas = tbl.getRowCount();
        for (int i = 0; i < filas; i++) {
            tbl.removeRow(0);
        }
        for (int i = 0; prestamos.size() > i; i++) {
            String interesPendiente = interes(prestamos.get(i));
            tbl.addRow(new Object[]{
                prestamos.get(i).getExterno().getNombre() + " " + prestamos.get(i).getExterno().getApellidos(),
                prestamos.get(i).getMonto(), prestamos.get(i).getSaldoRestante(),
                prestamos.get(i).getFechaAprobacion(), interesPendiente});
        }
    }

    public void actualizarTabla() {
        tblPrestamos.clearSelection();
        rbAprobado.setSelected(true);
        prestamos = CPrestamo.getPrestamosAprobadosExterno();
        tabla();
    }

    private String interes(Prestamo prestamo) {
        String intPen = null;
        Double interes = prestamo.getInteresPendiente();
        if (interes > 0) {
            double meses = prestamo.getMonto() * 0.07;
            meses = (interes / meses);
            int mesEntero = 0;
            if (meses > 0 && meses < 1) {
                meses = 1;
                mesEntero = (int) meses;
            }
            mesEntero = (int) Math.round(meses);
            intPen = interes + " - Meses " + mesEntero;
        } else {
            intPen = interes.toString();
        }
        return intPen;
    }

    private void accionTabla() {
        PExterno pExt = this;
        ev = new TablaAccionEventP() {
            @Override
            public void onAbonar(int row) {
                VAbonoPrestamo abonar = new VAbonoPrestamo(pExt, prestamos.get(row));
                abonar.setSize(412, 482);
                abonar.setVisible(true);
                dp.setLayout(null);

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
        tblPrestamos.getColumnModel().getColumn(5).setMinWidth(75);
        tblPrestamos.getColumnModel().getColumn(5).setMaxWidth(150);
        tblPrestamos.getColumnModel().getColumn(5).setPreferredWidth(100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgEstatus = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrestamos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lbAgregar = new javax.swing.JLabel();
        rbAprobado = new javax.swing.JRadioButton();
        rbLiquidado = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(7, 20, 123));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Agrandir", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Préstamos a externos");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 400, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1410, 10));

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
                "Externo", "Monto", "Restante", "Fecha Aprobado", "Interés Pendiente", "Acciones"
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 1230, 320));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/externo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        lbAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        lbAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAgregarMouseClicked(evt);
            }
        });
        jPanel1.add(lbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 20, -1, -1));

        bgEstatus.add(rbAprobado);
        rbAprobado.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        rbAprobado.setForeground(new java.awt.Color(255, 255, 255));
        rbAprobado.setSelected(true);
        rbAprobado.setText("Aprobados");
        rbAprobado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAprobadoActionPerformed(evt);
            }
        });
        jPanel1.add(rbAprobado, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 70, -1, -1));

        bgEstatus.add(rbLiquidado);
        rbLiquidado.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        rbLiquidado.setForeground(new java.awt.Color(255, 255, 255));
        rbLiquidado.setText("Liquidados");
        rbLiquidado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLiquidadoActionPerformed(evt);
            }
        });
        jPanel1.add(rbLiquidado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 70, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 530));
    }// </editor-fold>//GEN-END:initComponents

    private void lbAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAgregarMouseClicked
        vInicio.abrirPrestamoExterno();
    }//GEN-LAST:event_lbAgregarMouseClicked

    private void rbAprobadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAprobadoActionPerformed
        prestamos = CPrestamo.getPrestamosAprobadosExterno();
        tabla();
        tblPrestamos.getColumnModel().getColumn(5).setCellRenderer(new TablaAccionCellRenderP());
        tblPrestamos.getColumnModel().getColumn(5).setCellEditor(new TablaAccionCellEditorP(ev));
        actualizarColumnas();
        tblPrestamos.clearSelection();
    }//GEN-LAST:event_rbAprobadoActionPerformed

    private void rbLiquidadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLiquidadoActionPerformed
        prestamos = CPrestamo.getPrestamosLiquidadosExterno();
        tabla();
        tblPrestamos.getColumnModel().getColumn(5).setCellRenderer(null);
        tblPrestamos.getColumnModel().getColumn(5).setCellEditor(null);
        actualizarColumnas();
        tblPrestamos.clearSelection();
    }//GEN-LAST:event_rbLiquidadoActionPerformed

    private void actualizarColumnas() {
        if (rbLiquidado.isSelected()) {
            tblPrestamos.getColumnModel().getColumn(5).setMinWidth(0);
            tblPrestamos.getColumnModel().getColumn(5).setMaxWidth(0);
            tblPrestamos.getColumnModel().getColumn(5).setPreferredWidth(0);
        } else {
            tblPrestamos.getColumnModel().getColumn(5).setMinWidth(75);
            tblPrestamos.getColumnModel().getColumn(5).setMaxWidth(150);
            tblPrestamos.getColumnModel().getColumn(5).setPreferredWidth(100);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgEstatus;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbAgregar;
    private javax.swing.JRadioButton rbAprobado;
    private javax.swing.JRadioButton rbLiquidado;
    private javax.swing.JTable tblPrestamos;
    // End of variables declaration//GEN-END:variables
}
