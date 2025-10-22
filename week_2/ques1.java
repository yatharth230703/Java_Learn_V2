package week_2;
import java.util.Scanner;
public class ques1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("1st ques");
        int side = in.nextInt();
        System.out.println("Area : " + Math.pow(side,2) + " and perimeter : " + side*4);

        System.out.println("2nd ques");
        int p = in.nextInt();
        int r = in.nextInt();
        int t = in.nextInt();
        System.out.println("Simple Interest = " + (p*r*t)/100);

        System.out.println("3rd ques");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        double avg = (a+b+c)/3 ;
        System.out.println("The average value is " + avg);
        in.close();
    }
}
