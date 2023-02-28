import java.util.Arrays;
import java.util.Collections;

public class Vetor {

	public static void main(String[] args) {
		
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		
		//float[] notas = new float[10];
		
		for (int i = 0; i< arr.length; i++) {
			System.out.println("Element at index " + i + ": " + arr[i]);
		}
		
		
		Integer[] numbers = {5, 45, 65 , 12, 50};
		
		Arrays.sort(numbers, Collections.reverseOrder());
		
		for (int num: numbers) {
			System.out.println(num);
		}
	}

}
