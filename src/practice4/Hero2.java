package practice4;

//准备显式提供无参构造方法的父类
//在实例化Hero对象的时候，其构造方法会打印“Hero的构造方法 "
public class Hero2 {
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度


    public void useItem(Item i){
        System.out.println("hero use item");
        i.effect();
    }


    public Hero2(){
        System.out.println("Hero 的构造方法");
    }

    public Hero2(String name1){
        System.out.println("Hero 有一个参数的构造方法");
        this.name=name1;
    }

    public static void main(String[] args) {
        new Hero2();
    }
}
