package n2exercice1;

public class GenericMethods {

    public static <T> void printElements (String element1, T b, T c) {
        System.out.println(element1);
        System.out.println(b);
        System.out.println(c);
    }
}
