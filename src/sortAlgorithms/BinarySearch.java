package sortAlgorithms;

public class BinarySearch {
	
	public static int binarySearch(int[] arr, int start, int end, int key) {

		if (start <= end) {
			int mid = (int) Math.floor((start + end) / 2);
			if (arr[mid] < key) {
				binarySearch(arr, start, mid - 1, key);
			} else if (arr[mid] > key) {
				binarySearch(arr, mid + 1, end, key);
			} else {
				return mid;
			}
		} else {
			return -1;
		}
		return 0;
	}

}
