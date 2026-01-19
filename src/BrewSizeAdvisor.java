import java.util.Scanner;

public class BrewSizeAdvisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int volume = sc.nextInt();
        int coffee_volume = sc.nextInt();
        
        if (coffee_volume>350)
        {
            System.out.print("Large");
        }
        else if (coffee_volume>=200)
        {
            System.out.print("Medium");
        }
        else
        {
            System.out.print("Small");
        }
        sc.close();
    }
}
