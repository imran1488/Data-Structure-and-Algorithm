import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        String op = sc.next();
        switch (op) {
            case "+":
                int sum = a + b;
                System.out.println(sum);
                break;

            case "-":
                int diff = a - b;
                System.out.println(diff);
                break;

            case "*":
                int mul = a * b;
                System.out.println(mul);
                break;

            case "/":
                int divide = a / b;
                System.out.println(divide);
                break;

            default:
                System.out.println("The Operation you entered is invalid");
        }

    }

}
