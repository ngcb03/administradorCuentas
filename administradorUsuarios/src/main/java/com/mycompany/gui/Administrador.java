package com.mycompany.gui;

import com.mycompany.logica.Controladora;
import com.mycompany.logica.Cuenta;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Administrador extends javax.swing.JFrame {

    private static Controladora control = Controladora.getInstance();
    private static String usuarioVer = null;
    private static String rolVer = null;
    
    public Administrador() {
        initComponents();
        txtUsuario.setText("Usuario: " + Administrador.usuarioVer);
        txtRol.setText("Rol: " + Administrador.rolVer);
    }
    
    public Administrador(String usuario, String rol) {
        initComponents();
        txtUsuario.setText("Usuario: " + (Administrador.usuarioVer = usuario));
        txtRol.setText("Rol: " + (Administrador.rolVer = rol));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEstado = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        txtUsuario = new javax.swing.JLabel();
        txtRol = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel1.setText("ADMINISTRAR DE USUARIOS");

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaUsuarios);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Lista de usuarios registrados");

        btnCrear.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnCrear.setIcon(new javax.swing.ImageIcon("G:\\Mi unidad\\GITHUB\\CURSOS\\BACKEND\\TODO CODE\\04_JAVA\\02_POO\\PROYECTOS\\administradorUsuarios\\administradorUsuarios\\src\\main\\java\\img\\registroUsuario.png")); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon("G:\\Mi unidad\\GITHUB\\CURSOS\\BACKEND\\TODO CODE\\04_JAVA\\02_POO\\PROYECTOS\\administradorUsuarios\\administradorUsuarios\\src\\main\\java\\img\\editar.png")); // NOI18N
        btnActualizar.setText("Actualizar datos");
        btnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon("G:\\Mi unidad\\GITHUB\\CURSOS\\BACKEND\\TODO CODE\\04_JAVA\\02_POO\\PROYECTOS\\administradorUsuarios\\administradorUsuarios\\src\\main\\java\\img\\eliminar.png")); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEstado.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnEstado.setIcon(new javax.swing.ImageIcon("G:\\Mi unidad\\GITHUB\\CURSOS\\BACKEND\\TODO CODE\\04_JAVA\\02_POO\\PROYECTOS\\administradorUsuarios\\administradorUsuarios\\src\\main\\java\\img\\estado_cuenta.png")); // NOI18N
        btnEstado.setText("Habilitar / Inhabilitar");
        btnEstado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        jLabel3.setText("Opciones de cuenta");

        btnSalir.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon("G:\\Mi unidad\\GITHUB\\CURSOS\\BACKEND\\TODO CODE\\04_JAVA\\02_POO\\PROYECTOS\\administradorUsuarios\\administradorUsuarios\\src\\main\\java\\img\\volver.png")); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtUsuario.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtUsuario.setText("Usuario:");

        txtRol.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtRol.setText("Rol:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtRol, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtUsuario)
                        .addGap(3, 3, 3)
                        .addComponent(txtRol)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrear)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)
                        .addGap(16, 16, 16)
                        .addComponent(btnEstado)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir)
                        .addGap(85, 85, 85))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Administrador.verLogin();
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        Administrador.verCrearCuenta();
        this.dispose();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoActionPerformed
        if(validarTablaAccion()){
            int num_cuenta =  Integer.parseInt(String.valueOf(tablaUsuarios.getValueAt(
                    tablaUsuarios.getSelectedRow(), 0)));
            String estadoCuenta  =  String.valueOf(tablaUsuarios.getValueAt(
                    tablaUsuarios.getSelectedRow(), 4));
            Administrador.control.actualizarEstadoCuenta(num_cuenta, (!estadoCuenta.equalsIgnoreCase("Activo")));
            
            String estado = estadoCuenta.equalsIgnoreCase("Activo") ? "inhabilitada!" : "habilitada!";
            Administrador.mensajeEmergente("¡Operación completa!", "info", "¡La cuenta ha sido " + 
                    estado);
            this.cargarTabla();
        }
    }//GEN-LAST:event_btnEstadoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.cargarTabla();        
    }//GEN-LAST:event_formWindowOpened

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(validarTablaAccion()){
            int num_cuenta =  Integer.parseInt(String.valueOf(tablaUsuarios.getValueAt(
                    tablaUsuarios.getSelectedRow(), 0)));
            Administrador.verEditarCuenta(num_cuenta);
            this.dispose();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(validarTablaAccion()){
            int num_cuenta =  Integer.parseInt(String.valueOf(tablaUsuarios.getValueAt(
                    tablaUsuarios.getSelectedRow(), 0)));
            Administrador.control.eliminarCuenta(num_cuenta);
            Administrador.mensajeEmergente("¡Operación completada!", "info", "¡La cuenta ha sido eliminada!");
            this.cargarTabla();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cargarTabla(){
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        String[] titulos = {"Num", "Usuario", "Contraseña", "Rol",  "Estado"};
        modeloTabla.setColumnIdentifiers(titulos);
     
        List<Cuenta> listaCuentas = control.traerCuentas();
        
        if(!listaCuentas.isEmpty()){
            for(Cuenta cuenta: listaCuentas){
               Object[] objeto = {cuenta.getId(), cuenta.getUsuario(), 
                   cuenta.getContrasenia(), cuenta.getRol().getRol(), (cuenta.isHabilitado() ? "Activo" : "Inactivo")};
               modeloTabla.addRow(objeto);
            }
            
            tablaUsuarios.setModel(modeloTabla);
            
        }
        
    }
    
    private boolean validarTablaAccion(){
        
        if(tablaUsuarios.getRowCount() > 0){
            if(tablaUsuarios.getSelectedRow() != (-1)){
                return true;
            } else {
                Administrador.mensajeEmergente("¡Operación errónea!", "error", "¡No ha seleccionado una cuenta!");
            }
        } else {
            Administrador.mensajeEmergente("¡Operación errónea!", "error", "¡La tabla se encuentra vacía!");
        }
         return false;
    }
    
    private static void verCrearCuenta(){
        CrearCuenta guiCrearCuenta = new CrearCuenta();
        guiCrearCuenta.setVisible(true);
        guiCrearCuenta.setLocationRelativeTo(null);
        guiCrearCuenta.setResizable(false);
    }
    
    private static void verLogin(){
        Login interfaz = new Login();
        interfaz.setVisible(true);
        interfaz.setLocationRelativeTo(null);
        interfaz.setResizable(false);
    }
    
    private static void verEditarCuenta(int num_cuenta){
        EditarCuenta editarCuenta = new EditarCuenta(num_cuenta);
        editarCuenta.setVisible(true);
        editarCuenta.setLocationRelativeTo(null);
        editarCuenta.setResizable(false);
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
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEstado;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JLabel txtRol;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
