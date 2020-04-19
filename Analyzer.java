import java.util.Scanner;

public class Analyzer {

   public static String[] getData() {

       String[] stringDataSet = null;

       if (stringDataSet == null) {

           stringDataSet = new String[26 * 26 * 26 * 26 * 26];
           char[] tempSet = new char[5];
           int index = 0;

           for (tempSet[0] = 'a'; tempSet[0] <= 'z'; tempSet[0]++) {

               for (tempSet[1] = 'a'; tempSet[1] <= 'z'; tempSet[1]++) {

                   for (tempSet[2] = 'a'; tempSet[2] <= 'z'; tempSet[2]++) {

                       for (tempSet[3] = 'a'; tempSet[3] <= 'z'; tempSet[3]++) {

                           for (tempSet[4] = 'a'; tempSet[4] <= 'z'; tempSet[4]++) {

                               stringDataSet[index++] = new String (tempSet);

                           }

                       }

                   }

               }

           }

       }

       return stringDataSet;
    }

    public static int binarySearch(String[] dataSet, String element) { // binary search algorithm

        int index = dataSet.length / 2;
        int i = index;
        int j = 0;
        int low = 0;
        int high = dataSet.length;
        boolean valid = true;

        if (element.length() == 5) {

            for (int k = 0; element.length() > k; k++) {

                if ((element.charAt(k) > 'z') || (element.charAt(k) < 'a')) {

                    valid = false;
                    index = -1;
                    break;

                }

            }

            if (valid == true) {

                do {

                    j = -1;

                    do {

                        j++;

                    } while (dataSet[index].charAt(j) == element.charAt(j));

                    if (dataSet[index].charAt(j) > element.charAt(j)) {

                        high = index;
                        index = (index + low) / 2;

                    } else {

                        low = index;
                        index = (index + high) / 2;

                    }

                } while (element.equals(dataSet[index]) == false);

            }

        }

        else {

            index = -1;

        }

        return index;
    }

    public static int linearSearch(String[] dataSet, String element) { // linear search algorithm

       int index = 0;
        int j = 0;
        boolean valid = true;
        int temp = 0;

       if (element.length() == 5) {

           for (int k = 0; element.length() > k; k++) {

               if ((element.charAt(k) > 'z') || (element.charAt(k) < 'a')) {

                   valid = false;
                   index = -1;
                   break;

               }

           }

           if (valid = true) {

               for (int i = 4; -1 < i; i--) {

                   temp = element.charAt(i) - 97;
                   index = index + (int) (temp * Math.pow(26, j));
                   j++;

               }

           }

       }

       else {

           index = -1;

       }

       return index;
    }

    public static void main(String args[]) {

       Scanner scnr = new Scanner(System.in);

       String element;

       do { // allows for repeated testing without having the manually re-run program

           System.out.println("Insert string for data analysis");
           element = scnr.next();

           if (element.equals("turn_off_loop_and_exit_program") == false) {

               long i = System.nanoTime();
               int tempIndex = linearSearch(getData(), element);
               long j = System.nanoTime();
               long tempTime = (j - i);

               System.out.println("Linear Analysis Index: " + tempIndex);
               System.out.println("Linear Analysis Took " + tempTime + " Nano Seconds.");

               i = System.nanoTime();
               tempIndex = binarySearch(getData(), element);
               j = System.nanoTime();
               tempTime = (j - i);

               System.out.println("Binary Analysis Index: " + tempIndex);
               System.out.println("Binary Analysis Took " + tempTime + " Nano Seconds.");

               System.out.println("---------------");

           }

       } while (element.equals("turn_off_loop_and_exit_program") == false); // code is complicated so it will likely never be put in by accident

    }

}
