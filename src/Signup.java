
import javax.swing.JOptionPane;


public final class Signup extends javax.swing.JFrame {

    Loginn L = new Loginn();
   
    public Signup() {
        initComponents();
        L.setVisible(false);
        
        
        //Default Visibility of icons is false
        icon3.setVisible(false);
        icon4.setVisible(false);
    }
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Fullname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Username2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Password2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        icon3 = new javax.swing.JLabel();
        icon4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SignUp");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setForeground(new java.awt.Color(153, 153, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paw.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("WELCOME");

        jLabel11.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("TO");

        jLabel12.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("PETSHOP");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 98, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addGap(96, 96, 96))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 500);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("SIGN UP");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Full Name");

        Fullname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FullnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FullnameFocusLost(evt);
            }
        });
        Fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullnameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Username");

        Username2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Username2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Username2FocusLost(evt);
            }
        });
        Username2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Username2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Password");

        Password2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Password2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Password2FocusLost(evt);
            }
        });
        Password2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password2ActionPerformed(evt);
            }
        });
        Password2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Password2KeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setText("Sign Up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("I've an account");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view.png"))); // NOI18N
        icon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon3MousePressed(evt);
            }
        });
        jPanel4.add(icon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        icon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hidden.png"))); // NOI18N
        icon4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon4MousePressed(evt);
            }
        });
        jPanel4.add(icon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Username2, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(Password2)
                            .addComponent(Fullname))))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addGap(0, 353, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Username2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jButton2))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(289, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(159, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private boolean passwordVisible = false;
    private boolean iconVisible = false;
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(Fullname.getText().isEmpty() || Username2.getText().isEmpty() || Password2.getText().isEmpty()){
         JOptionPane.showMessageDialog(this,"Please input the required fields");
        }
        else{
            L.setAccounts(Username2.getText(), Password2.getText());
            JOptionPane.showMessageDialog(this,"Successfully Registered");
            Loginn login = new Loginn();
            login.setVisible(true);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            Loginn l = new Loginn();
        l.setVisible(true);
       l.pack();
      l.setLocationRelativeTo(null);
      this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void FullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullnameActionPerformed
       
    }//GEN-LAST:event_FullnameActionPerformed

    private void Username2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Username2ActionPerformed
      
    }//GEN-LAST:event_Username2ActionPerformed

    private void FullnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FullnameFocusGained
         
    }//GEN-LAST:event_FullnameFocusGained

    private void Username2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Username2FocusGained
       
    }//GEN-LAST:event_Username2FocusGained

    private void Password2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Password2FocusGained

    }//GEN-LAST:event_Password2FocusGained

    private void FullnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FullnameFocusLost
    
    }//GEN-LAST:event_FullnameFocusLost

    private void Username2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Username2FocusLost
       
    }//GEN-LAST:event_Username2FocusLost

    private void Password2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Password2FocusLost
 
    }//GEN-LAST:event_Password2FocusLost

    private void Password2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Password2ActionPerformed

    private void Password2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Password2KeyTyped
        if (!iconVisible && Password2.getPassword().length > 0) {
            icon3.setVisible(true);
            icon4.setVisible(true);
            iconVisible = true;
        } else if (iconVisible && Password2.getPassword().length == 0) {
            icon3.setVisible(false);
            icon4.setVisible(false);
            iconVisible = false;
        }        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_Password2KeyTyped

    private void icon3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon3MousePressed
        icon4.setVisible(passwordVisible);
        icon3.setVisible(!passwordVisible);

        if (passwordVisible) {
            Password2.setEchoChar('*'); 
        } else {
            Password2.setEchoChar((char)0); 
        }

        passwordVisible = !passwordVisible;
    }//GEN-LAST:event_icon3MousePressed

    private void icon4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon4MousePressed
        icon3.setVisible(passwordVisible);
        icon4.setVisible(!passwordVisible);

        if (passwordVisible) {
            Password2.setEchoChar('*'); 
        } else {
            Password2.setEchoChar((char)0); 
        }

        passwordVisible = !passwordVisible;       // TODO add your handling code here:
    }//GEN-LAST:event_icon4MousePressed

  
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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Signup().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fullname;
    private javax.swing.JPasswordField Password2;
    private javax.swing.JTextField Username2;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
