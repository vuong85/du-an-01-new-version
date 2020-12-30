/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.LoaiSanPham;
import java.util.List;
import Utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author nguye
 */
public class LoaiSanPhamDAO extends DADAO<LoaiSanPham, String> {

    @Override
    public void insert(LoaiSanPham entity) {
        String sql = "INSERT INTO LoaiSanPham (MALOAI,TENLOAI) VALUES (?,?)";
        XJdbc.update(sql,
                entity.getMALOAI(),
                entity.getTENLOAI());
    }

    @Override
    public void update(LoaiSanPham entity) {
        String sql = "UPDATE LoaiSanPham SET TENLOAI = ? WHERE MALOAI = ?";
        XJdbc.update(sql,              
                entity.getTENLOAI(),
                entity.getMALOAI());
    }

    @Override
    public void delete(String MALOAI) {
        String sql = "DELETE FROM LoaiSanPham WHERE MALOAI = ?";
        XJdbc.update(sql, MALOAI);
    }

    @Override
    public LoaiSanPham selectById(String MALOAI) {
        String sql = "SELECT * FROM LoaiSanPham WHERE MALOAI=?";
        List<LoaiSanPham> list = selectBySql(sql, MALOAI);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<LoaiSanPham> selectAll() {
        String sql = "SELECT * FROM LoaiSanPham";
        return selectBySql(sql);
    }

    @Override
    protected List<LoaiSanPham> selectBySql(String sql, Object... args) {
        List<LoaiSanPham> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    LoaiSanPham entity = new LoaiSanPham();
                    entity.setMALOAI(rs.getString("MALOAI"));
                    entity.setTENLOAI(rs.getString("TENLOAI"));
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

       public List<LoaiSanPham> selectByNCC(String mancc){
        String sql="select * from LOAISANPHAM where maloai in(select distinct maloai from sanpham where mancc =?)";
        return this.selectBySql(sql, mancc);
    }
       public List<LoaiSanPham> selectByNameLSP(String tenLoai) {
        String sql = "SELECT * FROM LOAISANPHAM WHERE TENLOAI LIKE ?";
        return this.selectBySql(sql, "%" + tenLoai + "%");
    }

}
