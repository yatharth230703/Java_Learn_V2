package week_1;
import java.util.Scanner;
public class ques5 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int rate = in.nextInt();
        int principle = in.nextInt();
        int time = in.nextInt();
        double ans = principle*(Math.pow(1+rate/100,time));
        System.out.println("the compound interest is :"+ans );
        in.close();

    }
}
