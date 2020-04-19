import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        double firstOperand;
        double secondOperand;
        int menuSelection;

        System.out.print("Enter first operand: "); /** first operand input */
        firstOperand = scnr.nextDouble();

        System.out.print("Enter second operand: "); /** second operand input */
        secondOperand = scnr.nextDouble();

        System.out.println("Calculator Menu"); /** calculator menu */
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Which operation do you want to perform? "); /** menu selection input */
        menuSelection = scnr.nextInt();

        if (menuSelection == 1) { /** if addition */
            System.out.print("The result of the operation is " + (firstOperand + secondOperand) + ". Goodbye!");
        }
        else if (menuSelection == 2) { /** if subtraction */
            System.out.print("The result of the operation is " + (firstOperand - secondOperand) + ". Goodbye!");
        }
        else if (menuSelection == 3) { /** if multiplication */
            System.out.print("The result of the operation is " + (firstOperand * secondOperand) + ". Goodbye!");
        }
        else if (menuSelection == 4) { /** if division */
            System.out.print("The result of the operation is " + (firstOperand / secondOperand) + ". Goodbye!");
        }
        else { /** if invalid menu selection input */
            System.out.print("Error: Invalid selection! Terminating program.");
        }
        }
    }