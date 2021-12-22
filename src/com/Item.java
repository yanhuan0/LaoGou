package com;



public class Item {
   private String name ="yyyy" ;
    private int price;

    //>> TODO 构造函数
    public  Item(){

    }
    public Item(String name, int price1){
         this.name = name;
         this.price = price1;
    }

    public void print(){

        System.out.println("我打印了" + this.name + "的价格"+ this.price );
    }


    protected void p(){
        System.out.println("测试私有方法");
    }
    public static void main(String[] args) {
        Item cx = new Item("草鞋",300);
//        System.out.println();
        cx.print();
        cx.p();
        Item cx1 = new Item("草鞋o",700);
//        System.out.println();
        cx1.print();
    }

}

class Test {
    public static void main(String[] args) {
        Item xp = new Item("血瓶",50);
        xp.print();

        xp.p();
//        System.out.println(xp.print());
        String s = "Hello";
        System.out.println(s);
        String j = "Java";
        System.out.println(s+j);

        StringBuffer sf = new StringBuffer("Hello");
        System.out.println(sf);
        sf.append("java");
        System.out.println(sf);

    }
}
