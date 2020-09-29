package sortAlgorithms;

public class InsertionSort {

	public static void insertionSort(int[] arr) {

		int n = arr.length;

		for (int i = 1; i < n; ++i) {
			int p = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > p) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}

			arr[j + 1] = p;
		}
	}
}
