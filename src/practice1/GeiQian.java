package practice1;
public class GeiQian {
    public static void main(String[] args) {

        double total=0;
        for(int day=1;day<=30;day++){
            double money = 0.01*Math.pow(2,day-1);
//            money=money * 2;
            total +=money;

            System.out.println(money);
        }
        System.out.println(total);

    }
}
