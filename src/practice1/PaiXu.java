package practice1;
public class PaiXu {
    public static void main(String[] args) {
        int[] a = {18, 62, 68, 82, 65, 9};

        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length-j - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    }
                }
            }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
