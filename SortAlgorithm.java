import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public abstract class SortAlgorithm{

	public Integer[] arr = new Integer[100];

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
		for(int i=1; i <= 100; i++){
			System.out.printf("%3d ",arr[i-1]);
			if(i%10 == 0)
				System.out.println();
		}
	}

	public void processArray(){
		System.out.println("Process Array");
		Random r = new Random();
		for(int i=0; i<100; i++){
			arr[i] = r.nextInt(50);
		}


	}
}
