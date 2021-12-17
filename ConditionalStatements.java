
import java.util.*;

public class ConditionalStatements {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if (a == b) {
        // System.out.println("Equal");
        // } else if (a > b) {
        // System.out.println("a is greater");
        // } else {
        // System.out.println("b is greater");
        // }

        int a = sc.nextInt();

        if (a % 2 != 0) {
            System.out.println("odd Number");
        } else {
            System.out.println("Even Number");
        }

    }
}
