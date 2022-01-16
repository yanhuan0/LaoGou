package practice4;

public class Hero5 extends Item1{
//    重写Item的 toString(), finalize()和equals()方法
//    toString() 返回Item的name + price
//    finalize() 输出当前对象正在被回收
//    equals(Object o) 首先判断o是否是Item类型，然后比较两个Item的price是否相同

    float price;

    public String toString(){
        return name+price;
    }


    public void finalize(){
        System.out.println("当前对象正在被收回");
    }

    public boolean equals(Object o){
        if (o instanceof Item1){
            Item1 i=(Item1) o;
            System.out.println("this.price--->"+this.price);
            System.out.println("i.price--->"+i.price);
            return this.price==i.price;
        }
        return false;
    }

    public static void main(String[] args) {
        Item1 i1=new Item1();
        i1.price=200;
        Item1 i2=new Item1();
        i2.price=100;
        Item1 i3=new Item1();
        i3.price=100;

        Hero5 i4=new Hero5();
        i4.price=100;
        Hero5 i5=new Hero5();
        i5.price=100;


        System.out.println(i1.equals(i2));
        System.out.println(i2.equals(i3));

        System.out.println(i4.equals(i5));

        String s="guoguo";
        int i=8;
        int g=9;
        System.out.println(s+i);
    }
}
