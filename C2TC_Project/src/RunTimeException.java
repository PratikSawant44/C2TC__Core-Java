
import java.util.Scanner;
public class RunTimeException {
    public static void main(String[] args) {
        // Reading user input
        Scanner input_dev = new Scanner(System.in);
        System.out.print("Enter your age in Numbers: ");
        int age1 = input_dev.nextInt();
        if (age1>20) {
            System.out.println("You can view the page");
        } else {
            System.out.println("You cannot view the page");
        }
    }
}
