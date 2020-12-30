/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import DAO.NhanVienDAO;
import Entity.NhanVien;
import Utils.MsgBox;
import Utils.XDate;
import Utils.XExcel;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class QuanLyNhanVienJPanel extends javax.swing.JPanel {

    public QuanLyNhanVienJPanel() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        btnPrev = new keeptoo.KButton();
        btnNext = new keeptoo.KButton();
        btnFirst = new keeptoo.KButton();
        btnLast = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
        jLabel1 = new javax.swing.JLabel();
        txtTimKiemNhanVien = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        btnXoa = new keeptoo.KButton();
        btnSua = new keeptoo.KButton();
        btnMoi = new keeptoo.KButton();
        btnThem = new keeptoo.KButton();
        jLabel9 = new javax.swing.JLabel();
        txtTenNhanVien = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMatKhau1 = new javax.swing.JPasswordField();
        txtXacNhanMatKhau = new javax.swing.JPasswordField();
        txtMaNhanVien = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rdoNhanVien = new javax.swing.JRadioButton();
        rdoQuanTriVien = new javax.swing.JRadioButton();
        txtDiaChi = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();

        kGradientPanel3.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel3.setOpaque(false);
        kGradientPanel3.setLayout(null);

        kGradientPanel4.setkEndColor(new java.awt.Color(153, 204, 255));
        kGradientPanel4.setkStartColor(new java.awt.Color(153, 204, 255));
        kGradientPanel4.setOpaque(false);
        kGradientPanel4.setLayout(null);

        btnPrev.setText("<<");
        btnPrev.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        kGradientPanel4.add(btnPrev);
        btnPrev.setBounds(100, 10, 88, 38);

        btnNext.setText(">>");
        btnNext.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        kGradientPanel4.add(btnNext);
        btnNext.setBounds(200, 10, 88, 38);

        btnFirst.setText("|<");
        btnFirst.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        kGradientPanel4.add(btnFirst);
        btnFirst.setBounds(10, 10, 82, 40);

        btnLast.setText(">|");
        btnLast.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        kGradientPanel4.add(btnLast);
        btnLast.setBounds(300, 10, 83, 38);

        kButton2.setText("Export Excel");
        kButton2.setkEndColor(new java.awt.Color(255, 153, 51));
        kButton2.setkStartColor(new java.awt.Color(255, 51, 0));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        kGradientPanel4.add(kButton2);
        kButton2.setBounds(390, 10, 83, 38);

        kGradientPanel3.add(kGradientPanel4);
        kGradientPanel4.setBounds(10, 550, 480, 60);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DANH SÁCH NHÂN VIÊN");
        kGradientPanel3.add(jLabel1);
        jLabel1.setBounds(20, 20, 370, 40);

        txtTimKiemNhanVien.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtTimKiemNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        txtTimKiemNhanVien.setText("Tìm kiếm");
        txtTimKiemNhanVien.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtTimKiemNhanVien.setOpaque(false);
        txtTimKiemNhanVien.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTimKiemNhanVienFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimKiemNhanVienFocusLost(evt);
            }
        });
        txtTimKiemNhanVien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemNhanVienKeyReleased(evt);
            }
        });
        kGradientPanel3.add(txtTimKiemNhanVien);
        txtTimKiemNhanVien.setBounds(30, 60, 420, 30);

        tblNhanVien.setBackground(new java.awt.Color(204, 204, 255));
        tblNhanVien.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MÃ NV", "MẬT KHẨU", "TÊN NV", "SDT", "ĐỊA CHỈ", "Email", "NGÀY SINH ", "VAI TRÒ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.setRowHeight(25);
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        kGradientPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(20, 100, 469, 402);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/find.png"))); // NOI18N
        kGradientPanel3.add(jLabel11);
        jLabel11.setBounds(460, 60, 30, 30);

        kGradientPanel2.setBackground(new java.awt.Color(204, 204, 255));
        kGradientPanel2.setkGradientFocus(100);
        kGradientPanel2.setOpaque(false);
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(368, 620));
        kGradientPanel2.setLayout(null);

        kGradientPanel5.setkEndColor(new java.awt.Color(153, 204, 255));
        kGradientPanel5.setkStartColor(new java.awt.Color(153, 204, 255));
        kGradientPanel5.setOpaque(false);
        kGradientPanel5.setLayout(null);

        btnXoa.setText("Xóa");
        btnXoa.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        kGradientPanel5.add(btnXoa);
        btnXoa.setBounds(110, 10, 70, 37);

        btnSua.setText("Sửa");
        btnSua.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        kGradientPanel5.add(btnSua);
        btnSua.setBounds(190, 10, 72, 37);

        btnMoi.setText("Mới");
        btnMoi.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });
        kGradientPanel5.add(btnMoi);
        btnMoi.setBounds(270, 10, 72, 37);

        btnThem.setText("Thêm");
        btnThem.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        kGradientPanel5.add(btnThem);
        btnThem.setBounds(20, 10, 75, 37);

        kGradientPanel2.add(kGradientPanel5);
        kGradientPanel5.setBounds(10, 549, 348, 60);

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Địa chỉ:");
        kGradientPanel2.add(jLabel9);
        jLabel9.setBounds(50, 330, 70, 17);

        txtTenNhanVien.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtTenNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        txtTenNhanVien.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtTenNhanVien.setOpaque(false);
        kGradientPanel2.add(txtTenNhanVien);
        txtTenNhanVien.setBounds(130, 220, 220, 30);

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SDT:");
        kGradientPanel2.add(jLabel6);
        jLabel6.setBounds(80, 280, 40, 18);

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email:");
        kGradientPanel2.add(jLabel7);
        jLabel7.setBounds(70, 420, 60, 30);

        jLabel10.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ngày sinh:");
        kGradientPanel2.add(jLabel10);
        jLabel10.setBounds(40, 380, 80, 18);

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Vai trò:");
        kGradientPanel2.add(jLabel8);
        jLabel8.setBounds(50, 470, 68, 17);

        txtEmail.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtEmail.setOpaque(false);
        kGradientPanel2.add(txtEmail);
        txtEmail.setBounds(130, 420, 225, 30);

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã nhân viên:");
        kGradientPanel2.add(jLabel2);
        jLabel2.setBounds(20, 50, 110, 25);

        txtMatKhau1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtMatKhau1.setForeground(new java.awt.Color(255, 255, 255));
        txtMatKhau1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtMatKhau1.setOpaque(false);
        kGradientPanel2.add(txtMatKhau1);
        txtMatKhau1.setBounds(130, 100, 220, 30);

        txtXacNhanMatKhau.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtXacNhanMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        txtXacNhanMatKhau.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtXacNhanMatKhau.setOpaque(false);
        kGradientPanel2.add(txtXacNhanMatKhau);
        txtXacNhanMatKhau.setBounds(130, 160, 220, 30);

        txtMaNhanVien.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtMaNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        txtMaNhanVien.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtMaNhanVien.setOpaque(false);
        kGradientPanel2.add(txtMaNhanVien);
        txtMaNhanVien.setBounds(130, 50, 220, 30);

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tên nhân viên:");
        kGradientPanel2.add(jLabel5);
        jLabel5.setBounds(10, 230, 120, 17);

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mật khẩu:");
        kGradientPanel2.add(jLabel3);
        jLabel3.setBounds(50, 110, 80, 18);

        txtSDT.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtSDT.setForeground(new java.awt.Color(255, 255, 255));
        txtSDT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtSDT.setOpaque(false);
        kGradientPanel2.add(txtSDT);
        txtSDT.setBounds(130, 270, 220, 30);

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Xác nhận mk:");
        kGradientPanel2.add(jLabel4);
        jLabel4.setBounds(20, 170, 110, 21);

        buttonGroup1.add(rdoNhanVien);
        rdoNhanVien.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        rdoNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        rdoNhanVien.setText("Nhân viên");
        rdoNhanVien.setOpaque(false);
        kGradientPanel2.add(rdoNhanVien);
        rdoNhanVien.setBounds(240, 470, 89, 23);

        buttonGroup1.add(rdoQuanTriVien);
        rdoQuanTriVien.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        rdoQuanTriVien.setForeground(new java.awt.Color(255, 255, 255));
        rdoQuanTriVien.setSelected(true);
        rdoQuanTriVien.setText("Quản trị viên");
        rdoQuanTriVien.setOpaque(false);
        kGradientPanel2.add(rdoQuanTriVien);
        rdoQuanTriVien.setBounds(120, 470, 110, 23);

        txtDiaChi.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtDiaChi.setForeground(new java.awt.Color(255, 255, 255));
        txtDiaChi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtDiaChi.setOpaque(false);
        kGradientPanel2.add(txtDiaChi);
        txtDiaChi.setBounds(130, 330, 220, 30);

        txtNgaySinh.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtNgaySinh.setForeground(new java.awt.Color(255, 255, 255));
        txtNgaySinh.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtNgaySinh.setOpaque(false);
        kGradientPanel2.add(txtNgaySinh);
        txtNgaySinh.setBounds(130, 370, 222, 30);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                        .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        this.prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        this.next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:\
        this.first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        this.delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        this.update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        this.clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        this.insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void txtTimKiemNhanVienKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemNhanVienKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
        model.setRowCount(0);
        String keyword = txtTimKiemNhanVien.getText();
        List<NhanVien> list = dao.selectByKeyword(keyword);
        for (NhanVien nv : list) {
            model.addRow(new Object[]{
                nv.getMANV(),
                nv.getMATKHAU(),
                nv.getTENNV(),
                nv.getDIACHI(),
                nv.getSDT(),
                nv.getEMAIL(),
                XDate.toString(nv.getNGAYSINH(), "dd/MM/yyyy"),
                nv.getVAITRO() ? "Nhân viên" : "Quản trị viên",}
            );
        }
    }//GEN-LAST:event_txtTimKiemNhanVienKeyReleased

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            this.row = tblNhanVien.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void txtTimKiemNhanVienFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimKiemNhanVienFocusGained
        // TODO add your handling code here:
        if (txtTimKiemNhanVien.getText().equals("Tìm kiếm")) {
            txtTimKiemNhanVien.setText("");
        }
    }//GEN-LAST:event_txtTimKiemNhanVienFocusGained

    private void txtTimKiemNhanVienFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimKiemNhanVienFocusLost
        // TODO add your handling code here:
        if (txtTimKiemNhanVien.getText().equals("")) {
            txtTimKiemNhanVien.setText("Tìm kiếm");
        }
    }//GEN-LAST:event_txtTimKiemNhanVienFocusLost

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLastActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
        XExcel a = new XExcel();
        a.exportToExcels(tblNhanVien);
    }//GEN-LAST:event_kButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnFirst;
    private keeptoo.KButton btnLast;
    private keeptoo.KButton btnMoi;
    private keeptoo.KButton btnNext;
    private keeptoo.KButton btnPrev;
    private keeptoo.KButton btnSua;
    private keeptoo.KButton btnThem;
    private keeptoo.KButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KButton kButton2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private javax.swing.JRadioButton rdoNhanVien;
    private javax.swing.JRadioButton rdoQuanTriVien;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JPasswordField txtMatKhau1;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNhanVien;
    private javax.swing.JTextField txtTimKiemNhanVien;
    private javax.swing.JPasswordField txtXacNhanMatKhau;
    // End of variables declaration//GEN-END:variables

    NhanVienDAO dao = new NhanVienDAO();
    int row = -1;

    void init() {
        this.fillTable();
//        this.row = -1;
       this.updateStatus();
        txtDiaChi.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtEmail.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtTenNhanVien.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtMatKhau1.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtNgaySinh.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtSDT.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtTenNhanVien.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtXacNhanMatKhau.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtTimKiemNhanVien.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtMaNhanVien.setBackground(new java.awt.Color(0, 0, 0, 1));
        this.CanChinhTable();
        JTableHeader header = tblNhanVien.getTableHeader();
        header.setBackground(Color.cyan);
        header.setForeground(Color.black);
        header.setFont(new Font("Tahoma", Font.BOLD, 12));
    }

    void fillTable() {
//        DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
//        model.setRowCount(0);
//        try {
//            List<NhanVien> list = dao.selectAll();
//            for (NhanVien nv : list) {
//                Object[] row = {
//                    nv.getMANV(),
//                    nv.getMATKHAU(),
//                    nv.getTENNV(),
//                    nv.getDIACHI(),
//                    nv.getSDT(),
//                    nv.getEMAIL(),
//                    XDate.toString(nv.getNGAYSINH(), "dd/MM/yyyy"),
//                    nv.getVAITRO() ? "Nhân viên" : "Quản trị viên",
//                };
//                model.addRow(row);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
        model.setRowCount(0);
        try {

            //  List<KhachHang> tk = dao.selectByKeyword(keyword);
            List<NhanVien> list = dao.selectAll();
            for (NhanVien nv : list) {
                Object[] row = {
                    nv.getMANV(),
                    nv.getMATKHAU(),
                    nv.getTENNV(),
                    nv.getSDT(),
                    nv.getDIACHI(),
                    nv.getEMAIL(),
                    XDate.toString(nv.getNGAYSINH(), "dd/MM/yyyy"),
                    nv.getVAITRO() ? "Nhân viên" : "Quản trị viên"
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn" + e);
        }
    }

    void insert() {
        if (!validates()) {
            return;
        } else {
            NhanVien model = getForm();
            try {
                dao.insert(model);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Thêm mới thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Thêm mới thất bại!");
            }
        }
    }

    void update() {
        if (!validates()) {
            return;
        } else {
            NhanVien model = getForm();
            try {
                dao.update(model);
                this.fillTable();
                MsgBox.alert(this, "Cập nhật thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Cập nhật thất bại!" + e);
            }
        }
    }

    void delete() {
        if (MsgBox.confirm(this, "Bạn thực sự muốn xóa người học này?")) {
            String manh = txtTenNhanVien.getText();
            try {
                dao.delete(manh);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Xóa thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Xóa thất bại!");
            }

        }
    }

    void clearForm() {
        NhanVien nv = new NhanVien();
        this.setForm(nv);
        this.row = -1;
        this.updateStatus();
    }

    void edit() {
        String manh = (String) tblNhanVien.getValueAt(this.row, 0);
        NhanVien nh = dao.selectById(manh);
        this.setForm(nh);
        this.updateStatus();
    }

    void setForm(NhanVien nv) {
        txtMaNhanVien.setText(nv.getMANV());
        txtMatKhau1.setText(nv.getMATKHAU());
        txtXacNhanMatKhau.setText(nv.getMATKHAU());
        txtTenNhanVien.setText(nv.getTENNV());
        txtNgaySinh.setText(XDate.toString(nv.getNGAYSINH(), "dd/MM/yyyy"));
        txtSDT.setText(nv.getSDT());
        txtEmail.setText(nv.getEMAIL());
        txtDiaChi.setText(nv.getDIACHI());
        rdoQuanTriVien.setSelected(!nv.getVAITRO());
        rdoNhanVien.setSelected(nv.getVAITRO());
    }

    NhanVien getForm() {
        NhanVien nv = new NhanVien();
        nv.setMANV(txtMaNhanVien.getText());
        nv.setTENNV(txtTenNhanVien.getText());
        nv.setMATKHAU(new String(txtMatKhau1.getPassword()));
        nv.setNGAYSINH(XDate.toDate(txtNgaySinh.getText(), "dd/MM/yyyy"));
        nv.setDIACHI(txtDiaChi.getText());
        nv.setEMAIL(txtEmail.getText());
        nv.setSDT(txtSDT.getText());
        nv.setVAITRO(rdoQuanTriVien.isSelected());
        nv.setVAITRO(rdoNhanVien.isSelected());
        return nv;
    }

    void first() {
        this.row = 0;
        tblNhanVien.setRowSelectionInterval(row, row);
        this.edit();
    }

    void prev() {
        if (this.row > 0) {
            this.row--;
            tblNhanVien.setRowSelectionInterval(row, row);
            this.edit();
        }
    }

    void next() {
        if (this.row < tblNhanVien.getRowCount() - 1) {
            this.row++;
            tblNhanVien.setRowSelectionInterval(row, row);
            this.edit();
        }
    }

    void last() {
        this.row = tblNhanVien.getRowCount() - 1;
        tblNhanVien.setRowSelectionInterval(row, row);
        this.edit();
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblNhanVien.getRowCount() - 1);
        // Trạng thái form
        txtMaNhanVien.setEnabled(!edit);
        btnThem.setVisible(!edit);
        btnSua.setVisible(edit);
        btnXoa.setVisible(edit);

        // Trạng thái điều hướng
        
        btnFirst.setVisible(edit && !first);
        btnPrev.setVisible(edit && !first);
        btnNext.setVisible(edit && !last);
        btnLast.setVisible(edit && !last);
    }

    private void timKiem() {
        this.fillTable();
        this.clearForm();
        this.row = -1;
        this.updateStatus();
    }

    boolean validates() {
        if (txtTenNhanVien.getText().equals("")) {
            MsgBox.alert(this, "Mã nhân viên không được rỗng");
            txtTenNhanVien.requestFocus();
            return false;
        }

        if (txtMatKhau1.getPassword().equals("")) {
            MsgBox.alert(this, "Mật khẩu không được rỗng");
            txtMatKhau1.requestFocus();
            return false;
        }
        if (txtXacNhanMatKhau.getPassword().equals("")) {
            MsgBox.alert(this, "Xác nhận mật khẩu không được rỗng");
            txtMatKhau1.requestFocus();
            return false;
        }

        if (txtTenNhanVien.getText().equals("")) {
            MsgBox.alert(this, "Tên nhân viên không được rỗng");
            txtMatKhau1.requestFocus();
            return false;
        }

        if (txtSDT.getText().equals("")) {
            MsgBox.alert(this, "Số điện thoại không được rỗng");
            txtSDT.requestFocus();
            return false;

        }

        boolean flag;
        do {
            String phonePattern = "((09|03|07|08|05)+([0-9]{8}))|(1900+([0-9]{4,8}))";
            flag = txtSDT.getText().matches(phonePattern);
            if (!flag) {
                JOptionPane.showMessageDialog(this, "Số điện thoại không hợp lệ");
                txtSDT.requestFocus();
                return false;
            }
        } while (!flag);

        if (txtNgaySinh.getText().equals("")) {
            MsgBox.alert(this, "Ngày sinh không được rỗng");
            txtNgaySinh.requestFocus();
            return false;
        }
        if (!txtMatKhau1.getText().equals(txtXacNhanMatKhau.getText())) {
            MsgBox.alert(this, "Xác nhận mật khẩu không hợp lệ!");
            txtXacNhanMatKhau.requestFocus();
            return false;
        }

        do {
            String birthDate = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)[0-9]{2})";
            flag = txtNgaySinh.getText().matches(birthDate);
            if (!flag) {
                JOptionPane.showMessageDialog(this, "Ngày sinh không hợp lệ");
                txtNgaySinh.requestFocus();
                return false;
            }
        } while (!flag);

        if (txtDiaChi.getText().equals("")) {
            MsgBox.alert(this, "Địa chỉ không được rỗng");
            txtDiaChi.requestFocus();
            return false;
        }

        if (txtEmail.getText().equals("")) {
            MsgBox.alert(this, "Email không được rỗng");
            txtEmail.requestFocus();
            return false;
        }

        if (txtMatKhau1.getPassword().equals(txtXacNhanMatKhau.getPassword())) {
            MsgBox.alert(this, "Xác nhận mật khẩu không hợp lệ!");
            txtXacNhanMatKhau.requestFocus();
            return false;
        }

        do {
            String emailPattern = "(\\w+@\\w+[.]\\w+[.]\\w+)|(\\w+@\\w+[.]\\w+)";
            flag = txtEmail.getText().matches(emailPattern);
            if (!flag) {
                JOptionPane.showMessageDialog(this, "Email không hợp lệ");
                txtEmail.requestFocus();
                return false;
            }
        } while (!flag);

        return true;
    }
    void CanChinhTable() {
        tblNhanVien.setAutoResizeMode(tblNhanVien.AUTO_RESIZE_OFF);
        tblNhanVien.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblNhanVien.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblNhanVien.getColumnModel().getColumn(2).setPreferredWidth(130);
        tblNhanVien.getColumnModel().getColumn(3).setPreferredWidth(80);
        tblNhanVien.getColumnModel().getColumn(4).setPreferredWidth(80);
        tblNhanVien.getColumnModel().getColumn(5).setPreferredWidth(80);
        tblNhanVien.getColumnModel().getColumn(6).setPreferredWidth(80);
        tblNhanVien.getColumnModel().getColumn(7).setPreferredWidth(80);
        
    }
}
