package week_5;
interface adv_calc{
    int sum(int a , int b);
    int diff(int a ,int b);
    int mult(int a,int b);
    int div (int a ,int b);
    int square (int a);
    int cube(int a);
    double pow(int a ,int b);
}
class advance_calculator implements adv_calc{
    int a;
    int b;
    advance_calculator(int a ,int b){
        this.a = a;
        this.b = b;
    }
    public int sum(int a ,int b){
        return a+b;
    }
    public int diff(int a ,int b){
        return a-b;
    }
    public int mult(int a , int b){
        return a*b;
    }
    public int div(int a ,int b){
        return a/b;
    }
    public int square(int a){
        return a*a;
    }
    public int cube(int a){
        return a*a*a;
    }
    public double pow(int a, int b){
        return Math.pow(a,b);
    }
}
public class ques1 {
    public static void main(String[] args){
        advance_calculator adv = new advance_calculator(123,5);
        System.out.println(adv.pow(2,13));
    }
}
