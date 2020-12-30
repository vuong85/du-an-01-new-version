/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import Entity.NhanVien;
import java.util.ArrayList;
import Utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author nguye
 */
public class NhanVienDAO extends DADAO<NhanVien, String> {

    @Override
    public void insert(NhanVien entity) {
        String sql = "INSERT INTO NhanVien(MANV,MATKHAU,TENNV,SDT,DIACHI,VAITRO,NGAYSINH,EMAIL) VALUES (?,?,?,?,?,?,?,?)";
        XJdbc.update(sql,
                entity.getMANV(),
                entity.getMATKHAU(),
                entity.getTENNV(),
                entity.getSDT(),
                entity.getDIACHI(),
                entity.getVAITRO(),
                entity.getNGAYSINH(),
                entity.getEMAIL());
    }

    @Override
    public void update(NhanVien entity) {
        String sql = "UPDATE NhanVien set MATKHAU=?,TENNV=?,DIACHI=?,SDT=?,VAITRO=?,NGAYSINH=?,EMAIL=? WHERE MANV = ?";
        XJdbc.update(sql,
                entity.getMATKHAU(),
                entity.getTENNV(),
                entity.getDIACHI(),
                entity.getSDT(),
                entity.getVAITRO(),
                entity.getNGAYSINH(),
                entity.getEMAIL(),
                entity.getMANV());
    }

    @Override
    public void delete(String MANV) {
        String sql = "DELETE FROM NhanVien WHERE MANV = ?";
        XJdbc.update(sql, MANV);
    }

    @Override
    public NhanVien selectById(String MANV) {
        String sql = "SELECT * FROM nhanvien WHERE MaNV=?";
        List<NhanVien> list = selectBySql(sql, MANV);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<NhanVien> selectAll() {
        String sql = "SELECT * FROM NHANVIEN";
        return selectBySql(sql);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    NhanVien entity = new NhanVien();
                    entity.setMANV(rs.getString("MANV"));
                    entity.setMATKHAU(rs.getString("MATKHAU"));
                    entity.setTENNV(rs.getString("TENNV"));
                    entity.setDIACHI(rs.getString("DIACHI"));
                    entity.setSDT(rs.getString("SDT"));
                    entity.setVAITRO(rs.getBoolean("VAITRO"));
                    entity.setNGAYSINH(rs.getDate("NGAYSINH"));
                    entity.setEMAIL(rs.getString("EMAIL"));
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

    public List<NhanVien> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM NhanVien WHERE TenNV LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

}
