package LoginBildschirm;

import java.awt.event.WindowEvent;
import SQLite.*;
import main.AppColor;
import main.AppFont;
import main.AppFrame;
import main.AppLabel;
import main.AppPanel;
import main.AppSystemButtons;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login extends AppFrame {

	public Login() {
		super();
		AppPanel loginPanel = new AppPanel(super.getBreite() / 2, 0, super.getBreite() / 2, super.getHeight(),
				AppColor.ROSA);
		super.add(loginPanel);
		AppLabel label = new AppLabel("Welcome to <br/> TeacherApp <br/>  by bejdenn!", 50, super.getHeight() / 6, 500,
				500);
		super.add(label);
		super.add(new AppSystemButtons("Terminate", super.getBreite()-30, 0));
	}

	private void initComponents() {

		jtxtUserName = new javax.swing.JTextField();
		jPassword = new javax.swing.JPasswordField();
		jButton1 = new javax.swing.JButton();
		jtxtUserName1 = new javax.swing.JTextField();
		jPasswordField1 = new javax.swing.JPasswordField();
		jPasswordField2 = new javax.swing.JPasswordField();

	}

//        jtxtUserName.setBackground(new java.awt.Color(159, 188, 197));
//        jtxtUserName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
//        jtxtUserName.setForeground(new java.awt.Color(255, 255, 255));
//        jtxtUserName.setText("Lehrer");
//        jtxtUserName.setToolTipText("Nutzername");
//        jtxtUserName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(159, 188, 197), 5));
//        jtxtUserName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
//        jtxtUserName.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                jtxtUserNameMouseClicked(evt);
//            }
//        });
//        jtxtUserName.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jtxtUserNameActionPerformed(evt);
//            }
//        });
//        jLayeredPane1.add(jtxtUserName);
//        jtxtUserName.setBounds(110, 70, 380, 40);
//
//        jPassword.setBackground(new java.awt.Color(159, 188, 197));
//        jPassword.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
//        jPassword.setForeground(new java.awt.Color(255, 255, 255));
//        jPassword.setText("1234");
//        jPassword.setToolTipText("Passwort");
//        jPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(159, 188, 197), 5));
//        jPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
//        jPassword.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                jPasswordMouseClicked(evt);
//            }
//        });
//        jPassword.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jPasswordActionPerformed(evt);
//            }
//        });
//        jLayeredPane1.add(jPassword);
//        jPassword.setBounds(110, 130, 380, 40);
//
//        jbtnLogin.setBackground(new java.awt.Color(159, 188, 197));
//        jbtnLogin.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
//        jbtnLogin.setForeground(new java.awt.Color(255, 255, 255));
//        jbtnLogin.setText("Login");
//        jbtnLogin.setToolTipText("Login");
//        jbtnLogin.setBorder(null);
//        jbtnLogin.setBorderPainted(false);
//        jbtnLogin.setContentAreaFilled(false);
//        jbtnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
//        jbtnLogin.setOpaque(true);
//        jbtnLogin.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jbtnLoginActionPerformed(evt);
//            }
//        });
//        jLayeredPane1.add(jbtnLogin);
//        jbtnLogin.setBounds(240, 200, 130, 40);
//
//        jTabbedPane1.addTab("Login", jLayeredPane1);
//
//        jButton1.setBackground(new java.awt.Color(159, 188, 197));
//        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
//        jButton1.setForeground(new java.awt.Color(255, 255, 255));
//        jButton1.setText("Registrieren");
//        jButton1.setToolTipText("Regbutton");
//        jButton1.setBorder(null);
//        jButton1.setBorderPainted(false);
//        jButton1.setContentAreaFilled(false);
//        jButton1.setOpaque(true);
//        jButton1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton1ActionPerformed(evt);
//            }
//        });
//        jLayeredPane2.add(jButton1);
//        jButton1.setBounds(235, 240, 130, 40);
//
//        jtxtUserName1.setBackground(new java.awt.Color(159, 188, 197));
//        jtxtUserName1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
//        jtxtUserName1.setForeground(new java.awt.Color(255, 255, 255));
//        jtxtUserName1.setText("E-Mail Adresse");
//        jtxtUserName1.setToolTipText("regnutzername");
//        jtxtUserName1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(159, 188, 197), 5));
//        jtxtUserName1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
//        jtxtUserName1.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                jtxtUserName1MouseClicked(evt);
//            }
//        });
//        jtxtUserName1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jtxtUserName1ActionPerformed(evt);
//            }
//        });
//        jLayeredPane2.add(jtxtUserName1);
//        jtxtUserName1.setBounds(110, 50, 380, 40);
//
//        jPasswordField1.setBackground(new java.awt.Color(159, 188, 197));
//        jPasswordField1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
//        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
//        jPasswordField1.setText("jPasswordField1");
//        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(159, 188, 197), 5));
//        jPasswordField1.setCaretPosition(8);
//        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                jPasswordField1MouseClicked(evt);
//            }
//        });
//        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jPasswordField1ActionPerformed(evt);
//            }
//        });
//        jLayeredPane2.add(jPasswordField1);
//        jPasswordField1.setBounds(110, 110, 380, 40);
//
//        jPasswordField2.setBackground(new java.awt.Color(159, 188, 197));
//        jPasswordField2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
//        jPasswordField2.setForeground(new java.awt.Color(255, 255, 255));
//        jPasswordField2.setText("jPasswordField1");
//        jPasswordField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(159, 188, 197), 5));
//        jPasswordField2.setCaretPosition(8);
//        jPasswordField2.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                jPasswordField2MouseClicked(evt);
//            }
//        });
//        jLayeredPane2.add(jPasswordField2);
//        jPasswordField2.setBounds(110, 170, 380, 40);
//
//        jTabbedPane1.addTab("Registrierung", jLayeredPane2);
//
//        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 350));
//
//        pack();
//    }// </editor-fold>//GEN-END:initComponents
//
//    
//    private void jbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLoginActionPerformed
//        
//        String nutzer = jtxtUserName.getText();
//        String passwort = jPassword.getText();
//        String hp;
//        ArrayList al = new ArrayList();
//        ArrayList al2 = new ArrayList();
//        
//        boolean stimmt = false;
//        
//        try {
//            hp = HashPassword.hashPassword(passwort);
//        
//        DB = new AppDatabase.Database("PS");
//        try {
//            al = DB.accessData("select email from user", 1);
//        } catch (Exception ex) {
//            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        DB.close();
//        
//        DB = new AppDatabase.Database("PS");
//        try {
//            al2 = DB.accessData("select password from user", 1);
//        } catch (Exception ex) {
//            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        DB.close();
//        
//        for(int i=0; i<al.size(); i++)
//        {
//            if(((al.get(i)).toString()).equals(nutzer) && ((al2.get(i)).toString()).equals(hp))
//            {
//                stimmt = true;
//            }
//            else
//            {
//                stimmt = false;
//            }
//        }
//        } catch (NoSuchAlgorithmException ex) {
//            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        if (stimmt == true)
//        {
//            jtxtUserName.setText(null);
//            jPassword.setText(null);
//
//            Login_start Startbildschirm = new Login_start();    //startet programm
//            Startbildschirm.setVisible(true);
//        }
//
//        else
//        {
//            JOptionPane.showMessageDialog(null, "Falsche Eingaben", "Login fehlgeschlagen",JOptionPane.ERROR_MESSAGE);
//            jPassword.setText(null);
//            jtxtUserName.setText(null);
//        }
//        
//
//    }//GEN-LAST:event_jbtnLoginActionPerformed
//
//    private void jtxtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUserNameActionPerformed
//       
//    }//GEN-LAST:event_jtxtUserNameActionPerformed
//
//    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//
//        String pass = jPasswordField1.getText();
//        String passwied = jPasswordField2.getText();
//        String user = jtxtUserName1.getText();
//        String hp;
//        ArrayList al = new ArrayList();
//        boolean frei = true;
//        boolean pu = false;
//        boolean at = false;
//        String sql;
//        char[] mail = user.toCharArray();
//        char[] muss = {'.', '@'};
//        DB = new AppDatabase.Database("PS");
//        
//        try {
//            al = DB.accessData("SELECT email from user", 1);
//        } catch (Exception ex) {
//            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        DB.close();
//        
//        
//        for(int i=0; i<mail.length; i++)
//        {
//            if(mail[i] == muss[0])
//            {
//                pu = true;
//            }
//            else
//            {
//            }
//        }
//        
//        for(int i=0; i<mail.length; i++)
//        {
//            if(mail[i] == muss[1])
//            {
//                at = true;
//            }
//            else
//            {
//            }
//        }
//        
//        for(int i=0; i<al.size(); i++)
//        {
//            if(al.get(i).toString().equals(user))
//            {
//                frei = false;
//            }
//            
//            else
//            {
//                frei = true;
//            }
//        }
//        
//        if (pu == false || at == false)
//        {
//            JOptionPane.showMessageDialog(null, "Ihre Eingabe entspricht keiner richtigen E-Mail Adresse!");
//            jtxtUserName1.setText("");
//            jPasswordField1.setText("");
//            jPasswordField2.setText("");
//        }
//        else if (pass.length() < 8) //Buchstabenbegrenzung für Passwortlänge
//        {
//            JOptionPane.showMessageDialog(null,"Das Passwort ist zu kurz! Es muss mindestens 8 Zeichen lang sein!");
//            jPasswordField1.setText("");
//            jPasswordField2.setText("");
//        } 
//        
//        else if(!pass.equals(passwied)) //Vergleich von Passwort und wiederholtem Passwort
//        {
//            JOptionPane.showMessageDialog(null,"Die Passwörter stimmen nicht überein!");
//            jPasswordField1.setText("");
//            jPasswordField2.setText("");
//        }
//        
//        else if(frei == false) //Prüft ob die E-Mail Adresse schon registriert ist
//        {
//            JOptionPane.showMessageDialog(null,"Sie sind bereits registriert!");
//            jtxtUserName1.setText("");
//            jPasswordField1.setText("");
//            jPasswordField2.setText("");
//        }
//        
//        else         {
//            try //registriert die neue E-Mail und das neue Passwort in der Datenbank
//            {
//                hp = HashPassword.hashPassword(pass);
//                DB = new AppDatabase.Database("PS");
//                sql = "INSERT INTO user ([right], password, email, id) VALUES ('Yes', '"+ hp+ "', '" + user + "', 3)";
//;
//                DB.executeOrder(sql);
//                DB.close();
//                Login_start Startbildschirm = new Login_start();    //startet programm
//                Startbildschirm.setVisible(true);
//            } catch (NoSuchAlgorithmException ex) {
//                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        
//    }//GEN-LAST:event_jButton1ActionPerformed
//
//    private void jtxtUserName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUserName1ActionPerformed
//        // TODO add your handling code here:
//    }//GEN-LAST:event_jtxtUserName1ActionPerformed
//
//    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
//        // TODO add your handling code here:
//    }//GEN-LAST:event_jPasswordActionPerformed
//
//    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
//        // TODO add your handling code here:
//    }//GEN-LAST:event_jPasswordField1ActionPerformed
//
//    private void jtxtUserName1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtUserName1MouseClicked
//        jtxtUserName1.setText("");
//    }//GEN-LAST:event_jtxtUserName1MouseClicked
//
//    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
//        jPasswordField1.setText("");
//    }//GEN-LAST:event_jPasswordField1MouseClicked
//
//    private void jPasswordField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField2MouseClicked
//        jPasswordField2.setText("");
//    }//GEN-LAST:event_jPasswordField2MouseClicked
//
//    private void jtxtUserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtUserNameMouseClicked
//        jtxtUserName.setText("");
//    }//GEN-LAST:event_jtxtUserNameMouseClicked
//
//    private void jPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordMouseClicked
//        jPassword.setText("");
//    }//GEN-LAST:event_jPasswordMouseClicked
// 
	public static void main(String args[]) {
		new Login().setVisible(true);
	}

	private javax.swing.JButton jButton1;
	private javax.swing.JPasswordField jPassword;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JPasswordField jPasswordField2;
	private javax.swing.JButton jbtnLogin;
	private javax.swing.JTextField jtxtUserName;
	private javax.swing.JTextField jtxtUserName1;
//
//    private void systemExit()
//    {
//        WindowEvent winCloseing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
//    }
//
}
