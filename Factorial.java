import java.util.Scanner;

public class Factorial {

    public static long pureRecursive(int n) {

        long factorial = 1;
        n--;

        if (n == -1) {

            factorial = -1;


        }

        if (n < 1) {


        } else {


            factorial = (n + 1) * pureRecursive(n);

        }

        return factorial;
    }

    public static long tailRecursive(int n) {

        long factorial = n;

        if (factorial != 0) {

            factorial = tail(factorial, n);

        }

        return factorial;
    }

    private static Long tail(long factorial, int n) {

        n--;

        if (n < 1) {


        }

        else {


            factorial = n * tail(factorial, n);

        }

        return factorial;
    }

    public static long iterative(int n) {

        long factorial = 1;

        do {

            factorial = n * factorial;

            n--;

        } while (n > 0);

        return factorial;
    }

    public static void main(String args[]) {

        Scanner scnr = new Scanner(System.in);

        int n = 0;
        int menuSelection = 0;

        System.out.println("Factorial Menu:");
        System.out.println("-----------------");

        do {

            System.out.println("1. Recursive Factorial Calculation");
            System.out.println("2. Tail Recursive Factorial Calculation");
            System.out.println("3. Iterative Factorial Calculation");
            System.out.println("4. Exit");

            System.out.println("Select a Menu Option:");
            menuSelection = scnr.nextInt();

            if ((menuSelection > 0) && (menuSelection < 5)) {

                if (menuSelection != 4) {

                    System.out.println("Insert \"n\" value: ");
                    n = scnr.nextInt();

                }

                if (menuSelection == 1) {

                    if (pureRecursive(n) == -1) {

                        System.out.println("\033[3mthrows IllegalArgumentException\033[0m");

                    }

                    else {

                        System.out.println(" Factorial of " + n + " = " + pureRecursive(n));

                    }

                    System.out.println();

                }

                else if (menuSelection == 2) {

                    if (tailRecursive(n) == 0) {

                        System.out.println("\033[3mthrows IllegalArgumentException\033[0m");

                    }

                    else {

                        System.out.println("Factorial of " + n + " = " + tailRecursive(n));

                    }

                    System.out.println();

                }

                else if (menuSelection == 3) {

                    if (pureRecursive(n) == 0) {

                        System.out.println("\033[3mthrows IllegalArgumentException\033[0m");

                    }

                    else {

                        System.out.println("Factorial of " + n + " = " + iterative(n));

                    }

                    System.out.println();

                }

            }

        } while (menuSelection != 4);

    }

}
