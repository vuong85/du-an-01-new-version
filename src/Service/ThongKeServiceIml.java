/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import bean.KhachHangBean;
import bean.SanPhamBean;
import bean.ThongKeSanPhamBean;
import DAO.ThongKeIml;
import DAO.ThongKe_KhachHangDAO;
import java.util.List;

/**
 *
 * @author nguye
 */
public class ThongKeServiceIml implements ThongKeService {

    private ThongKe_KhachHangDAO tkdao = null;

    public ThongKeServiceIml() {
        tkdao = new ThongKeIml();
    }

    @Override
    public List<KhachHangBean> getListByKhachHang(Integer nam) {
        return tkdao.getListByKhachHangBean(nam);
    }

    @Override
    public List<SanPhamBean> getListByDoanhThu(Integer nam) {
        return tkdao.getListBySanPhamBean(nam);
    }

    @Override
    public List<ThongKeSanPhamBean> getListBySanPham(Integer nam) {
        return tkdao.getListByThogKeSanPhamBean(nam);

    }
}
