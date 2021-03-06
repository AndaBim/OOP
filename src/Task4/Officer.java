package Task4;

public class Officer extends Person {

    private int officerID;
    private int crimesSolved;

    public Officer() {
    }

    public Officer(String name, String surname, int officerID, int crimesSolved) {
        this.name = name;
        this.surname = surname;
        this.officerID = officerID;
        this.crimesSolved = crimesSolved;

    }

    public int getOfficerID() {

        return officerID;
    }


    public int getCrimesSolved() {

        return crimesSolved;
    }


    public void setOfficerID(int officerID) {

        this.officerID = officerID;
    }


    public void setCrimesSolved(int crimesSolved) {

        this.crimesSolved = crimesSolved;
    }

    @Override
    public String toString() {
        return "Officer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", officerID=" + officerID +
                ", crimesSolved=" + crimesSolved +
                '}';
    }

    public int calculatedLevel() {
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

