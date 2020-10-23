import java.util.Scanner;
import java.util.Random;

public abstract class SortAlgorithm{

	public int[] arr = new int[100];

	final void sortArray(){
		processArray();
		sort();
		compare();
		returnArray();
	}

	public abstract void sort();

	protected void compare(){
		System.out.println("Compare array");
	}

	public void returnArray(){
		System.out.println("Print array: ");
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}

	public void processArray(){
		Scanner sc = new Scanner(System.in);

		Random r = new Random();
		for(int i=0; i<100; i++){
			arr[i] = r.nextInt();
		}


	}
}
