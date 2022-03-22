package practice4;

public abstract class ItemTest1 {
    String name;
    float hp;
    float armar;
    int moveSpeed;
    //Item有抽象方法disposable(), 就像抽象类练习 中要求的那样。
    public abstract boolean disposable();

    public static void main(String[] args) {
        ItemTest1 i=new ItemTest1(){
            public boolean disposable(){
                return true;
            }
        };
        i.disposable();
        System.out.println(i);
    }
}
