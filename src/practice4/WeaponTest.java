package practice4;

public class WeaponTest {
    public boolean disposable(){
        return false;
    }

    public static void main(String[] args) {
        WeaponTest w = new WeaponTest();
        System.out.println(w.disposable());
    }
}
