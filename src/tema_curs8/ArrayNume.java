package tema_curs8;

import java.util.HashSet;

public class ArrayNume {

    String [] nume = {"Maria", "Bob", "Ion", "George", "Oana",
            "Bogdan", "Oana", "Ion"};

    public void findDuplicateNames () {

        HashSet<String> nameList = new HashSet<String>();

        for (String numeDuplicat : nume) {
            if(!nameList.add(numeDuplicat)) {
                System.out.println("Numele duplicat este: " + numeDuplicat);
            }
        }
    }
}
