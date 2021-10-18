import java.util.Scanner;
public class RelationalandLogicalOperators {
    public static <scanner> void main(String[] args) {

       int Marks ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks ");
        Marks = sc.nextInt();
        if (Marks>=1 && Marks <=33) {
            System.out.println("m3 , Very Poor Grade");
        } else if (Marks>=34 && Marks <=70) {
                System.out.println("m2 ,  Good Grade");
        } else if (Marks>=71 && Marks <=100) {
            System.out.println("m1 ,  Excellent Grade");
        }else {
            System.out.println("Enter the valid Marks ");
        }


    }
}
