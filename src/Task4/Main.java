package Task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Officer officer1 = new Officer("Maria", "Gonzalez", 1234, 12);
        Officer officer2 = new Officer("Marlene", "Dietrich", 2345, 27);
        Officer officer3 = new Officer("Jim", "Beam", 3456, 44);
        Officer officer4 = new Officer("Johnie", "Walker", 4567, 72);
        Officer officer5 = new Officer("Jack", "Daniels", 5678, 11);
        Officer officer6 = new Officer("Tee", "Ling", 6789, 99);
        Officer officer7 = new Officer("Morgan", "Black", 7890, 21);

        District district1 = new District("District 1", "Riga", 1, new ArrayList<Person>());
        District district2 = new District("District 2", "Ventspils", 2, new ArrayList<Person>());

        Lawyer lawyer1 = new Lawyer("Henn", "Essy", 123, 34);
        Lawyer lawyer2 = new Lawyer("Ara", "Rats", 234, 47);
        Lawyer lawyer3 = new Lawyer("Jean Paul", "Chenet", 567, 11);

        district1.addNewPerson(officer1);
        district1.addNewPerson(officer2);
        district1.addNewPerson(officer3);
        district1.addNewPerson(lawyer1);
        district1.addNewPerson(lawyer2);

        district2.addNewPerson(officer4);
        district2.addNewPerson(officer5);
        district2.addNewPerson(officer6);
        district2.addNewPerson(officer7);
        district2.addNewPerson(lawyer3);

        System.out.println("The first districts info sheet: " + district1);
        System.out.println("The second district info sheet: " + district2);

        ArrayList<District> allDistricts = new ArrayList<District>();
        allDistricts.add(district1);
        allDistricts.add(district2);

        int theLargestNumberOfPersons = Integer.MIN_VALUE;
        District largestDistrict = null;

        for (District dist : allDistricts) {
            if (dist.getPersonsInTheDistrict().size() > theLargestNumberOfPersons) {
                largestDistrict = dist;
                theLargestNumberOfPersons = dist.getPersonsInTheDistrict().size();
            }
        }
        System.out.println("The district with the largest amount of persons is: " + largestDistrict.getTitle());

    }
}


