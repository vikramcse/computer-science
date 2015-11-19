class BinarySearch {
	public static void main(String args[]) {
		// For binary search the data must be sorted
		int[] A = {1,2,3,4,15,26,67,88,99};
		BinarySearch.search(A, 88);
	}

	public static void search(int[] A, int x) {
		// 1. Check if middle element has the search term
		// 2. if the search term is less than the mid element the search left
		// 3. else search right
		
		int low = 0;
		int high = A.length - 1;

		while(low <= high) {
			int mid = low + (high - low) / 2;
			if (A[mid] == x) {
				System.out.println("Element found at " + mid);
				break;
			}

			if (x < A[mid]) {
				high = mid;
			} else {
				low = mid;
			}
		}
	}
}