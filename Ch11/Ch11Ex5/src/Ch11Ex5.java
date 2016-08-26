/**
 * File: Ch11Ex5.java
 * ------------------
 * This program checks a sudoku solution for accuracy.
 * @author Brent Perry
 *
 */

import java.util.ArrayList;

import acm.program.*;

public class Ch11Ex5 extends ConsoleProgram {
	public void run() {
		int[][] sudoku1 = {{3, 9, 2, 4, 6, 5, 8, 1, 7},
						   {7, 4, 1, 8, 9, 3, 6, 2, 5},
						   {6, 8, 5, 2, 7, 1, 4, 3, 9},
						   {2, 5, 4, 1, 3, 8, 7, 9, 6},
						   {8, 3, 9, 6, 2, 7, 1, 5, 4},
						   {1, 7, 6, 9, 5, 4, 2, 8, 3},
						   {9, 6, 7, 5, 8, 2, 3, 4, 1},
						   {4, 2, 3, 7, 1, 9, 5, 6, 8},
						   {5, 1, 8, 3, 4, 6, 9, 7, 2}
		};
		int[][] sudoku2 = {{3, 9, 2, 4, 6, 5, 8, 1, 7},
						   {7, 4, 1, 8, 9, 3, 6, 2, 5},
						   {6, 8, 5, 2, 7, 1, 4, 3, 9},
						   {2, 5, 4, 1, 3, 7, 7, 9, 6},
						   {8, 3, 9, 6, 2, 7, 1, 5, 4},
						   {1, 7, 6, 9, 5, 4, 2, 8, 3},
						   {9, 6, 7, 5, 8, 2, 3, 4, 1},
						   {4, 2, 3, 7, 1, 9, 5, 6, 8},
						   {5, 1, 8, 3, 4, 6, 9, 7, 2}
		};
		
		println("This program checks the accuracy of a sudoku solution.");
		println("Sudoku 1: " + checkSudokuSolution(sudoku1));
		println("Sudoku 2: " + checkSudokuSolution(sudoku2)); 
		
	}
	
	private boolean checkSudokuSolution(int[][] array) {
		if (checkRow(array) && checkColumn(array) && checkAllGrids(array)) return true;
		return false;
	}
	
	private boolean checkRow(int[][] array) {
		int goodRows = 0;
		for (int i = 0; i < array.length; i++) {
			String row = "";
			for (int j = 0; j < array[0].length; j++) {
				if (!row.contains("" + array[i][j])) row += array[i][j];
			}
			if (row.length() == array[i].length) goodRows++;
		}
		if (goodRows == array.length) return true;
		return false;
	}
	
	private boolean checkColumn(int[][] array) {
		int goodColumns = 0;
		for (int i = 0; i < array[0].length; i++) {
			String column = "";
			for (int j = 0; j < array.length; j++) {
				if (!column.contains("" + array[j][i])) column += array[j][i];
			}
			if (column.length() == array.length) goodColumns++;
		}
		if (goodColumns == array[0].length) return true;
		return false;
	}
	
	private boolean checkAllGrids(int[][] array) {
		int goodBlocks = 0;
		for (int block = 0; block < 9; block++) {
			String cube = "";
			for (int i = block / 3 * 3; i < block / 3 * 3 + 3; i++) {
				for (int j = block % 3 * 3; j < block % 3 * 3 + 3; j++) {
					if(!cube.contains("" + array[i][j])) cube += array[i][j];
				}
			}
			if (cube.length() == 9) goodBlocks++;
		}
		if(goodBlocks == 9) return true;
		return false;
	}
	
	
	
}
