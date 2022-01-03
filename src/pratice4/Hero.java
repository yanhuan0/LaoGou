package pratice4;

public class Hero {
    public String name;
    private float hp;

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

        ADHero ad=new ADHero();
        Hero h=ad;
        AD adi=(AD)h;
        APHero ap=(APHero) adi;
    }
}
