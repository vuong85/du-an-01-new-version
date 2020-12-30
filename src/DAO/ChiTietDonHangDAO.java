/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.ChiTietDonHang;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.List;
import Utils.XJdbc;
import java.sql.SQLException;
/**
 *
 * @author nguye
 */
public class ChiTietDonHangDAO extends DADAO<ChiTietDonHang, String> {

   @Override
    public void insert(ChiTietDonHang entity) {
        String sql = "INSERT INTO ChiTietDonHang (MADH,MASP,SOLUONG,GIA) VALUES (?,?,?,?)";
        XJdbc.update(sql,
                entity.getMADH(),
                entity.getMASP(),
                entity.getSOLUONG(),
                entity.getGIA());
    }
    
    @Override
    public void update(ChiTietDonHang entity) {
        String sql = "UPDATE ChiTietDonHang SET MASP = ? ,SOLUONG = ?, GIA = ? WHERE MADH =? ";
        XJdbc.update(sql,             
                entity.getMASP(),
                entity.getSOLUONG(),
                entity.getGIA(),
                entity.getMADH()
        );
    }

    @Override
    public void delete(String MADH) {
        String sql = "DELETE FROM ChiTietDonHang WHERE MADH = ?";
        XJdbc.update(sql, MADH);
    }

    @Override
    public ChiTietDonHang selectById(String MADH) {
        String sql = "SELECT * FROM ChiTietDonHang WHERE MaDH=?";
        List<ChiTietDonHang> list = selectBySql(sql, MADH);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<ChiTietDonHang> selectAll() {
        String sql = "SELECT * FROM ChiTietDonHang";
        return (List<ChiTietDonHang>) selectById(sql);
    }

    @Override
    protected List<ChiTietDonHang> selectBySql(String sql, Object... args) {
        List<ChiTietDonHang> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    ChiTietDonHang entity = new ChiTietDonHang();
                    entity.setMADH(rs.getInt("MAHD"));
                    entity.setMASP(rs.getInt("MASP"));
                    entity.setSOLUONG(rs.getInt("SOLUONG"));
                    entity.setGIA(rs.getDouble("MASP"));
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
