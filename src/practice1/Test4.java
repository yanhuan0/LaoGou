package practice1;
public class Test4 {
    public static void main(String[] args) {
//        boolean b=false;
//        if(b)
//            System.out.println("yes1");
//        else
//            System.out.println("no");

//        for (int j=0;j<10;j++) {
//            if (0 == j % 2)
//                continue;
//            System.out.println(j);
//        }
//        for (int i=0;i<= 10;i++) {
//            if (0 == i % 3 || 0==i % 5) {
//                continue;
//            }
//            System.out.println(i);
//        }

        int i = 1;
//        boolean b=!(i++==3)^(i++==2)&&(i++==3);
        boolean b = (i++ == 3) && (!(i++ == 3) ^ (i++ == 2));
        //         false/2  &&         true/3    false/4
        //              false      ||         true/4
        System.out.println(b);
        System.out.println(i);


    }
}

