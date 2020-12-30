/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import bean.SanPhamBean;
import java.util.List;

/**
 *
 * @author nguye
 */
public interface ThongKe_SanPhamDAO {


    public List<SanPhamBean> getListBySanPhamBean(Integer nam);
}
