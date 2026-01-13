package n2exercice2;

public class GenericMethods {

    public static <T> void printAll(String text, T... elements) {

        System.out.println(text);
        for (T element : elements) {
            System.out.println(element);
        }
    }

}
