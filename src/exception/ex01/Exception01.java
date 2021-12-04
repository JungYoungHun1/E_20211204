package exception.ex01;

public class Exception01 {
    public static void main(String[] args) {
        int a = 10, b=0, c;
        try{
            c = a/b;
            System.out.println(c);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("end");
        }
        System.out.println("end");

    }
}
