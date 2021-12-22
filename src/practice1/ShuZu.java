package practice1;
public class ShuZu {
    public static void main(String[] args) {
//        int[] a;
//        a=new int[5];
//
//        System.out.println(a.length);
//        a[4]=100;
//        a[5]=101;
//
//        System.out.println(a[5]);



        System.out.println("数组中的随机数是：");
        int[] a = new int[5];
        a[0] = (int) (Math.random() * 100);
        a[1] = (int) (Math.random() * 100);
        a[2] = (int) (Math.random() * 100);
        a[3] = (int) (Math.random() * 100);
        a[4] = (int) (Math.random() * 100);

//        int[] a={90,62,42,69,74};

        int temp;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");

            if(a[0]>a[i]){
                temp=a[0];
                a[0]=a[i];
                a[i]=temp;
            }
        }
        System.out.println();
        System.out.println("最小值"+a[0]);


        //讲个故事
        String s = "从前有座山，山里有个庙,从前有座山，山里有个庙,从前有座山，山里有个庙,从前有座山，山里有个庙...";
        YanHuan yh = new YanHuan(s);
        Thread t = new Thread(yh);
        t.start();
    }

}

