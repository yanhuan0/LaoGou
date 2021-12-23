package practice0;

public class PaiXu {
    public static void main(String[] args) {
//        int[] a ={18,62,68,82,65,9};
//        int temp=a[0];
//
//        for(int i=1;i<a.length;i++){
//            if(a[0]>a[i]){
//                temp=a[0];
//                a[0]=a[i];
//                a[i]=temp;
//
//                System.out.println(a[0]);
//            }
//        }

        int[] a = {18, 62, 68, 82, 65, 9};
        //打印内容
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");

        for (int i = 1; i < a.length; i++) {
            if (a[0] > a[i]) {
                int temp = a[0];
                a[0] = a[i];
                a[i]=temp;
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();


        for(int j=0;j<a.length;j++){
            for (int i = 0; i < a.length-j-1; i++) {
                if (a[i] > a[i+1]) {
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
        for(int i=0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
