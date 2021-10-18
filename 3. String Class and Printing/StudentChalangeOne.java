public class StudentChalangeOne {

    public static void main(String[] args) {

        String str = "Progammer@gmail.com";
        int i = str.indexOf("@");
        int length = str.length();
        String username = str.substring(0, i);
        String domain = str.substring(i + 1, str.length());
        System.out.println(length);
        System.out.println(str.matches(".*gmail.*"));
        System.out.println(i);
        System.out.println(username);
        System.out.println(domain);
    }

}
