import java.util.Scanner;

public class NumericConversion {

    public static long hexStringDecode(String hex){

        int hexLength;
        int lengthModifier = 0;
        int currentHexValue = 0;
        long decodedHex = 0;
        int hexModifier = 0;
        

        hexLength = String.valueOf(hex).length();

        do {

            char currentHex = hex.charAt(hexLength - (lengthModifier + 1));

            if (currentHex == '0') {
                currentHexValue = 0;
            }
            if (currentHex == '1') {
                currentHexValue = 1;
            }
            if (currentHex == '2') {
                currentHexValue = 2;
            }
            if (currentHex == '3') {
                currentHexValue = 3;
            }
            if (currentHex == '4') {
                currentHexValue = 4;
            }
            if (currentHex == '5') {
                currentHexValue = 5;
            }
            if (currentHex == '6') {
                currentHexValue = 6;
            }
            if (currentHex == '7') {
                currentHexValue = 7;
            }
            if (currentHex == '8') {
                currentHexValue = 8;
            }
            if (currentHex == '9') {
                currentHexValue = 9;
            }
            if ((currentHex == 'a') || (currentHex == 'A')) {
                currentHexValue = 10;
            }
            if ((currentHex == 'b') || (currentHex == 'B')) {
                currentHexValue = 11;
            }
            if ((currentHex == 'c') || (currentHex == 'C')) {
                currentHexValue = 12;
            }
            if ((currentHex == 'd') || (currentHex == 'D')) {
                currentHexValue = 13;
            }
            if ((currentHex == 'e') || (currentHex == 'E')) {
                currentHexValue = 14;
            }
            if ((currentHex == 'f') || (currentHex == 'F')) {
                currentHexValue = 15;
            }

            decodedHex = (long) (decodedHex + (currentHexValue * (Math.pow(16, (lengthModifier)))));

            lengthModifier = lengthModifier + 1;

            if (hexLength > 1) {
                char hex1 = hex.charAt(0);
                char hex2 = hex.charAt(1);

                if ((hex1 == '0') && ((hex2 == 'x') || (hex2 == 'b'))) {
                    hexModifier = 2;
                }
            }

        } while (lengthModifier < hexLength - hexModifier);

        System.out.println("Result: " + decodedHex);

        return decodedHex;
    }

    public static short hexCharDecode(char digit) {

        int hexLength;
        int lengthModifier = 0;
        int currentHexValue = 0;
        short decodedHex = 0;
        int hexModifier = 0;

            if (digit == '0') {
                currentHexValue = 0;
            }
            if (digit == '1') {
                currentHexValue = 1;
            }
            if (digit == '2') {
                currentHexValue = 2;
            }
            if (digit == '3') {
                currentHexValue = 3;
            }
            if (digit == '4') {
                currentHexValue = 4;
            }
            if (digit == '5') {
                currentHexValue = 5;
            }
            if (digit == '6') {
                currentHexValue = 6;
            }
            if (digit == '7') {
                currentHexValue = 7;
            }
            if (digit == '8') {
                currentHexValue = 8;
            }
            if (digit == '9') {
                currentHexValue = 9;
            }
            if ((digit == 'a') || (digit == 'A')) {
                currentHexValue = 10;
            }
            if ((digit == 'b') || (digit == 'B')) {
                currentHexValue = 11;
            }
            if ((digit == 'c') || (digit == 'C')) {
                currentHexValue = 12;
            }
            if ((digit == 'd') || (digit == 'D')) {
                currentHexValue = 13;
            }
            if ((digit == 'e') || (digit == 'E')) {
                currentHexValue = 14;
            }
            if ((digit == 'f') || (digit == 'F')) {
                currentHexValue = 15;
            }

        System.out.println("Result: " + currentHexValue);

        return (short) currentHexValue;
    }

    public static short binaryStringDecode(String binary) {

        int binLength = 0;
        int hexModifier = 0;
        int lengthModifier = 0;
        int decodedBin = 0;

        binLength = String.valueOf(binary).length();

        if (binLength > 1) {
            char hex1 = binary.charAt(0);
            char hex2 = binary.charAt(1);

            if ((hex1 == '0') && ((hex2 == 'x') || (hex2 == 'b'))) {
                hexModifier = 2;
            }
        }

        do {

            char currentBin = binary.charAt(binLength - (lengthModifier + 1));

            if (currentBin == '1') {

                decodedBin = (int) (decodedBin + Math.pow(2, (lengthModifier)));

            }

            lengthModifier = lengthModifier + 1;

        } while (lengthModifier < binLength);

            System.out.println("Result: " + decodedBin);

        return (short) decodedBin;
    }

