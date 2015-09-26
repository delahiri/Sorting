
public class QuickSort {

	public static void main(String[] args) {
		int a[] = {2,2,3,7,4,9,1,7,4,9,0,3};
		quickSort(a, 0, a.length-1);
		for(int n:a)
			System.out.println(n);

	}
	
	
	static void quickSort(int arr[], int start, int end)
	{
	      int i = start, j = end;
	      int tmp;
	      int pivot = arr[(i + end) / 2];
	     
	      while (i <= j) {
	            while (arr[i] < pivot)
	                  i++;
	            while (arr[j] > pivot)
	                  j--;
	            if (i <= j) {
	                  tmp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = tmp;
	                  i++;
	                  j--;
	            }
	      }
	     
	      if(start < i-1)
	      {
	    	  quickSort(arr, start, i-1);
	      }
	      if(end>j)
	      {
	    	  quickSort(arr, i, end);
	      }
	    	  
	}
	 
	


}
