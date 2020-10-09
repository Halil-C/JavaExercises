package Chapter8;

import java.util.Scanner;

public class Exercise08_23 {
	 public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);

	        System.out.println("Enter a 6-by-6 matrix row by row: ");
	        int[][] m = new int[6][6];
	        for (int i = 0; i < m.length; i++)
	            for (int j = 0; j < m[i].length; j++)
	                m[i][j] = input.nextInt();

	        int invalidRow = -1;
	        for (int i = 0; i < m.length; i++) {
	            if (!rowHasEvenOnes(m, i)) {
	                invalidRow = i;
	                break;
	            }
	        }
	        int invalidColumn = -1;
	        for (int i = 0; i < m[0].length; i++) {
	            if (!columnHasEvenOnes(m, i)) {
	                invalidColumn = i;
	                break;
	            }
	        }

	        if (invalidColumn != -1 && invalidRow != -1) {
	            System.out.println("The flipped cell is at (" +invalidRow +", " + invalidColumn + ")" );
	        }



	    }



	    public static boolean rowHasEvenOnes(int[][] m, int row) {

	        int count = 0;
	        for (int j = 0; j < m[row].length; j++) {

	            if (m[row][j] == 1) count++;
	        }

	        return (count % 2 == 0 && count != 0);
	    }

	    public static boolean columnHasEvenOnes(int[][] m, int column) {

	        int count = 0;
	        for (int i = 0; i < m.length; i++) {

	            if (m[i][column] == 1) count++;
	        }

	        return (count % 2 == 0 && count != 0);
	    }



}
