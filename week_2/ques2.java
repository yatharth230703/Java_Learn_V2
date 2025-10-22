package week_2;
import java.util.Scanner;
public class ques2 {
    public static void main (String[] args){
        System.out.println("Find min element");
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the size of array");
        int n = in.nextInt();
        int[] arr = new int[n];
        //created array of size n 
        for(int i=0;i<n;i++){
            System.out.printf("Enter element " + i + " : ");
            arr[i] = in.nextInt();
        }

        int min = arr[0];
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }

        System.out.println("The min element is : " + min);

        in.close();
    }

}
