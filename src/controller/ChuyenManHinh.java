/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ui.QuanLyDonHangJPanel;
import ui.QuanLyKhachHangJPanel;
import bean.DanhMucBean;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import ui.QuanLyNhaCungCapJPanel;
import ui.QuanLyNhanVienJPanel;
import ui.QuanLySanPhamJPanel;
import ui.ThongKeJPanel;
import ui.TrangChuPanel;

/**
 *
 * @author Vu Hoang Phuc
 */
public class ChuyenManHinh {

    private JPanel jpnroot;
    private String kindSelected = "";

    private List<DanhMucBean> listItem = null;

    public ChuyenManHinh(JPanel jpnroot) {
        this.jpnroot = jpnroot;
    }

    public void setDashboard(JPanel jpnItem, JLabel jlbItem) {
        kindSelected = "TrangChinh";
        jpnItem.setBackground(new Color(96, 100, 191));
        jlbItem.setBackground(new Color(96, 100, 191));

        jpnroot.removeAll();
        jpnroot.setLayout(new BorderLayout());
        jpnroot.add(new TrangChuPanel());
        jpnroot.validate();
        jpnroot.repaint();

    }

    public void setEvent(List<DanhMucBean> listItem) {
        this.listItem = listItem;
        for (DanhMucBean item : listItem) {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }



    class LabelEvent implements MouseListener {

        private JPanel node;
        private String kind;
        private JPanel pnlItem;
        private JLabel lblItem;

        public LabelEvent(String kind, JPanel pnlItem, JLabel lblItem) {
            this.kind = kind;
            this.pnlItem = pnlItem;
            this.lblItem = lblItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "TrangChu":
                    node = new TrangChuPanel();
                    break;
                case "NhanVien":
                    node = new QuanLyNhanVienJPanel();
                    break;
                case "SanPham":
                    node = new QuanLySanPhamJPanel();
                    break;
                case "DonHang":
                    node = new QuanLyDonHangJPanel();
                    break;
                case "KhachHang":
                    node = new QuanLyKhachHangJPanel();
                    break;
                case "ThongKe":
                    node = new ThongKeJPanel();
                    break;
                case "NhaCungCap":
                    node = new QuanLyNhaCungCapJPanel();
                    break;
                default:
                    node = new TrangChuPanel();
                    break;

            }
            jpnroot.removeAll();;
            jpnroot.setLayout(new BorderLayout());
            jpnroot.add(node);
            jpnroot.validate();
            jpnroot.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            //khi nhan giu
            
            pnlItem.setBackground(new Color(96, 100, 191));
            lblItem.setBackground(new Color(96, 100, 191));
            
            }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            //hover
            
            pnlItem.setBackground(new Color(96, 100, 191));
            lblItem.setBackground(new Color(96, 100, 191));
            
            
            }

        @Override
        public void mouseExited(MouseEvent e) {
            
            if(!kindSelected.equalsIgnoreCase(kind)){
                pnlItem.setBackground(new Color(76, 175, 80));
                lblItem.setBackground(new Color(76, 175, 80));
            }
             
        }

    }

    private void setChangeBackground(String kind) {
            
        for (DanhMucBean item : listItem) {
            if (item.getKind().equalsIgnoreCase(kind)) {
                item.getJpn().setBackground(new Color(96, 100, 191));
                item.getJlb().setBackground(new Color(96, 100, 191));
            } else {
                item.getJpn().setBackground(new Color(76, 175, 80));
                item.getJlb().setBackground(new Color(76, 175, 80));
            }
        }

    }

}
