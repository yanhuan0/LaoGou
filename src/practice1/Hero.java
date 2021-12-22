package practice1;
public class Hero {
    String name;   //姓名
    float hp;   //血量
    float hj;   //护甲
    int sd;  //移动速度


    public static void main(String[] args) {
        Hero gailun = new Hero();
        gailun.name = "盖伦";
        gailun.hp = 616.28f;
        gailun.hj = 27.536f;
        gailun.sd = 350;

        Hero timo = new Hero();
        timo.name = "提莫";
        timo.hp = 383f;
        timo.hj = 14f;
        timo.sd = 330;

    }

}
