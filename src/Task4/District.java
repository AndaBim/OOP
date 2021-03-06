package Task4;

import java.util.ArrayList;
import java.util.Arrays;

public class District {

    private String title;
    private String city;
    private int districtID;
    private ArrayList<Person> personsInTheDistrict;

    public District() {

    }

    public District(String title, String city, int districtID, ArrayList<Person> personsInTheDistrict) {
        this.title = title;
        this.city = city;
        this.districtID = districtID;
        this.personsInTheDistrict = personsInTheDistrict;
        personsInTheDistrict = new ArrayList<>(personsInTheDistrict);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDistrictID(int districtID) {
        this.districtID = districtID;
    }

    public void setPersonsInTheDistrict(ArrayList<Person> personsInTheDistrict) {
        this.personsInTheDistrict = personsInTheDistrict;
    }

    public String getTitle() {
        return title;
    }

    public String getCity() {
        return city;
    }

    public int getDistrictID() {
        return districtID;
    }

    public ArrayList<Person> getPersonsInTheDistrict() {
        return personsInTheDistrict;
    }

    @Override
    public String toString() {
        return "District{" +
                "title='" + title + '\'' +
                ", city='" + city + '\'' +
                ", districtID=" + districtID +
                ", personsInTheDistrict=" + Arrays.toString(new ArrayList[]{personsInTheDistrict}) +
                '}';
    }

    public boolean addNewPerson(Person person) {
        personsInTheDistrict.add(person);
        return true;

    }

    public boolean removePerson(Person person) {
        personsInTheDistrict.remove(person);
        return true;
    }

    public float calculateAverageLevelInDistrict() {
        float sumOfLevels = 0;
        int officerCount = 0;
        for (Person pers : personsInTheDistrict) {
            if (pers instanceof Officer) {
                sumOfLevels = sumOfLevels + pers.calculatedLevel();
                officerCount++;
            }
        }
        return sumOfLevels / officerCount;
    }
}
