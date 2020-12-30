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
public class SanPham {
    private int MASP; 
    private String TENSP; 
    private double GIA;
    private int SOLUONG; 
    private String HINH; 
    private String MOTA; 
    private String MANCC; 
    private String MALOAI; 

    public SanPham(int MASP, String TENSP, double GIA, int SOLUONG, String HINH, String MOTA, String MANCC, String MALOAI) {
        this.MASP = MASP;
        this.TENSP = TENSP;
        this.GIA = GIA;
        this.SOLUONG = SOLUONG;
        this.HINH = HINH;
        this.MOTA = MOTA;
        this.MANCC = MANCC;
        this.MALOAI = MALOAI;
    }
    
    public SanPham(int MASP, String TENSP, double GIA) {
        this.MASP = MASP;
        this.TENSP = TENSP;
        this.GIA = GIA;

    }
    
    

   
    public SanPham() {
    }

    public int getMASP() {
        return MASP;
    }

    public void setMASP(int MASP) {
        this.MASP = MASP;
    }

    public String getTENSP() {
        return TENSP;
    }

    public void setTENSP(String TENSP) {
        this.TENSP = TENSP;
    }

    public double getGIA() {
        return GIA;
    }

    public void setGIA(double GIA) {
        this.GIA = GIA;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }

    public String getHINH() {
        return HINH;
    }

    public void setHINH(String HINH) {
        this.HINH = HINH;
    }

    public String getMOTA() {
        return MOTA;
    }

    public void setMOTA(String MOTA) {
        this.MOTA = MOTA;
    }

    public String getMANCC() {
        return MANCC;
    }

    public void setMANCC(String MANCC) {
        this.MANCC = MANCC;
    }

    public String getMALOAI() {
        return MALOAI;
    }

    public void setMALOAI(String MALOAI) {
        this.MALOAI = MALOAI;
    }
    

}
