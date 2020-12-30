/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Utils.MsgBox;

/**
 *
 * @author Vu Hoang Phuc
 */
public class DonHangTam {

    int masp;
    String tensp;
    int soluong;
    double gia;
    double tongGia;

    public DonHangTam(int masp, String tensp, int soluong, double gia, double tongGia) {
        this.masp = masp;
        this.tensp = tensp;
        this.soluong = soluong;
        this.gia = gia;
        this.tongGia = tongGia;
    }

    public DonHangTam() {
    }

      public DonHangTam(int masp) {
        this.masp = masp;
    }
    
    public int getMasp() {
        return masp;
    }

    public void setMasp(int masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public double getTongGia() {
        return tongGia;
    }

    public void setTongGia(double tongGia) {
        this.tongGia = tongGia;
    }

    
}
