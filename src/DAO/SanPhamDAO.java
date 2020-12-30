/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.SanPham;
import java.util.List;
import Utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author nguye
 */
public class SanPhamDAO extends DADAO<SanPham, Integer> {

    @Override
    public void insert(SanPham entity) {
        String sql = "INSERT INTO SanPham (TENSP,GIA,SOLUONG,HINH,MOTA,MANCC,MALOAI)VALUES(?,?,?,?,?,?,?)";
        XJdbc.update(sql,
                entity.getTENSP(),
                entity.getGIA(),
                entity.getSOLUONG(),
                entity.getHINH(),
                entity.getMOTA(),
                entity.getMANCC(),
                entity.getMALOAI());

    }

    @Override
    public void update(SanPham entity) {
        String sql = "UPDATE SanPham SET TENSP=?,GIA=?,SOLUONG=?,HINH=?,MOTA=?,MANCC=?,MALOAI=? WHERE MASP=?";
        XJdbc.update(sql,
                entity.getTENSP(),
                entity.getGIA(),
                entity.getSOLUONG(),
                entity.getHINH(),
                entity.getMOTA(),
                entity.getMANCC(),
                entity.getMALOAI(),
                entity.getMASP()
        );
    }

    @Override
    public void delete(Integer MASP) {
        String sql = "DELETE FROM SanPham WHERE MaSP = ?";
        XJdbc.update(sql, MASP);
    }

    @Override
    public SanPham selectById(Integer MASP) {
        String sql = "SELECT * FROM SanPham WHERE MASP=?";
        List<SanPham> list = selectBySql(sql, MASP);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<SanPham> selectByMALOAI(String maloai) {
        String sql = "SELECT * FROM SANPHAM WHERE MALOAI=?";
        return this.selectBySql(sql, maloai);
    }

    @Override
    public List<SanPham> selectAll() {
        String sql = "SELECT * FROM SanPham";
        return selectBySql(sql);
    }

    @Override
    protected List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    SanPham entity = new SanPham();
                    entity.setMASP(rs.getInt("MASP"));
                    entity.setTENSP(rs.getString("TENSP"));
                    entity.setGIA(rs.getDouble("GIA"));
                    entity.setSOLUONG(rs.getInt("SOLUONG"));
                    entity.setMOTA(rs.getString("MOTA"));
                    entity.setMANCC(rs.getString("MANCC"));
                    entity.setMALOAI(rs.getString("MALOAI"));
                    entity.setHINH(rs.getString("HINH"));
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

    public List<SanPham> selectByNCC_LOAISP(String MaNCC, String MaLoai) {
        String sql = "SELECT * FROM SanPham WHERE MaNCC=? and MaLoai=?";
        return this.selectBySql(sql, MaNCC, MaLoai);
    }

    public List<SanPham> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM sanpham WHERE Tensp LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

    public List<SanPham> selectNotInCourse(String keyword) {
        String sql = "SELECT * FROM SANPHAM WHERE TENSP LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

    public List<SanPham> selectbyName(String keyword, String mancc, String maloai) {
        String sql = "SELECT * FROM SANPHAM WHERE TENSP LIKE ? and  MaNCC=? and MaLoai=?";
        return this.selectBySql(sql, "%" + keyword + "%", mancc, maloai);
    }

    public void updateSoLuong(SanPham entity) {
        String sql = "UPDATE SanPham SET SOLUONG=? WHERE MASP=?";
        XJdbc.update(sql,
                entity.getSOLUONG(),
                entity.getMASP()
        );
    }

    public List<Integer> selectSoLuongSanPham() {
        String sql = "select COUNT(*) from SANPHAM";
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
