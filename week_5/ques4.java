package week_5;

import java.util.InputMismatchException;
import java.util.Scanner;
interface Operation{
    int compute(int a ,int b);
}

class div_calc implements Operation{
    public int compute(int a, int b){
        try{
            int ans = a/b;
            return ans;
        }
        catch (ArithmeticException e){
            System.out.println("Division by 0 not possible , following is error : " + e );
        }
        catch (InputMismatchException e){
            System.out.println("please enter numbers only , following is error : " + e );

        }
        return -1 ;

    }
}
public class ques4 {
    public static void main(String[] args){
        div_calc d = new div_calc();
        Scanner in = new Scanner(System.in);
        int a =in.nextInt();
        int b = in.nextInt();
        int ans = d.compute(a, b);
        System.out.println("the final ans is : "  + ans);
        in.close();
    }
}
