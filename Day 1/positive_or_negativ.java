import java.util.*;
public class positive_or_negative {

    public static void main(String[] args) {
        System.out.println("ENTER THE NUMBER :");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        
        if(a>0) {
            System.out.println("THE GIVEN NUMBER IS POSITIVE");
        }else {
            System.out.println("THE GIVEN NUMBER IS NEGATIVE");

        }
    }
}
