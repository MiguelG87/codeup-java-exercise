import java.util.Scanner;
public class Bob {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isContinued = false;
        String continueUser;
        do {
            System.out.println("Bob: What do you need?: ");
            String userInput = scanner.nextLine();
            if (userInput.endsWith("!")){
                System.out.println("Bob: Whoa, chill out!");
            } else if (userInput.endsWith("?")){
                System.out.println("Bob: Sure.");
            } else if (userInput.equals("")){
                System.out.println("Bob: Fine. Be that way!");
            } else {
                System.out.println("Bob: Whatever.");
            }
            System.out.println("Bob: Another question?");
            continueUser = scanner.nextLine();
            if (continueUser.equalsIgnoreCase("yes")) {
                isContinued = true;
            } else if (continueUser.equalsIgnoreCase("no")){
                isContinued = false;
                System.out.println("Bob: Whatever, Bye!");
            } else {
                System.out.println("Not a valid Response");
                break;
            }
        } while (isContinued == true);



    }
}
