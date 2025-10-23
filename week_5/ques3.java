package week_5;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ques3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        try{
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println("Division : " + a/b);
        }
        catch (ArithmeticException e){
            System.err.println("Can't divide by zero ,error : " + e);
        }
        catch (InputMismatchException e){
            System.err.println("Can't accept anything but int , error : "  + e );
        }
        finally{
            System.out.println("finished execution setup");
        }
        in.close();
    }
}
