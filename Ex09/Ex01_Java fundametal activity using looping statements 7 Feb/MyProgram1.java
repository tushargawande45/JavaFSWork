import java.util.*;
class MyProgram1{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        int salary = Sc.nextInt();
        System.out.print("Enter number of shifts: ");
        int shifts = Sc.nextInt();
        int saving = ((50*salary)/100)+((shifts*salary*2)/100);
        


        if(salary<=8000){
            System.out.println(saving);
           
        }
        else{
            System.out.println("Salary is too large");
        }

        if(shifts<0){
            System.out.println("Shifts to small");
        }
        if(salary<0){
            System.out.println("Salary too small");
        }




    }
}