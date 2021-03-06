package Task3;

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

        District district1 = new District("District 1", "Riga", 1, new ArrayList<Officer>());
        District district2 = new District("District 2", "Ventspils", 2, new ArrayList<Officer>());

        Lawyer lawyer1 = new Lawyer("Henn", "Essy", 123, 34);
        Lawyer lawyer2 = new Lawyer("Ara", "Rats", 234, 47);
        Lawyer lawyer3 = new Lawyer("Jean Paul", "Chenet", 567, 11);

        district1.addNewOfficer(officer1);
        district1.addNewOfficer(officer2);
        district1.addNewOfficer(officer3);

        district2.addNewOfficer(officer4);
        district2.addNewOfficer(officer5);
        district2.addNewOfficer(officer6);
        district2.addNewOfficer(officer7);

        System.out.println("District 1 information: " + district1);
        System.out.println("District 2 information: " + district2);

        System.out.println("Lawyer one information: " + lawyer1);
        System.out.println("Lawyer two information: " + lawyer2);
        System.out.println("Lawyer three information: " + lawyer3);

        ArrayList<Lawyer> allLawyers = new ArrayList<>();
        allLawyers.add(lawyer1);
        allLawyers.add(lawyer2);
        allLawyers.add(lawyer3);

        int sumOfCrimesHelpedSolving = 0;
        for (Lawyer law: allLawyers)
        {
        sumOfCrimesHelpedSolving = sumOfCrimesHelpedSolving + law.getHelpedInCrimesSolving();
        }
        System.out.println("The total of crimes helped to solve is " + sumOfCrimesHelpedSolving);

        int largestNumberHelpedToSolve = Integer.MIN_VALUE;
        Lawyer bestLawyer = null;
        for (Lawyer law: allLawyers)
        {
        if (law.getHelpedInCrimesSolving()>largestNumberHelpedToSolve)
        {
            bestLawyer = law;
            largestNumberHelpedToSolve = law.getHelpedInCrimesSolving();
        }
        }
        System.out.println("The lawyer with the largest number of crimes helped in solveing is " + bestLawyer.getSurname());

    }
}


