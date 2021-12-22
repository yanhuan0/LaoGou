package practice1;
public class XunHuan {

    public static void main(String[] args) {
        boolean out=false; //是否终止外部循环标记
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.println(i+":"+j);
                if(0==j%2)
                    out =true; //终止外部循环的标记
                    break;
            }
//            if(out){
//                break;
//            }
        }

//        out:
//        for(int i=0;i<10;i++){
//            for(int j=0;j<10;j++){
//                System.out.println(i+":"+j);
//                if(0==j%2)
//                    break out;
//            }
//        }
    }
}
