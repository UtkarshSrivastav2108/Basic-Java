import java.util.Scanner;

public class StudentChallenge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;
        System.out.println("Enter a number");
        num = sc.nextLine();
        if (num.matches("[01]+")) {
            System.out.println("Binary Number");
        } else if (num.matches("[0-7]+")) {
            System.out.println("Octal Number");
        } else if (num.matches("[0-9]+")) {
            System.out.println("Decimal Number");
        }else if (num.matches("[0-9A-F]+")) {
            System.out.println(" Hexa Decimal Number");
        }else{
            System.out.println("Invalid Number");
        }
        ;


        System.out.println();
    }
}
