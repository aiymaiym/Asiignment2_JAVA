import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        var scanner = new
                Scanner(System.in);
        System.out.print("Enter your number");
        int freeHours = scanner
                .nextInt();
        if(freeHours >= 2){
            System.out.println("You have free hours");
            System.out.println(
                    "You can go to the cinema for free"
            );
        }
        scanner.close();
        System.out.println("Hello world!");
    }
}
