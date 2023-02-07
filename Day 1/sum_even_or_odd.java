import java.util.Scanner;

public class sum_even_or_odd {

    public static void main(String[] args) {
        System.out.println("ENTER THE FIRST NUMBER :");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("ENTER THE SECOND NUMBER :");
        int b = scanner.nextInt();
        int sum =a+b;

        
        if(sum%2==0)
        {
            System.out.println("THE "+sum +" NUMBER EVEN");
        }else {
            System.out.println("THE "+sum +" NUMBER OOD");

        }
    }

}
