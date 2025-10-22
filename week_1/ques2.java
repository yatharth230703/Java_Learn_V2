package week_1;
import java.util.Scanner;
public class ques2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int yr = in.nextInt();
        if(yr%400==0 || (yr%4==0 && yr%100 !=0)){
            System.out.println("leap year");
        }
        else{
            System.out.println("not leap year");
        }
        in.close();
    }
}
