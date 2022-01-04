package pratice4;

public class Hero1 {
    public String name;
    protected float hp;

    public void useItem(Item i){
        i.effect();
    }

    public static void main(String[] args) {
        Hero1 garen=new Hero1();
        garen.name="盖伦";

        LifePotion lp=new LifePotion();
        MagicPotion mp=new MagicPotion();

        garen.useItem(lp);
        garen.useItem(mp);
    }
}
