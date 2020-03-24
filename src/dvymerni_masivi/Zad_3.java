package dvymerni_masivi;

public class Zad_3 {

	private static final int sumG = 0;

	public static void sumColumn(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			int sumC = 0;
			for (int j = 0; j < arr.length; j++) {
				sumC = sumC + arr[i][j];
			}
			System.out.print("Сума по редове: " + sumC);
			System.out.println();
		}
	}

	public static void sumRow(int[][] arr) {
		for (int j = 0; j < arr.length; j++) {
			int sumR = 0;
			for (int i = 0; i < arr.length; i++) {
				sumR = sumR + arr[i][j];
			}
			System.out.print(sumR);
			System.out.println();
		}
	}

	public static void sumGlaven(int[][] arr) {
		int sumG = 0;
		for (int i = 0; i < arr.length; i++) {
			sumG = sumG + arr[i][i];
		}
		System.out.print(sumG + " ");
		System.out.println();
	}

	public static void sumVtori(int[][] arr) {
		int sumW = 0;
		for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
			sumW = sumW + arr[i][j];
		}
		System.out.print(sumW + " ");

	if(sumW==sumG){
		System.out.println("Магически");
	}
	}
	public static void main(String[] args) {
		int[][] arr = { 
				{ 16, 3, 2, 13 }, 
				{ 5, 10, 11, 8 }, 
				{ 9, 6, 7, 12 }, 
				{ 4, 15, 14, 1 } 
				};

		sumColumn(arr);
		sumRow(arr);
		sumGlaven(arr);
		sumVtori(arr);
	}
}