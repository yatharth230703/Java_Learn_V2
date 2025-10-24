package week_6;
import java.util.InputMismatchException;
import java.util.Scanner;
class no_moni extends Exception {
    // ye no moni ka constructor hai public facing 
    public no_moni(String message){
        //jisme wo message iske parent yani exception k constructor me pass hora h
        super(message);
    }
}
class bank{
    String name ;
    int balance ;
    bank(String name , int balance ){
        this.name=name;
        this.balance=balance;
    }
    public void print_balance(){
        System.out.println(balance);
    }
    public void deposit(int amount) throws Exception {
        if(amount <=0){
            throw new Exception("Amount has to be a non zero positive number");
        }
        System.out.println("Balance updated by amount : " + amount);
        
        balance+=amount;

        System.out.println("New Balance : " + balance + "of User : " + name);


    }

    public void withdraw(int amount) throws no_moni{
        if(amount>balance){
            throw new no_moni ("The balance is not sufficient");
        }
        System.out.println("Amount withdrawn :  "  + amount);
        balance -=amount;
        System.out.println("New Balance : " + balance + " of User " + name);
    }
}
public class ques_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            String name = in.nextLine();
            int balance = in.nextInt();
            bank sbi = new bank(name,balance);
            //created a costructor based object , now onto next step
            sbi.print_balance();

            sbi.deposit(100);
            //sbi.deposit(-100);

            sbi.withdraw(1002);
            sbi.withdraw(1000000000);


        }
        catch(InputMismatchException e){
            System.err.println("Sahi se kar bc :  " + e);
        }
        catch(no_moni e){
            System.err.println("Not enuff balance bitch : "  + e);

        }
        catch(Exception e){
            System.err.println("THIS ONE is for exception : " + e);
        }
        in.close();
    }
}
