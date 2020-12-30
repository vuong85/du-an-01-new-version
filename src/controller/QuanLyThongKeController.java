/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.KhachHangBean;
import bean.SanPhamBean;
import bean.ThongKeSanPhamBean;
import Service.ThongKeService;
import Service.ThongKeServiceIml;
import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author nguye
 */
public class QuanLyThongKeController {

    private ThongKeService thongKeService = null;

    public QuanLyThongKeController() {
        thongKeService = new ThongKeServiceIml();
    }

    public void setDateToChart(JPanel jpnItem, Integer nam) {
        var listItem = thongKeService.getListByKhachHang(nam);
        if (listItem != null) {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            for (KhachHangBean item : listItem) {
                dataset.addValue(item.getLuongKhach(), "Số lượng khách", item.getThang());
            }
            JFreeChart chart = ChartFactory.createStackedAreaChart("Lượng khách trong năm", "Tháng", "lượng khách", dataset);
            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new Dimension(500, 250));
            jpnItem.removeAll();
            jpnItem.setLayout(new CardLayout());
            jpnItem.add(chartPanel);
            jpnItem.validate();
            jpnItem.repaint();
        }
    }

    public void setDateToChart1(JPanel jpnItem, Integer nam) {
        var listItem = thongKeService.getListByDoanhThu(nam);
        if (listItem != null) {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            for (SanPhamBean item : listItem) {
                dataset.addValue(item.getDOANHTHU(), "Doanh thu", item.getThang());
            }
            JFreeChart chart1 = ChartFactory.createStackedBarChart3D("Doanh thu trong năm", "Tháng", "Doanh thu", dataset);
            ChartPanel chartPanel = new ChartPanel(chart1);
            chartPanel.setPreferredSize(new Dimension(500, 250));
            jpnItem.removeAll();
            jpnItem.setLayout(new CardLayout());
            jpnItem.add(chartPanel);
            jpnItem.validate();
            jpnItem.repaint();
        }
    }
    public void setChartLuongSanPham(JPanel jpnItem, Integer nam) {
        var listItem = thongKeService.getListBySanPham(nam);
        if (listItem != null) {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            for (ThongKeSanPhamBean item : listItem) {
                dataset.addValue(item.getSOLUONG(), "Doanh số", item.getTENLOAI());
            }
            JFreeChart chart1 = ChartFactory.createStackedBarChart3D("Doanh số loại sản phẩm", "Tên loại", "Doanh số", dataset);
            ChartPanel chartPanel = new ChartPanel(chart1);
            chartPanel.setPreferredSize(new Dimension(800, 300));
            jpnItem.removeAll();
            jpnItem.setLayout(new CardLayout());
            jpnItem.add(chartPanel);
            jpnItem.validate();
            jpnItem.repaint();
        }
    }
}
