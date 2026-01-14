package n1exercice1;

public class Main {

    public static void main (String [] args) {

        String name = "Dani";
        String city = "Barcelona";
        String dogName = "Kira";


        NoGenericMethods object1 = new NoGenericMethods(name, city, dogName);
        NoGenericMethods object2 = new NoGenericMethods(city, dogName, name);

    }
}
