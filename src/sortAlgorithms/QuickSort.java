package sortAlgorithms;

public class QuickSort {
	
	public static void quickSort(int[]arr, int left, int right) {
		if(left < right) {
			int p = partition(arr, left, right);
			quickSort(arr, left, p - 1);
			quickSort(arr, p + 1, right);
		}
	}
	
	public static int partition(int[] arr, int left, int right) {
		int pivot = arr[right];
		int i = left - 1;
		
		for (int j = left; j <= right - 1; j++) {
			if (arr[j] <= pivot) {
				
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i + 1];
		arr[i + 1] = arr[right];
		arr[right] = temp;
		
		return i + 1;
	}
}
