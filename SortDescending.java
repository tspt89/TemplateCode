public class SortDescending extends SortAlgorithm{

	
	public void sort(){
		int last = arr.length - 1;
    	int middle = arr.length / 2;
    	for (int i = 0; i <= middle; i++) {
      		int temp = arr[i];
      		arr[i] = arr[last - i];
      		arr[last - i] = temp;
      	}
	}
}