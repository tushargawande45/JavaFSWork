import java.util.*;
public class ArrOddEvenSum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements n: ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Invalid array size");
        }

        int [] arr = new int[n];
        
        int evenSum=0;
        int oddSum=0;
        
        

        System.out.println("Enter the numbers");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.println("Invalid input");
            }
        }
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]%2==0){
                evenSum+=arr[i];
            }
            else{
                oddSum+=arr[i];
            }
        }
        if(evenSum>oddSum){
            System.out.println(evenSum);
        }
        else{
            System.out.println(oddSum);
        }



    }
}