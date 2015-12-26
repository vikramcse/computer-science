
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
		merge(arr, aux, low, mid, high);
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

	public static void main(String[] args) {
		int[] a = {5,8,6,4,3,7,9,2,1};
        MergeSort.sort(a);
        for (int k = 0; k < a.length; k++)
            System.out.print(a[k] + " ");
	}
}