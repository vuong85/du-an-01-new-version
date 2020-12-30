/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author nguye
 */
public class ChiTietDonHang {
    private int MADH;
    private int MASP; 
    private int SOLUONG;
    private double GIA;

    public ChiTietDonHang(int MADH, int MASP, int SOLUONG, double GIA) {
        this.MADH = MADH;
        this.MASP = MASP;
        this.SOLUONG = SOLUONG;
        this.GIA = GIA;
    }
    
    public ChiTietDonHang(int MASP, int SOLUONG, double GIA) {
        this.MASP = MASP;
        this.SOLUONG = SOLUONG;
        this.GIA = GIA;
    }

    public ChiTietDonHang() {
    }
    

    public int getMADH() {
        return MADH;
    }

    public void setMADH(int MADH) {
        this.MADH = MADH;
    }

    public int getMASP() {
        return MASP;
    }

    public void setMASP(int MASP) {
        this.MASP = MASP;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }

    public double getGIA() {
        return GIA;
    }

    public void setGIA(double GIA) {
        this.GIA = GIA;
    }
    
    
}
