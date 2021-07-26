public class UpCasting_DownCasting {
    public static void main(String[] args) {

        byte b = 10;
        short s = 10;
        int i = 10;
        long l = 10;
        float f = 10;
        double d = 10;
        char c = 10;
        boolean bl = true;

        // convert the following which are valid
        s = b;
        i = b;
        l = i;
        f = l;
        d = l;
        i = c;

    }

}
