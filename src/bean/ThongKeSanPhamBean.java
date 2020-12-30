/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ThongKeSanPhamBean {
    private String TENLOAI;
    private int SOLUONG;

    public ThongKeSanPhamBean() {
    }

    public ThongKeSanPhamBean(String TENLOAI, int SOLUONG) {
        this.TENLOAI = TENLOAI;
        this.SOLUONG = SOLUONG;
    }

    public String getTENLOAI() {
        return TENLOAI;
    }

    public void setTENLOAI(String TENLOAI) {
        this.TENLOAI = TENLOAI;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }
    
}
