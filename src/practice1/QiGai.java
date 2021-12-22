package practice1;
public class QiGai {
    public static void main(String[] args) {
         double money = 0 , total = 0;
         for(int d = 0 ; d< 10 ;d++){
             money = Math.pow(2, d);
//             System.out.println("第"+ (d+1)+"天赚了："+money);
//             money = money + money;
             total += money;

         }
        System.out.println("总共赚了"+total);
//        float money=0.5f;
//        float total=0;
//        for(int day=1;day<=10;day++){
//            money=money*2;
//            total =total+money;
//        }
//
//        System.out.println(money);
//
//        System.out.println("洪乞丐干10天,收入是" + total +"块钱");
    }
}
