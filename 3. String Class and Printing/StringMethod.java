public class StringMethod {

    public static void main(String[] args) {

        String str = "Java";
        int l = str.length();
        String str1 = "JAVA IS GOOF AF";
        String small = str1.toLowerCase();
        String str2 = "java is good af";
        String cap = str2.toUpperCase();
        String str3 = "Welcome";
        String sub1 = str3.substring(3);

        System.out.println(l);
        System.out.println(small);
        System.out.println(cap);
        System.out.println(sub1);

    }

}
