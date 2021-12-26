package practice2;

public class Hero6 {
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    //打印内存中的虚拟地址
    public void ShowAddressInMerroy(){
        System.out.println("打印this看到的虚拟地址"+this);
    }

    public static void main(String[] args) {
        Hero6 garen=new Hero6();
        garen.name="盖伦";
        //直接打印对象，会显示该对象在内存中的虚拟地址
        System.out.println("打印对象看到的虚拟地址"+garen);
        garen.ShowAddressInMerroy();

        Hero6 teemo=new Hero6();
        System.out.println("打印对象看到的虚拟地址"+teemo);
        teemo.ShowAddressInMerroy();
    }

}
