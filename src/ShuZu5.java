public class ShuZu5 {
    public static void main(String[] args) {
        int [][] a=new int[5][6];
        int b[]=new int[a.length * a[0].length];

        for (int j=0;j<a.length;j++){
            for (int i=0;i<a[j].length;i++) {
                a[j][i]=(int) (Math.random()*100);

                System.out.print(a[j][i]+" ");
                 b[j * a[j].length+i]=a[j][i];

            }
            System.out.println();
        }
        for (int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }


        for(int i=1;i<b.length;i++){
            if(b[0]<b[i]){
                int temp=b[0];
                b[0]=b[i];
                b[i]=temp;
            }
        }
        System.out.println();
        System.out.println(b[0]);
    }

}
