package chapter1.section1;

public class Exercise10 {
    public  static void main(String[] args) {
        initializeArrayInWrongWay();
    }

    private static void initializeArrayInWrongWay() {
        int a[] = new int[10];
        for(int i = 0;i < 10;i++) {
            a[i] = i * i;
        }
    }
}
