import java.util.*;

public class Ashcode {
    public static void main(String[] args) {
        String s = "Helloanjankumar";
        System.out.println(s);
        int n = hashCode(s);
        System.out.println(n);
    }

    private static int hashCode(String s) {
        return s.hashCode();
    }
	
}
