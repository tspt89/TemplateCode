import java.util.Arrays;
import java.util.Collections;
public class SortDescending extends SortAlgorithm{


	public void compare(){
		System.out.println("Compare DESC");
	}

	public void sort(){
		Arrays.sort(arr, Collections.reverseOrder()); 
	}
}