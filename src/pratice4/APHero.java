package pratice4;

import practice2.Hero;

public class APHero extends Hero implements AP {
    @Override
    public void magicAttack(){
        System.out.println("进行魔法攻击");
    }

}
