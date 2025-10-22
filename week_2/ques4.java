package week_2;
import java.util.Scanner;
public class ques4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int even =0;
        int odd = 0;
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Number of even : " + even + " Number of odd : " + odd );
        in.close();
    }
}
