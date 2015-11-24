// An element in a sorted array can be found in O(log n) time via binary search. 
// But suppose we rotate an ascending order sorted array at some pivot unknown to you beforehand. 
// So for instance, 1 2 3 4 5 might become 3 4 5 1 2. Devise a way to find an element in the rotated array in O(log n) time.

class Solution {
	public static void main(String[] args) {
		int[] A = {4, 5, 6, 7, 8, 9, 1, 2, 3};
		int element = 6;
		int mid = Solution.search(A, 0, A.length - 1, element);

		if (mid != -1)
			System.out.println("the element will be found at " + mid);
		else
			System.out.println("the element not found");
	}

	public static int search(int[] A, int low, int high, int element) {
		// if low cant be greater than high
		if (high < low)
			return -1;

		// find the mids
		int mid = (low + high) / 2;

		// if current mid == key then return mid
		if (A[mid] == element)
			return mid;

		// A[low] <= A[mid] means the array A[low ... mid] is sorted
		if (A[low] <= A[mid]) {

			// if the key lies in between the A[low] and A[high]
			// then search in between those range
			if (element >= A[low] && element <= A[mid]) {
				return search(A, low, mid - 1, element);
			}
			// else go to other half to search
			return search(A, mid + 1, high, element);	
		}

		// it the right part is sorted A[mid ... high]
		if (element >= A[mid] && element <= A[high]) {
			// if the key lies in between the A[mid] and A[high]
			// then search in between those range
			return search(A, mid + 1, high, element);
		}
		
		// else go to other half to search
		return search(A, low, mid - 1, element);
	}
}