package practice2;

public class ADHero1 extends Hero{
        public void attack(){

            System.out.println(name+"对"+" "+"进行了一次攻击");
        }

        public void attack(Hero h1,Hero h2){
            System.out.println(name+"攻击了"+h1.name+"和"+h2.name);
        }

        public void attack(Hero...Heros){
            for (int i=0;i<Heros.length;i++){
                System.out.println(name+"攻击了"+Heros[i].name);
            }
        }


        public static void main(String[] args) {

           ADHero1 hero=new ADHero1();
            hero.name="赏金猎人";

            Hero h1=new Hero();
            h1.name="盖伦";

            Hero h2=new Hero();
            h2.name="提莫";

            hero.attack(h1);
            hero.attack(h1,h2);
        }
}
