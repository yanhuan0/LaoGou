package practice2;
//辅助英雄
public class Support extends Hero{
    public void heal(){
        System.out.println(name+"为"+""+"加血");
    }
    public void heal(Hero h){
        System.out.println(name+"为"+h.name+"加血");
    }
    public void heal(Hero h,int hp){
        System.out.println(name+"为"+h.name+"加加了"+hp+"血量");
    }

    public static void main(String[] args) {
        Support support = new Support();
        support.name="辅助英雄";

        Hero h=new Hero();
        h.name="盖伦";
//        h.hp=50;

        support.heal(h);
        support.heal(h,50);

    }
}
