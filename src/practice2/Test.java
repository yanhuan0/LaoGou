package practice2;

public class Test {

    String name;
    //对象方法
    public String getName(){
        return name;
    }

    //类方法
    public static void printGameDuration(){
        System.out.println("已经玩了10分51秒");

        Test test=new Test();
        test.name="张三";
        test.getName();
    }

    public static void main(String[] args) {
//
//        Test t=new Test();
//        t.name="张三";
//        t.getName();
//
        Test.printGameDuration();
    }
}
