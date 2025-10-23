package week_6;
import java.util.Scanner; 
public class ques_1 {
    public static int neganum(int a) throws Exception{
        if (a<0){
            throw new Exception ("cant have negative number");
            
        }
        return a;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        try{
            int b = neganum(a);
            System.out.println("Das is b : " + b);
        }
        catch (Exception e){
            System.out.println("Error " + e);
        }
        in.close();
    }
}
