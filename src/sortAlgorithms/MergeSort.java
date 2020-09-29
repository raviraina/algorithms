package sortAlgorithms;

import java.*;

public class MergeSort {

	public static void mergeSort(int[] arr, int left, int right) {
		
		// check conditions and sort
		if (left < right) {
			int mid = (int) Math.floor((left + right) / 2);
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, right, mid);
		}
	}

	static void merge(int[] arr, int l, int r, int m) {
		
		// initialize size of each subarray and initialize temps
		int n1 = m - l + 1;
		int n2 = r - m;
		int L[] = new int[n1];
		int R[] = new int[n2];

		// copy elements into temps
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		// initialize subarry indicies
		int i = 0;
		int j = 0;

		// sort
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// copy remaining elements for left and right subarrys
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}

	}

}
