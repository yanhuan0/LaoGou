package practice4;

public class ADHero3 extends Hero3 implements AD {


    public ADHero3(String name){
        super(name);
        System.out.println("AD Hero3 的构造方法");
    }
    @Override
    public void physicAttack(){
        System.out.println("进行物理攻击");
    }

    public static void main(String[] args) {
        ADHero3 h=new ADHero3("名字");
    }


}
