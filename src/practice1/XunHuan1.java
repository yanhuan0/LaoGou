package practice1;
public class XunHuan1 {
    public static void main(String[] args) {
        int a[]=new int[]{18,62,68,82,65,0};

        for(int i=0;i<a.length;i++){
            int b=a[i];
            System.out.println(b);
        }

        int max = 0;
        for (int b : a) {
//            System.out.println(b);


            if (b > max) {
                max = b;
            }
        }
       System.out.println(max);
    }
}
