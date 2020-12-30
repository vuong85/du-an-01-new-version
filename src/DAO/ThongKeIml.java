/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import bean.KhachHangBean;
import bean.SanPhamBean;
import bean.ThongKeSanPhamBean;
import Utils.XJdbc;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author nguye
 */
public class ThongKeIml implements ThongKe_KhachHangDAO {

    @Override
    public List<KhachHangBean> getListByKhachHangBean(Integer nam) {
        String sql = "  select month(ngaymua) as THANG,count(makh) as LUONGKHACH\n"
                + "  from DONHANG where year(ngaymua) = ? "
                + "  group by month(ngaymua) ";
        List<KhachHangBean> list = selectBySql(sql, nam);
        return list;
    }

    /*
    Hàm sql lấy từ khoahocDAO của DAMAU
     */
    protected List<KhachHangBean> selectBySql(String sql, Object... args) {
        List<KhachHangBean> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    KhachHangBean entity = new KhachHangBean();
                    entity.setThang(rs.getString("THANG"));
                    entity.setLuongKhach(rs.getInt("LUONGKHACH"));
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    /*
    ---------------------------------------------------------------
     */
    @Override
    public List<SanPhamBean> getListBySanPhamBean(Integer nam) {
        String sql = "  	select month(ngaymua) as THANG,cast(sum(CHITIETDONHANG.Gia) as money) as DOANHTHU\n"
                + "                      from DONHANG,CHITIETDONHANG where year(ngaymua)=? and DONHANG.MADH= CHITIETDONHANG.MADH\n"
                + "                      group by month(ngaymua)";
        List<SanPhamBean> list = selectBySqlDoanhThu(sql, nam);
        return list;
    }

    protected List<SanPhamBean> selectBySqlDoanhThu(String sql, Object... args) {
        List<SanPhamBean> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    SanPhamBean entity = new SanPhamBean();
                    entity.setThang(rs.getString("THANG"));
                    entity.setDOANHTHU(rs.getInt("DOANHTHU"));
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }
    ////////////////////////////////////////////////

    @Override
    public List<ThongKeSanPhamBean> getListByThogKeSanPhamBean(Integer nam) {
        String sql = "		select TENLOAI, COUNT(chitietdonhang.masp) as soluong\n"
                + "	    from DONHANG,CHITIETDONHANG,SANPHAM,LOAISANPHAM\n"
                + "    	where DONHANG.MADH=CHITIETDONHANG.MADH and CHITIETDONHANG.MASP = SANPHAM.MASP and SANPHAM.MALOAI = LOAISANPHAM.MALOAI\n"
                + "		and YEAR(NGAYMUA) = ?\n"
                + "	    group by TENLOAI";
        List<ThongKeSanPhamBean> list = selectBySqlLuongSanPham(sql, nam);
        return list;
    }

    protected List<ThongKeSanPhamBean> selectBySqlLuongSanPham(String sql, Object... args) {
        List<ThongKeSanPhamBean> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    ThongKeSanPhamBean entity = new ThongKeSanPhamBean();
                    entity.setTENLOAI(rs.getString("TENLOAI"));
                    entity.setSOLUONG(rs.getInt("SOLUONG"));
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }
}
