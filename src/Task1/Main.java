package Task1;

import java.util.ArrayList;

public class Main {

        public static void main(String[] args) {

                Officer officer1 = new Officer("Paul", "McMillan", 23456, "District 1", 13);
                Officer officer2 = new Officer("Linda", "Smith", 34567, "District 19", 25);
                Officer officer3 = new Officer("Raul", "Wallaby", 45678, "District 88", 84);

                System.out.println(officer1.toString() + officer2 + officer3);

                ArrayList<Officer> district99 = new ArrayList<>();
                district99.add(officer1);
                district99.add(officer2);
                district99.add(officer3);

                int levelOneOfficerCount = 0;
                for (Officer off: district99)
                     {
                             if (off.calculatedLevel()==1)
                     {
                             ++levelOneOfficerCount;
                     }
                     }
                System.out.println("There are " + levelOneOfficerCount + " officers with level 2 in the district.");

                int levelMoreThanOneCounter = 0;
                for (Officer off1: district99)
                {
                if(off1.calculatedLevel()>1)
                {
                        ++levelMoreThanOneCounter;
                }
                }
                System.out.println("There are " + levelMoreThanOneCounter + " officers with a higher level than 1 on the district.");

                boolean isThereJohn = false;
                for (Officer off2: district99)
                {
                        if(off2.getName().equalsIgnoreCase("John"))
                        {
                                isThereJohn = true;
                                break;
                        }
                }
                if (isThereJohn)
                {
                        System.out.println("There is John in the district");
                }
                else
                {
                        System.out.println("There are no Johns on the force!");
                }
                }




}


