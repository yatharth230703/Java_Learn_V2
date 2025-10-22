package week_2;
import java.util.Scanner; 
class Car{
    String brand ;
    int price ;
}
public class ques5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter number of cars");
        int number_of_cars = in.nextInt();
        in.nextLine();
        Car[] dealership = new Car[number_of_cars];
        //dealership details 
        System.out.println("Dealership Details");
        for(int i=0;i<number_of_cars ;i++){
            Car temp = new Car();
            System.out.println("Enter car details ");
            temp.brand = in.nextLine();
            temp.price = in.nextInt();
            in.nextLine();
            dealership[i] = temp;
        }
        System.out.println("The number of brands available : " + number_of_cars );
        for(int i=0;i<number_of_cars ; i++){
            System.out.println("Brand : " + dealership[i].brand + " Price : " + dealership[i].price);
        }
        in.close();
    }

}
