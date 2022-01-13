package pratice4;

public class Hero4 extends Object{

//    float hp; //血量
//
//    float armor; //护甲
//
//    int moveSpeed; //移动速度
//
//    public void useItem(Item i){
//        System.out.println("hero4 use item");
//        i.effect();
//    }
//
//    public Hero4(){
//        System.out.println("无参数的构造方法");
//    }
//
//    public Hero4(String name){
//        System.out.println("一个参数的构造方法");
//    }
//
//    public static void main(String[] args) {
//        Hero4 h=new Hero4();
//    }

    //equals
    public String name;
    private float hp;

    public boolean equals(Object o){
        if(o instanceof Hero4){
            Hero4 h=(Hero4) o;
            return this.hp==h.hp;
        }
        return false;
    }

    public static void main(String[] args) {
        Hero4 h1=new Hero4();
        h1.hp=300;
        Hero4 h2=new Hero4();
        h2.hp=400;
        Hero4 h3=new Hero4();
        h3.hp=300;

        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h3));
    }
}
