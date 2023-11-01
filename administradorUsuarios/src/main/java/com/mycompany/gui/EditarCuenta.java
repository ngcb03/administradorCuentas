package com.mycompany.gui;

import com.mycompany.logica.Controladora;
import com.mycompany.logica.Cuenta;
import com.mycompany.logica.Rol;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class EditarCuenta extends javax.swing.JFrame {
    
    private static final Controladora control = Controladora.getInstance();
    private static Cuenta cuenta;
    private static int num_cuenta = (-1);
    
    public EditarCuenta() {
        initComponents();
    }
    
    public EditarCuenta(int num_cuenta) {
        initComponents();
        EditarCuenta.num_cuenta = num_cuenta;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        txtContrasenia = new javax.swing.JPasswordField();
        txtContraseniaConf = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        cmbRol = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtPassAnt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel1.setText("ACTUALIZAR CUENTA");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel2.setText("Nuevo nombre para usuario:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel3.setText("Nueva contraseña para el usuario: ");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel4.setText("Confirmar nueva contraseña:");

        btnVolver.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon("G:\\Mi unidad\\GITHUB\\CURSOS\\BACKEND\\TODO CODE\\04_JAVA\\02_POO\\PROYECTOS\\administradorUsuarios\\administradorUsuarios\\src\\main\\java\\img\\volver.png")); // NOI18N
        btnVolver.setText(" Volver");
        btnVolver.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon("G:\\Mi unidad\\GITHUB\\CURSOS\\BACKEND\\TODO CODE\\04_JAVA\\02_POO\\PROYECTOS\\administradorUsuarios\\administradorUsuarios\\src\\main\\java\\img\\limpiar.png")); // NOI18N
        btnLimpiar.setText(" Limpiar");
        btnLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon("G:\\Mi unidad\\GITHUB\\CURSOS\\BACKEND\\TODO CODE\\04_JAVA\\02_POO\\PROYECTOS\\administradorUsuarios\\administradorUsuarios\\src\\main\\java\\img\\registro.png")); // NOI18N
        btnModificar.setText("Guardar");
        btnModificar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel5.setText("Seleccionar rol:");

        cmbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel6.setText("Contraseña actual:");

        txtPassAnt.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtPassAnt.setText("...");
        txtPassAnt.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPassAnt, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(164, 164, 164))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(txtContrasenia)
                                        .addComponent(txtContraseniaConf, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cmbRol, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addComponent(btnModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassAnt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addComponent(btnVolver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContraseniaConf, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        EditarCuenta.verInicio();
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private static void verInicio(){
        Administrador administrador = new Administrador();
        administrador.setVisible(true);
        administrador.setLocationRelativeTo(null);
        administrador.setResizable(false);
    }
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        if(txtUsuario.getText().equals("") || 
            txtContrasenia.getText().equals("") || 
            txtContraseniaConf.getText().equals("") ||
            cmbRol.getSelectedIndex() == 0){
            EditarCuenta.mensajeEmergente("Operación errónea", "error", "¡Faltan campos por llenar!");
        } else {
            if (txtContrasenia.getText().equals(txtContraseniaConf.getText())) {
                String usuario = txtUsuario.getText();
                String contrasenia = txtContrasenia.getText();
                String rol = (String) cmbRol.getSelectedItem();
                control.actualizarCuenta(EditarCuenta.num_cuenta, usuario, contrasenia, rol);
                limpiar();
                EditarCuenta.mensajeEmergente("Operación completada", "info", "¡La cuenta ha sido actualizada!");
                EditarCuenta.verInicio();
                this.dispose();
            } else {
                EditarCuenta.mensajeEmergente("Operación errónea", "error", "¡Las contraseñas deben ser iguales!");
            }            
        }
        
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        // llenar campos con cuenta a modificar
        EditarCuenta.cuenta = EditarCuenta.control.traerCuenta(EditarCuenta.num_cuenta);
        txtUsuario.setText(EditarCuenta.cuenta.getUsuario());
        txtPassAnt.setText(EditarCuenta.cuenta.getContrasenia());
        
        // traer roles desde bbdd
        List<Rol> listaRoles = control.traerRoles();
        if(!listaRoles.isEmpty()){
            for(Rol rol: listaRoles){
                cmbRol.addItem(rol.getRol());
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void limpiar(){
        txtUsuario.setText("");
        txtContrasenia.setText("");
        txtContraseniaConf.setText("");
        cmbRol.setSelectedIndex(0);
    }
    
    private static void mensajeEmergente(String titulo, String tipo, String mensaje){
        
        JOptionPane optionPane = new JOptionPane(mensaje);
        
        if(tipo.equalsIgnoreCase("info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if(tipo.equalsIgnoreCase("error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JPasswordField txtContraseniaConf;
    private javax.swing.JLabel txtPassAnt;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
