package ui;

import AppPackage.AnimationClass;
import bean.DanhMucBean;
import controller.ChuyenManHinh;
import java.util.ArrayList;
import java.util.List;
import DAO.SanPhamDAO;
import DAO.KhachHangDAO;
import DAO.DonHangDAO;
import DAO.NhaCungCapDAO;
import Utils.XImage;

public final class TrangChuPanel extends javax.swing.JPanel {

    AnimationClass ac = new AnimationClass();

    public TrangChuPanel() {
        initComponents();

        ChuyenManHinh controller = new ChuyenManHinh(pnlView1);

        List<DanhMucBean> listItem = new ArrayList<>();

        controller.setEvent(listItem);

        slideShow();
        

        fillSoLuongSanPham();
        fillSoLuongKhachHang();
        fillSoLuongDonHang();
        fillSoLuongNCC();
    }

    public void slideShow() {
        new Thread(() -> {
            int nb = 0;
            try {
                while (true) {
                    switch (nb) {
                        case 0:
                            Thread.sleep(3000);
                            ac.jLabelXLeft(0, -500, 1, 1, img1);
                            ac.jLabelXLeft(500, 0, 1, 1, img2);
                            ac.jLabelXLeft(1000, 500, 1, 1, img3);
                            nb++;
                        case 1:
                            Thread.sleep(3000);
                            ac.jLabelXLeft(-500, -1000, 1, 1, img1);
                            ac.jLabelXLeft(0, -500, 1, 1, img2);
                            ac.jLabelXLeft(500, 0, 1, 1, img3);
                            nb++;
                        case 2:
                            Thread.sleep(3000);
                            ac.jLabelXRight(-1000, -500, 1, 1, img1);
                            ac.jLabelXRight(-500, 0, 1, 1, img2);
                            ac.jLabelXRight(0, 500, 1, 1, img3);
                            nb++;
                        case 3:
                            Thread.sleep(3000);
                            ac.jLabelXRight(-500, 0, 1, 1, img1);
                            ac.jLabelXRight(0, 500, 1, 1, img2);
                            ac.jLabelXRight(500, 1000, 1, 1, img3);
                            nb = 0;
                    }
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }).start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jProgressBar1 = new javax.swing.JProgressBar();
        pnlView1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        pnlViewSanPham = new keeptoo.KGradientPanel();
        pnlViewSanPham1 = new javax.swing.JLabel();
        pnlViewSanPham3 = new javax.swing.JLabel();
        lblSanPham = new javax.swing.JLabel();
        pnlViewKhachHang = new keeptoo.KGradientPanel();
        pnlViewKhachHang3 = new javax.swing.JLabel();
        pnlViewKhachHang1 = new javax.swing.JLabel();
        lblKhachHang = new javax.swing.JLabel();
        pnlViewNhaCungCap = new keeptoo.KGradientPanel();
        lblNhaCungCap = new javax.swing.JLabel();
        lblNCC = new javax.swing.JLabel();
        pnlViewThongKe3 = new javax.swing.JLabel();
        pnlViewDonHang = new keeptoo.KGradientPanel();
        pnlViewDonHang1 = new javax.swing.JLabel();
        lblDonHang = new javax.swing.JLabel();
        pnlViewDonHang3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        left = new javax.swing.JPanel();
        img1 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();

        pnlView1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setOpaque(false);

        pnlViewSanPham.setOpaque(false);
        pnlViewSanPham.setLayout(null);

        pnlViewSanPham1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sanPham1.png"))); // NOI18N
        pnlViewSanPham.add(pnlViewSanPham1);
        pnlViewSanPham1.setBounds(0, 0, 96, 96);

        pnlViewSanPham3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        pnlViewSanPham3.setForeground(new java.awt.Color(255, 255, 255));
        pnlViewSanPham3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlViewSanPham3.setText("Sản phẩm");
        pnlViewSanPham.add(pnlViewSanPham3);
        pnlViewSanPham3.setBounds(10, 102, 110, 22);

        lblSanPham.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lblSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSanPham.setText("100");
        pnlViewSanPham.add(lblSanPham);
        lblSanPham.setBounds(100, 40, 80, 40);

        pnlViewKhachHang.setOpaque(false);
        pnlViewKhachHang.setLayout(null);

        pnlViewKhachHang3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        pnlViewKhachHang3.setForeground(new java.awt.Color(255, 255, 255));
        pnlViewKhachHang3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlViewKhachHang3.setText("Khách hàng");
        pnlViewKhachHang.add(pnlViewKhachHang3);
        pnlViewKhachHang3.setBounds(10, 102, 110, 22);

        pnlViewKhachHang1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lich.png"))); // NOI18N
        pnlViewKhachHang.add(pnlViewKhachHang1);
        pnlViewKhachHang1.setBounds(0, 0, 96, 96);

        lblKhachHang.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        lblKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKhachHang.setText("100");
        pnlViewKhachHang.add(lblKhachHang);
        lblKhachHang.setBounds(100, 40, 80, 40);

        pnlViewNhaCungCap.setOpaque(false);
        pnlViewNhaCungCap.setLayout(null);

        lblNhaCungCap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/thongKe1.png"))); // NOI18N
        pnlViewNhaCungCap.add(lblNhaCungCap);
        lblNhaCungCap.setBounds(0, 0, 96, 96);

        lblNCC.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblNCC.setForeground(new java.awt.Color(255, 255, 255));
        lblNCC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNCC.setText("100");
        pnlViewNhaCungCap.add(lblNCC);
        lblNCC.setBounds(100, 40, 80, 29);

        pnlViewThongKe3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        pnlViewThongKe3.setForeground(new java.awt.Color(255, 255, 255));
        pnlViewThongKe3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlViewThongKe3.setText("Nhà Cung Cấp");
        pnlViewNhaCungCap.add(pnlViewThongKe3);
        pnlViewThongKe3.setBounds(10, 102, 140, 22);

        pnlViewDonHang.setOpaque(false);
        pnlViewDonHang.setLayout(null);

        pnlViewDonHang1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/donHang1.png"))); // NOI18N
        pnlViewDonHang.add(pnlViewDonHang1);
        pnlViewDonHang1.setBounds(0, 0, 96, 96);

        lblDonHang.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblDonHang.setForeground(new java.awt.Color(255, 255, 255));
        lblDonHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDonHang.setText("100");
        pnlViewDonHang.add(lblDonHang);
        lblDonHang.setBounds(100, 40, 80, 40);

        pnlViewDonHang3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        pnlViewDonHang3.setForeground(new java.awt.Color(255, 255, 255));
        pnlViewDonHang3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlViewDonHang3.setText("Đơn hàng");
        pnlViewDonHang.add(pnlViewDonHang3);
        pnlViewDonHang3.setBounds(10, 100, 100, 22);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        left.setBackground(new java.awt.Color(255, 255, 255));
        left.setLayout(new java.awt.GridBagLayout());

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img1.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        left.add(img1, gridBagConstraints);

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img2.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        left.add(img2, gridBagConstraints);

        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img3.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        left.add(img3, gridBagConstraints);

        jPanel2.add(left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 500));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(pnlViewSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlViewKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlViewNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlViewDonHang, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlViewNhaCungCap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(pnlViewKhachHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlViewSanPham, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlViewDonHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlView1Layout = new javax.swing.GroupLayout(pnlView1);
        pnlView1.setLayout(pnlView1Layout);
        pnlView1Layout.setHorizontalGroup(
            pnlView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlView1Layout.setVerticalGroup(
            pnlView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlView1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlView1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblDonHang;
    private javax.swing.JLabel lblKhachHang;
    private javax.swing.JLabel lblNCC;
    private javax.swing.JLabel lblNhaCungCap;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JPanel left;
    private javax.swing.JPanel pnlView1;
    private keeptoo.KGradientPanel pnlViewDonHang;
    private javax.swing.JLabel pnlViewDonHang1;
    private javax.swing.JLabel pnlViewDonHang3;
    private keeptoo.KGradientPanel pnlViewKhachHang;
    private javax.swing.JLabel pnlViewKhachHang1;
    private javax.swing.JLabel pnlViewKhachHang3;
    private keeptoo.KGradientPanel pnlViewNhaCungCap;
    private keeptoo.KGradientPanel pnlViewSanPham;
    private javax.swing.JLabel pnlViewSanPham1;
    private javax.swing.JLabel pnlViewSanPham3;
    private javax.swing.JLabel pnlViewThongKe3;
    // End of variables declaration//GEN-END:variables

    SanPhamDAO spdao = new SanPhamDAO();
    KhachHangDAO khdao = new KhachHangDAO();
    DonHangDAO dhdao = new DonHangDAO();
    NhaCungCapDAO nccdao = new NhaCungCapDAO();

    void fillSoLuongSanPham() {
        String model = lblSanPham.getText();
        List<Integer> list = spdao.selectSoLuongSanPham();
        for (Integer year : list) {
            lblSanPham.setText(String.valueOf(list.get(0)));
        }
    }

    void fillSoLuongKhachHang() {
        String model = lblKhachHang.getText();
        List<Integer> list = khdao.selectSoLuongKhachHang();
        for (Integer year : list) {
            lblKhachHang.setText(String.valueOf(list.get(0)));
        }
    }

    void fillSoLuongDonHang() {
        String model = lblDonHang.getText();
        List<Integer> list = dhdao.selectSoLuongDonHang();
        for (Integer year : list) {
            lblDonHang.setText(String.valueOf(list.get(0)));
        }
    }

    void fillSoLuongNCC() {
        String model = lblNCC.getText();
        List<Integer> list = nccdao.selectSoLuongNhaCungCap();
        for (Integer year : list) {
            lblNCC.setText(String.valueOf(list.get(0)));
        }
    }
}
