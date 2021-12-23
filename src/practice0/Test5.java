package practice0;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        int a = q.nextInt();
        System.out.println("第一个整数："+a);
        int b = q.nextInt();
        System.out.println("第一个整数："+b);

        System.out.println(a>b);
    }
}
