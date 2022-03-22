package practice4;

import javax.tools.JavaCompiler;

public abstract class Hero9 {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    public abstract void attack();


    public static void main(String[] args) {

        Hero9 h=new Hero9() {
           //当场实现attack方法
            public void attack(){
                System.out.println("新的进攻手段");
            }
        };
        h.attack();
        //通过打印h，可以看到h这个对象属于Hero9$1这么一个系统自动分配的类名
        System.out.println(h);

    }

}

 abstract class  ADHero9{

     String name;
     float hp;
     float armor;
     int moveSpeed;

     public abstract void attack();

     public static void main(String[] args) {
         ADHero9 adh=new ADHero9() {

             public void attack() {
                 System.out.println("进行物理攻击");
             }
         };
         adh.attack();
         System.out.println(adh);


     }
}