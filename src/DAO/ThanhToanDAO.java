/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.ThanhToan;
import java.util.ArrayList;
import java.util.List;
import Utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author nguye
 */
public class ThanhToanDAO extends DADAO<ThanhToan, Boolean> {

    @Override
    public void insert(ThanhToan entity) {
        String sql = "INSERT INTO ThanhToan(MATT,TENTT) VALUES (?,?)";
        XJdbc.update(sql,
                entity.isMATT(),
                entity.getTENTT());
    }

    @Override
    public void update(ThanhToan entity) {
        String sql = "UPDATE ThanhToan TENTT=? WHERE MATT= ?";
        XJdbc.update(sql,
                entity.isMATT(),
                entity.getTENTT());
    }

 @Override
    public void delete(Boolean id) {
        String sql = "DELETE FROM ThanhToan WHERE MATT = ?";
        XJdbc.update(sql, id);
    }

    @Override
    public ThanhToan selectById(Boolean id) {
               String sql = "SELECT * FROM ThanhToan WHERE MATT=?";
        List<ThanhToan> list = selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }


    @Override
    public List<ThanhToan> selectAll() {
        String sql = "SELECT * FROM ThanhToan";
         return selectBySql(sql);
    }

    @Override
    protected List<ThanhToan> selectBySql(String sql, Object... args) {
        List<ThanhToan> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    ThanhToan entity = new ThanhToan();
                    entity.setMATT(rs.getBoolean("MATT"));
                    entity.setTENTT(rs.getString("TENTT"));
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;    }

   
}
