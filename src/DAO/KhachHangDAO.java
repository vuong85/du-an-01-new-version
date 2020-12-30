/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.KhachHang;
import java.util.List;
import Utils.XJdbc;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author nguye
 */
public class KhachHangDAO extends DADAO<KhachHang, Integer> {

    public List<KhachHang> selectNotInCourse(String keyword) {
        String sql = "SELECT * FROM KHACHHANG WHERE TENKH LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

    @Override
    public void insert(KhachHang entity) {
        String sql = "INSERT INTO KhachHang (TENKH,DIACHI,SDT,NGAYSINH,EMAIL,GIOITINH) VALUES (?,?,?,?,?,?)";
        XJdbc.update(sql,
                entity.getTENKH(),
                entity.getDIACHI(),
                entity.getSDT(),
                entity.getNGAYSINH(),
                entity.getEMAIL(),
                entity.getGIOITINH());
    }

    @Override
    public void update(KhachHang entity) {
        String sql = "UPDATE KHACHHANG SET TENKH=?,DIACHI=?,SDT=?,NGAYSINH=?,EMAIL=?,GIOITINH=? WHERE MAKH = ?";
        XJdbc.update(sql,
                entity.getTENKH(),
                entity.getDIACHI(),
                entity.getSDT(),
                entity.getNGAYSINH(),
                entity.getEMAIL(),
                entity.getGIOITINH(),
                entity.getMAKH()
        );
    }

    @Override
    public void delete(Integer MAKH) {
        String sql = "DELETE FROM KhachHang WHERE MAKH = ?";
        XJdbc.update(sql, MAKH);
    }

    @Override
    public List<KhachHang> selectAll() {
        String sql = "SELECT * FROM KHACHHANG";
        return selectBySql(sql);
    }

    @Override
    public KhachHang selectById(Integer makh) {
        String sql = "SELECT * FROM KHACHHANG WHERE MAKH=?";
        List<KhachHang> list = selectBySql(sql, makh);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    KhachHang entity = new KhachHang();
                    entity.setMAKH(rs.getInt("MAKH"));
                    entity.setTENKH(rs.getString("TENKH"));
                    entity.setDIACHI(rs.getString("DIACHI"));
                    entity.setSDT(rs.getString("SDT"));
                    entity.setNGAYSINH(rs.getDate("NGAYSINH"));
                    entity.setEMAIL(rs.getString("EMAIL"));
                    entity.setGIOITINH(rs.getBoolean("GIOITINH"));
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

    public List<KhachHang> selectByNameKH(String tenKh) {
        String sql = "SELECT * FROM KhachHang WHERE TenKH LIKE ?";
        return this.selectBySql(sql, "%" + tenKh + "%");
    }

    public List<Integer> selectSoLuongKhachHang() {
        String sql = "select COUNT(*) from KHACHHANG";
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
