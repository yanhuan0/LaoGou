package practice0;

public class Er {
    public static void main(String[] args) {
        int i =5;
        String b=(Integer.toBinaryString(i));
        System.out.println(i + "的二进制是" + b);

        int i1=5;
        int j1=6;
        System.out.println(Integer.toBinaryString(i1));
        System.out.println(Integer.toBinaryString(j1));
        System.out.println(i1|j1);
        System.out.println(i1&j1);
        System.out.println(i1^j1);
    }
}
