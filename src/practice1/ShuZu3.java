package practice1;
public class ShuZu3 {
    public static void main(String[] args) {
        int a[]=new int[]{24,49,23,38,36,67,89};
        int b[]=new int[]{65,70,86,77,43,10};
        int c[]=new int[13];

        for (int i=0;i<a.length;i++){
            c[i]=a[i];
        }
//        System.arraycopy(a,0,c,0,7);
        for (int i=7;i<c.length;i++){
            c[i]=b[i-7];
        }
//        System.arraycopy(b,0,c,7,6);
        for (int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
}
