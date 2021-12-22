package practice1;
import java.util.Arrays;

public class ShuZu5 {
    public static void main(String[] args) {
            int a[][]=new int[5][8];
            int b[]=new int[a.length*a[0].length];

            for (int j=0;j<a.length;j++){
                for (int i=0;i<a[0].length;i++) {
                    a[j][i]=(int)(Math.random()*100);

                    System.out.print(a[j][i]+" ");

                }
                System.arraycopy(a[j],0,b,(j*a[0].length),8);

                System.out.println();
            }

            for (int i=0;i<b.length;i++) {
                System.out.print(b[i] + " ");

            }

            System.out.println();
            Arrays.sort(b);
            System.out.println(Arrays.toString(b));

            for (int i=0;i<a.length;i++){
                System.arraycopy(b,i*a[0].length,a[i],0,8);
            }

            System.out.println();
            for (int j=0;j<a.length;j++) {
                for (int i = 0; i < a[0].length; i++) {

                    System.out.print(a[j][i]+" ") ;
                }
                System.out.println();
            }
        }
    }

