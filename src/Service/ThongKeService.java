/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import bean.KhachHangBean;
import bean.SanPhamBean;
import bean.ThongKeSanPhamBean;
import java.util.List;

/**
 *
 * @author nguye
 */
public interface ThongKeService {
    public List<KhachHangBean> getListByKhachHang(Integer nam );
    
    public List<SanPhamBean> getListByDoanhThu(Integer nam);
    
    public List<ThongKeSanPhamBean> getListBySanPham(Integer nam);
}
