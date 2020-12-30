/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Utils.XJdbc;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author nguye
 */
public class ThongKeDAO {

    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Object[]> getDoanhThu(Integer nam) {
        String sql = "{CALL sp_ThongKeSanPham (?)}";
        String[] cols = {"MASP", "TENSP", "GIA", "SOLUONG"};
        return this.getListOfArray(sql, cols, nam);
    }

    public List<Object[]> getKhachHang(Integer nam) {
        String sql = "{CALL sp_ThongKeLuongKhach(?)}";
        String[] cols = {"THANG", "SOLUONGKHACH"};
        return this.getListOfArray(sql, cols, nam);
    }

    public List<Object[]> getThongKeDoanhThu(Integer nam) {
        String sql = "{CALL sp_DoanhThu(?)}";
        String[] cols = {"MADH", "SOSANPHAM", "LUONGKHACH", "TONGTIEN"};
        return this.getListOfArray(sql, cols, nam);
    }

    public List<Object[]> getLuongSPBanDuoc(Integer year) {
        String sql = "{CALL sp_LuongSPBanDuoc(?)}";
        String[] cols = {"TENSP", "SOLUONG", "DOANHTHU", "LUONGKHACH"};
        return this.getListOfArray(sql, cols, year);
    }

    public List<Object[]> getDonHang(int year) {
        String sql = "CALL sp_QuanLyDonHang(?)";
        String[] cols = {"MADH", "NGAYMUA", "TENSP", "SOLUONG", "GIA", "TONGTIEN", "TENKH"};
        return this.getListOfArray(sql, cols, year);
    }
}
