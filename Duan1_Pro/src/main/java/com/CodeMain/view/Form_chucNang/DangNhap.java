/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CodeMain.view.Form_chucNang;

import com.CodeMain.application.NewJFrame;
import com.CodeMain.domainModel.NguoiDung;
import com.CodeMain.domainModel.TaiKhoan;
import com.CodeMain.services.TaiKhoanService;
import com.CodeMain.services.serviceImp.TaiKhoanServiceImp;
import com.raven.main.Main;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DangNhap extends javax.swing.JFrame {

    TaiKhoanService tkService;
    List<TaiKhoan> listtk;

    public DangNhap() {
        initComponents();
        tkService = new TaiKhoanServiceImp();
        listtk = tkService.getListAll();
    }

    public static NguoiDung ndLogin = null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_login = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_tdn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bnt_dangnhap = new javax.swing.JButton();
        btn_quenmk = new javax.swing.JButton();
        txt_pw = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pn_login.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));

        jLabel2.setText("Tên Đăng Nhập :");

        txt_tdn.setText("admin");

        jLabel3.setText("Mật Khẩu : ");

        bnt_dangnhap.setText("Đăng Nhập");
        bnt_dangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_dangnhapActionPerformed(evt);
            }
        });

        btn_quenmk.setText("Quên mật khẩu");
        btn_quenmk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quenmkActionPerformed(evt);
            }
        });

        txt_pw.setText("123");

        javax.swing.GroupLayout pn_loginLayout = new javax.swing.GroupLayout(pn_login);
        pn_login.setLayout(pn_loginLayout);
        pn_loginLayout.setHorizontalGroup(
            pn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_loginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(42, 42, 42)
                .addGroup(pn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_tdn, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(pn_loginLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btn_quenmk, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bnt_dangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        pn_loginLayout.setVerticalGroup(
            pn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_loginLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txt_tdn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txt_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(pn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_quenmk, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt_dangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jLabel1.setIcon(new ImageIcon("src/main/icon/JABS.png"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pn_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean checklogin() {
        if (txt_tdn.getText().trim().length() == 0 && txt_pw.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để trống userName và pass");
            return false;
        } else if (txt_tdn.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để trống userName");
            return false;
        } else if (txt_pw.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để trống pass");
            return false;
        } else {
            return true;
        }
    }
    private void bnt_dangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_dangnhapActionPerformed
        String pass = txt_pw.getText();
        String user = txt_tdn.getText();
        if (checklogin()) {
            for (TaiKhoan x : listtk) {
                if (x.getUserName().equals(user) && x.getPassWord().equals(pass)) {
                    ndLogin = x.getNguoiDung();
                    this.dispose();
                    new Main().setVisible(true);
                }
            }
        }

    }//GEN-LAST:event_bnt_dangnhapActionPerformed

    private void btn_quenmkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quenmkActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_quenmkActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_dangnhap;
    private javax.swing.JButton btn_quenmk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel pn_login;
    private javax.swing.JPasswordField txt_pw;
    private javax.swing.JTextField txt_tdn;
    // End of variables declaration//GEN-END:variables
}
