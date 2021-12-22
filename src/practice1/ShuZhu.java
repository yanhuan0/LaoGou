package practice1;
import java.util.Arrays;

public class ShuZhu {
    public static void main(String[] args) {
        int a[][]=new int[5][8];
        int b[]=new int[a.length*a[0].length];

        for (int j=0;j<a.length;j++){
            for (int i=0;i<a[0].length;i++){
                a[j][i]=(int)(Math.random()*100);

                System.out.print(a[j][i]+" ");

                System.arraycopy(a[j], 0, b, (j * a[0].length), 8);
            }

            System.out.println();

            Arrays.sort(a[j]);
            System.out.println(Arrays.toString(a[j]));
            System.out.println();
        }

        for (int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }


    }
}
