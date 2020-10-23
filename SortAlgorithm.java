import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public abstract class SortAlgorithm{

	public int[] arr = new int[100];

	final void sortArray(){
		processArray();
		sort();
		compare();
		returnArray();
	}

	public void sort(){
		Arrays.sort(this.arr);
	}

	protected abstract void compare();

	public void returnArray(){
		System.out.println("Print array:");
		
	}

	public void processArray(){
		System.out.println("Process Array");
		Random r = new Random();
		for(int i=0; i<100; i++){
			arr[i] = r.nextInt();
		}


	}
}
