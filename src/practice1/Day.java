package practice1;
import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);

        System.out.println("今天是周几");
        int b=a.nextInt();

        int k=6;
        String h= b < k ? "今天是工作日" : "今天周末";
        System.out.println(h);

    }
}
