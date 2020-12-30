/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.NhaCungCap;
import java.util.ArrayList;
import java.util.List;
import Utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author nguye
 */
public class NhaCungCapDAO extends DADAO<NhaCungCap, String> {

    @Override
    public void insert(NhaCungCap entity) {
        String sql = "INSERT INTO NhaCungCap(MANCC,TENNCC,SDT,DIACHI)VALUES(?,?,?,?)";
        XJdbc.update(sql,
                entity.getMANCC(),
                entity.getTENNCC(),
                entity.getSDT(),
                entity.getDIACHI());
    }

    @Override
    public void update(NhaCungCap entity) {
        String sql = "UPDATE NhaCungCap SET TENNCC = ?,SDT =?,DIACHI=? WHERE MANCC = ?";
        XJdbc.update(sql,
                entity.getTENNCC(),
                entity.getSDT(),
                entity.getDIACHI(),
                entity.getMANCC()
        );
    }

    @Override
    public void delete(String MANCC) {
        String sql = "DELETE FROM NhaCungCap WHERE MANCC = ?";
        XJdbc.update(sql, MANCC);
    }

    @Override
    public NhaCungCap selectById(String MANCC) {
        String sql = "SELECT * FROM nhacungcap WHERE mancc=?";
        List<NhaCungCap> list = selectBySql(sql, MANCC);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<NhaCungCap> selectAll() {
        String sql = "SELECT * FROM NhaCungCap";
        return selectBySql(sql);
    }

    @Override
    protected List<NhaCungCap> selectBySql(String sql, Object... args) {
        List<NhaCungCap> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    NhaCungCap entity = new NhaCungCap();
                    entity.setMANCC(rs.getString("MANCC"));
                    entity.setTENNCC(rs.getString("TENNCC"));
                    entity.setSDT(rs.getString("SDT"));
                    entity.setDIACHI(rs.getString("DIACHI"));
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

    public List<NhaCungCap> selectNotInCourse(String keyword) {
        String sql = "SELECT * FROM nhacungcap WHERE mancc LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

    public List<Integer> selectSoLuongNhaCungCap() {
        String sql = "select COUNT(*) from NHACUNGCAP";
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
    public List<NhaCungCap> selectByTenNCC(String tenncc) {
        String sql = "SELECT * FROM nhacungcap WHERE tenncc LIKE ?";
        return this.selectBySql(sql, "%" + tenncc + "%");
    }
}
