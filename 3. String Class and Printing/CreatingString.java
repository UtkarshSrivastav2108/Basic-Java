public class CreatingString {

    public static void main(String[] args) {
        String str1 = "Java Program";

        String str2 = new String("JAVA");

        char c[] = { 'J', 'A', 'V', 'A' };
        String str3 = new String(c);

        byte b[] = { 65, 66, 67, 68 };
        String str4 = new String(b);

        String str5 = "JP";
        String str6 = "JP";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5 == str6);
    }
}
