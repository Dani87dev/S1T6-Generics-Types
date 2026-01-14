package n1exercice2;


public class Person {

    private final String NAME;
    private final String SURNAME;
    private final int AGE;

    public Person(String name, String surname, int age) {
        this.NAME = name;
        this.SURNAME = surname;
        this.AGE = age;
    }

    @Override
    public String toString() {
        return "name: " +this.NAME + " " +this.SURNAME+ ", "+ this.AGE+ " years old.";
    }
}
