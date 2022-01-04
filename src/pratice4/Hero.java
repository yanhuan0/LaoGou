package pratice4;

public class Hero {
    public String name;
    private float hp;

    public void useKill(Mortal m){
        m.die();
    }

    public static void main(String[] args) {
//        ADHero ad =new ADHero();
//        APHero ap=new APHero();
//
//        Hero h1=ad;
//        Hero h2=ap;
//
//        System.out.println(h1 instanceof ADHero);
//        System.out.println(h2 instanceof APHero);
//        System.out.println(h1 instanceof Hero);
//
//        ADHero ad=new ADHero();
//        Hero h=ad;
//        AD adi=(AD)h;
//        APHero ap=(APHero) adi;

        Hero garen=new Hero();
        garen.name="盖伦";

        ADHero1 ad1=new ADHero1();
        APHero1 ap1=new APHero1();
        ADAPHero1 adap1=new ADAPHero1();

        garen.useKill(ad1);
        garen.useKill(ap1);
        garen.useKill(adap1);


    }
}
