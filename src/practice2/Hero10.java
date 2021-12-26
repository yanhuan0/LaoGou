package practice2;

public class Hero10 {
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public Hero10(){

    }

    public Hero10(String name,float hp){
        this.name = name;
        this.hp = hp;
    }

    //复活
    public void revive(Hero10 h){
        h = new Hero10("提莫",383);
        System.out.println(h.hp);
    }

    public static void main(String[] args) {
        Hero10 teemo =  new Hero10("提莫",383);

        //受到400伤害，挂了
        teemo.hp = teemo.hp - 400;

        teemo.revive(teemo);
        System.out.println(teemo.hp);
        //问题： System.out.println(teemo.hp); 输出多少？ 怎么理解？


    }
}
