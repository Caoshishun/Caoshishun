package Exception_;

public class Exception01 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;
        //异常快捷建 ctrl  + alt + t 选中语句 6.try-catch
        try {
            int res = n1 / n2 ;
        } catch (Exception e) {
            e.printStackTrace();//输出异常
        }
        System.out.println("程序继续运行....");
    }
}
