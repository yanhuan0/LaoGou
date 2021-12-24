package practice2;

public class Hero3 {
    String name; //姓名
    float hp; //血量
    float armor; //护甲
    int moveSpeed; //移动速度

    public Hero3(String name1){
        this.name=name1;
    }

    public static void main(String[] args) {
        Hero3 garen=new Hero3("盖伦");

//        Hero3 teemo=new Hero3(); //默认无参的构造方法就失效了，如果需要重新加一个构造方法
    }
}
