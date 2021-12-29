package practice2;

public class Test3 {

    public String name="some test3";
    static String name1="some test3";

    public Test3(){
        System.out.println("test3"+name);

        name="1";

    }
    {
        System.out.println("初始化块"+name);

        name="2";
    }

    public static void main(String[] args) {
        Test3 t=new Test3();
    }
}
