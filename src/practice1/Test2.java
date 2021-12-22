package practice1;
public class Test2 {
    public static void main(String[] args) {
        int i=2;
        System.out.println(i==1 & i++ == 2);


        System.out.println(i);

        int j=2;
        System.out.println(j==1 && j++==2);
        System.out.println(j);

        int i1=3;
        int j1=2;
        int c=(i1|j1)^(i1&j1);
        System.out.println(c);

    }
}
