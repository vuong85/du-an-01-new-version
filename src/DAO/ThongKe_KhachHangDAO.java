/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import bean.KhachHangBean;
import bean.SanPhamBean;
import bean.ThongKeSanPhamBean;
import java.util.List;

/**
 *
 * @author nguye
 */
public interface ThongKe_KhachHangDAO {

    public List<KhachHangBean> getListByKhachHangBean(Integer nam);

    public List<SanPhamBean> getListBySanPhamBean(Integer nam);
    
    public List<ThongKeSanPhamBean> getListByThogKeSanPhamBean(Integer nam);
}
