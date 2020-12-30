/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import DAO.NhanVienDAO;
import Utils.Auth;
import Utils.MsgBox;
import Entity.NhanVien;
import Music.Nhac;
import Utils.XImage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 *
 * @author Admin
 */
public class DoiMatKhauJDialog extends javax.swing.JDialog {

    public DoiMatKhauJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtMaNV = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JPasswordField();
        txtMatKhauMoi = new javax.swing.JPasswordField();
        txtMatKhauMoi2 = new javax.swing.JPasswordField();
        kButton1 = new keeptoo.KButton();
        chkHienMatKhau = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FireCode - Đổi mật khẩu");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        txtMaNV.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtMaNV.setForeground(new java.awt.Color(255, 255, 255));
        txtMaNV.setText("Tên đăng nhập");
        txtMaNV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtMaNV.setOpaque(false);
        txtMaNV.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMaNVFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaNVFocusLost(evt);
            }
        });
        jPanel1.add(txtMaNV);
        txtMaNV.setBounds(33, 41, 181, 33);

        txtMatKhau.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        txtMatKhau.setText("Mật khẩu");
        txtMatKhau.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtMatKhau.setOpaque(false);
        txtMatKhau.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMatKhauFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMatKhauFocusLost(evt);
            }
        });
        jPanel1.add(txtMatKhau);
        txtMatKhau.setBounds(269, 41, 180, 33);

        txtMatKhauMoi.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtMatKhauMoi.setForeground(new java.awt.Color(255, 255, 255));
        txtMatKhauMoi.setText("Mật khẩu mới");
        txtMatKhauMoi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtMatKhauMoi.setOpaque(false);
        txtMatKhauMoi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMatKhauMoiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMatKhauMoiFocusLost(evt);
            }
        });
        txtMatKhauMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatKhauMoiActionPerformed(evt);
            }
        });
        jPanel1.add(txtMatKhauMoi);
        txtMatKhauMoi.setBounds(33, 126, 181, 34);

        txtMatKhauMoi2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtMatKhauMoi2.setForeground(new java.awt.Color(255, 255, 255));
        txtMatKhauMoi2.setText("Xác nhận mật khẩu");
        txtMatKhauMoi2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtMatKhauMoi2.setOpaque(false);
        txtMatKhauMoi2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMatKhauMoi2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMatKhauMoi2FocusLost(evt);
            }
        });
        jPanel1.add(txtMatKhauMoi2);
        txtMatKhauMoi2.setBounds(269, 126, 180, 34);

        kButton1.setText("Đổi mật khẩu");
        kButton1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton1);
        kButton1.setBounds(33, 170, 416, 45);

        chkHienMatKhau.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        chkHienMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        chkHienMatKhau.setText("Hiện mật khẩu");
        chkHienMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkHienMatKhauActionPerformed(evt);
            }
        });
        jPanel1.add(chkHienMatKhau);
        chkHienMatKhau.setBounds(33, 221, 100, 21);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pngegg.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/anh1.jpg"))); // NOI18N
        jLabel6.setAlignmentY(0.0F);
        jLabel6.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(532, 532, 532)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 562, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel7)
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 333, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMatKhauMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatKhauMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatKhauMoiActionPerformed

    private void chkHienMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkHienMatKhauActionPerformed
        // TODO add your handling code here:
        if (chkHienMatKhau.isSelected()) {
            txtMatKhau.setEchoChar((char) 0);
            txtMatKhauMoi.setEchoChar((char) 0);
            txtMatKhauMoi2.setEchoChar((char) 0);
        } else {
            txtMatKhau.setEchoChar('*');
            txtMatKhauMoi.setEchoChar('*');
            txtMatKhauMoi2.setEchoChar('*');
        }
    }//GEN-LAST:event_chkHienMatKhauActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        this.dispose();
        new DangNhap().setVisible(true);
        nhac.playWin();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void txtMaNVFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaNVFocusGained
        // TODO add your handling code here:
        if (txtMaNV.getText().equals("Tên đăng nhập")) {
            txtMaNV.setText("");
        }
    }//GEN-LAST:event_txtMaNVFocusGained

    private void txtMaNVFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaNVFocusLost
        // TODO add your handling code here:
        
        if (txtMatKhau.getText().equals("")) {
            txtMatKhau.setText("Mật khẩu");
        }
    }//GEN-LAST:event_txtMaNVFocusLost

    private void txtMatKhauFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMatKhauFocusGained
        // TODO add your handling code here:
       if (txtMaNV.getText().equals("")) {
            txtMaNV.setText("Tên đăng nhập");
        }
    }//GEN-LAST:event_txtMatKhauFocusGained

    private void txtMatKhauFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMatKhauFocusLost
        // TODO add your handling code here:
       
          if (txtMatKhau.getText().equals("Mật khẩu")) {
            txtMatKhau.setText("");
        }
    }//GEN-LAST:event_txtMatKhauFocusLost

    private void txtMatKhauMoiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMatKhauMoiFocusGained
        // TODO add your handling code here:
        if (txtMatKhauMoi.getText().equals("Mật khẩu mới")) {
            txtMatKhauMoi.setText("");
        }
    }//GEN-LAST:event_txtMatKhauMoiFocusGained

    private void txtMatKhauMoiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMatKhauMoiFocusLost
        // TODO add your handling code here:
        if (txtMatKhauMoi.getText().equals("")) {
            txtMatKhauMoi.setText("Mật khẩu mới");
        }
    }//GEN-LAST:event_txtMatKhauMoiFocusLost

    private void txtMatKhauMoi2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMatKhauMoi2FocusGained
        // TODO add your handling code here:
        if (txtMatKhauMoi2.getText().equals("Xác nhận mật khẩu")) {
            txtMatKhauMoi2.setText("");
        }
    }//GEN-LAST:event_txtMatKhauMoi2FocusGained

    private void txtMatKhauMoi2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMatKhauMoi2FocusLost
        // TODO add your handling code here:
        if (txtMatKhauMoi2.getText().equals("")) {
            txtMatKhauMoi2.setText("Xác nhận mật khẩu");
        }
    }//GEN-LAST:event_txtMatKhauMoi2FocusLost

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        this.doiMK();
    }//GEN-LAST:event_kButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DoiMatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DoiMatKhauJDialog dialog = new DoiMatKhauJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkHienMatKhau;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KButton kButton1;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JPasswordField txtMatKhauMoi;
    private javax.swing.JPasswordField txtMatKhauMoi2;
    // End of variables declaration//GEN-END:variables

    Nhac nhac = new Nhac();

    private void init() {
        this.setLocationRelativeTo(null);
        setIconImage(XImage.getAppIcon());
        txtMatKhau.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtMatKhauMoi.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtMatKhauMoi2.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtMaNV.setBackground(new java.awt.Color(0, 0, 0, 1));
    }

    NhanVienDAO dao = new NhanVienDAO();

    private void huyBo() {
        this.dispose();
    }

    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String dburl = "jdbc:sqlserver://localhost:1433;database=duan1";
    private static String username = "sa";
    private static String password = "123";

    void doiMK() {
        String manv = txtMaNV.getText();
        String matKhau = new String(txtMatKhau.getPassword());
        NhanVien nhanVien = dao.selectById(manv);
        if (nhanVien == null) {
            nhac.playFalse();
            MsgBox.alert(this, "Xác nhận lại tên đăng nhập!");

        } else if (!matKhau.equals(nhanVien.getMATKHAU())) {
            nhac.playFalse();
            MsgBox.alert(this, "Sai mật khẩu!");
        } else {
            Connection conn = null;
            Statement stml = null;
            ResultSet rs = null;
            try {
                System.out.println("Đang kết nối đến dữ liệu....");
                conn = DriverManager.getConnection(dburl, username, password);//Kết nối CSDL bằng đối tượng Connection
                String sql = "Select * from nhanvien";
                stml = conn.createStatement();//Tạo đối tượng Statement
                rs = stml.executeQuery(sql);//Thi hành câu truy vấn
                String user, pass;
                boolean role;
                boolean flag = false;
                while (rs.next()) {    //Xử lý kết quả             
                    user = rs.getString("manv");
                    pass = rs.getString("matkhau");
                    if (user.equalsIgnoreCase(txtMaNV.getText()) && pass.equalsIgnoreCase(txtMatKhau.getText())) {
                        flag = true;
                        role = rs.getBoolean("vaitro");
                        Auth.user = nhanVien;
                        if (role == true) {
//                            MsgBox.alert(this, "Đăng nhập vai trò nhân viên thành công!");
//                            new QuanTriVienUI().setVisible(true);
                            String matKhauMoi = new String(txtMatKhauMoi.getPassword());
                            String matKhauMoi2 = new String(txtMatKhauMoi2.getPassword());

                            if (!manv.equalsIgnoreCase(Auth.user.getMANV())) {
                                nhac.playFalse();
                                MsgBox.alert(this, "Sai tên đăng nhập!");
                            } else if (!matKhau.equals(Auth.user.getMATKHAU())) {
                                nhac.playFalse();
                                MsgBox.alert(this, "Sai mật khẩu!");
                            } else if (matKhauMoi.equals("")) {
                                nhac.playFalse();
                                MsgBox.alert(this, "Mật khẩu mới trống");
                            } else if (!matKhauMoi.equals(matKhauMoi2)) {
                                nhac.playFalse();
                                MsgBox.alert(this, "Xác nhận mật khẩu không đúng!");
                            } else {
                                Auth.user.setMATKHAU(matKhauMoi);
                                dao.update(Auth.user);
                                nhac.playWin();
                                MsgBox.alert(this, "Đổi mật khẩu thành công!");
                            }
                            // dispose(); // thoát khỏi login
                        } else {
//                            MsgBox.alert(this, "Đăng nhập vai trò quản lý thành công!");
//                            new NhanVienUI().setVisible(true);
                            String matKhauMoi = new String(txtMatKhauMoi.getPassword());
                            String matKhauMoi2 = new String(txtMatKhauMoi2.getPassword());

                            if (!manv.equalsIgnoreCase(Auth.user.getMANV())) {
                                nhac.playFalse();
                                MsgBox.alert(this, "Sai tên đăng nhập!");
                            } else if (!matKhau.equals(Auth.user.getMATKHAU())) {
                                nhac.playFalse();
                                MsgBox.alert(this, "Sai mật khẩu!");
                            } else if (!matKhauMoi.equals(matKhauMoi2)) {
                                nhac.playFalse();
                                MsgBox.alert(this, "Xác nhận mật khẩu không đúng!");
                            } else {
                                Auth.user.setMATKHAU(matKhauMoi);
                                dao.update(Auth.user);
                                nhac.playWin();
                                MsgBox.alert(this, "Đổi mật khẩu thành công!");
                            }
                            // dispose(); // thoát khỏi login
                        }
                    }
                }
                if (flag == false) {
                    nhac.playFalse();
                    MsgBox.alert(this, "Đăng nhập thất bại");
                }
                rs.close(); // đóng mọi thứ (ResultSet)
                stml.close();// đóng câu lệnh
                conn.close();// đóng kết nối

            } catch (Exception e) {
                MsgBox.alert(this, "Lỗi đổi mật khẩu");
            }
        }
    }
}
