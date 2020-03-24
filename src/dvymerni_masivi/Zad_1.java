package dvymerni_masivi;

// Даден е двумерен масив 6x5, чиито стойности са въведени предварително.
// Да се състави програма, която извежда най-големият и най-малкият елемент на масива.

public class Zad_1 {
	public static void min(int[][] arr) {
		int min = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
			}
		}
		System.out.println("Minimalen element: " + min);
	}

	public static void max(int[][] arr) {
		int max = arr[0][0];
		for (int k = 0; k < arr.length; k++) {
			for (int m = 0; m < arr[k].length; m++) {
				if (arr[k][m] > max) {
					max = arr[k][m];
				}
			}
		}
		System.out.println("Maksimalen element: " + max);
	}

	public static void main(String[] args) {
		int[][] arr = { 
				{ 48, 72, 13, 14, 15 }, 
				{ 21, 22, 53, 24, 75 }, 
				{ 31, 57, 33, 34, 35 }, 
				{ 41, 95, 43, 44, 45 },
				{ 59, 52, 53, 54, 55 }, 
				{ 61, 69, 63, 64, 65 } 
				};
		min(arr);
		max(arr);
	}
}
