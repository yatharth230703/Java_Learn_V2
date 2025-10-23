package week_4;
class Employeez{
    private int salary;
    private String password ; 
    public void set_salary(int sy){
        if(sy<0){
            System.err.println("Salary can't be negative");
        }
        salary=sy;
    }
    public void set_password(String p){
        if(p.length()<9){
            System.err.println("password needs to be more than 9 characters");
        }
        password= p;
    }
    public void get_salary(String p){
        if(p==password){
            System.out.println("The salary of the employee is : "  + salary);

        }
        else{
            System.err.println("Please enter valid password ");
        }
    }
}
public class ques1 {
    public static void main(String[] args){
        Employeez em = new Employeez();
        em.set_salary(-10000);
        em.set_password("aaaaa");
        em.get_salary("halleluyaaaaaa");

    }
}
