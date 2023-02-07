import java.util.Scanner;

public class even_or_ood {

    public static void main(String[] args) {
        System.out.println("ENTER THE NUMBER :");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        
        if(a%2==0)
        {
            System.out.println("THE GIVEN NUMBER EVEN");
        }else {
            System.out.println("THE GIVEN NUMBER OOD");

        }
    }

}
