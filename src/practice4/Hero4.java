package practice4;

public class Hero4 {

    //toString()的意思是返回当前对象的字符串表达
//    public String name;
//    protected float hp;
//
//    public String toString(){
//        return name;
//    }
//
//    public static void main(String[] args) {
//        Hero4 h=new Hero4();
//        h.name="盖伦";
//        System.out.println(h.toString());
//        //直接打印对象就是打印该对象的toString()返回值
//        System.out.println(h);
//    }

//


   // equals() 用于判断两个对象的内容是否相同
    public String name;
    private float hp;

    public boolean equals(Object o){
        if (o instanceof Hero4){
            Hero4 h=(Hero4) o;
            return this.hp==h.hp;
        }
        return false;
    }

    public static void main(String[] args) {
        Hero4 h1= new Hero4();
        h1.hp = 300;
        Hero4 h2= new Hero4();
        h2.hp = 400;
        Hero4 h3= new Hero4();
        h3.hp = 300;

        System.out.println(h1==h2);
        System.out.println(h1==h3);
    }

}
