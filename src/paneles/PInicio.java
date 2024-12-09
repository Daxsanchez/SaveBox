package paneles;

import controladores.CAbonoPrestamo;
import controladores.CDeposito;
import controladores.CRetiro;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import main.Config;
import modelos.AbonoPrestamo;
import modelos.Deposito;
import modelos.Retiro;
import modelos.Usuario;
import utilerias.Utileria;
import ventanas.VInicio;

/**
 *
 * @author daxsa
 */
public class PInicio extends javax.swing.JPanel {
    
    private DefaultTableModel tbl;
    private ArrayList<AbonoPrestamo> abonos = new ArrayList<>();
    private ArrayList<Deposito> depositos = new ArrayList<>();
    private ArrayList<Retiro> retiros = new ArrayList<>();
    private VInicio vInicio = null;
    
    public PInicio(VInicio vIni) {
        initComponents();
        vInicio = vIni;
        tbl = (DefaultTableModel) tblTransacciones.getModel();
        
        Date fechaI = Utileria.sumarRestarDias(new Date(), -100);
        Date fechaF = new Date();
        abonos = CAbonoPrestamo.abonosPorFechas(fechaI, fechaF);
        depositos = CDeposito.depositosPorFechas(fechaI, fechaF);
        retiros = CRetiro.retirosPorFechas(fechaI, fechaF);
        
        tabla();
        cargarIniUsu();
    }
    
    private void tabla() {
        int filas = tbl.getRowCount();
        for (int i = 0; i < filas; i++) {
            tbl.removeRow(0);
        }
        for (int i = 0; abonos.size() > i; i++) {
            tbl.addRow(new Object[]{
                abonos.get(i).getPrestamo().getSocio().getNombre(),
                "Abono Préstamo", abonos.get(i).getMonto(),
                abonos.get(i).getFecha()});
        }
        
        for (int i = 0; depositos.size() > i; i++) {
            tbl.addRow(new Object[]{
                depositos.get(i).getAhorro().getSocio().getNombre(),
                "Depósito", depositos.get(i).getMonto(),
                depositos.get(i).getFecha()});
        }
        
        for (int i = 0; retiros.size() > i; i++) {
            tbl.addRow(new Object[]{
                retiros.get(i).getAhorro().getSocio().getNombre(),
                "Retiro", retiros.get(i).getMonto(),
                retiros.get(i).getFecha()});
        }
    }
    
    private void cargarIniUsu() {
        Usuario usuario = Config.getUsuarioLog();
        lbRol.setText(usuario.getRol().toUpperCase());
        lbNombre.setText(usuario.getNombre() + " " + usuario.getApellidos());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pini = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransacciones = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        lbBuscar = new javax.swing.JLabel();
        panelRedondeado2 = new utilerias.PanelRedondeado();
        jLabel9 = new javax.swing.JLabel();
        lbRol = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        helpCentro1 = new help.helpCentro();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(680, 455));

        Pini.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Agrandir", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(7, 20, 123));
        jLabel18.setText("Historial Transacciones");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/historial.png"))); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(7, 20, 123));
        jScrollPane1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jScrollPane1.setOpaque(false);

        tblTransacciones.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        tblTransacciones.setForeground(new java.awt.Color(7, 20, 123));
        tblTransacciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Socio", "Tipo", "Monto", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTransacciones.setGridColor(new java.awt.Color(255, 255, 255));
        tblTransacciones.setRowHeight(50);
        tblTransacciones.setSelectionBackground(new java.awt.Color(7, 20, 123));
        tblTransacciones.getTableHeader().setResizingAllowed(false);
        tblTransacciones.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblTransacciones);

        jLabel17.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(7, 20, 123));
        jLabel17.setText("Buscar");

        lbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha_d.png"))); // NOI18N
        lbBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PiniLayout = new javax.swing.GroupLayout(Pini);
        Pini.setLayout(PiniLayout);
        PiniLayout.setHorizontalGroup(
            PiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PiniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PiniLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 680, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PiniLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(14, 14, 14))))
        );
        PiniLayout.setVerticalGroup(
            PiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PiniLayout.createSequentialGroup()
                .addGroup(PiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jLabel17))
                    .addComponent(jLabel16)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PiniLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lbBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRedondeado2.setBackground(new java.awt.Color(7, 20, 123));
        panelRedondeado2.setRoundBottomLeft(10);
        panelRedondeado2.setRoundBottomRight(10);
        panelRedondeado2.setRoundTopLeft(10);
        panelRedondeado2.setRoundTopRight(10);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario (1).png"))); // NOI18N

        lbRol.setBackground(new java.awt.Color(255, 255, 255));
        lbRol.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        lbRol.setForeground(new java.awt.Color(255, 255, 255));
        lbRol.setText("ADMINISTRADOR");

        jLabel10.setFont(new java.awt.Font("Agrandir", 0, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Bienvenido a SaveBox");

        lbNombre.setFont(new java.awt.Font("Agrandir", 0, 30)); // NOI18N
        lbNombre.setForeground(new java.awt.Color(255, 255, 255));
        lbNombre.setText("Dax Naim Sánchez López");

        jLabel12.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Empresa: XXXXXX");

        jLabel13.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ID: XXXXXXX");

        jLabel14.setFont(new java.awt.Font("Agrandir", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("____");

        jLabel15.setFont(new java.awt.Font("Agrandir", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("____");

        javax.swing.GroupLayout panelRedondeado2Layout = new javax.swing.GroupLayout(panelRedondeado2);
        panelRedondeado2.setLayout(panelRedondeado2Layout);
        panelRedondeado2Layout.setHorizontalGroup(
            panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado2Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(lbRol)
                .addGap(286, 286, 286)
                .addGroup(panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRedondeado2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel15)
                        .addGap(104, 104, 104)
                        .addComponent(jLabel14)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelRedondeado2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(panelRedondeado2Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel9)
                .addGroup(panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRedondeado2Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(lbNombre)
                        .addContainerGap())
                    .addGroup(panelRedondeado2Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 372, Short.MAX_VALUE)
                        .addComponent(helpCentro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelRedondeado2Layout.setVerticalGroup(
            panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRedondeado2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)))
                    .addGroup(panelRedondeado2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbRol)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelRedondeado2Layout.createSequentialGroup()
                .addComponent(helpCentro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRedondeado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRedondeado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Pini, javax.swing.GroupLayout.PREFERRED_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBuscarMouseClicked
        vInicio.abrirHistorialTransacciones();
    }//GEN-LAST:event_lbBuscarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pini;
    private help.helpCentro helpCentro1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbBuscar;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbRol;
    private utilerias.PanelRedondeado panelRedondeado2;
    private javax.swing.JTable tblTransacciones;
    // End of variables declaration//GEN-END:variables
}
