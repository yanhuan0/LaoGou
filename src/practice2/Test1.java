package practice2;

public class Test1 {

    static String name;
    String nickName;

    public static void main(String[] args) {
        Test1 t=new Test1();
//        t.name ="郭";
        Test1.name ="fff";
        System.out.println(t.name);

        Test1 y=new Test1();
        System.out.println(y.name);


    }
//    public void a(String name1){
//        this.name = name1;
//    }
//    public void print(){
//        System.out.println(this.name);
//    }
//    public static void main(String[] args) {
//        Test1 t=new Test1();
//        t.a("盖伦");
//        t.print();
//
//        Test1 y=new Test1();
//        y.print();
//
//
//    }

}
