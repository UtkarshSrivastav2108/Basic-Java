import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {

        float base, area, height;
        System.out.println("Enter base and Height");
        Scanner sc = new Scanner(System.in);
        base = sc.nextFloat();
        height = sc.nextFloat();
        area = (base * height) / 2;
        System.out.println("area of triangle is : " + area);
    }
}
