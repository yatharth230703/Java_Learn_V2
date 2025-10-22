package week_2;
import java.util.Scanner;
class Book {
    String title ;
    String author ;
}
public class ques7 {
    public  static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int books = in.nextInt();
        in.nextLine();
        Book[] library = new Book[books];
        
        for(int i=0;i<books ; i++){
            Book temp = new Book();
            temp.title = in.nextLine();
            temp.author = in.nextLine();
            library[i] = temp;
        }
        System.out.println("Summary of collected books");
        for(int i=0;i<books;i++){
            System.out.println("Book number : " + (i+1) + " Book title " + library[i].title + " Book author : " + library[i].author);
        }
        in.close();

    }

}
