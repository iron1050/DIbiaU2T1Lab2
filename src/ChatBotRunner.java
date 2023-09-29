import java.util.Scanner;
public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot debbie = new ChatBot("Debbie", 4);
        debbie.greeting("Chukwuma");
        debbie.weather();
        debbie.favoriteNumber(4);
        double meters = debbie.convertFeetToMeters(30);
        System.out.println("There are " + meters + " meters in 30 feet");
        int total = debbie.addNumbers(15, 21, 36);
        System.out.println("The total is " + total);
        System.out.println(debbie.goodbye());
        Scanner scan = new Scanner(System.in);
        System.out.println("What do you think the bots favorite number is?");
        int guess = scan.nextInt();
        System.out.println(debbie.guessFavNumber(guess));
        debbie.name();
    }
}
