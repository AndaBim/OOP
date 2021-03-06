package Task4;

public class Person {

    protected String name;
    protected String surname;

    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Person(String name, String surname){
        this.name=name;
        this.surname=surname;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public int calculatedLevel() {
        int crimesSolved = 0;
        if (crimesSolved >= 0 && crimesSolved < 20) {
            return 1;
        } else if (crimesSolved >= 20 && crimesSolved < 40) {
            return 2;
        } else if (crimesSolved >= 40) {
            return 3;
        } else {
            return 0;
        }
    }
}
