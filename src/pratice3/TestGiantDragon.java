package pratice3;

public class TestGiantDragon {
    public static void main(String[] args) {

        //因为GiantDragon是私有构造方法，直接new会报错
        GiantDragon g1=GiantDragon.getInstance();
        GiantDragon g2=GiantDragon.getInstance();
        GiantDragon g3=GiantDragon.getInstance();

        System.out.println(g1==g2);
        System.out.println(g1==g3);
    }
}
