/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_marcelarivera;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mvrivera
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        //this.setLocationRelativeTo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CrearCuenta = new javax.swing.JFrame();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        AlumnoNormal = new javax.swing.JFrame();
        contra_normal = new javax.swing.JTextField();
        edad_normal = new javax.swing.JTextField();
        carrera_normal = new javax.swing.JTextField();
        nombre_normal = new javax.swing.JTextField();
        cuenta_normal = new javax.swing.JTextField();
        lugar_normal = new javax.swing.JTextField();
        usuario_normal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        aprendizaje_normal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Tutor = new javax.swing.JFrame();
        carrera_tutor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        nombre_tutor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cuenta_tutor = new javax.swing.JTextField();
        lugar_tutor = new javax.swing.JTextField();
        usuario_tutor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        contra_tutor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        edad_tutor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        musica = new javax.swing.JCheckBox();
        Mate = new javax.swing.JCheckBox();
        espa = new javax.swing.JCheckBox();
        ccnn = new javax.swing.JCheckBox();
        ccss = new javax.swing.JCheckBox();
        progra = new javax.swing.JCheckBox();
        sociologia = new javax.swing.JCheckBox();
        antro = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        ganancia_tutor = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        nivel_tutor = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jButton4.setText("Registrarse como alumno normal");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Registrar como tutor");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CrearCuentaLayout = new javax.swing.GroupLayout(CrearCuenta.getContentPane());
        CrearCuenta.getContentPane().setLayout(CrearCuentaLayout);
        CrearCuentaLayout.setHorizontalGroup(
            CrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearCuentaLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(CrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(342, Short.MAX_VALUE))
        );
        CrearCuentaLayout.setVerticalGroup(
            CrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearCuentaLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jButton4)
                .addGap(57, 57, 57)
                .addComponent(jButton5)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        jLabel1.setText("Nombre:");

        jLabel2.setText("Edad:");

        jLabel3.setText("Carrera:");

        jLabel4.setText("Lugar de nacimiento:");

        jLabel5.setText("Numero de cuenta:");

        jLabel6.setText("Usuario:");

        jLabel7.setText("Contraseña:");

        jButton6.setText("Agregar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel8.setText("Nivel Aprendizaje:");

        javax.swing.GroupLayout AlumnoNormalLayout = new javax.swing.GroupLayout(AlumnoNormal.getContentPane());
        AlumnoNormal.getContentPane().setLayout(AlumnoNormalLayout);
        AlumnoNormalLayout.setHorizontalGroup(
            AlumnoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlumnoNormalLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(AlumnoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6)
                    .addGroup(AlumnoNormalLayout.createSequentialGroup()
                        .addGroup(AlumnoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(AlumnoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombre_normal)
                            .addComponent(edad_normal)
                            .addComponent(carrera_normal)
                            .addComponent(lugar_normal, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                            .addComponent(cuenta_normal)
                            .addComponent(usuario_normal)
                            .addComponent(contra_normal)
                            .addComponent(aprendizaje_normal))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        AlumnoNormalLayout.setVerticalGroup(
            AlumnoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlumnoNormalLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(AlumnoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AlumnoNormalLayout.createSequentialGroup()
                        .addGroup(AlumnoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AlumnoNormalLayout.createSequentialGroup()
                                .addGroup(AlumnoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(AlumnoNormalLayout.createSequentialGroup()
                                        .addGroup(AlumnoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(AlumnoNormalLayout.createSequentialGroup()
                                                .addGroup(AlumnoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(nombre_normal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel1))
                                                .addGap(18, 18, 18)
                                                .addComponent(edad_normal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addComponent(carrera_normal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(AlumnoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lugar_normal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addComponent(cuenta_normal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(usuario_normal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(AlumnoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contra_normal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(AlumnoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aprendizaje_normal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(20, 20, 20)
                .addComponent(jButton6)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jLabel9.setText("Usuario:");

        jLabel10.setText("Contraseña:");

        jLabel11.setText("Nombre:");

        jLabel12.setText("Edad:");

        jLabel13.setText("Carrera:");

        jLabel14.setText("Lugar de nacimiento:");

        jLabel15.setText("Numero de cuenta:");

        musica.setText("Musica");

        Mate.setText("Matematicas");

        espa.setText("Español");

        ccnn.setText("CCNN");

        ccss.setText("CCSS");

        progra.setText("Programacion");

        sociologia.setText("Sociologia");

        antro.setText("Antropologia");

        jLabel16.setText("Clases Dadas:");

        jButton7.setText("Agregar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel17.setText("Ganancia:");

        jLabel18.setText("Nivel de enseñanza:");

        javax.swing.GroupLayout TutorLayout = new javax.swing.GroupLayout(Tutor.getContentPane());
        Tutor.getContentPane().setLayout(TutorLayout);
        TutorLayout.setHorizontalGroup(
            TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TutorLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TutorLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TutorLayout.createSequentialGroup()
                                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Mate)
                                    .addComponent(espa)
                                    .addComponent(ccss)
                                    .addComponent(ccnn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(antro)
                                    .addComponent(sociologia)
                                    .addComponent(progra)
                                    .addComponent(musica)))
                            .addGroup(TutorLayout.createSequentialGroup()
                                .addGap(288, 288, 288)
                                .addComponent(jButton7))))
                    .addGroup(TutorLayout.createSequentialGroup()
                        .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nombre_tutor)
                                .addComponent(edad_tutor)
                                .addComponent(carrera_tutor)
                                .addComponent(lugar_tutor)
                                .addComponent(cuenta_tutor)
                                .addComponent(usuario_tutor)
                                .addComponent(contra_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ganancia_tutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nivel_tutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        TutorLayout.setVerticalGroup(
            TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TutorLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TutorLayout.createSequentialGroup()
                        .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(TutorLayout.createSequentialGroup()
                                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(TutorLayout.createSequentialGroup()
                                        .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(TutorLayout.createSequentialGroup()
                                                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(nombre_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel11))
                                                .addGap(18, 18, 18)
                                                .addComponent(edad_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel12))
                                        .addGap(18, 18, 18)
                                        .addComponent(carrera_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lugar_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addComponent(cuenta_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addComponent(usuario_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contra_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(12, 12, 12)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(ganancia_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nivel_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mate)
                    .addComponent(musica)
                    .addComponent(jLabel16))
                .addGap(2, 2, 2)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(espa)
                    .addComponent(progra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccss)
                    .addComponent(sociologia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccnn)
                    .addComponent(antro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addGap(53, 53, 53))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Crear cuenta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Crear examen");

        jButton3.setText("Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addGap(47, 47, 47)
                .addComponent(jButton3)
                .addGap(45, 45, 45)
                .addComponent(jButton2)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CrearCuenta.pack();
        this.setVisible(false);

        CrearCuenta.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    ArrayList<Alumno> alumnos = new ArrayList();

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        alumnos.add(new Alumno_normal(Integer.parseInt(edad_normal.getText()), nombre_normal.getText(),
                carrera_normal.getText(), lugar_normal.getText(), usuario_normal.getText(),
                contra_normal.getText(), Integer.parseInt(edad_normal.getText()), Integer.parseInt(cuenta_normal.getText())));
        JOptionPane.showMessageDialog(this, "Se ingreso correctamente");

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        alumnos.add(new Tutor(Double.parseDouble(ganancia_tutor.getText()), Integer.parseInt(nivel_tutor.getText()), nombre_tutor.getText(), carrera_tutor.getText(), lugar_tutor.getText(), usuario_tutor.getText(), contra_tutor.getText(),
                Integer.parseInt(edad_tutor.getText()), Integer.parseInt(cuenta_tutor.getText())));
        if (Mate.isSelected()) {
            ((Tutor) alumnos.get(alumnos.size() - 1)).getClasesDadas().add("Matematicas");
            System.out.println(":D");
        }
        if (sociologia.isSelected()) {
            ((Tutor) alumnos.get(alumnos.size() - 1)).getClasesDadas().add("Sociologia");
        }
        if (espa.isSelected()) {
            ((Tutor) alumnos.get(alumnos.size() - 1)).getClasesDadas().add("Español");
        }
        if (ccnn.isSelected()) {
            ((Tutor) alumnos.get(alumnos.size() - 1)).getClasesDadas().add("CCNN");
        }
        if (ccss.isSelected()) {
            ((Tutor) alumnos.get(alumnos.size() - 1)).getClasesDadas().add("CCSS");
        }
        if (progra.isSelected()) {
            ((Tutor) alumnos.get(alumnos.size() - 1)).getClasesDadas().add("Programacion");
        }
        if (musica.isSelected()) {
            ((Tutor) alumnos.get(alumnos.size() - 1)).getClasesDadas().add("Musica");
        }
        if (antro.isSelected()) {
            ((Tutor) alumnos.get(alumnos.size() - 1)).getClasesDadas().add("Antropologia");
        }

        JOptionPane.showMessageDialog(this, "Se ingreso correctamente");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        CrearCuenta.pack();
        AlumnoNormal.pack();
        CrearCuenta.setVisible(false);
        AlumnoNormal.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        CrearCuenta.pack();
        Tutor.pack();
        CrearCuenta.setVisible(false);
        Tutor.setVisible(true);


    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame AlumnoNormal;
    private javax.swing.JFrame CrearCuenta;
    private javax.swing.JCheckBox Mate;
    private javax.swing.JFrame Tutor;
    private javax.swing.JCheckBox antro;
    private javax.swing.JTextField aprendizaje_normal;
    private javax.swing.JTextField carrera_normal;
    private javax.swing.JTextField carrera_tutor;
    private javax.swing.JCheckBox ccnn;
    private javax.swing.JCheckBox ccss;
    private javax.swing.JTextField contra_normal;
    private javax.swing.JTextField contra_tutor;
    private javax.swing.JTextField cuenta_normal;
    private javax.swing.JTextField cuenta_tutor;
    private javax.swing.JTextField edad_normal;
    private javax.swing.JTextField edad_tutor;
    private javax.swing.JCheckBox espa;
    private javax.swing.JTextField ganancia_tutor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lugar_normal;
    private javax.swing.JTextField lugar_tutor;
    private javax.swing.JCheckBox musica;
    private javax.swing.JTextField nivel_tutor;
    private javax.swing.JTextField nombre_normal;
    private javax.swing.JTextField nombre_tutor;
    private javax.swing.JCheckBox progra;
    private javax.swing.JCheckBox sociologia;
    private javax.swing.JTextField usuario_normal;
    private javax.swing.JTextField usuario_tutor;
    // End of variables declaration//GEN-END:variables
}
