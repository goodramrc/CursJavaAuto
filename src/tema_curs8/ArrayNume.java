package tema_curs8;

import java.util.HashSet;

public class ArrayNume {

    String [] nume = {"Oana","Oana","Maria","Maria", "Bob", "Ion", "George", "Oana",
            "Bogdan", "Oana", "Ion","Oana"};

    public void findDuplicateNames () {

        HashSet<String> nameList = new HashSet<String>();
        HashSet<String> duplicateNames = new HashSet<String>();

        for (String numeDuplicat : nume) {
            if (!nameList.add(numeDuplicat)) {
                duplicateNames.add(numeDuplicat);
            }
        }

        for (String duplicateNameList : duplicateNames) {
            System.out.println("Numele duplicat este: " + duplicateNameList);
        }
    }
}
