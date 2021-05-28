
package agro.pages;

import AppPackage.AnimationClass;
import java.awt.Color;
import javax.swing.JOptionPane;
import models.MySQL;
import models.Usuario;

public class LoginPage extends javax.swing.JFrame {
    
    AnimationClass animation = new AnimationClass();
    boolean visible = false;
    Color colorPrimario = new Color(0, 105,93);    
    Color colorLetra = new Color(51, 51,51);

    


    
    public LoginPage() {
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciaButton();
        
        
    }

   public void transparenciaButton(){
       jButtonCrearCuenta.setOpaque(false);
       jButtonCrearCuenta.setContentAreaFilled(false);
       jButtonCrearCuenta.setBorderPainted(false);
       jButtonTieneCuenta.setOpaque(false);
       jButtonTieneCuenta.setContentAreaFilled(false);
       jButtonTieneCuenta.setBorderPainted(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelIniciaSesion1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jPasswordInicia = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        passswordVisible = new javax.swing.JLabel();
        jButton1Ingresar2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButtonCrearCuenta = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabelBienvenido = new javax.swing.JLabel();
        jLabelDescripInicio = new javax.swing.JLabel();
        jLabelDescripRegister = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelRegistro = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordRegister = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jTextField5 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        passwordVisibiliy2 = new javax.swing.JLabel();
        jButtonTieneCuenta = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(730, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(730, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelIniciaSesion1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelIniciaSesion1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Usuario (Email)");

        jTextField2.setText("ingrese usuario");
        jTextField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jSeparator3.setForeground(new java.awt.Color(0, 105, 93));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Contraseña");

        jPasswordInicia.setText("jPasswordField1");
        jPasswordInicia.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPasswordInicia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordIniciaActionPerformed(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(0, 105, 93));

        passswordVisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/visibility.png"))); // NOI18N
        passswordVisible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passswordVisibleMouseClicked(evt);
            }
        });

        jButton1Ingresar2.setBackground(new java.awt.Color(0, 105, 94));
        jButton1Ingresar2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1Ingresar2.setForeground(new java.awt.Color(255, 255, 255));
        jButton1Ingresar2.setText("ingresar");
        jButton1Ingresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1Ingresar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPasswordInicia, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passswordVisible, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(56, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1Ingresar2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(43, 43, 43))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPasswordInicia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(passswordVisible)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1Ingresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/hombre.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButtonCrearCuenta.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCrearCuenta.setForeground(new java.awt.Color(0, 105, 94));
        jButtonCrearCuenta.setText("Crear una cuenta?");
        jButtonCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelIniciaSesion1Layout = new javax.swing.GroupLayout(jPanelIniciaSesion1);
        jPanelIniciaSesion1.setLayout(jPanelIniciaSesion1Layout);
        jPanelIniciaSesion1Layout.setHorizontalGroup(
            jPanelIniciaSesion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIniciaSesion1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(jPanelIniciaSesion1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelIniciaSesion1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
        );
        jPanelIniciaSesion1Layout.setVerticalGroup(
            jPanelIniciaSesion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIniciaSesion1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButtonCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBienvenido.setBackground(new java.awt.Color(255, 255, 255));
        jLabelBienvenido.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBienvenido.setText("Bienvenido");
        jPanel2.add(jLabelBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 140));

        jLabelDescripInicio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelDescripInicio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescripInicio.setText("<html>Inicia sesion con tu cuenta y compra/vente tus productos al mejor precio<html");
        jPanel2.add(jLabelDescripInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 330, 110));

        jLabelDescripRegister.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelDescripRegister.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescripRegister.setText("<html>Registrate y disfruta de los beneficios que tiene AgroLibre para ti!<html");
        jPanel2.add(jLabelDescripRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(-350, 230, 330, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgdef.jpeg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 411, -1));

        jPanelRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRegistro.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jTextField1.setText("ingrese apellido");
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPasswordRegister.setText("jPasswordField1");
        jPasswordRegister.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Nombre");

        jTextField3.setText("ingrese nombre");
        jTextField3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jSeparator5.setForeground(new java.awt.Color(0, 105, 93));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Apellido");

        jSeparator6.setForeground(new java.awt.Color(0, 105, 93));

        jTextField5.setText("ingrese apellido");
        jTextField5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jSeparator7.setForeground(new java.awt.Color(0, 105, 93));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Correo Electronico");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Teléfono");

