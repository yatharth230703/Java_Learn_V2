package week_2;
import java.util.Scanner;
class Student{
    String name ;
    int marks ; 
}

public class ques6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int total_students = in.nextInt();
        in.nextLine();
        Student[] classroom = new Student[total_students];

        for(int i=0;i<total_students ; i++) {
            Student temp = new Student();
            temp.name = in.nextLine();
            //in.nextLine();
            temp.marks = in.nextInt();
            in.nextLine();
            classroom[i] = temp;
        }
        int avg = 0;
        for(int i=0;i<total_students ; i++){
            avg += classroom[i].marks/total_students;
        }
        System.out.println("The average is : " + avg );

        in.close();
    }
}
