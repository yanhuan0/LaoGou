package practice2;

public class Hero2 {
    String name; //姓名
    float hp; //血量
    float armor; //护甲
    int moveSpeed;  //移动速度


    public static void main(String[] args) {
        Hero2 garen=new Hero2();
        garen.name="盖伦";
        garen.hp=616.28f;
        garen.armor=27.536f;
        garen.moveSpeed=350;

        Hero2 teemo=new Hero2();
        teemo.name="提莫";
        teemo.hp=383f;
        teemo.armor=14f;
        teemo.moveSpeed=330;

    }
}
