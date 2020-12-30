/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author nguye
 */
public class SanPhamBean {

    private String thang;
    private int DOANHTHU;

    public SanPhamBean() {
    }

    public SanPhamBean(String thang, int DOANHTHU) {
        this.thang = thang;
        this.DOANHTHU = DOANHTHU;
    }

    public String getThang() {
        return thang;
    }

    public void setThang(String thang) {
        this.thang = thang;
    }

    public int getDOANHTHU() {
        return DOANHTHU;
    }

    public void setDOANHTHU(int DOANHTHU) {
        this.DOANHTHU = DOANHTHU;
    }

}
