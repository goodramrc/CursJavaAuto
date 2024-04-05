package curs9;

import java.util.Arrays;
import java.util.Iterator;

public class TwoDimensionArray {

	public static void main(String[] args) {

		int[] numbers = {3, 6, 7, 2, 1};
		//	index		 0  1  2  3  4				
		System.out.println(numbers[1]);
		
		int[][] twoDimArray = { {4, 6, 3}, {0, 3, 2} };
		//index                 |   0  |    |   1  |
		//index                 0  1   2    0   1  2 
		
		System.out.println(twoDimArray[0][2]);
		System.out.println(twoDimArray[1][1]);
		
		/*                       Col0          col1        col2
		 *  textArray ---> row0  Brasov			Cluj 		Arad
		 * 
		 * 				   row 1 Paris			Roma		Berlin
		 * 
		 */
		String[][] orase =  new String[2][3];
		orase[0][0] = "Brasov";
		orase[0][1] = "Cluj";
		orase[0][2] = "Arad";

		orase[1][0] = "Paris";
		orase[1][1] = "Roma";
		orase[1][2] = "Berlin";

        System.out.println("-----------------------------------");
		int row = orase.length;
		System.out.println("Row " + row);
		int coloana = orase[1].length;
		System.out.println("Coloana : "+ coloana);
		
        System.out.println("-----------------------------------");

        for(int i =0; i<orase.length; i++) {
        	
        	System.out.println("row : " + Arrays.toString(orase[i])  );
        	
        	for(int j=0; j< orase[i].length; j++) {
        		
            	System.out.println("column : " + orase[i][j]  );

        	}
        }
        
        System.out.println("-----------------------------------");

        for(String[] rand : orase) {
        	
        	System.out.println("row : " + Arrays.toString(rand) );

        	for(String col : rand) {
        		
        		System.out.println("column : " + col);
        	}
        }

		Iterator <String[]> obj = Arrays.stream(orase).iterator();

		while (obj.hasNext()) {
			System.out.println("row : " + Arrays.toString(obj.next()) );
			String [] obj2 = obj.next();
			Iterator <String> obj3 = Arrays.stream(obj2).iterator();
			while (obj3.hasNext()) {
				System.out.println("column : " + obj3.next());
			}
		}
        
	}

}
