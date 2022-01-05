package pratice4;

public class ADHero extends Hero implements AD {
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
    //子类隐藏父类方法
    public static void battleWin(){
        System.out.println("AD hero battle win");
    }

    public static void main(String[] args) {
        Hero.battleWin();
        ADHero.battleWin();
    }
}
