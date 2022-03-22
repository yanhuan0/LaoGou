package practice4;

public abstract class Hero10 {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public abstract  void attack();

    public static void main(String[] args) {

        //与匿名类区别在于，本地类有了自定义的类名
        class SomeHero10 extends Hero10{
            public void attack(){
                System.out.println(name + "新的攻击手段");
            }
        }

        SomeHero10 h =new SomeHero10();
        h.name="地卜师";
        h.attack();
    }

}
