/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.DonHang;
import java.util.ArrayList;
import java.util.List;
import Utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author nguye
 */
public class DonHangDAO extends DADAO<DonHang, Integer> {

    @Override
    public void insert(DonHang entity) {
        String sql = "INSERT INTO DonHang (NGAYMUA,MAKH,MATT,MANV,TONGTIEN) VALUES (?,?,?,?,?) ";
        XJdbc.update(sql,
                entity.getNGAYMUA(),
                entity.getMAKH(),
                entity.getMATT(),
                entity.getMANV(),
                entity.getTongTien());
    }

    @Override
    public void update(DonHang entity) {
        String sql = "UPDATE DonHang SET NGAYMUA = ?, MAKH = ?, MATT = ?,MANV=? WHERE MADH = ? ";
        XJdbc.update(sql,
                entity.getNGAYMUA(),
                entity.getMAKH(),
                entity.getMATT(),
                entity.getMANV(),
                entity.getMADH());
    }

    @Override
    public void delete(Integer MADH) {
        String sql = "DELETE FROM DonHang WHERE MADH = ?";
        XJdbc.update(sql, MADH);
    }

    @Override
    public DonHang selectById(Integer MADH) {
        String sql = "SELECT * FROM DonHang WHERE MADH=?";
        List<DonHang> list = selectBySql(sql, MADH);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<DonHang> selectAll() {
        String sql = "SELECT * FROM DONHANG";
        return selectBySql(sql);
    }

    @Override
    protected List<DonHang> selectBySql(String sql, Object... args) {
        List<DonHang> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    DonHang entity = new DonHang();
                    entity.setMADH(rs.getInt("MADH"));
                    entity.setNGAYMUA(rs.getDate("NGAYMUA"));
                    entity.setMAKH(rs.getInt("MAKH"));
                    entity.setMATT(rs.getString("MATT"));
                    entity.setMANV(rs.getString("MANV"));
                    entity.setTongTien(rs.getDouble("TONGTIEN"));
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

    public List<Integer> selectMaxMADH() {
        String sql = "SELECT MAX(Madh) FROM DONHANG";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Integer> selectYears() {
        String sql = "SELECT DISTINCT year(NGAYMUA) Year FROM DONHANG ORDER BY Year DESC";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

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

    public List<DonHang> selectByYear(int year) {
        String sql = "CALL sp_DanhSachThang(?)";
        return this.selectBySql(sql, year);
    }

    public List<Object[]> getDonHang(Integer year) {
        String sql = "CALL sp_QuanLyDonHang(?)";
        String[] cols = {"MADH", "NGAYMUA", "TENSP", "SOLUONG", "GIA", "TONGTIEN", "TENKH"};
        return this.getListOfArray(sql, cols, year);
    }

    public List<Object[]> getDanhSachDonHang() {
        String sql = "{call dh_DonHangFull}";
        String[] cols = {"MADH", "NGAYMUA", "TENSP", "TENTT", "SOLUONG", "GIA", "THANHTIEN", "TENKH", "TENNV"};
        return this.getListOfArray(sql, cols);
    }

    public List<Object[]> getDanhSachDonHangByDay(Date date1, Date date2) {
        String sql = "{CALL sp_DanhSachDonHangByDay(?,?)}";
        String[] cols = {"MADH", "NGAYMUA", "TENSP", "TENTT", "SOLUONG", "GIA", "THANHTIEN", "TENKH", "TENNV"};
        return this.getListOfArray(sql, cols,date1,date2);
    }

    public List<Integer> selectSoLuongDonHang() {
        String sql = "select COUNT(*) from DONHANG";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
