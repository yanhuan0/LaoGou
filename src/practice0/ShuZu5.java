package practice0;

import java.util.Arrays;

public class ShuZu5 {
    public static void main(String[] args) {

        //搜索
//        int a[]=new int[]{18, 62, 68, 82, 65, 9};
//
//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));
//
//        System.out.println("数字62出现的位置：" + Arrays.binarySearch(a,62));

        //判断是否相同

//        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
//        int b[] = new int[] { 18, 62, 68, 82, 65, 8 };
//
//        System.out.println(Arrays.equals(a,b));

        //填充
        int a[]=new int[10];
        Arrays.fill(a,5);
        System.out.println(Arrays.toString(a));
    }
}
