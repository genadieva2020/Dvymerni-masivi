package dvymerni_masivi;
//Зад.4. Даден е едномерен масив. Да се напише програма, която извежда броя на цифрите на получената сума.
public class Zad_4 {

	public static void main(String[] args) {
		int[] arr={13, 14, 25, 16, 55, 97, 900};

		
		int sum=0;
		int broqch=0;
		
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
			
		}
		while(sum>0){
			sum=sum/10;
			broqch++;
		}

		System.out.print(broqch);
}
	}
