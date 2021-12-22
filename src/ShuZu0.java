import java.util.Arrays;

public class ShuZu0 {
    public static void main(String[] args) {
            int a[][] = new int[][] {
                    { 18, 62, 68, 82, 65, 9 },
                    { 18, 62, 68, 82, 65, 9 }
            };
            System.out.println("排序之前 :");
            System.out.println(Arrays.toString(a[0]));
            Arrays.sort(a[0]);
            System.out.println("排序之后:");
            System.out.println(Arrays.toString(a[0]));

        }
    }


