package practice2;

public class ADHero extends Hero {
    public void attack(){
        System.out.println(name+"对"+" "+"进行了一次攻击");
    }
    public void attack(Hero h1){
        System.out.println(name+"对"+h1.name+"进行了一次攻击");
    }
    public void attack(Hero h1, Hero h2){
        System.out.println(name+"对"+h1.name+"和"+h2.name+"进行了攻击" );
    }

    public static void main(String[] args) {
        ADHero hero=new ADHero();
        hero.name="赏金猎人";

        Hero h1=new Hero();
        h1.name="盖伦";

        Hero h2=new Hero();
        h2.name="提莫";

        hero.attack(h1);
        hero.attack(h1,h2);
    }
}
