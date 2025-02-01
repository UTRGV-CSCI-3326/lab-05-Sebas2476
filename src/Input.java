import java.util.Scanner;
public class Input{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Full Name: ");
        String UserName = scanner.nextLine();

        System.out.println("Now Enter Your Age: ");
        int UserAge = scanner.nextInt();

        System.out.println("Now Input your weight: ");
        float UserWeight = scanner.nextFloat();

        System.out.println("Are you a smoker? Type either True:(yes) or False:(No)");
        boolean UserSmoke = scanner.nextBoolean();

        System.out.println("Ok " + UserName + " Here are the accurate record we have of you. you are currently " + UserAge + " Years old, you currently weigh around " + UserWeight + "and you typed " + UserSmoke + " in your smoking status.");
        
        scanner.close();
        

    }
}
