import java.util.Scanner;

public class SciCalculator {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        double firstOperand; //Denoting values
        double secondOperand;
        double currentResult = 0.0;
        double sumCalculations = 0.0;
        int menuSelection;
        double roundedAverageValue;
        int numCalculations = 0;
        double roundedSumValue;

        System.out.println("Current Result: 0.0"); //Initial menu (1 time)
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("0. Exit Program");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponentiation");
        System.out.println("6. Logarithm");
        System.out.println("7. Display Average");

        do { //Repeating the menu

        System.out.print("Enter Menu Selection: "); //Menu Selection Input
        menuSelection = scnr.nextInt();

        if (menuSelection == 0) { //Exit Module
            System.out.print("Thanks for using this calculator. Goodbye!");
        }

        else if (menuSelection == 1) { //Additon Module
            System.out.print("Enter first operand: ");
            firstOperand = scnr.nextDouble();
            System.out.print("Enter second operand: ");
            secondOperand = scnr.nextDouble();
            currentResult = firstOperand + secondOperand;
            numCalculations = numCalculations + 1;
            sumCalculations = sumCalculations + currentResult;
            System.out.println("Current Result: " +currentResult);
            System.out.println("Calculator Menu");
            System.out.println("---------------");
            System.out.println("0. Exit Program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm");
            System.out.println("7. Display Average");
        }

        else if (menuSelection == 2) { //Subtraction Module
            System.out.print("Enter first operand: ");
            firstOperand = scnr.nextDouble();
            System.out.print("Enter second operand: ");
            secondOperand = scnr.nextDouble();
            currentResult = firstOperand - secondOperand;
            numCalculations = numCalculations + 1;
            sumCalculations = sumCalculations + currentResult;
            System.out.println("Current Result: " +currentResult);
            System.out.println("Calculator Menu");
            System.out.println("---------------");
            System.out.println("0. Exit Program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm");
            System.out.println("7. Display Average");
        }

        else if (menuSelection == 3) { //Multiplication Module
            System.out.print("Enter first operand: ");
            firstOperand = scnr.nextDouble();
            System.out.print("Enter second operand: ");
            secondOperand = scnr.nextDouble();
            currentResult = firstOperand * secondOperand;
            numCalculations = numCalculations + 1;
            sumCalculations = sumCalculations + currentResult;
            System.out.println("Current Result: " +currentResult);
            System.out.println("Calculator Menu");
            System.out.println("---------------");
            System.out.println("0. Exit Program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm");
            System.out.println("7. Display Average");
        }

        else if (menuSelection == 4) { //Division Module
            System.out.print("Enter first operand: ");
            firstOperand = scnr.nextDouble();
            System.out.print("Enter second operand: ");
            secondOperand = scnr.nextDouble();
            currentResult = firstOperand / secondOperand;
            numCalculations = numCalculations + 1;
            sumCalculations = sumCalculations + currentResult;
            System.out.println("Current Result: " +currentResult);
            System.out.println("Calculator Menu");
            System.out.println("---------------");
            System.out.println("0. Exit Program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm");
            System.out.println("7. Display Average");
        }

        else if (menuSelection == 5) { //Exponential Module
            System.out.print("Enter first operand: ");
            firstOperand = scnr.nextDouble();
            System.out.print("Enter second operand: ");
            secondOperand = scnr.nextDouble();
            currentResult = Math.pow(firstOperand, secondOperand);
            numCalculations = numCalculations + 1;
            sumCalculations = sumCalculations + currentResult;
            System.out.println("Current Result: " +currentResult);
            System.out.println("Calculator Menu");
            System.out.println("---------------");
            System.out.println("0. Exit Program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm");
            System.out.println("7. Display Average");
        }

        else if (menuSelection == 6) { //Logarithm Module
            System.out.print("Enter first operand: ");
            firstOperand = scnr.nextDouble();
            System.out.print("Enter second operand: ");
            secondOperand = scnr.nextDouble();
            currentResult = Math.log(secondOperand) / Math.log(firstOperand);
            System.out.println("Current Result: " + currentResult);
            numCalculations = numCalculations + 1;
            sumCalculations = sumCalculations + currentResult;
            System.out.println("Calculator Menu");
            System.out.println("---------------");
            System.out.println("0. Exit Program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm");
            System.out.println("7. Display Average");
        }

        else if ((menuSelection == 7) && (numCalculations == 0)) { //Average Error Module
        System.out.println("Error: No calculations yet to average!");
        }

        else if ((menuSelection == 7) && (numCalculations > 0)) { //Average Module (this area is a mess due to how I rounded)
            roundedSumValue = Math.round((sumCalculations - (Math.round(sumCalculations))) * 100) / 100.00;
            System.out.println("Sum of calculations: " + (Math.round(sumCalculations) + roundedSumValue));
            System.out.println("Number of calculations: " + numCalculations);
            roundedAverageValue = Math.round(((sumCalculations / numCalculations) - Math.round(sumCalculations / numCalculations)) * 100) / 100.00;
            currentResult = Math.round(sumCalculations / numCalculations) + roundedAverageValue;
            System.out.println("Average of calculations: " + (Math.round(sumCalculations / numCalculations) + roundedAverageValue));
            numCalculations = numCalculations + 1;
            sumCalculations = sumCalculations + currentResult;
        }

        else { //General Error Module
            System.out.println("Error: Invalid selection!");
            }

        } while (menuSelection != 0); //End of Repetition

    }
}