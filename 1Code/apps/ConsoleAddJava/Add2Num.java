import java.util.Scanner;

public class Add2Num{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st number : ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter the 2nd numbers : ");
        int num2 = sc.nextInt();

        System.out.println("Sum of two numbers : "+(num1+num2));
        
    }
}