package practice0;

public class Test7 {
    public static void main(String[] args) {

        int[] a=new int[4];

        a[0]=(int) (Math.random()*100);
        a[1]=(int) (Math.random()*100);
        a[2]=(int) (Math.random()*100);
        a[3]=(int) (Math.random()*100);

        System.out.println("随机数组：" );
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
        for (int j=0;j<a.length;j++){
            for(int i=0;i<a.length-j-1;i++){
                if(a[i]<a[i+1]){
                    int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
//            System.out.println();
//            for(int i=0;i<a.length;i++){
//                System.out.print(a[i]+ " ");
//            }

            }
        System.out.println("");
        System.out.println("排序后：");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
    }
}
