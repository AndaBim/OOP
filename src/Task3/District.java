package Task3;

import java.util.ArrayList;
import java.util.Arrays;

public class District {

    private String title;
    private String city;
    private int districtID;
    private ArrayList<Officer> officersInTheDistrict;

    public District() {

    }

    public District(String title, String city, int districtID, ArrayList<Officer> officersInTheDistrict) {
        this.title = title;
        this.city = city;
        this.districtID = districtID;
        this.officersInTheDistrict = officersInTheDistrict;
        officersInTheDistrict = new ArrayList<>(officersInTheDistrict);
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

    public void setOfficersInTheDistrict(ArrayList<Officer> officersInTheDistrict) {
        this.officersInTheDistrict = officersInTheDistrict;
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

    public ArrayList<Officer> getOfficersInTheDistrict() {
        return officersInTheDistrict;
    }

    @Override
    public String toString() {
        return "District{" +
                "title='" + title + '\'' +
                ", city='" + city + '\'' +
                ", districtID=" + districtID +
                ", officersInTheDistrict=" + Arrays.toString(new ArrayList[]{officersInTheDistrict}) +
                '}';
    }

    public boolean addNewOfficer(Officer officer) {
        officersInTheDistrict.add(officer);
        return true;

    }

    public boolean removeOfficer(Officer officer) {
        officersInTheDistrict.remove(officer);
        return true;
    }

    public float averageLevelInTheDistrict() {
        float sum = 0;
        for (Officer off : officersInTheDistrict) {
            sum = sum + off.calculatedLevel();
        }

        return sum / officersInTheDistrict.size();
    }
}
