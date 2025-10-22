package week_1;
import java.util.Scanner;
public class ques7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        //finding mins and s ecs 
        System.out.println("1st ques");
        System.out.println("The time is : " + n/60 + "minutes and " + n%60 + "seconds");
        
        //divisible by 7
        System.out.println("2nd ques");
        if(n%7==0){
            System.out.println("divisible by 7");
        }
        else{
            System.out.println("Not ");
        }

        System.out.println("3rd ques");
        
        for(int i=1;i<=n;i++){
            System.out.println("The remainder for " + n + " divided by " + i + " is : " + n%i );
        }
        in.close();



    }
}
