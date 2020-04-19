import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        String userName;
        String userAge;
        String userLocation;

        System.out.print("Hello. What is your name? ");
        userName = scnr.next();

        System.out.print("It's nice to meet you, ");
        System.out.print(userName);
        System.out.print(". How old are you? ");
        userAge = scnr.next();

        System.out.print("I see that you are still quite young at only ");
        System.out.print(userAge);
        System.out.println(".");

        System.out.print("Where do you live? ");
        userLocation = scnr.next();

        System.out.print("Wow! I've always wanted to go to ");
        System.out.print(userLocation);
        System.out.print(". Thanks for chatting with me. Bye!");
    }
}
