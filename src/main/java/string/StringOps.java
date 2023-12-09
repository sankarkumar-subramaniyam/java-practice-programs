package string;

public class StringOps {

    public static void main(String[] args) {
        String a = "aa";
        String b = "aabbaa";

        System.out.println(b.contains(a));
        System.out.println(a.contains(a));
        System.out.println(a.contains(b));
    }
}
