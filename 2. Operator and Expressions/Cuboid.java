import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {

        int length, breadth, height, Volume, totalArea;

        System.out.println("Enter the Length , Breadth and Height");

        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();

        Volume = length * breadth * height;
        totalArea = 2 * (length * breadth + length * height + breadth * height);
        System.out.println("The vaolume of Cuboid is " + Volume);
        System.out.println("The vaolume of Cuboid is " + totalArea);
    }

}
