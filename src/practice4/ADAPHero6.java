package practice4;

public class ADAPHero6 extends Hero6 implements AD,AP{
    public void attack(){
        System.out.println("既可进行物理攻击，也可进行魔法攻击");
    }

    public void physicAttack(){
        System.out.println("进行物理攻击");
    }

    public void magicAttack(){
        System.out.println("进行魔法攻击");
    }
}
