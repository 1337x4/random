import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the event code and number of guests: ");
       String eCode = scanner.next();
       int guest = scanner.nextInt();

        Event myEvent = new Event(eCode,guest);
        if(myEvent.isCrowded(guest)){
            myEvent.setGuest(100);
            System.out.println("The number of guests exceeds 100 so it will be set to 100");

        }
        (myEvent).printer();

    }
}