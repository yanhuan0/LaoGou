package practice3;

public class TestSeasom {

    public static void main(String[] args) {
        Season season=Season.SPRING;

        switch (season){
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINDER:
                System.out.println("冬天");
                break;
        }
    }
}
