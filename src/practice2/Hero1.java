package practice2;

public class Hero1 {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    //方法名和类名一样(包括大小写)
    //没有返回类型

    //隐式构造方法
//    public  Hero1(){
//
//    }
    public Hero1(){
        System.out.println("实例化一个对象的时候，必然用构造方法");
    }

    public static void main(String[] args) {
        Hero1 h=new Hero1();

    }
}
