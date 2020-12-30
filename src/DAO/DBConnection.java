/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author nguye
 */
/*
tạo lớp kết nối cơ sở dữ liệu, viết phương thức truy vấn dữ liệu
Lớp DBConnection giúp kết nối cơ sở dữ liệu
 */
public class DBConnection {

    public static Connection getConnection() {
        Connection cons = null;
        try {
           
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cons = DriverManager.getConnection(
                    "jdbc:sqlserver://127.0.0.1:1433;databaseName=duan1_final", "sa", "123");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cons;
    }

    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
