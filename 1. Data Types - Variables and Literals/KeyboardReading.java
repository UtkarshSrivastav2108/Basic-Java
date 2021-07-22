


import java.util.Scanner;
public class KeyboardReading {

public static void main(String[]args){

Scanner s = new Scanner(System.in);
    String name;
    System.out.println("May i Your Name");
    name= s.nextLine();
    System.out.println("Hello Mr/Ms "+name + ", How are you?");
    s.close();

}
}