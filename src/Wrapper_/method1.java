package Wrapper_;

public class method1 {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);   //false
        //Integer.valueOf 有范围-128 - 127 ，否则new一个新对象。
        Integer m = 1;
        Integer n = 1;

        System.out.println(m == n);  // true

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);  // false


    }
}
