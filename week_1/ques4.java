package week_1;
import java.util.Scanner;
public class ques4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        double pi = Math.PI;
        double area = pi*r*r;
        double volume = (4/3)*pi*r*r*r;
        System.out.printf("The area  of circle is : %f \n " , area);
        System.out.printf("The volume of circle is : %f \n" , volume);
        in.close();


    }
}
