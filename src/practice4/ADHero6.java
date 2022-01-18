package practice4;

public class ADHero6 extends Hero6 implements AD{

    public void physicAttack(){
        System.out.println("进行物理攻击");
    }
    public void attack(){
        physicAttack();
    }
}
