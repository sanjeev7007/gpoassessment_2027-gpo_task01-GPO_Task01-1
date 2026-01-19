import java.util.Scanner;

public class BrewSizeAdvisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input < 200) {
            System.out.println("Small");
        } else if (input < 350) {
            System.out.println("Medium");
        } else {
            System.out.println("Large");
        }
    }
}
