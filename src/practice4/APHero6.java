package practice4;

public class APHero6 extends Hero6 implements AP {
    public void magicAttack(){
        System.out.println("进行魔法攻击");
    }

    public void attack(){
        magicAttack();
    }
}
