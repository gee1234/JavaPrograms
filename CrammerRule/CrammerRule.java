// Creator: Gagan Marwah
// Inspiration: MA106 Linear Algebra revision
// Aim: Create a program that can provide a solution to a 3x3 matrix using Crammers rule

import java.util.*;

class CrammerRule {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		long[][] matrix = new long[3][3];
		long[] answers = new long[3];
		
		// Get matrix of coefficients -D
		for(int row = 0; row < 3; row++){
			for(int column = 0; column < 3; column++){
				System.out.print("Enter the a" + (row+1) + (column+1) + " element of your 3x3 matrix:");
				matrix[row][column] = input.nextLong();
				System.out.println();
			}
		}
		
		// Get answer column -D
		for(int row = 0; row < 3; row++){
			System.out.print("Enter the c" + (row+1) + "1 element of your answer column matrix:");
			answers[row] = input.nextLong();
			System.out.println();
		}
		
		long detA, detX, detY, detZ = 0;
		detA = detX = detY = detZ = 0;
		
		System.out.println("########################### RESULT ###########################\n\n");
		System.out.println("########################### YOUR MATRIX ######################");

		for(int i = 0; i<3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print("|");
				System.out.print(matrix[i][j]);
				System.out.print("|");
			}
			System.out.println();
		}

		System.out.println("\n########################### YOUR ANSWER COLUMN ###############");
		
		System.out.println("|" + answers[0] + "|");
		System.out.println("|" + answers[1] + "|");
		System.out.println("|" + answers[2] + "|");
		
		System.out.println("\n########################### OUTCOME ##########################");
		
		long[] row1 = new long[3];
		long[] row2 = new long[3];
		long[] row3 = new long[3];
		long[] ansCol = new long[3];
		
		// Copied original variables into your variable names -D
		for(int i = 0; i < 3; i++){
			row1[i] = matrix[0][i];
			row2[i] = matrix[1][i];
			row3[i] = matrix[2][i];
			ansCol[i] = answers[i];
		}
		
		// Determinant calculated by getting the cofactors and multiplying it by their respective 2x2 matrix
		detA = (row1[0]*((row2[1]*row3[2])-(row2[2]*row3[1])))-(row1[1]*((row2[0]*row3[2])-(row2[2]*row3[0])))+(row1[2]*((row2[0]*row3[1])-(row2[1]*row3[0])));
		
		// Using Crammers rule for finding the determinant of X, Y & Z
		detX = (ansCol[0]*((row2[1]*row3[2])-(row2[2]*row3[1])))-(row1[1]*((ansCol[1]*row3[2])-(row2[2]*ansCol[2])))+(row1[2]*((ansCol[1]*row3[1])-(row2[1]*ansCol[2])));
		detY = (row1[0]*((ansCol[1]*row3[2])-(row2[2]*ansCol[2])))-(ansCol[0]*((row2[0]*row3[2])-(row2[2]*row3[0])))+(row1[2]*((row2[0]*ansCol[2])-(ansCol[1]*row3[0])));
		detZ = (row1[0]*((row2[1]*ansCol[2])-(ansCol[1]*row3[1])))-(row1[1]*((row2[0]*ansCol[2])-(ansCol[1]*row3[0])))+(ansCol[0]*((row2[0]*row3[1])-(row2[1]*row3[0])));
		
		System.out.println("This is the determinant of your 3x3 matrix: " + detA);
		System.out.println(" ");
		
		// Check detA != 0 -D
		if(detA == 0){
			System.out.println("Determinent is 0, cannot calculate");
		} else {
		
			// Final step of Crammers rule
			System.out.print("Solution: ");
			System.out.print("x = " + detX/detA + ", ");
			System.out.print("y = " + detY/detA + ", ");
			System.out.println("z = " + detZ/detA);
		}
		
		System.out.println("##############################################################");
	}
}
