package practice0;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("请输入邱阳波的体重：");
        Scanner w = new Scanner(System.in);
        float a = w.nextFloat();
        System.out.println("邱阳波的体重是" + a + "kg" );
        System.out.println("请输入邱阳波的身高：");
        float b = w.nextFloat();
        System.out.println("邱阳波的身高是" + b +"m");

        float BMI = a/(b*b);
        System.out.println("当前的BMI是" + BMI);

        if(BMI<18.5){
            System.out.println("体重过轻");
        }
        else if(18.5<= BMI && BMI<24){
            System.out.println("正常范围");
        }
        else if(BMI>=24){
            System.out.println("体重过重");
        }



        }

    }

