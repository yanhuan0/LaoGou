package practice2;

public class Hero4 {
    String name; //姓名
    float hp; //血量
    float armor; //护甲
    int moveSpeed; //移动速度

    //带一个参数的构造方法
    public Hero4(String name1){
        this.name=name1;
    }
    //带两个参数的构造方法
    public Hero4(String name1,float hp1){
        this.name=name1;
        this.hp=hp1;
    }

    public static void main(String[] args) {
        Hero4 garen=new Hero4("盖伦");
        Hero4 teemo=new Hero4("提莫",320);

        System.out.println(garen.name);
        System.out.println(teemo.name+"\n"+teemo.hp);
    }
}
