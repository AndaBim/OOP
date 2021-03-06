package Task2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Officer officer1 = new Officer("Paul", "McMillan", 23456, 13);
        Officer officer2 = new Officer("Linda", "Smith", 34567, 25);
        Officer officer3 = new Officer("Raul", "Wallaby", 45678, 84);
        Officer officer4 = new Officer("Catherin", "Zeta", 56789, 22);
        Officer officer5 = new Officer("Astrid", "Lindgrene", 67890, 11);
        Officer officer6 = new Officer("Jack", "Sparrow", 78901, 12);
        Officer officer7 = new Officer("Sigvard", "Johnson", 89012, 16);

        ArrayList<Officer> officersForOne = new ArrayList<>();
        ArrayList<Officer> officersForTwo = new ArrayList<>();

        officersForOne.add(officer1);
        officersForOne.add(officer2);
        officersForOne.add(officer3);

        officersForTwo.add(officer4);
        officersForTwo.add(officer5);
        officersForTwo.add(officer6);
        officersForTwo.add(officer7);

        District district1 = new District("District 1", "Riga", 1, new ArrayList<Officer>());
        District district2 = new District("District 2", "Ventspils", 2, new ArrayList<Officer>());

        district1.setOfficersInTheDistrict(officersForOne);
        district2.setOfficersInTheDistrict(officersForTwo);

        System.out.println(district1);
        System.out.println(district2);


        district2.removeOfficer(officer5);
        System.out.println(district2);

        System.out.println("The average level in District 1 is " + district1.averageLevelInTheDistrict());
        System.out.println("The average level in District 2 is " + district2.averageLevelInTheDistrict());

        ArrayList<District> allDistricts = new ArrayList<>();
        allDistricts.add(district1);
        allDistricts.add(district2);

        int sumOfOfficersInDIstricts = 0;
        float sumOfAllLevels = 0;

        for (District dist : allDistricts) {
            sumOfOfficersInDIstricts = sumOfOfficersInDIstricts + dist.getOfficersInTheDistrict().size();
            sumOfAllLevels = sumOfAllLevels + dist.averageLevelInTheDistrict();

        }
        System.out.println("There are " + sumOfOfficersInDIstricts + " officers in both districts");
        System.out.println("The average level in both districts is: " + sumOfAllLevels / 2);

        if (district1.averageLevelInTheDistrict() > district2.averageLevelInTheDistrict()) {
            System.out.println("The best district based on the average level is District 1.");
        } else {
            System.out.println("The best district based on the average level is District 2.");
        }

        allDistricts.remove(district1);

        System.out.println(officer1); //nothing happens when I remove district 1

    }
}


