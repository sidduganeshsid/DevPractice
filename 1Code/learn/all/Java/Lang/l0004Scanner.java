import java.util.*;

public class l0004Scanner
{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 : ");
        int a = sc.nextInt();
        System.out.println("Enter the num2 : ");
        int b = sc.nextInt();

        int c = a+b;
        System.out.println("sum of a and b is : "+c);
    }
}