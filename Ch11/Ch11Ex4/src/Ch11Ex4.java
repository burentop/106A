/**
 * File: Ch11Ex4.java
 * ------------------
 * This program tests whether or not a multi-dimensional array is a "magic square"
 * (all rows, columns and diagonals add up to the same value).
 * @author Brent Perry
 *
 */

import acm.program.*;

public class Ch11Ex4 extends ConsoleProgram {
	public void run() {
		int[][] array1 = {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
		int[][] array2 = {{2, 4, 5}, {2, 5, 1}, {9, 4, 7}};
		int[][] array3 = {{16, 3, 2, 13}, {5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15, 14, 1}};
		
		println("This program will test two multi-dimensional arrays,");
		println("to see if they are magic squares.");
		println("Array 1: " + isMagicSquare(array1));
		println("Array 2: " + isMagicSquare(array2));
		println("Array 3: " + isMagicSquare(array3));
	
	}
	
	private boolean isMagicSquare(int[][] array) {
		return isRows(array) && isColumns(array) && isDiagonal(array) && (sumFirstRow == sumFirstColumn && sumFirstColumn == sumDiag1);
	}
	
	private boolean isRows(int[][] array) {
		sumFirstRow = 0;
		for (int i = 0; i < array[0].length; i++) {
			sumFirstRow += array[0][i];
		}
		for (int i = 1; i < array.length; i++) {
			int sumRow = 0;
			for (int j = 0; j < array[0].length; j++) {
				sumRow += array[i][j];
			}
			if (sumRow != sumFirstRow) return false;
		}
		return true;
	}
	
	private boolean isColumns(int[][] array) {
		sumFirstColumn = 0;
		for (int i = 0; i < array.length; i++) {
			sumFirstColumn += array[i][0];
		}
		for (int i = 1; i < array[0].length; i++) {
			int sumRow = 0;
			for (int j = 0; j < array.length; j++) {
				sumRow += array[j][i];
			}
			if (sumRow != sumFirstColumn) return false;
		}
		return true;
	}
	
	private boolean isDiagonal(int[][] array) {
		sumDiag1 = 0;
		for (int i = 0; i < array.length; i++) {
			sumDiag1 += array[i][i];
		}
		int sumDiag2 = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			sumDiag2 += array[i][i];
		}
		if (sumDiag1 == sumDiag2) return true;
		return false;
	}
	
	private int sumFirstColumn;
	private int sumFirstRow;
	private int sumDiag1;
}
