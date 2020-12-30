package Utils;

import Entity.NhanVien;



public class Auth {
        
    /*
     * Đối tượng này chứa thông tin người sử dụng sau khi đăng nhập
     */
    public static NhanVien user = null;
    //để truy trì user đăng nhập vào hệ thống, bởi vì biến user là static nên dùng chung cho
    // toàn ứng dụng của mình.
    /*
      Xóa thông tin của người sử dụng khi có yêu cầu đăng xuất.
     */
    public static void clear() {
        Auth.user = null;
    }
    /*
      Kiểm tra xem đăng nhập hay chưa ?
      nếu biến user != null return false và ngược lại
     */
    public static boolean isLogin() {
        return Auth.user != null;
    }
     /*
       Kiểm tra xem có phải là trưởng phòng hay không ? 
       trong điều kiện thì trưởng phòng được phép xoá và thêm doanh thu , 
       không phải trưởng phòng thì không được phép thực hiện.
     */
    public static boolean isManager() {
        return Auth.isLogin() && user.getVAITRO();
    }
}
