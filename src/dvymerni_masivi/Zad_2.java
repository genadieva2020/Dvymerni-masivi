package dvymerni_masivi;

import java.util.Scanner;

// Даден е двумерен масив 6х5, чиито стойности за въведени предварително.
// От клавиатурата се въвежда число v.
// Да се състави програма, с която се отпечатват двойките индекси на всички елементи от масива, 
// чиято стойност е по-малка от v.

public class Zad_2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Въведете число v = ");
		int v=scan.nextInt();
		int[][] arr = { 
				{ 48, 72, 13, 14, 15 }, 
				{ 21, 22, 53, 24, 75 }, 
				{ 31, 57, 33, 34, 35 }, 
				{ 41, 95, 43, 44, 45 },
				{ 59, 52, 53, 54, 55 }, 
				{ 61, 69, 63, 64, 65 } 
				};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]<v){
					System.out.println("["+i+"]["+j+"]");
				}
			}
	}
	}
}
