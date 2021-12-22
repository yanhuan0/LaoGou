package practice1;
import java.util.Scanner;

public class JieCheng {
    public static void main(String[] args) {
        int total=1;
        System.out.println("请输入一个整数");
        Scanner a = new Scanner(System.in);
        int N=a.nextInt();

        if(N>=0){
            while(N>=1){

                total=total* N--;
            }
            System.out.println(total);
        }

    }
}
