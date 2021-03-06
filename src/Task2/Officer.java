package Task2;

public class Officer {

    private String name;
    private String surname;
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

    public String getName() {

        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getOfficerID() {

        return officerID;
    }



    public int getCrimesSolved() {

        return crimesSolved;
    }


    public void setName(String name) {

        this.name = name;
    }

    public void setSurname(String surname) {

        this.surname = surname;
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

    public int calculatedLevel()
    {
       if (crimesSolved >= 0 && crimesSolved < 20) {
            return 1;
                    }
        else if (crimesSolved >= 20 && crimesSolved < 40) {
            return 2;
        }
        else if (crimesSolved >= 40) {
            return 3;
        } else {
            return 0;
        }
    }

}

