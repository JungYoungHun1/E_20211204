package exception.ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MulityTry {
    public static void main(String[] args) {
        int num = 50;

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("숫자를 입력하세요");
            int val = sc.nextInt();
            System.out.println(num/val);
        }catch (NullPointerException e){
            System.out.println("NullPointerException");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
            e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("InputMismatchException");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Exception");
            e.printStackTrace();
        }finally {
            System.out.println("항상 실행");
        }
        System.out.println("end");
    }
}
