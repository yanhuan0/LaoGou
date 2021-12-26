package practice2;

public class Hero7 {
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度
    //带一个参数的构造方法
    public Hero7(String name){
        System.out.println("一个参数的构造方法");
        this.name = name;
    }

    //带两个参数的构造方法
    public Hero7(String name,float hp){
        this(name);
        System.out.println("两个参数的构造方法");
        this.hp = hp;
    }

    public Hero7(String name,float hp,float armor){
        this(name,hp);
        System.out.println("带三个参数的构造方法");
        this.armor=armor;
    }

    public static void main(String[] args) {
        Hero7 teemo =  new Hero7("提莫",383);

        System.out.println(teemo.name);

        Hero7 gou=new Hero7("郭",280,350);

    }
}
