package interface_;

public interface Interface01 {
    //即便不输入abstrcat也是默认抽象
    public void hi();

    int eat();

    public static void yeah(){

    }
    void ye();

}

class cat implements Interface01 {

    @Override
    public void hi() {

    }

    @Override
    public int eat() {
        return 0;
    }

    @Override
    public void ye() {

    }
}
