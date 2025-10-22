package week_2;

import org.w3c.dom.css.Rect;

class Studentzz{
    String name; 
    int roll_no;
    Studentzz (String name , int roll_no ){
        this.name = name;
        this.roll_no = roll_no;
    }
}

class Bank{
    String acc_holder_name ; 
    int bank_balance ;
    Bank(int bank_balance){
        this.bank_balance = bank_balance;
    }
}

class Rectanglez{
    int width ;
    int height;
    Rectanglez(int width , int height){
        this.height = height;
        this.width = width;
    }
}
public class ques8 {
    public static void main(String[] args){
        Studentzz mark = new Studentzz ("timmy",32);
        System.out.println("The name of student is : "  + mark.name + " The roll no is : " + mark.roll_no);

        Bank andhra = new Bank(23000);
        andhra.acc_holder_name = "mukesh";

        System.out.println("the name of account holder is  : " + andhra.acc_holder_name + " The balance available is : " + andhra.bank_balance );

        Rectanglez rect = new Rectanglez(12,3);
        System.out.println("Area : " + (rect.height * rect.width) + " Perimeter : " + (2*(rect.height+ rect.width)));


    }
}
