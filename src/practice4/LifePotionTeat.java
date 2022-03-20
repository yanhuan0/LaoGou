package practice4;

public class LifePotionTeat extends ItemTest{
    public boolean disposable(){
        return true;
    }

    public static void main(String[] args) {

        LifePotionTeat t=new LifePotionTeat();

        System.out.println(t.disposable());

    }
}
