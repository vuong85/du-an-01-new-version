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
public class KhachHangBean {

    private String thang;
    private int luongKhach;

    public KhachHangBean() {
    }

    public KhachHangBean(String thang, int luongKhach) {
        this.thang = thang;
        this.luongKhach = luongKhach;
    }

    public String getThang() {
        return thang;
    }

    public void setThang(String thang) {
        this.thang = thang;
    }

    public int getLuongKhach() {
        return luongKhach;
    }

    public void setLuongKhach(int luongKhach) {
        this.luongKhach = luongKhach;
    }

}
