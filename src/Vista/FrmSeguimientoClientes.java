/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author betty
 */
public class FrmSeguimientoClientes extends javax.swing.JFrame {

    /**
     * Creates new form FrmSeguimientoClientes
     */
    public FrmSeguimientoClientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        lblID = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        lblLugarExpedicion = new javax.swing.JLabel();
        lblProfesion = new javax.swing.JLabel();
        lblNombreCompleto = new javax.swing.JLabel();
        lblDireccionResidencial = new javax.swing.JLabel();
        lblCiudad = new javax.swing.JLabel();
        txtLugarExpedicion = new javax.swing.JTextField();
        txtNombreCompleto = new javax.swing.JTextField();
        txtProfesion = new javax.swing.JTextField();
        txtDireccionResidencial = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        lblDepartamento = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblTelResidencia = new javax.swing.JLabel();
        lblTelTrabajo = new javax.swing.JLabel();
        lblNumFactura = new javax.swing.JLabel();
        lblTipoCartera = new javax.swing.JLabel();
        lblFechaMora = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelResidencia = new javax.swing.JTextField();
        txtTelTrabajo = new javax.swing.JTextField();
        txtNumFactura = new javax.swing.JTextField();
        txtTipoCartera = new javax.swing.JTextField();
        txtFechaMora = new javax.swing.JTextField();
        cmdAgregar = new javax.swing.JButton();
        cmdEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFechaMora1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtValmora = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtVseguro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtIntMora = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtSaldMora = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtTipoCobro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtFeAcuerdo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TxtAcuerdouno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TxtFeacudos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAcuerdoDos = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtFechaAcuerdoTres = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtFechaAcuerdoCuatro = new javax.swing.JTextField();
        txtAcuerdoTres = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtAcuerdoCuatro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblID.setText("ID");

        lblCedula.setText("Cedula");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        lblLugarExpedicion.setText("Lugar Expedicion");

        lblProfesion.setText("Profesion");

        lblNombreCompleto.setText("Nombre Completo");

        lblDireccionResidencial.setText("Direccion Residencial");

        lblCiudad.setText("Ciudad");

        txtDireccionResidencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionResidencialActionPerformed(evt);
            }
        });

        txtCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiudadActionPerformed(evt);
            }
        });

        lblDepartamento.setText("Departamento");

        lblEmail.setText("Email");

        lblTelResidencia.setText("Tel Residencia");

        lblTelTrabajo.setText("Tel Trabajo");

        lblNumFactura.setText("Num Factura");

        lblTipoCartera.setText("Tipo Cartera");

        lblFechaMora.setText("Fecha Mora");

        txtDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartamentoActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        cmdAgregar.setText("Agregar");
        cmdAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAgregarActionPerformed(evt);
            }
        });

        cmdEliminar.setText("Eliminar");

        jLabel1.setText("Dias Mora");

        jLabel2.setText("Val Mora");

        TxtValmora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtValmoraActionPerformed(evt);
            }
        });

        jLabel3.setText("V Seguro");

        TxtVseguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtVseguroActionPerformed(evt);
            }
        });

        jLabel4.setText("Interes Mora");

        TxtIntMora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIntMoraActionPerformed(evt);
            }
        });

        jLabel5.setText("Sald Mora");

        TxtSaldMora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSaldMoraActionPerformed(evt);
            }
        });

        jLabel6.setText("Tipo Cobro");

        TxtTipoCobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTipoCobroActionPerformed(evt);
            }
        });

        jLabel7.setText("Fecha Acuerdo Uno");

        TxtFeAcuerdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFeAcuerdoActionPerformed(evt);
            }
        });

        jLabel8.setText("Acuerdo Uno");

        TxtAcuerdouno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAcuerdounoActionPerformed(evt);
            }
        });

        jLabel9.setText("Fecha Acuerdo Dos");

        TxtFeacudos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFeacudosActionPerformed(evt);
            }
        });

        jLabel10.setText("Acuerdo Dos");

        jLabel11.setText("Fecha Acuerdo Tres");

        jLabel12.setText("Acuerdo Tres");

        jLabel13.setText("Fecha Acuerdo Cuatro");

        jLabel14.setText("Acuerdo Cuatro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNombreCompleto)
                    .addComponent(lblLugarExpedicion)
                    .addComponent(lblCedula)
                    .addComponent(lblID)
                    .addComponent(lblDireccionResidencial)
                    .addComponent(lblProfesion)
                    .addComponent(lblCiudad)
                    .addComponent(lblDepartamento)
                    .addComponent(lblEmail)
                    .addComponent(lblTelResidencia)
                    .addComponent(lblTelTrabajo)
                    .addComponent(lblNumFactura)
                    .addComponent(lblTipoCartera)
                    .addComponent(lblFechaMora)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCedula)
                    .addComponent(txtLugarExpedicion)
                    .addComponent(txtID)
                    .addComponent(txtNombreCompleto)
                    .addComponent(txtProfesion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDireccionResidencial, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDepartamento, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTelResidencia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTelTrabajo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNumFactura, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTipoCartera, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFechaMora)
                    .addComponent(txtFechaMora1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtIntMora, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtSaldMora, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtFeAcuerdo)
                            .addComponent(TxtTipoCobro)
                            .addComponent(TxtVseguro)
                            .addComponent(TxtValmora, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtFeacudos)
                            .addComponent(TxtAcuerdouno)
                            .addComponent(txtAcuerdoDos, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAcuerdoCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(txtFechaAcuerdoTres, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAcuerdoTres)
                            .addComponent(txtFechaAcuerdoCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblID)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCedula)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLugarExpedicion)
                            .addComponent(txtLugarExpedicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreCompleto)
                            .addComponent(txtNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(TxtTipoCobro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(TxtFeAcuerdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(TxtAcuerdouno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(TxtFeacudos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtAcuerdoDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtFechaAcuerdoTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtAcuerdoTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtFechaAcuerdoCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(txtAcuerdoCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblProfesion)
                                    .addComponent(txtProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDireccionResidencial)
                                    .addComponent(txtDireccionResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCiudad)
                                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDepartamento)
                                    .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEmail)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTelResidencia)
                                    .addComponent(txtTelResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTelTrabajo)
                                    .addComponent(txtTelTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNumFactura)
                                    .addComponent(txtNumFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTipoCartera)
                                    .addComponent(txtTipoCartera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblFechaMora)
                                    .addComponent(txtFechaMora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtFechaMora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmdAgregar)
                                    .addComponent(cmdEliminar)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtValmora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TxtVseguro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TxtIntMora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TxtSaldMora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtDireccionResidencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionResidencialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionResidencialActionPerformed

    private void txtCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCiudadActionPerformed

    private void txtDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartamentoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void TxtValmoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtValmoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtValmoraActionPerformed

    private void TxtVseguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtVseguroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtVseguroActionPerformed

    private void TxtIntMoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIntMoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIntMoraActionPerformed

    private void TxtSaldMoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSaldMoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSaldMoraActionPerformed

    private void TxtTipoCobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTipoCobroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTipoCobroActionPerformed

    private void TxtFeAcuerdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFeAcuerdoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFeAcuerdoActionPerformed

    private void TxtAcuerdounoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAcuerdounoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAcuerdounoActionPerformed

    private void TxtFeacudosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFeacudosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFeacudosActionPerformed

    private void cmdAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdAgregarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmSeguimientoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSeguimientoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSeguimientoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSeguimientoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSeguimientoClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField TxtAcuerdouno;
    public javax.swing.JTextField TxtFeAcuerdo;
    public javax.swing.JTextField TxtFeacudos;
    public javax.swing.JTextField TxtIntMora;
    public javax.swing.JTextField TxtSaldMora;
    public javax.swing.JTextField TxtTipoCobro;
    public javax.swing.JTextField TxtValmora;
    public javax.swing.JTextField TxtVseguro;
    public javax.swing.JButton cmdAgregar;
    public javax.swing.JButton cmdEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblDepartamento;
    private javax.swing.JLabel lblDireccionResidencial;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFechaMora;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLugarExpedicion;
    private javax.swing.JLabel lblNombreCompleto;
    private javax.swing.JLabel lblNumFactura;
    private javax.swing.JLabel lblProfesion;
    private javax.swing.JLabel lblTelResidencia;
    private javax.swing.JLabel lblTelTrabajo;
    private javax.swing.JLabel lblTipoCartera;
    public javax.swing.JTextField txtAcuerdoCuatro;
    public javax.swing.JTextField txtAcuerdoDos;
    public javax.swing.JTextField txtAcuerdoTres;
    public javax.swing.JTextField txtCedula;
    public javax.swing.JTextField txtCiudad;
    public javax.swing.JTextField txtDepartamento;
    public javax.swing.JTextField txtDireccionResidencial;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtFechaAcuerdoCuatro;
    public javax.swing.JTextField txtFechaAcuerdoTres;
    public javax.swing.JTextField txtFechaMora;
    public javax.swing.JTextField txtFechaMora1;
    public javax.swing.JTextField txtID;
    public javax.swing.JTextField txtLugarExpedicion;
    public javax.swing.JTextField txtNombreCompleto;
    public javax.swing.JTextField txtNumFactura;
    public javax.swing.JTextField txtProfesion;
    public javax.swing.JTextField txtTelResidencia;
    public javax.swing.JTextField txtTelTrabajo;
    public javax.swing.JTextField txtTipoCartera;
    // End of variables declaration//GEN-END:variables
}
