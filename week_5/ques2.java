package week_5;
interface mathic {
    int gcd(int a , int b);
    int fact(int a);
    int power(int a , int b);
}
class RecMath implements mathic {
    public int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,b%a);
    }

    public int fact(int a){
        if(a<=1) return 1;
        return a*fact(a-1);
    }
    public int power (int a , int b){
        if(b==0){
            return 1;
        }
        return a*power(a,b-1);
    }
}
public class ques2 {
    public static void main(String[] args){
        RecMath m = new RecMath();

        System.out.println("Factorial of 5 : " + m.fact(5) + " GCD of 421  and 253 " + m.gcd(421, 253) + " 4 to the power 5 : " + m.power(4,5)  );

    }
}
