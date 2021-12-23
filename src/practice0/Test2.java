package practice0;

public class Test2 {
    public static void main(String[] args) {
        int i=5;
        System.out.println(i++);  //先运算
        System.out.println(i);   //后赋值

        int j=5;
        System.out.println(++j);   //先赋值
        System.out.println(j);     //后运算

        int i1=1;
        int j1 =++i1 + i1++ + ++i1 + ++i1 + i1++ + ++i1;
        System.out.println(j1);
    }
}
