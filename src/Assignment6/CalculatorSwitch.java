import java.util.Scanner;
public class CalculatorSwitch {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter the third number: ");
            double num3 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2 + num3;
                    break;
                case '-':
                    result = num1 - num2 - num3;
                    break;
                case '*':
                    result = num1 * num2 - num3;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2 / num3;
                    } else {
                        System.out.println("Cannot divide by zero");
                        return;
                    }
                    break;
                default:
                    System.out.println("Invalid operator");
                    return;
            }

            System.out.println("The result is: " + result);
        }
    }
