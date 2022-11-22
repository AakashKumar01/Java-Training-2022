// Addition of two number
import java.util.Scanner;

public class addition2 {
    public static void main(String[] args) {
        //int sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number:");
        int a = sc.nextInt();
        System.out.print("enter the second number:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("total=" +sum);
        sc.close();
    }
}