    public static String binaryToHex(String binary){

        int binLength = 0;
        int hexModifier = 0;
        int lengthModifier = 0;
        int decodedBin = 0;
        String decodedHex = "0";
        int exponentModifier = 0;
        int remainder = 0;
        int currentToHex;
        String finalHex = "";

        binLength = String.valueOf(binary).length();

        if (binLength > 1) {
            char hex1 = binary.charAt(0);
            char hex2 = binary.charAt(1);

            if ((hex1 == '0') && ((hex2 == 'x') || (hex2 == 'b'))) {
                hexModifier = 2;
            }
        }

        do {

            char currentBin = binary.charAt(binLength - (lengthModifier + 1));

            if (currentBin == '1') {

                decodedBin = (int) (decodedBin + Math.pow(2, (lengthModifier)));

            }

            lengthModifier = lengthModifier + 1;

        } while (lengthModifier < binLength);

        do {

            do {

                exponentModifier = exponentModifier + 1;

                remainder = (int) (decodedBin % (Math.pow(16, (exponentModifier - 1))));


            } while (decodedBin > Math.pow(16, exponentModifier));


            currentToHex = (int) ((decodedBin - remainder) / (Math.pow(16, (exponentModifier - 1))));

            decodedBin = remainder;

            exponentModifier = 0;

            if (currentToHex == 0) {
                finalHex = finalHex.concat("0");
            }
            if (currentToHex == 1) {
                finalHex = finalHex.concat("1");
            }
            if (currentToHex == 2) {
                finalHex = finalHex.concat("2");
            }
            if (currentToHex == 3) {
                finalHex = finalHex.concat("3");
            }
            if (currentToHex == 4) {
                finalHex = finalHex.concat("4");
            }
            if (currentToHex == 5) {
                finalHex = finalHex.concat("5");
            }
            if (currentToHex == 6) {
                finalHex = finalHex.concat("6");
            }
            if (currentToHex == 7) {
                finalHex = finalHex.concat("7");
            }
            if (currentToHex == 8) {
                finalHex = finalHex.concat("8");
            }
            if (currentToHex == 9) {
                finalHex = finalHex.concat("9");
            }
            if (currentToHex == 10) {
                finalHex = finalHex.concat("a");
            }
            if (currentToHex == 11) {
                finalHex = finalHex.concat("b");
            }
            if (currentToHex == 12) {
                finalHex = finalHex.concat("c");
            }
            if (currentToHex == 13) {
                finalHex = finalHex.concat("d");
            }
            if (currentToHex == 14) {
                finalHex = finalHex.concat("e");
            }
            if (currentToHex == 15) {
                finalHex = finalHex.concat("f");
            }

        } while (decodedBin != 0);

        System.out.println("Result: " + finalHex);

        return String.valueOf(finalHex);

    }

    public static void main(String args[]) {

        Scanner scnr = new Scanner(System.in);

        int menuSelection;
        String hex;
        String decodedHex = "0";
        String binary = "0";

        do {

        System.out.println("Decoding Menu");
        System.out.println("-------------");
        System.out.println("1. Decode hexadecimal");
        System.out.println("2. Decode binary");
        System.out.println("3. Convert binary to hexadecimal");
        System.out.println("4. Quit");
        System.out.println("Please enter an option: ");
        menuSelection = scnr.nextInt();

        if (menuSelection == 1) {
            System.out.println("Please enter the numeric string to convert: ");

            hex = scnr.next();

            if (String.valueOf(hex).length() == 1) {
                char digit = hex.charAt(0);
                hexCharDecode(digit);
            }

            else if (String.valueOf(hex).length() > 1) {
                hexStringDecode(hex);
            }
        }


        else if (menuSelection == 2) {

            System.out.println("Please enter the numeric string to convert: ");

            binaryStringDecode(binary = scnr.next());

        }

        else if (menuSelection == 3) {

            System.out.println("Please enter the numeric string to convert: ");

            binaryToHex(binary = scnr.next());

        }

        else if (menuSelection == 4) {
            System.out.println("Goodbye!");
        }

        } while (menuSelection != 4);

        }
    }