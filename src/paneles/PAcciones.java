package paneles;

import controladores.CPrestamo;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelos.Prestamo;
import modelos.Socio;
import ventanas.VInicio;

/**
 *
 * @author daxsa
 */
public class PAcciones extends javax.swing.JPanel {

    private VInicio vInicio;
    private DefaultTableModel tbl;
    private int totalAcciones = CPrestamo.totalAcciones();
    private Double totalGanancia = CPrestamo.totalGanacia();
    private Double gananciaPorAccion = 0.0;
    private ArrayList<Object[]> valores;

    public PAcciones(VInicio vIni) {
        initComponents();
        vInicio = vIni;
        ftTotalAcciones.setValue(totalAcciones);
        ftTotalGanacia.setValue(totalGanancia);
        gananciaPorAccion = totalGanancia / totalAcciones;
        ftGananciaPorAccion.setValue(gananciaPorAccion);

        tbl = (DefaultTableModel) tblAcciones.getModel();
        valores = CPrestamo.socioAcciones(null);
        tabla();
        tblAcciones.getColumnModel().getColumn(1).setMinWidth(150);
        tblAcciones.getColumnModel().getColumn(1).setMaxWidth(250);
        tblAcciones.getColumnModel().getColumn(1).setWidth(200);
        tblAcciones.getColumnModel().getColumn(2).setMinWidth(250);
        tblAcciones.getColumnModel().getColumn(2).setMaxWidth(300);
        tblAcciones.getColumnModel().getColumn(2).setWidth(400);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        tblAcciones.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tblAcciones.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tblAcciones.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
    }

    private void tabla() {
        int filas = tbl.getRowCount();
        for (int i = 0; i < filas; i++) {
            tbl.removeRow(0);
        }
        for (int i = 0; valores.size() > i; i++) {
            double acciones = (double) valores.get(i)[1];
            double ganancia = acciones * gananciaPorAccion;
            tbl.addRow(new Object[]{
                valores.get(i)[0], Math.round(acciones), "$" + Math.round(ganancia)});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAcciones = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        panelRedondeado2 = new utilerias.PanelRedondeado();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        helpCentro1 = new help.helpCentro();
        jLabel1 = new javax.swing.JLabel();
        panelRedondeado1 = new utilerias.PanelRedondeado();
        ftTotalAcciones = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        panelRedondeado3 = new utilerias.PanelRedondeado();
        ftTotalGanacia = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        panelRedondeado4 = new utilerias.PanelRedondeado();
        ftGananciaPorAccion = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(7, 20, 123));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(7, 20, 123));
        jScrollPane1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jScrollPane1.setOpaque(false);

        tblAcciones.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        tblAcciones.setForeground(new java.awt.Color(7, 20, 123));
        tblAcciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Socio", "Acciones", "Ganancia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAcciones.setGridColor(new java.awt.Color(255, 255, 255));
        tblAcciones.setRowHeight(50);
        tblAcciones.setSelectionBackground(new java.awt.Color(7, 20, 123));
        tblAcciones.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tblAcciones.getTableHeader().setResizingAllowed(false);
        tblAcciones.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblAcciones);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1300, 320));

        jLabel18.setFont(new java.awt.Font("Agrandir", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Acciones");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 50));

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1300, 20));

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
        panelRedondeado2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 280, 30));

        add(panelRedondeado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 60, 330, 40));
        add(helpCentro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ganancia por accion:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, -1, 40));

        panelRedondeado1.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado1.setRoundBottomLeft(22);
        panelRedondeado1.setRoundBottomRight(22);
        panelRedondeado1.setRoundTopLeft(22);
        panelRedondeado1.setRoundTopRight(22);
        panelRedondeado1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ftTotalAcciones.setEditable(false);
        ftTotalAcciones.setBackground(new java.awt.Color(255, 255, 255));
        ftTotalAcciones.setBorder(null);
        ftTotalAcciones.setForeground(new java.awt.Color(7, 20, 123));
        ftTotalAcciones.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        panelRedondeado1.add(ftTotalAcciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 20));

        add(panelRedondeado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 10, 180, 40));

        jLabel3.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total de acciones:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, -1, 30));

        panelRedondeado3.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado3.setRoundBottomLeft(22);
        panelRedondeado3.setRoundBottomRight(22);
        panelRedondeado3.setRoundTopLeft(22);
        panelRedondeado3.setRoundTopRight(22);
        panelRedondeado3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ftTotalGanacia.setEditable(false);
        ftTotalGanacia.setBackground(new java.awt.Color(255, 255, 255));
        ftTotalGanacia.setBorder(null);
        ftTotalGanacia.setForeground(new java.awt.Color(7, 20, 123));
        ftTotalGanacia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("$#,##0.###"))));
        ftTotalGanacia.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        panelRedondeado3.add(ftTotalGanacia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 20));

        add(panelRedondeado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 180, 40));

        jLabel4.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ganancia total:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, 40));

        panelRedondeado4.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado4.setRoundBottomLeft(22);
        panelRedondeado4.setRoundBottomRight(22);
        panelRedondeado4.setRoundTopLeft(22);
        panelRedondeado4.setRoundTopRight(22);
        panelRedondeado4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ftGananciaPorAccion.setEditable(false);
        ftGananciaPorAccion.setBackground(new java.awt.Color(255, 255, 255));
        ftGananciaPorAccion.setBorder(null);
        ftGananciaPorAccion.setForeground(new java.awt.Color(7, 20, 123));
        ftGananciaPorAccion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("$#0"))));
        ftGananciaPorAccion.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        panelRedondeado4.add(ftGananciaPorAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 20));

        add(panelRedondeado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, 180, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarFocusGained
        txtBuscar.setText("");
    }//GEN-LAST:event_txtBuscarFocusGained

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        if (!txtBuscar.getText().isEmpty()) {
            buscar();
        } else {
            tblAcciones.clearSelection();
            valores = CPrestamo.socioAcciones(null);
            tabla();
        }
    }//GEN-LAST:event_txtBuscarKeyReleased
    private void buscar() {
        tblAcciones.clearSelection();
        valores = CPrestamo.socioAcciones(txtBuscar.getText());
        tabla();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ftGananciaPorAccion;
    private javax.swing.JFormattedTextField ftTotalAcciones;
    private javax.swing.JFormattedTextField ftTotalGanacia;
    private help.helpCentro helpCentro1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private utilerias.PanelRedondeado panelRedondeado1;
    private utilerias.PanelRedondeado panelRedondeado2;
    private utilerias.PanelRedondeado panelRedondeado3;
    private utilerias.PanelRedondeado panelRedondeado4;
    private javax.swing.JTable tblAcciones;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
