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
public class KhachHang {
    private int MAKH ; 
    private String TENKH; 
    private String DIACHI; 
    private String SDT; 
    private Date NGAYSINH; 
    private String EMAIL; 
    private boolean GIOITINH; 

        @Override
    public String toString() {
        return this.TENKH;
                }
    public KhachHang(int MAKH, String TENKH, String DIACHI, String SDT, Date NGAYSINH, String EMAIL, boolean GIOITINH) {
        this.MAKH = MAKH;
        this.TENKH = TENKH;
        this.DIACHI = DIACHI;
        this.SDT = SDT;
        this.NGAYSINH = NGAYSINH;
        this.EMAIL = EMAIL;
        this.GIOITINH = GIOITINH;
    }

    public KhachHang() {
    }
    

    public int getMAKH() {
        return MAKH;
    }

    public void setMAKH(int MAKH) {
        this.MAKH = MAKH;
    }

    public String getTENKH() {
        return TENKH;
    }

    public void setTENKH(String TENKH) {
        this.TENKH = TENKH;
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

    public boolean getGIOITINH() {
        return GIOITINH;
    }

    public void setGIOITINH(boolean GIOITINH) {
        this.GIOITINH = GIOITINH;
    }
    
    
}