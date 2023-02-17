import java.util.Scanner;
public class SumOfOddDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int sum=0;
        while(no>0) {
            if((no%10)%2 != 0) {
                sum=sum+no%10;no=no/10;
            }
            System.out.println(sum);
        }
    }
}