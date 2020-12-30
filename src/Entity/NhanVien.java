/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author nguye
 */
public class NhanVien {
    private String MANV ;
    private String MATKHAU;
    private String TENNV; 
    private String DIACHI; 
    private String SDT; 
    private boolean VAITRO; 
    private Date NGAYSINH=new Date(); 
    private String EMAIL;

    public NhanVien(String MANV, String MATKHAU, String TENNV, String DIACHI, String SDT, boolean VAITRO, Date NGAYSINH, String EMAIL) {
        this.MANV = MANV;
        this.MATKHAU = MATKHAU;
        this.TENNV = TENNV;
        this.DIACHI = DIACHI;
        this.SDT = SDT;
        this.VAITRO = VAITRO;
        this.NGAYSINH = NGAYSINH;
        this.EMAIL = EMAIL;
    }

    public NhanVien() {
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public String getMATKHAU() {
        return MATKHAU;
    }

    public void setMATKHAU(String MATKHAU) {
        this.MATKHAU = MATKHAU;
    }

    public String getTENNV() {
        return TENNV;
    }

    public void setTENNV(String TENNV) {
        this.TENNV = TENNV;
    }

    public String getDIACHI() {
        return DIACHI;
    }

    public void setDIACHI(String DIACHI) {
        this.DIACHI = DIACHI;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public boolean getVAITRO() {
        return VAITRO;
    }

    public void setVAITRO(boolean VAITRO) {
        this.VAITRO = VAITRO;
    }

    public Date getNGAYSINH() {
        return NGAYSINH;
    }

    public void setNGAYSINH(Date NGAYSINH) {
        this.NGAYSINH = NGAYSINH;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }
}
