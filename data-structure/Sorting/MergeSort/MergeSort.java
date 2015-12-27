import java.util.*;

// Merge Sort implementation in Java
class MergeSort {
	public static void sort(int[] arr) {
		int len = arr.length;
		int[] aux = new int[len];
		sort(arr, aux, 0, len - 1);
	}

	public static void sort(int[] arr, int[] aux, int low, int high) {
		if(low >= high)
			return;

		// for finding the middle of array
		int mid = low + ((high - low) / 2);

		// sorting
		sort(arr, aux, low, mid);
		sort(arr, aux, mid + 1, high);

		// merging
		// merge(arr, aux, low, mid, high);
		mergeIterative(arr, low, mid, high);
	}

	public static void merge(int[] arr, int[] aux, int low, int mid, int high) {
		for(int i = 0; i < arr.length; i++)
			aux[i] = arr[i];

		int i = low;
		int j = mid + 1;

		for(int k = low; k <= high; k++) {
			if(i > mid) {
				arr[k] = aux[j];
				j++;
			} else if(j > high) {
				arr[k] = aux[i];
				i++;
			} else if(aux[j] < aux[i]) {
                arr[k] = aux[j];
                j++;
			} else {
                arr[k] = aux[i];
                i++;
            }
		}
	}

	public static void mergeIterative(int[] arr, int low, int mid, int high) {
		// length og first half +1 for counting mid element
		int n1 = mid - low + 1;

		// length og second half
		int n2 = high - mid;

		// Create two temp array Left and Right
		int[] L = new int[n1];
		int[] R = new int[n2];

		// Copy data to temp arrays L[] and R[]
		for(int i = 0; i < n1; i++) {
			L[i] = arr[low + i];
		}

		for(int i = 0; i < n2; i++) {
			R[i] = arr[mid + i + 1];
		}

		// System.out.println(Arrays.toString(L));
		int i = 0;
	    int j = 0;
	    int k = low;

	    while(i < n1 && j < n2) {
	    	if(L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
	    	} else {
	    		arr[k] = R[j];
				j++;
	    	}
	    	k++;
	    }

	    /* Copy the remaining elements of L[], if there are any */
	    while (i < n1) {
	        arr[k] = L[i];
	        i++;
	        k++;
	    }
	 
	    /* Copy the remaining elements of R[], if there are any */
	    while (j < n2) {
	        arr[k] = R[j];
	        j++;
	        k++;
	    }

	}

	public static void main(String[] args) {
		int[] a = {5,8,6,4,3,7,9,2,1};
        MergeSort.sort(a);
        for (int k = 0; k < a.length; k++)
            System.out.print(a[k] + " ");
	}
}