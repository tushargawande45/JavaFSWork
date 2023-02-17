import java.util.*;
public class CricIdScore{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements n: ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Invalid array size");
        }
        
        int [] arr = new int[n];
        System.out.println("Enter player ID and Score Consecutively : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.println("Invalid input");
            }
        }
        int givenScore = sc.nextInt();

        int j=1;
        while(j<arr.length){
            if(arr[j]<0){
                System.out.println("Invalid Score");
            }
            j+=2;
        }
        
        if(true){
            if(givenScore<0){
                System.out.println("Invalid Score");
            }
            else{
                int i=1;
                while(i<arr.length){
                    if(arr[i]>givenScore){
                        System.out.println(arr[i-1]);
                    }
                    i+=2;
                }

            }

        }


    }
}