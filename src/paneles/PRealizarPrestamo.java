package paneles;

import controladores.CPrestamo;
import controladores.CSocio;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import main.Config;
import modelos.Prestamo;
import modelos.Socio;
import utilerias.GenerarReporte;
import ventanas.VInicio;

/**
 *
 * @author daxsa
 */
public class PRealizarPrestamo extends javax.swing.JPanel {

    private VInicio vInicio = null;
    private Prestamo prestamo = new Prestamo();
    private ArrayList<Socio> socios = new ArrayList<>();

    public PRealizarPrestamo(VInicio ini) {
        initComponents();
        vInicio = ini;
        socios = CSocio.getRegistros();
        for (Socio s : socios) {
            cmbSocio.addItem(s.getNombre() + " " + s.getApellidos());
        }
        dcFecha.setDate(new Date());
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
        jLabel5 = new javax.swing.JLabel();
        cmbSocio = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        panelRedondeado1 = new utilerias.PanelRedondeado();
        txtFolio = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        panelRedondeado4 = new utilerias.PanelRedondeado();
        txtMonto = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        panelRedondeado5 = new utilerias.PanelRedondeado();
        txtNumCuotas = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        panelRedondeado8 = new utilerias.PanelRedondeado();
        txtFormaPago = new javax.swing.JTextField();
        panelRedondeado9 = new utilerias.PanelRedondeado();
        txtTasaInteres = new javax.swing.JTextField();
        panelRedondeado10 = new utilerias.PanelRedondeado();
        txtTotalInteres = new javax.swing.JTextField();
        panelRedondeado12 = new utilerias.PanelRedondeado();
        txtTotalPagar = new javax.swing.JTextField();
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
        btnBuscarSocio = new javax.swing.JButton();
        rbExterno = new javax.swing.JRadioButton();
        pExterno = new utilerias.PanelRedondeado();
        txtNombreExterno = new javax.swing.JTextField();

        setBackground(new java.awt.Color(7, 20, 123));

        jPanel1.setBackground(new java.awt.Color(7, 20, 123));

        jLabel18.setFont(new java.awt.Font("Agrandir", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Realización de Prestamos");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/prestamo.png"))); // NOI18N

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator3.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator4.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator5.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Agrandir", 0, 30)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Datos del Préstamo");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("|");

        cmbSocio.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        cmbSocio.setForeground(new java.awt.Color(7, 20, 123));
        cmbSocio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el socio" }));

        jLabel20.setFont(new java.awt.Font("Agrandir", 0, 30)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Socio");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("|");

        jLabel21.setFont(new java.awt.Font("Agrandir", 0, 30)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Datos");

        jLabel22.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Forma de pago:");

        panelRedondeado1.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado1.setRoundBottomLeft(30);
        panelRedondeado1.setRoundBottomRight(30);
        panelRedondeado1.setRoundTopLeft(30);
        panelRedondeado1.setRoundTopRight(30);

        txtFolio.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        txtFolio.setForeground(new java.awt.Color(7, 20, 123));
        txtFolio.setBorder(null);

        javax.swing.GroupLayout panelRedondeado1Layout = new javax.swing.GroupLayout(panelRedondeado1);
        panelRedondeado1.setLayout(panelRedondeado1Layout);
        panelRedondeado1Layout.setHorizontalGroup(
            panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFolio, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRedondeado1Layout.setVerticalGroup(
            panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFolio, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel23.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Folio:");

        jLabel24.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Número de Cuotas:");

        panelRedondeado4.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado4.setRoundBottomLeft(30);
        panelRedondeado4.setRoundBottomRight(30);
        panelRedondeado4.setRoundTopLeft(30);
        panelRedondeado4.setRoundTopRight(30);

        txtMonto.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        txtMonto.setForeground(new java.awt.Color(7, 20, 123));
        txtMonto.setBorder(null);

        javax.swing.GroupLayout panelRedondeado4Layout = new javax.swing.GroupLayout(panelRedondeado4);
        panelRedondeado4.setLayout(panelRedondeado4Layout);
        panelRedondeado4Layout.setHorizontalGroup(
            panelRedondeado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondeado4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelRedondeado4Layout.setVerticalGroup(
            panelRedondeado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMonto, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel25.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Monto Requerido:");

        panelRedondeado5.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado5.setRoundBottomLeft(30);
        panelRedondeado5.setRoundBottomRight(30);
        panelRedondeado5.setRoundTopLeft(30);
        panelRedondeado5.setRoundTopRight(30);

        txtNumCuotas.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        txtNumCuotas.setForeground(new java.awt.Color(7, 20, 123));
        txtNumCuotas.setBorder(null);

        javax.swing.GroupLayout panelRedondeado5Layout = new javax.swing.GroupLayout(panelRedondeado5);
        panelRedondeado5.setLayout(panelRedondeado5Layout);
        panelRedondeado5Layout.setHorizontalGroup(
            panelRedondeado5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondeado5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNumCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelRedondeado5Layout.setVerticalGroup(
            panelRedondeado5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNumCuotas, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel26.setFont(new java.awt.Font("Agrandir", 0, 30)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Interes");

        jSeparator6.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel27.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Tasa de Interes:");

        jLabel28.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Fecha:");

        jLabel29.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Total a Pagar:");

        jLabel30.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Total de Intereses:");

        panelRedondeado8.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado8.setRoundBottomLeft(30);
        panelRedondeado8.setRoundBottomRight(30);
        panelRedondeado8.setRoundTopLeft(30);
        panelRedondeado8.setRoundTopRight(30);

        txtFormaPago.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        txtFormaPago.setForeground(new java.awt.Color(7, 20, 123));
        txtFormaPago.setBorder(null);

        javax.swing.GroupLayout panelRedondeado8Layout = new javax.swing.GroupLayout(panelRedondeado8);
        panelRedondeado8.setLayout(panelRedondeado8Layout);
        panelRedondeado8Layout.setHorizontalGroup(
            panelRedondeado8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFormaPago, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRedondeado8Layout.setVerticalGroup(
            panelRedondeado8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFormaPago, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelRedondeado9.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado9.setRoundBottomLeft(30);
        panelRedondeado9.setRoundBottomRight(30);
        panelRedondeado9.setRoundTopLeft(30);
        panelRedondeado9.setRoundTopRight(30);

        txtTasaInteres.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        txtTasaInteres.setForeground(new java.awt.Color(7, 20, 123));
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

        panelRedondeado10.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado10.setRoundBottomLeft(30);
        panelRedondeado10.setRoundBottomRight(30);
        panelRedondeado10.setRoundTopLeft(30);
        panelRedondeado10.setRoundTopRight(30);

        txtTotalInteres.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        txtTotalInteres.setForeground(new java.awt.Color(7, 20, 123));
        txtTotalInteres.setBorder(null);

        javax.swing.GroupLayout panelRedondeado10Layout = new javax.swing.GroupLayout(panelRedondeado10);
        panelRedondeado10.setLayout(panelRedondeado10Layout);
        panelRedondeado10Layout.setHorizontalGroup(
            panelRedondeado10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTotalInteres, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRedondeado10Layout.setVerticalGroup(
            panelRedondeado10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTotalInteres, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelRedondeado12.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado12.setRoundBottomLeft(30);
        panelRedondeado12.setRoundBottomRight(30);
        panelRedondeado12.setRoundTopLeft(30);
        panelRedondeado12.setRoundTopRight(30);

        txtTotalPagar.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        txtTotalPagar.setForeground(new java.awt.Color(7, 20, 123));
        txtTotalPagar.setBorder(null);

        javax.swing.GroupLayout panelRedondeado12Layout = new javax.swing.GroupLayout(panelRedondeado12);
        panelRedondeado12.setLayout(panelRedondeado12Layout);
        panelRedondeado12Layout.setHorizontalGroup(
            panelRedondeado12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTotalPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRedondeado12Layout.setVerticalGroup(
            panelRedondeado12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTotalPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        dcFecha.setBackground(new java.awt.Color(255, 255, 255));
        dcFecha.setForeground(new java.awt.Color(7, 20, 123));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        btnBuscarSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar (1).png"))); // NOI18N

        rbExterno.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        rbExterno.setForeground(new java.awt.Color(255, 255, 255));
        rbExterno.setText("Externo");
        rbExterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbExternoActionPerformed(evt);
            }
        });

        pExterno.setRoundBottomLeft(30);
        pExterno.setRoundBottomRight(30);
        pExterno.setRoundTopLeft(30);
        pExterno.setRoundTopRight(30);

        txtNombreExterno.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        txtNombreExterno.setForeground(new java.awt.Color(7, 20, 123));
        txtNombreExterno.setText("Nombre externo");
        txtNombreExterno.setBorder(null);
        txtNombreExterno.setEnabled(false);
        txtNombreExterno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreExternoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreExternoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout pExternoLayout = new javax.swing.GroupLayout(pExterno);
        pExterno.setLayout(pExternoLayout);
        pExternoLayout.setHorizontalGroup(
            pExternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExternoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombreExterno)
                .addContainerGap())
        );
        pExternoLayout.setVerticalGroup(
            pExternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExternoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombreExterno, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator4))
                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(227, 227, 227))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(jLabel20)
                                .addGap(117, 117, 117)
                                .addComponent(jLabel5)
                                .addGap(202, 202, 202)
                                .addComponent(jLabel21)
                                .addGap(138, 138, 138)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(573, 573, 573)
                                .addComponent(jLabel26))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnBuscarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbExterno))
                                    .addComponent(pExterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(panelRedondeado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panelRedondeado4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(panelRedondeado5, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelRedondeado8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelRedondeado10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelRedondeado9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelRedondeado12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(205, 205, 205))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelRedondeado13, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(panelRedondeado14, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(panelRedondeado15, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRedondeado16, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel19))
                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel23)
                                .addComponent(rbExterno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelRedondeado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarSocio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel28)
                                .addComponent(dcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(pExterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelRedondeado4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24)
                            .addComponent(panelRedondeado5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRedondeado8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel27)
                        .addComponent(panelRedondeado9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(panelRedondeado10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(panelRedondeado12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRedondeado13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRedondeado14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRedondeado15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRedondeado16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        vInicio.abrirPrestamo();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void rbExternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbExternoActionPerformed
        if (rbExterno.isSelected()) {
            pExterno.setBackground(Color.WHITE);
            txtNombreExterno.setEnabled(true);
            btnBuscarSocio.setEnabled(false);
            cmbSocio.setEnabled(false);
            txtNombreExterno.requestFocus();
        } else {
            pExterno.setBackground(new Color(242, 242, 242));
            txtNombreExterno.setEnabled(false);
            btnBuscarSocio.setEnabled(true);
            cmbSocio.setEnabled(true);
            txtNombreExterno.setText("Nombre externo");
        }
    }//GEN-LAST:event_rbExternoActionPerformed

    private void txtNombreExternoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreExternoFocusGained
        txtNombreExterno.setText("");
    }//GEN-LAST:event_txtNombreExternoFocusGained

    private void txtNombreExternoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreExternoFocusLost
        if (txtNombreExterno.getText().isEmpty()) {
            txtNombreExterno.setText("Nombre externo");
        }
    }//GEN-LAST:event_txtNombreExternoFocusLost

    private void btnRealizarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPrestamoActionPerformed
        guardar();
    }//GEN-LAST:event_btnRealizarPrestamoActionPerformed

    private void btnContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratoActionPerformed
        reporte();
    }//GEN-LAST:event_btnContratoActionPerformed

    private void reporte() {
        setPrestamo();
        GenerarReporte reporte = new GenerarReporte("Contrato", prestamo);
        reporte.run();
    }

    private void setPrestamo() {
        prestamo.setEstatus("APROBADO");
        prestamo.setFechaAprobacion(dcFecha.getDate());
        prestamo.setIntereses(0.07);
        Double monto = Double.valueOf(txtMonto.getText());
        prestamo.setMonto(monto);
        prestamo.setSaldoRestante(monto);
        prestamo.setSocio(socios.get(cmbSocio.getSelectedIndex() - 1));
        prestamo.setUsuario(Config.getUsuarioLog());
    }

    private void guardar() {
        setPrestamo();
        boolean guardado = CPrestamo.guardarRegistro(prestamo);
        if (guardado) {
            JOptionPane.showMessageDialog(this, "Se ha registrado el préstamo correctamente",
                    "Prestamo Realizado", JOptionPane.INFORMATION_MESSAGE);
            vInicio.abrirPrestamo();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarSocio;
    private javax.swing.JButton btnContrato;
    private javax.swing.JButton btnCronograma;
    private javax.swing.JButton btnPagare;
    private javax.swing.JButton btnRealizarPrestamo;
    private javax.swing.JComboBox<String> cmbSocio;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private utilerias.PanelRedondeado pExterno;
    private utilerias.PanelRedondeado panelRedondeado1;
    private utilerias.PanelRedondeado panelRedondeado10;
    private utilerias.PanelRedondeado panelRedondeado12;
    private utilerias.PanelRedondeado panelRedondeado13;
    private utilerias.PanelRedondeado panelRedondeado14;
    private utilerias.PanelRedondeado panelRedondeado15;
    private utilerias.PanelRedondeado panelRedondeado16;
    private utilerias.PanelRedondeado panelRedondeado4;
    private utilerias.PanelRedondeado panelRedondeado5;
    private utilerias.PanelRedondeado panelRedondeado8;
    private utilerias.PanelRedondeado panelRedondeado9;
    private javax.swing.JRadioButton rbExterno;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtFormaPago;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNombreExterno;
    private javax.swing.JTextField txtNumCuotas;
    private javax.swing.JTextField txtTasaInteres;
    private javax.swing.JTextField txtTotalInteres;
    private javax.swing.JTextField txtTotalPagar;
    // End of variables declaration//GEN-END:variables
}
