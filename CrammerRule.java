// Creator: Gagan Marwah
// Inspiration: MA106 Linear Algebra revision
// Aim: Create a program that can provide a solution to a 3x3 matrix using Crammers rule

import java.util.*;

class CrammerRule {
	public static void main(String[] args) {
		
		int integer;
		
		int[] row1 = new int[3];
		int row1Counter = 0;
		
		int[] row2 = new int[3];
		int row2Counter = 0;
		
		int[] row3 = new int[3];
		int row3Counter = 0;
		
		int[] ansCol = new int[3];
		int ansColCounter = 0;
		
		int detA = 0;
		int detX = 0;
		int detY = 0;
		int detZ = 0;
		
		// User input variables
		Scanner firstRow = new Scanner(System.in);
		Scanner secondRow = new Scanner(System.in);
		Scanner thirdRow = new Scanner(System.in);
		Scanner AnswerColumn = new Scanner(System.in);
		
		// User inputs the values into the matrix
		System.out.println("Enter the a11 element of your 3x3 matrix:");
		integer = firstRow.nextInt();
		row1[row1Counter] = integer;
		row1Counter++;
		System.out.println( );
		
		System.out.println("Enter the a12 element of your 3x3 matrix:");
		integer = firstRow.nextInt();
		row1[row1Counter] = integer;
		row1Counter++;
		System.out.println( );
		
		System.out.println("Enter the a13 element of your 3x3 matrix:");
		integer = firstRow.nextInt();
		row1[row1Counter] = integer;
		row1Counter++;
		System.out.println( );

		System.out.println("Enter the a21 element of your 3x3 matrix:");
		integer = secondRow.nextInt();
		row2[row2Counter] = integer;
		row2Counter++;
		System.out.println( );
		
		System.out.println("Enter the a22 element of your 3x3 matrix:");
		integer = secondRow.nextInt();
		row2[row2Counter] = integer;
		row2Counter++;
		System.out.println( );
		
		System.out.println("Enter the a23 element of your 3x3 matrix:");
		integer = secondRow.nextInt();
		row2[row2Counter] = integer;
		row2Counter++;
		System.out.println( );

		System.out.println("Enter the a31 element of your 3x3 matrix:");
		integer = thirdRow.nextInt();
		row3[row3Counter] = integer;
		row3Counter++;
		System.out.println( );
		
		System.out.println("Enter the a32 element of your 3x3 matrix:");
		integer = thirdRow.nextInt();
		row3[row3Counter] = integer;
		row3Counter++;
		System.out.println( );
		
		System.out.println("Enter the a33 element of your 3x3 matrix:");
		integer = thirdRow.nextInt();
		row3[row3Counter] = integer;
		row3Counter++;
		System.out.println( );
		
		// User enters values for the Answer Column

		System.out.println("Enter the c11 element of your Answer Column:");
		integer = AnswerColumn.nextInt();
		ansCol[ansColCounter] = integer;
		ansColCounter++;
		System.out.println( );
		
		System.out.println("Enter the c21 element of your Answer Column:");
		integer = AnswerColumn.nextInt();
		ansCol[ansColCounter] = integer;
		ansColCounter++;
		System.out.println( );
		
		System.out.println("Enter the c31 element of your Answer Column:");
		integer = AnswerColumn.nextInt();
		ansCol[ansColCounter] = integer;
		ansColCounter++;
		System.out.println( );
		
		System.out.println("########################### RESULT ###########################");

		System.out.println(" ");
		System.out.println("########################### YOUR MATRIX ######################");

		for(int i = 0; i<3; i++){
			System.out.print("|");
			System.out.print(row1[i]);
			System.out.print("|");
		}
		
		System.out.println( );

		for(int j = 0; j<3; j++){
			System.out.print("|");
			System.out.print(row2[j]);
			System.out.print("|");		
		}
		
		System.out.println( );

		for(int k = 0; k<3; k++){
			System.out.print("|");
			System.out.print(row3[k]);		
			System.out.print("|");
		}

		System.out.println(" ");
		System.out.println("########################### YOUR ANSWER COLUMN ###############");
		
		System.out.println("|" + ansCol[0] + "|");
		System.out.println("|" + ansCol[1] + "|");
		System.out.println("|" + ansCol[2] + "|");
		
		System.out.println("########################### OUTCOME ##########################");
		
		// Determinant calculated by getting the cofactors and multiplying it by their respective 2x2 matrix
		detA = (row1[0]*((row2[1]*row3[2])-(row2[2]*row3[1])))-(row1[1]*((row2[0]*row3[2])-(row2[2]*row3[0])))+(row1[2]*((row2[0]*row3[1])-(row2[1]*row3[0])));
		
		// Using Crammers rule for finding the determinant of X, Y & Z
		detX = (ansCol[0]*((row2[1]*row3[2])-(row2[2]*row3[1])))-(row1[1]*((ansCol[1]*row3[2])-(row2[2]*ansCol[2])))+(row1[2]*((ansCol[1]*row3[1])-(row2[1]*ansCol[2])));
		detY = (row1[0]*((ansCol[1]*row3[2])-(row2[2]*ansCol[2])))-(ansCol[0]*((row2[0]*row3[2])-(row2[2]*row3[0])))+(row1[2]*((row2[0]*ansCol[2])-(ansCol[1]*row3[0])));
		detZ = (row1[0]*((row2[1]*ansCol[2])-(ansCol[1]*row3[1])))-(row1[1]*((row2[0]*ansCol[2])-(ansCol[1]*row3[0])))+(ansCol[0]*((row2[0]*row3[1])-(row2[1]*row3[0])));
		
		System.out.println("This is the determinant of your 3x3 matrix: " + detA);
		System.out.println(" ");
		
		// Final step of Crammers rule
		System.out.print("Solution: ");
		System.out.print("x = " + detX/detA + ", ");
		System.out.print("y = " + detY/detA + ", ");
		System.out.println("z = " + detZ/detA);
		
		System.out.println("##############################################################");
	}
}