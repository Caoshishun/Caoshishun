package kaoshi;

public class Arrays_ {
    public static void main(String[] args) {
        int[] a = {3,6,2,5,9,1,4};

        Arrays arrays = new Arrays(a);
        System.out.println(arrays.toString());

    }
}

class Arrays {
    private int[] a;

    public Arrays(int[] a) {
        this.a = a;
        array_(this.a);
    }

    public void array_(int[] a){
        int temp = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if(a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return java.util.Arrays.toString(a);
    }
}

