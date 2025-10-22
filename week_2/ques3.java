package week_2;
import java.util.Scanner;
public class ques3 {
    public  static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
            sum+=arr[i];
        }

        System.out.println("The sum is : " + sum + " and the mean is : " + sum/n);
        
        
        in.close();
    }
}
