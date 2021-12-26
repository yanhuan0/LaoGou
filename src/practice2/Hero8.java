package practice2;

public class Hero8 {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    public Hero8(String name,float hp){
        this.name=name;
        System.out.println("被调用");
    }
    public Hero8(String name,float hp,float armor,int moveSpeed){
        this(name,hp);
        System.out.println("太狠了");
    }

    public static void main(String[] args) {
        Hero8 teemo = new Hero8("提莫",20,30,40);
    }
}
