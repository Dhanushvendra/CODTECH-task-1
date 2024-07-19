import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****Welcome To Simple Calculator*****");
        System.out.println("Addition-a: Subtraction-s: Multiplication-m: Division-d: ");
        System.out.println("Select Operation");
        char c = sc.next().charAt(0);
        System.out.println("Enter First Number :");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        switch (c) {
            case 'a':
                System.out.println("Addition of Two Numbers :" + (a + b));
                break;
            case 's':
                System.out.println("Difference of Two Numbers :" + (a - b));
                break;
            case 'm':
                System.out.println("Multiplication of Two Numbers :" + (a * b));
                break;
            case 'd':
                if (b != 0)
                    System.out.println("Division of Two Nmubers :" + (a / b));
                else
                    System.out.println("Error:Division by zero is not possible");
                break;
            default:
                System.out.println("Invalid operation is selected");
        }
        sc.close();
    }
}