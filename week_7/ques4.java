package week_7;
import java.util.Scanner;
public class ques4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y= in.nextInt();
        int primecount = countprimes(x, y);
        System.out.println("Total primes between x and y : " + primecount);
        showprimes(x , y);
        in.close();
    }
    public static boolean isprime(int x){
        for(int i=2;i<Math.sqrt(x) ; i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    public static int countprimes(int x  , int y){
        int sum = 0;
        for(int i=x;i<=y;i++){
            if(isprime(i)){
                sum++;
            }
        }
        return sum;
    }
    public static void showprimes (int x, int y){
        for(int i=x;i<=y;i++){
            if(isprime(i)){
                System.out.println("Prime found : " + i);
            }
        }
    }
}
