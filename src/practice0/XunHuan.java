package practice0;

public class XunHuan {
    //增强型for循环
    public static void main(String[] args) {
        int a[] = new int[]{18,62,68,82,65,9};
        //常规遍历
        for(int i=0;i<a.length;i++){
            int b=a[i];
            System.out.println(b);
        }

//        System.out.println();
        //增强型for循环遍历
        for(int b:a){
            System.out.println(b);
        }
        int max=0;
        for(int b:a){
            if(b<max){
                max=b;
            }
        }
        System.out.println(max);

    }
}
