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
        right = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtGioiThieu1 = new javax.swing.JTextPane();
        txtYeuCauPhienBan1 = new javax.swing.JTextPane();
        Title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

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

        right.setBackground(new java.awt.Color(255, 255, 255));
        right.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel15.setText("GIỚI THIỆU");
        right.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        jLabel16.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel16.setText("YÊU CẦU MÔI TRƯỜNG: ");
        right.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 160, 20));

        txtGioiThieu1.setEditable(false);
        txtGioiThieu1.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        txtGioiThieu1.setText("    Ngày nay, công nghệ thông tin ngày càng phát triển thì nhu cầu cuộc sống cũng như việc ứng dụng Công nghệ thông tin vào công việc của con người được phát triển mạnh mẽ và ngày càng đa dạng hơn, đặc biệt vấn đề quản lý đang được mọi người quan tâm và phát triển. Nhiều công nghệ sử dụng mới được áp dụng hàng ngày, cũng như đưa phần mềm vào quản lý ngày càng trực quan và sinh động hơn vời người sử dụng, nhằm phục vụ nhu cầu truyền thông của con người, hoạt động kinh doanh thiết bị công nghệ ngày càng phát triển mạnh mẽ trong xu hướng bán lẻ của các doanh nghiệp.\n\n   Hiện nay, đa số các cửa hàng thiết bị công nghệ đều chưa có phần mềm quản lý, các phương pháp quản lý đều thực hiện một cách thủ công chủ yếu bằng ghi chép sổ sách... Nhằm giảm thao tác thủ công, mang lại tính chính xác và hiệu quả cao trong công tác quản lý hoạt động kinh doanh. Với mục tiêu trên thì trọng tâm của đề tài này sẽ đi sâu nghiên cứu và phát triển phần mềm  “Quản lý cửa hàng thiết bị công nghệ” Là một đề tài mang tính thực tế và đáp ứng được nhu cầu trong công tác quản lý.Để đáp ứng được nhu cầu cho việc quản lý cửa hàng dễ dàng và thuân tiện ...,Vì vậy mà em đã chọn đề tài này để phát triển phần mềm của mình.");
        txtGioiThieu1.setPreferredSize(new java.awt.Dimension(512, 175));
        txtGioiThieu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGioiThieu1MouseClicked(evt);
            }
        });
        right.add(txtGioiThieu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 380, 350));

        txtYeuCauPhienBan1.setEditable(false);
        txtYeuCauPhienBan1.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        txtYeuCauPhienBan1.setText("1. Hệ điều hành bất kỳ\n2. JDK 1.8 trở lên\n3. SQL Server 2008 trở lên");
        txtYeuCauPhienBan1.setPreferredSize(new java.awt.Dimension(512, 175));
        txtYeuCauPhienBan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtYeuCauPhienBan1MouseClicked(evt);
            }
        });
        right.add(txtYeuCauPhienBan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 160, 50));

        Title.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        Title.setText("NỘI DUNG");
        right.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));
        right.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 380, 10));

        jPanel2.add(right, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 410, 500));

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
                        .addComponent(pnlViewDonHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 870, Short.MAX_VALUE))
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

    private void txtGioiThieu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGioiThieu1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_txtGioiThieu1MouseClicked

    private void txtYeuCauPhienBan1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtYeuCauPhienBan1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYeuCauPhienBan1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
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
    private javax.swing.JPanel right;
    private javax.swing.JTextPane txtGioiThieu1;
    private javax.swing.JTextPane txtYeuCauPhienBan1;
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
