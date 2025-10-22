package week_1;
import java.util.Scanner;
public class ques6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();

        // multiplication table of n 
        System.out.println("1st ques");
        for(int i=1;i<=10;i++){
            System.out.println(n + "x" + i + "=" + n*i);
        }

        System.out.println("2nd ques");
        // first n natural number ;
        for(int i=1 ; i<=n ; i++){
            System.out.println(i);
        }

        System.out.println("3rd ques");
        for(int i=n-1;i>=1;i--){
            n*=i;

        }
        System.out.println("Factorial of given number = " + n);
        in.close();
    }
}
