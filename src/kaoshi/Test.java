package kaoshi;
public class Test {
    public static void main(String[] args) {
        Test.Inner inner = new Test().new Inner();
        Test test = new Test();
        Inner inner1 = test.new Inner();

        System.out.println(inner.i++);
        }
        class Inner {
            public int i = 1;
        }
    }

