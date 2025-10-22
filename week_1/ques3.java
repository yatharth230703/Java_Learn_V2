package week_1;
import java.util.Scanner;
public class ques3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        if(n==0){
            System.out.println("zero");
        }
        else{
            if(n>0){
                System.out.println("positive");
            }
            else{
                System.out.println("negative");
            }
        }
        in.close();
    }
}
