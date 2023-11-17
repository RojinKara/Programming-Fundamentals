package ProblemSet_8c;

public class Person {
    private String forename = null;
    private String surname = null;
    private int age = 0;

    public Person(String forename, String surname, int age) {
        super();
        this.forename = forename;
        this.surname = surname;
        this.age = age;
    }

    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.forename + " "
                + this.surname
                + " (" + this.age + ")";
    }
}
