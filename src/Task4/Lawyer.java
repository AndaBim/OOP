package Task4;

public class Lawyer extends Person{

    private int lawyerID;
    private int helpedInCrimesSolving;

    public Lawyer(){

    }

    public int getLawyerID() {
        return lawyerID;
    }

    public void setLawyerID(int lawyerID) {
        this.lawyerID = lawyerID;
    }

    public int getHelpedInCrimesSolving() {
        return helpedInCrimesSolving;
    }

    public void setHelpedInCrimesSolving(int helpedInCrimesSolving) {
        this.helpedInCrimesSolving = helpedInCrimesSolving;
    }

    public Lawyer(String name, String surname, int lawyerID, int helpedInCrimesSolving){
        this.name = name;
        this.surname = surname;
        this.lawyerID = lawyerID;
        this.helpedInCrimesSolving = helpedInCrimesSolving;

    }

    @Override
    public String toString() {
        return "Lawyer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lawyerID=" + lawyerID +
                ", helpedInCrimesSolving=" + helpedInCrimesSolving +
                '}';
    }


}
