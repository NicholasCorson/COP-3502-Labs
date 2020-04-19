import java.util.Scanner;

    public class CowSay {

        public static void cowSay(String command) {

            System.out.println(
                    command + "\n" +
                    "    \\\n" +
                    "     \\\n" +
                    "      \\\n" +
                    "        ^__^\n" +
                    "        (oo)\\_______\n" +
                    "        (__)\\       )\\/\\\n" +
                    "            ||----w |\n" +
                    "            ||     ||\n");

        }

        public static void kittehSay(String command){

            command = command.replace("-n kitteh ", "");

            System.out.println(
                    command + "\n" +
                            "    \\\n" +
                            "     \\\n" +
                            "      \\\n" +
                    "       (\"`-'  '-/\") .___..--' ' \"`-._\n" +
                    "         ` *_ *  )    `-.   (      ) .`-.__. `)\n" +
                    "         (_Y_.) ' ._   )   `._` ;  `` -. .-'\n" +
                    "      _.. `--'_..-_/   /--' _ .' ,4\n" +
                    "   ( i l ),-''  ( l i),'  ( ( ! .-'\n");

        }



        public static void main(String[] args) {

            Scanner scnr = new Scanner(System.in);

            String command;

            System.out.println(">javac Cowsay.java");

            do {

                System.out.print(">java Cowsay ");
                command = scnr.nextLine();

                if (command.charAt(0) == '-') {

                    if (command.charAt(1) == 'l') {

                        System.out.println("Cows  available:  heifer  kitteh");

                    } else if (command.charAt(1) == 'n') {

                        if ((command.charAt(3) == 'k')
                                && (command.charAt(4) == 'i') && (command.charAt(5) == 't')
                                && (command.charAt(6) == 't') && (command.charAt(7) == 'e')
                                && (command.charAt(8) == 'h')) {

                            kittehSay(command);

                        } else {

                            char working = '!';
                            String errorCow = "";

                            for (int i = 3; working != ' '; i++) {

                                working = command.charAt(i);

                                errorCow = errorCow.concat(Character.toString(working));

                            }

                            errorCow = errorCow.replace(" ", "");

                            System.out.println("Could not find " + errorCow + " cow!");

                        }

                    }

                } else {

                    cowSay(command);

                }


            } while (0 == 0);

        }
    }

