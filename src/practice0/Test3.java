package practice0;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("第一个整数"+a);
        int b= s.nextInt();
        System.out.println("第二个整数"+b);

        System.out.println("两个整数的和是" + (a+b));
    }


}
