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
public class NhaCungCap {

    private String MANCC;
    private String TENNCC;
    private String SDT;
    private String DIACHI;

    @Override
    public String toString() {
        return this.TENNCC;
    }
        
    
    public NhaCungCap(String MANVCC, String TENNCC, String SDT, String DIACHI) {
        this.MANCC = MANVCC;
        this.TENNCC = TENNCC;
        this.SDT = SDT;
        this.DIACHI = DIACHI;
    }

    public NhaCungCap() {
    }
    

    public String getMANCC() {
        return MANCC;
    }

    public void setMANCC(String MANVCC) {
        this.MANCC = MANVCC;
    }

    public String getTENNCC() {
        return TENNCC;
    }

    public void setTENNCC(String TENNCC) {
        this.TENNCC = TENNCC;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDIACHI() {
        return DIACHI;
    }

    public void setDIACHI(String DIACHI) {
        this.DIACHI = DIACHI;
    }

}
