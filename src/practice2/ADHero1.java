package practice2;

public class ADHero1 extends Hero{
        public void attack(){

            System.out.println(name+"对"+" "+"进行了一次攻击");
        }

        public void attack(Hero...Heros){
            String hrs = "";
            for (int i=0;i<Heros.length;i++){
//                System.out.println(name+"攻击了"+Heros[i].name);

//                if(i == Heros.length -1){
//                    hrs += Heros[i].name ;
//                }else{
//                    hrs += Heros[i].name + ".";
//                }
            }
            System.out.println(name+"攻击了"+hrs);
//            System.out.println(name+"攻击了"+hrs+ "。");
        }

        public static void main(String[] args) {

           ADHero1 hero=new ADHero1();
            hero.name="赏金猎人";

            Hero h1=new Hero();
            h1.name="盖伦";

            Hero h2=new Hero();
            h2.name="提莫";

            hero.attack( h1);
            hero.attack(h1,h2);

            Hero h3=new Hero();
            h3.name="提莫1";
            hero.attack(h1,h2,h3);

            Hero h4=new Hero();
            h4.name="提莫2";
            hero.attack(h1,h2,h3,h4);



        }
}