        jSeparator8.setForeground(new java.awt.Color(0, 105, 93));

        jTextField4.setText("ingrese teléfono");
        jTextField4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Contraseña");

        jButtonRegistrar.setBackground(new java.awt.Color(0, 105, 94));
        jButtonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 107, 93));

        passwordVisibiliy2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/visibility.png"))); // NOI18N
        passwordVisibiliy2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordVisibiliy2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator8)
                        .addComponent(jSeparator7)
                        .addComponent(jSeparator5)
                        .addComponent(jSeparator6)
                        .addComponent(jTextField3)
                        .addComponent(jTextField1)
                        .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addComponent(jTextField5)
                        .addComponent(jSeparator1)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jButtonRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jPasswordRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordVisibiliy2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(10, 10, 10)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(2, 2, 2)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addGap(2, 2, 2)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel12)
                .addGap(1, 1, 1)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordRegister, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordVisibiliy2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jButtonTieneCuenta.setForeground(new java.awt.Color(0, 105, 94));
        jButtonTieneCuenta.setText("Ya tienes una cuenta?");
        jButtonTieneCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTieneCuentaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setText("Regístrate");

        jSeparator9.setBackground(new java.awt.Color(5, 105, 94));

        javax.swing.GroupLayout jPanelRegistroLayout = new javax.swing.GroupLayout(jPanelRegistro);
        jPanelRegistro.setLayout(jPanelRegistroLayout);
        jPanelRegistroLayout.setHorizontalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistroLayout.createSequentialGroup()
                        .addComponent(jButtonTieneCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanelRegistroLayout.setVerticalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonTieneCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelIniciaSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelIniciaSesion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordIniciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordIniciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordIniciaActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButtonCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearCuentaActionPerformed
        
      
       jPanelIniciaSesion1.setLocation(730, 0);
       jPanelRegistro.setLocation(410,0);
       animation.jLabelXLeft(30, -350, 10, 5, jLabelDescripInicio);
       animation.jLabelXRight(-350, 30, 10, 5, jLabelDescripRegister);
       
       jLabel5.setForeground(colorLetra);
       jSeparator4.setForeground(colorPrimario);
        
    }//GEN-LAST:event_jButtonCrearCuentaActionPerformed

    private void jButtonTieneCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTieneCuentaActionPerformed
        jPanelIniciaSesion1.setLocation(410, 0);
        jPanelRegistro.setLocation(730,0);
        
        animation.jLabelXLeft(30, -350, 10, 5, jLabelDescripRegister);
        animation.jLabelXRight(-350, 30, 10, 5, jLabelDescripInicio);
    }//GEN-LAST:event_jButtonTieneCuentaActionPerformed

    private void passswordVisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passswordVisibleMouseClicked
         if (visible){
            jPasswordInicia.setEchoChar('*'); 
            passswordVisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/visibility.png")));
            visible = false;
        }else{
            jPasswordInicia.setEchoChar((char)0);
            passswordVisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/not_visibility.png")));
            visible = true;
        }        
    }//GEN-LAST:event_passswordVisibleMouseClicked

    private void passwordVisibiliy2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordVisibiliy2MouseClicked
        if (visible){
            jPasswordRegister.setEchoChar('*'); 
            passwordVisibiliy2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/visibility.png")));
            visible = false;
        }else{
            jPasswordRegister.setEchoChar((char)0);
            passwordVisibiliy2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/not_visibility.png")));
            visible = true;
        } 
    }//GEN-LAST:event_passwordVisibiliy2MouseClicked

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        MySQL miDB = new MySQL();
        miDB.MySQLConnection("root", "", "pruebaagro");
        
        String tabla = "usuario";
        
        String nombre = jTextField3.getText();
        String apellido = jTextField1.getText();
        String telefono = jTextField4.getText();
        String email = jTextField5.getText();
        String password = jPasswordRegister.getText();
        
        boolean existe = miDB.verificarUsuario(tabla, email);
        if(!existe){
            int estado = miDB.insertData(tabla, nombre, apellido, email, password, telefono);    
            
            jLabel12.setForeground(colorLetra);
            jSeparator7.setForeground(colorPrimario);
            
              if(telefono.length() <= 10){
                jLabel11.setForeground(Color.black);
                jSeparator8.setForeground(colorPrimario);
            
          
                if (password.length() > 20){
                JOptionPane.showMessageDialog(this,"ERROR, La Contraseña supero 20 caracteres, Intenta de nuevo", "Estado", JOptionPane.ERROR_MESSAGE);
                senalizacionRojo(jLabel1, jSeparator1, Color.red);
                
                }else if(estado == 1){
                    jTextField3.setText("Ingrese Nombre");
                    jTextField4.setText("Ingrese Telefono");
                    jTextField1.setText("Ingrese Apellido");
                    jTextField5.setText("Ingrese Emaill");
                    jPasswordRegister.setText("password");
                
                    JOptionPane.showMessageDialog(this,"Usuario registrado con exito!! ", "Estado", JOptionPane.INFORMATION_MESSAGE);
                
                
                    jSeparator1.setForeground(colorPrimario);
                    jLabel1.setForeground(colorLetra);
                    
                  }else{
                
                    jLabel1.setForeground(colorLetra);
                    jSeparator1.setForeground(colorPrimario);
                    JOptionPane.showMessageDialog(this,"ERROR, Por favor revisar", "Estado", JOptionPane.ERROR_MESSAGE);
                  }
         
              }else{
                //System.out.println("Telefono " + telefono.length());
                 senalizacionRojo(jLabel11, jSeparator8,Color.red);
          
                JOptionPane.showMessageDialog(this,"ERROR, Telefono supero 10 caracteres. Intente de nuevo", "Estado", JOptionPane.ERROR_MESSAGE);
             }
         }else{
            senalizacionRojo(jLabel12, jSeparator7, Color.red);
            JOptionPane.showMessageDialog(this,"ERROR, Usuario ya existe", "Estado", JOptionPane.ERROR_MESSAGE);
        }
        miDB.closeConnection();
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButton1Ingresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1Ingresar2ActionPerformed
        MySQL miDB = new MySQL();
        miDB.MySQLConnection("root", "", "pruebaagro");
        String tabla = "usuario";
        
        String email = jTextField2.getText();
        String password = jPasswordInicia.getText();
        
        Usuario user = miDB.getUser(tabla, email, password);
        
        if(user != null ){
             
            if(user.getPassword()!= null){
                
                jTextField2.setText("");
                jPasswordInicia.setText("");
                HomeTemp hometemp = new HomeTemp();
                this.setVisible(false);
                hometemp.setVisible(true);
                
                jLabel5.setForeground(colorLetra);
                jSeparator4.setForeground(colorPrimario);
                
                
            }else{
                JOptionPane.showMessageDialog(this,"ERROR, Contraseña incorrecta. Intente de nuevo", "Estado", JOptionPane.ERROR_MESSAGE);
             
                senalizacionRojo(jLabel5, jSeparator4,Color.red);         
            }       
        }else{
            JOptionPane.showMessageDialog(this,"ERROR, Usuario no existe. Puedes Registrarte ahora", "Estado", JOptionPane.ERROR_MESSAGE);
           
            jLabel5.setForeground(colorLetra);
                
            jSeparator4.setForeground(colorPrimario);
        }
        miDB.closeConnection();
    }//GEN-LAST:event_jButton1Ingresar2ActionPerformed

    private void senalizacionRojo(javax.swing.JLabel label,javax.swing.JSeparator separator, Color color){
       label.setForeground(color);
       separator.setForeground(color);
    }

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Ingresar2;
    private javax.swing.JButton jButtonCrearCuenta;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonTieneCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBienvenido;
    private javax.swing.JLabel jLabelDescripInicio;
    private javax.swing.JLabel jLabelDescripRegister;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelIniciaSesion1;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JPasswordField jPasswordInicia;
    private javax.swing.JPasswordField jPasswordRegister;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel passswordVisible;
    private javax.swing.JLabel passwordVisibiliy2;
    // End of variables declaration//GEN-END:variables
}
