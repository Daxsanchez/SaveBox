package paneles;

import controladores.CExterno;
import controladores.CPrestamo;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import main.Config;
import modelos.Externo;
import modelos.Prestamo;
import utilerias.Utileria;
import ventanas.VInicio;

/**
 *
 * @author daxsa
 */
public class PRealizarPrestamoExterno extends javax.swing.JPanel {

    private VInicio vInicio = null;
    private Prestamo prestamo = new Prestamo();
    private ArrayList<Externo> externos = new ArrayList<>();
    private Externo externo = new Externo();

    public PRealizarPrestamoExterno(VInicio vIni) {
        initComponents();
        vInicio = vIni;
        externos = CExterno.getExternosActivos();
        for (Externo s : externos) {
            cmbExternos.addItem(s.getNombre() + " " + s.getApellidos());
        }
        txtMonto.setValue(0);
        dcFecha.setDate(new Date());
        cuotas();
        intereses();
    }

    private void intereses() {
        double montoPrestamo = Double.parseDouble(txtMonto.getText());
        double interes, totalPago;

        interes = montoPrestamo * Config.getInteresExterno();
        interes = interes * Double.parseDouble(txtNumCuotas.getText());
        totalPago = interes + montoPrestamo;

        txtTotalInteres.setValue(interes);
        txtTotalPagar.setValue(totalPago);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        panelRedondeado4 = new utilerias.PanelRedondeado();
        txtMonto = new javax.swing.JFormattedTextField();
        jLabel25 = new javax.swing.JLabel();
        panelRedondeado5 = new utilerias.PanelRedondeado();
        txtNumCuotas = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        panelRedondeado9 = new utilerias.PanelRedondeado();
        txtTasaInteres = new javax.swing.JTextField();
        panelRedondeado10 = new utilerias.PanelRedondeado();
        txtTotalInteres = new javax.swing.JFormattedTextField();
        panelRedondeado12 = new utilerias.PanelRedondeado();
        txtTotalPagar = new javax.swing.JFormattedTextField();
        panelRedondeado13 = new utilerias.PanelRedondeado();
        btnContrato = new javax.swing.JButton();
        panelRedondeado14 = new utilerias.PanelRedondeado();
        btnPagare = new javax.swing.JButton();
        panelRedondeado15 = new utilerias.PanelRedondeado();
        btnCronograma = new javax.swing.JButton();
        panelRedondeado16 = new utilerias.PanelRedondeado();
        btnRealizarPrestamo = new javax.swing.JButton();
        dcFecha = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        pExterno = new utilerias.PanelRedondeado();
        txtNombre = new javax.swing.JTextField();
        pExterno1 = new utilerias.PanelRedondeado();
        txtApellidos = new javax.swing.JTextField();
        pExterno2 = new utilerias.PanelRedondeado();
        txtTelefono = new javax.swing.JTextField();
        pExterno3 = new utilerias.PanelRedondeado();
        txtCorreo = new javax.swing.JTextField();
        cmbExternos = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(7, 20, 123));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Agrandir", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Realización de Prestamos");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 16, -1, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/prestamo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 6, -1, 60));

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 72, 1410, -1));

        jSeparator3.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 137, 1410, -1));

        jSeparator4.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 264, 1404, 20));

        jSeparator5.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 454, 1416, 20));

        jLabel19.setFont(new java.awt.Font("Agrandir", 0, 30)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Datos del Préstamo");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(783, 77, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("|");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 75, -1, 42));

        jLabel21.setFont(new java.awt.Font("Agrandir", 0, 30)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Datos Externo");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 220, -1));

        jLabel24.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Cuotas:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 150, -1, -1));

        panelRedondeado4.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado4.setRoundBottomLeft(30);
        panelRedondeado4.setRoundBottomRight(30);
        panelRedondeado4.setRoundTopLeft(30);
        panelRedondeado4.setRoundTopRight(30);
        panelRedondeado4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMonto.setBorder(null);
        txtMonto.setForeground(new java.awt.Color(7, 20, 123));
        txtMonto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMontoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoKeyTyped(evt);
            }
        });
        panelRedondeado4.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 1, 80, 30));

        jPanel1.add(panelRedondeado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 140, 120, -1));

        jLabel25.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Monto Requerido:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, -1, -1));

        panelRedondeado5.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado5.setRoundBottomLeft(30);
        panelRedondeado5.setRoundBottomRight(30);
        panelRedondeado5.setRoundTopLeft(30);
        panelRedondeado5.setRoundTopRight(30);
        panelRedondeado5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNumCuotas.setEditable(false);
        txtNumCuotas.setBackground(new java.awt.Color(255, 255, 255));
        txtNumCuotas.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        txtNumCuotas.setForeground(new java.awt.Color(7, 20, 123));
        txtNumCuotas.setBorder(null);
        panelRedondeado5.add(txtNumCuotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 53, 18));

        jPanel1.add(panelRedondeado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 140, 70, 30));

        jLabel26.setFont(new java.awt.Font("Agrandir", 0, 30)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Interes");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 290, -1, -1));

        jSeparator6.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 336, 1410, 20));

        jLabel27.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Tasa de Interes:");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 366, -1, -1));

        jLabel28.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Fecha:");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 210, -1, -1));

        jLabel29.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Total a Pagar:");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 418, -1, -1));

        jLabel30.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Total de Intereses:");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        panelRedondeado9.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado9.setRoundBottomLeft(30);
        panelRedondeado9.setRoundBottomRight(30);
        panelRedondeado9.setRoundTopLeft(30);
        panelRedondeado9.setRoundTopRight(30);

        txtTasaInteres.setEditable(false);
        txtTasaInteres.setBackground(new java.awt.Color(255, 255, 255));
        txtTasaInteres.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        txtTasaInteres.setForeground(new java.awt.Color(7, 20, 123));
        txtTasaInteres.setText("10%");
        txtTasaInteres.setBorder(null);

        javax.swing.GroupLayout panelRedondeado9Layout = new javax.swing.GroupLayout(panelRedondeado9);
        panelRedondeado9.setLayout(panelRedondeado9Layout);
        panelRedondeado9Layout.setHorizontalGroup(
            panelRedondeado9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTasaInteres, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRedondeado9Layout.setVerticalGroup(
            panelRedondeado9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTasaInteres)
                .addContainerGap())
        );

        jPanel1.add(panelRedondeado9, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 362, -1, -1));

        panelRedondeado10.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado10.setRoundBottomLeft(30);
        panelRedondeado10.setRoundBottomRight(30);
        panelRedondeado10.setRoundTopLeft(30);
        panelRedondeado10.setRoundTopRight(30);
        panelRedondeado10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTotalInteres.setEditable(false);
        txtTotalInteres.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalInteres.setBorder(null);
        txtTotalInteres.setForeground(new java.awt.Color(7, 20, 123));
        txtTotalInteres.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        panelRedondeado10.add(txtTotalInteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 1, 270, 30));

        jPanel1.add(panelRedondeado10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 300, -1));

        panelRedondeado12.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado12.setRoundBottomLeft(30);
        panelRedondeado12.setRoundBottomRight(30);
        panelRedondeado12.setRoundTopLeft(30);
        panelRedondeado12.setRoundTopRight(30);
        panelRedondeado12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTotalPagar.setEditable(false);
        txtTotalPagar.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalPagar.setBorder(null);
        txtTotalPagar.setForeground(new java.awt.Color(7, 20, 123));
        panelRedondeado12.add(txtTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 1, 260, 30));

        jPanel1.add(panelRedondeado12, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 411, 300, -1));

        panelRedondeado13.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado13.setForeground(new java.awt.Color(7, 20, 123));
        panelRedondeado13.setRoundBottomLeft(20);
        panelRedondeado13.setRoundBottomRight(20);
        panelRedondeado13.setRoundTopLeft(20);
        panelRedondeado13.setRoundTopRight(20);
        panelRedondeado13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnContrato.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        btnContrato.setForeground(new java.awt.Color(7, 20, 123));
        btnContrato.setText("Contrato");
        btnContrato.setBorder(null);
        btnContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratoActionPerformed(evt);
            }
        });
        panelRedondeado13.add(btnContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 40));

        jPanel1.add(panelRedondeado13, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 480, 169, -1));

        panelRedondeado14.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado14.setForeground(new java.awt.Color(7, 20, 123));
        panelRedondeado14.setRoundBottomLeft(20);
        panelRedondeado14.setRoundBottomRight(20);
        panelRedondeado14.setRoundTopLeft(20);
        panelRedondeado14.setRoundTopRight(20);
        panelRedondeado14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPagare.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        btnPagare.setForeground(new java.awt.Color(7, 20, 123));
        btnPagare.setText("Pagare");
        btnPagare.setBorder(null);
        panelRedondeado14.add(btnPagare, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 40));

        jPanel1.add(panelRedondeado14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 169, -1));

        panelRedondeado15.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado15.setForeground(new java.awt.Color(7, 20, 123));
        panelRedondeado15.setRoundBottomLeft(20);
        panelRedondeado15.setRoundBottomRight(20);
        panelRedondeado15.setRoundTopLeft(20);
        panelRedondeado15.setRoundTopRight(20);
        panelRedondeado15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCronograma.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        btnCronograma.setForeground(new java.awt.Color(7, 20, 123));
        btnCronograma.setText("Cronograma");
        btnCronograma.setBorder(null);
        panelRedondeado15.add(btnCronograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 40));

        jPanel1.add(panelRedondeado15, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 480, 169, -1));

        panelRedondeado16.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado16.setForeground(new java.awt.Color(7, 20, 123));
        panelRedondeado16.setRoundBottomLeft(20);
        panelRedondeado16.setRoundBottomRight(20);
        panelRedondeado16.setRoundTopLeft(20);
        panelRedondeado16.setRoundTopRight(20);
        panelRedondeado16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRealizarPrestamo.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        btnRealizarPrestamo.setForeground(new java.awt.Color(7, 20, 123));
        btnRealizarPrestamo.setText("Realizar Préstamo");
        btnRealizarPrestamo.setBorder(null);
        btnRealizarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPrestamoActionPerformed(evt);
            }
        });
        panelRedondeado16.add(btnRealizarPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 40));

        jPanel1.add(panelRedondeado16, new org.netbeans.lib.awtextra.AbsoluteConstraints(997, 480, 218, -1));

        dcFecha.setBackground(new java.awt.Color(255, 255, 255));
        dcFecha.setForeground(new java.awt.Color(7, 20, 123));
        dcFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dcFechaPropertyChange(evt);
            }
        });
        jPanel1.add(dcFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 210, 180, 29));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1133, 16, -1, -1));

        pExterno.setBackground(new java.awt.Color(255, 255, 255));
        pExterno.setRoundBottomLeft(30);
        pExterno.setRoundBottomRight(30);
        pExterno.setRoundTopLeft(30);
        pExterno.setRoundTopRight(30);

        txtNombre.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(7, 20, 123));
        txtNombre.setText("Nombre");
        txtNombre.setBorder(null);
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
        });

        javax.swing.GroupLayout pExternoLayout = new javax.swing.GroupLayout(pExterno);
        pExterno.setLayout(pExternoLayout);
        pExternoLayout.setHorizontalGroup(
            pExternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExternoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        pExternoLayout.setVerticalGroup(
            pExternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExternoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pExterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 190, 40));

        pExterno1.setBackground(new java.awt.Color(255, 255, 255));
        pExterno1.setRoundBottomLeft(30);
        pExterno1.setRoundBottomRight(30);
        pExterno1.setRoundTopLeft(30);
        pExterno1.setRoundTopRight(30);

        txtApellidos.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(7, 20, 123));
        txtApellidos.setText("Apellidos");
        txtApellidos.setBorder(null);
        txtApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApellidosFocusGained(evt);
            }
        });

        javax.swing.GroupLayout pExterno1Layout = new javax.swing.GroupLayout(pExterno1);
        pExterno1.setLayout(pExterno1Layout);
        pExterno1Layout.setHorizontalGroup(
            pExterno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExterno1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        pExterno1Layout.setVerticalGroup(
            pExterno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExterno1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pExterno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 170, 40));

        pExterno2.setBackground(new java.awt.Color(255, 255, 255));
        pExterno2.setRoundBottomLeft(30);
        pExterno2.setRoundBottomRight(30);
        pExterno2.setRoundTopLeft(30);
        pExterno2.setRoundTopRight(30);

        txtTelefono.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(7, 20, 123));
        txtTelefono.setText("Teléfono");
        txtTelefono.setBorder(null);
        txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusGained(evt);
            }
        });

        javax.swing.GroupLayout pExterno2Layout = new javax.swing.GroupLayout(pExterno2);
        pExterno2.setLayout(pExterno2Layout);
        pExterno2Layout.setHorizontalGroup(
            pExterno2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExterno2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        pExterno2Layout.setVerticalGroup(
            pExterno2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExterno2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pExterno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 290, 40));

        pExterno3.setBackground(new java.awt.Color(255, 255, 255));
        pExterno3.setRoundBottomLeft(30);
        pExterno3.setRoundBottomRight(30);
        pExterno3.setRoundTopLeft(30);
        pExterno3.setRoundTopRight(30);

        txtCorreo.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(7, 20, 123));
        txtCorreo.setText("Correo");
        txtCorreo.setBorder(null);
        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCorreoFocusGained(evt);
            }
        });

        javax.swing.GroupLayout pExterno3Layout = new javax.swing.GroupLayout(pExterno3);
        pExterno3.setLayout(pExterno3Layout);
        pExterno3Layout.setHorizontalGroup(
            pExterno3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExterno3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );
        pExterno3Layout.setVerticalGroup(
            pExterno3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExterno3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pExterno3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 260, 40));

        cmbExternos.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        cmbExternos.setForeground(new java.awt.Color(7, 20, 123));
        cmbExternos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un externo" }));
        jPanel1.add(cmbExternos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 240, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));
    }// </editor-fold>//GEN-END:initComponents

    private void txtMontoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyReleased
        if (!txtMonto.getText().isEmpty()) {
            intereses();
        }
    }//GEN-LAST:event_txtMontoKeyReleased

    private void txtMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57 || key == 46;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMontoKeyTyped

    private void btnContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratoActionPerformed
        //reporte();
    }//GEN-LAST:event_btnContratoActionPerformed

    private void btnRealizarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPrestamoActionPerformed
        boolean valida = validaciones();
        if (!valida) {
            return;
        }
        guardar();
    }//GEN-LAST:event_btnRealizarPrestamoActionPerformed

    private void dcFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dcFechaPropertyChange
        cuotas();
        if (!txtMonto.getText().isEmpty()) {
            intereses();
        }
    }//GEN-LAST:event_dcFechaPropertyChange

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        vInicio.abrirExterno();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        txtNombre.setText("");
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtApellidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosFocusGained
        txtApellidos.setText("");
    }//GEN-LAST:event_txtApellidosFocusGained

    private void txtTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusGained
        txtTelefono.setText("");
    }//GEN-LAST:event_txtTelefonoFocusGained

    private void txtCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusGained
        txtCorreo.setText("");
    }//GEN-LAST:event_txtCorreoFocusGained

    private boolean validaciones() {
        if ((txtNombre.getText().isEmpty() || txtNombre.getText().equalsIgnoreCase("Nombre"))
                && cmbExternos.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Debe de introducir el nombre del externo",
                    "Nombre de externo no introducido", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (dcFecha.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Debe de seleccionar una fecha",
                    "Fecha no seleccionada", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtMonto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe de introducir un monto",
                    "Monto no introducido", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        double monto = Double.parseDouble(txtMonto.getText());
        if (monto <= 0) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un monto mayor a 0",
                    "Monto inválido", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private void guardar() {
        if (cmbExternos.getSelectedIndex() == 0) {
            boolean guardadoExterno = guardarExterno();
            if (!guardadoExterno) {
                JOptionPane.showMessageDialog(this, "Ocurrió un error al internar guardar el externo",
                        "Error al registrar externo", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } else {
            externo = externos.get(cmbExternos.getSelectedIndex());
        }
        setPrestamo();
        boolean guardado = CPrestamo.guardarRegistro(prestamo);
        if (guardado) {
            new Thread(() -> {
                CPrestamo.actualizarIntereses();
            }).start();
            JOptionPane.showMessageDialog(this, "Se ha registrado el préstamo correctamente",
                    "Prestamo Realizado", JOptionPane.INFORMATION_MESSAGE);
            vInicio.abrirExterno();
        }
    }

    private boolean guardarExterno() {
        externo = new Externo();
        externo.setNombre(txtNombre.getText());
        externo.setApellidos(txtApellidos.getText());
        externo.setCorreo(txtCorreo.getText());
        externo.setTelefono(txtTelefono.getText());
        externo.setFechaCreacion(new Date());
        externo.setEstatus(1);
        boolean guardado = CExterno.guardarRegistro(externo);
        if (guardado) {
            externo.setId(CExterno.getUltimoId());
        }
        return guardado;
    }

    private void setPrestamo() {
        prestamo.setEstatus("APROBADO");
        prestamo.setFechaAprobacion(dcFecha.getDate());
        prestamo.setIntereses(0.1);
        Double monto = Double.valueOf(txtMonto.getValue().toString());
        prestamo.setMonto(monto);
        prestamo.setSaldoRestante(monto);
        prestamo.setExterno(externo);
        prestamo.setUsuario(Config.getUsuarioLog());
        prestamo.setInteresPendiente(0);
        prestamo.setUltimaActualizacionIntereses(dcFecha.getDate());
    }

    private void cuotas() {
        Date fechaFin = Config.getFechaCierre();
        java.util.Date utilDate = new Date(fechaFin.getTime());
        long diferencia = Utileria.diferenciaMeses(dcFecha.getDate(), utilDate);
        txtNumCuotas.setText(diferencia + "");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContrato;
    private javax.swing.JButton btnCronograma;
    private javax.swing.JButton btnPagare;
    private javax.swing.JButton btnRealizarPrestamo;
    private javax.swing.JComboBox<String> cmbExternos;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private utilerias.PanelRedondeado pExterno;
    private utilerias.PanelRedondeado pExterno1;
    private utilerias.PanelRedondeado pExterno2;
    private utilerias.PanelRedondeado pExterno3;
    private utilerias.PanelRedondeado panelRedondeado10;
    private utilerias.PanelRedondeado panelRedondeado12;
    private utilerias.PanelRedondeado panelRedondeado13;
    private utilerias.PanelRedondeado panelRedondeado14;
    private utilerias.PanelRedondeado panelRedondeado15;
    private utilerias.PanelRedondeado panelRedondeado16;
    private utilerias.PanelRedondeado panelRedondeado4;
    private utilerias.PanelRedondeado panelRedondeado5;
    private utilerias.PanelRedondeado panelRedondeado9;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JFormattedTextField txtMonto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumCuotas;
    private javax.swing.JTextField txtTasaInteres;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JFormattedTextField txtTotalInteres;
    private javax.swing.JFormattedTextField txtTotalPagar;
    // End of variables declaration//GEN-END:variables
}
