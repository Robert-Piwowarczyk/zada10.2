public class Person {
    private String firstName;
    private String lastName;
    private int pesel;

    public Person(String firstName, String lastName, int pesel) {
        if (firstName == null) {
            throw new NullPointerException();
        }this.firstName = firstName;

        if (lastName == null) {
            throw new NullPointerException();
        }this.lastName = lastName;

        if (pesel < 10) {
            throw new NullPointerException();
        }this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }
}
