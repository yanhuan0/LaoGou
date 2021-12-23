package practice0;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        int count=0;

        String user = "root";
        String pwd = "123456";

        while (true) {
            System.out.println("用户名：");
            Scanner a = new Scanner(System.in);
            String u = a.next();
            System.out.println("密码：");
            String p = a.next();

            count++;
            if(count==3 && (user.equals(u)==false || pwd.equals(p)==false || user.equals(u)&&pwd.equals(p)) ){

               break;

            }else{
                System.out.println("用户名密码错误");
            }



//            if (user.equals(u) && pwd.equals(p)) {
//                System.out.println("登录成功");
//                break;
//            } else {
//                System.out.println("用户名或密码错误");
//            }

        }
    }
}
