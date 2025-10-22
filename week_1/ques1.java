package week_1;
import java.util.Scanner ;
public class ques1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n%2==0){
            System.out.println("even");
    
        }
        else{
            System.out.println("odd");
        }
        in.close();

    }

}
