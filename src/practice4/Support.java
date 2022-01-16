package practice4;

import practice2.Hero;

public class Support extends Hero implements Healer {
    @Override
    public void heal(){
        System.out.println("进行辅助治疗");
    }
}
