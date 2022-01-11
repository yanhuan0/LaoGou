package pratice4;

public class ADHero2 extends Hero2 implements AD {

//    @Override
//    public void physicAttack(){
//        System.out.println("进行物理攻击");
//    }
//
//    public ADHero2(String name){
//        super(name);
//        System.out.println("AD Hero 的构造方法");
//    }
//
//    public static void main(String[] args) {
//
//        new ADHero2("名字");
//    }

    int moveSpeed=400;
    public ADHero2(){
        System.out.println("AD Hero2 的构造方法");
    }
    @Override
    public void physicAttack(){
        System.out.println("进行物理攻击");
    }

    public int getMoveSpeed(){

        return this.moveSpeed;
    }

    public int getMoveSpeed2(){

        return  super.moveSpeed;
    }

    //重写useItem，并在其中调用父类的useItem方法
    public void  useItem(Item i){
        System.out.println("adhero use item");
        super.useItem(i);
    }

    public static void main(String[] args) {
        ADHero2 h=new ADHero2();

        System.out.println(h.getMoveSpeed());
        System.out.println(h.getMoveSpeed2());

        LifePotion lp=new LifePotion();
        h.useItem(lp);
    }
}
