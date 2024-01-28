import java.util.*;

public class rps {
    public static void main(String[] args) {
        String[] cArray = { "r", "p", "s" };
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("USER CHOICE: ");
            String ask = sc.nextLine();
            Random random = new Random();
            int randomIndex = random.nextInt(cArray.length);
            String computer = cArray[randomIndex];
            System.out.println("COMPUTER CHOICE: " + computer);
            if (ask.equals(computer)) {
                System.out.println("It's a tie! You and the computer have chosen the same choice.");
            } else if ((ask.equals("r") && computer.equals("s")) || (ask.equals("p") && computer.equals("r"))
                    || (ask.equals("s") && computer.equals("p"))) {
                System.out.println(
                        "Hurray, you won! The computer has chosen " + computer + " and you have chosen " + ask);
            } else if ((ask.equals("r") && computer.equals("p")) || (ask.equals("p") && computer.equals("s"))
                    || (ask.equals("s") && computer.equals("r"))) {
                System.out.println("You lost. The computer has chosen " + computer + " and you chose " + ask);
            } else {
                System.out.println("Please choose only 'r' for rock, 'p' for paper, or 's' for scissor.");
            }
        }
    }
}
