// Given a set of non-negative integers, and a value sum, 
// determine if there is a subset of the given set with sum equal to given sum.
// Examples: set[] = {3, 34, 4, 12, 5, 2}, sum = 9
// Output:  True  There is a subset (4, 5) with sum 9.

class Solution {
	public static void main(String[] args) {
		int[] A = {3, 34, 4, 12, 5, 2};
		int sum = 9;
		int len = A.length;
		boolean ans = Solution.solveRecursive(A, len, sum);
		System.out.println("Sum " + sum + " found " + ans);
	}

	public static boolean solveRecursive(int[] A, int n, int sum) {
		// If the sum is zero means we got the elements
		if (sum == 0)
			return true;

		// If the array is empty then false
		if (n == 0 && sum != 0)
			return false;

		// If the current number in the array is greater than sum then
		// return false i.e 45 > 9. no chance 
		if (A[n - 1] > sum)
			solveRecursive(A, n - 1, sum);
		
		// 1. Include last element
		// 2. Exclude last elements
		return solveRecursive(A, n - 1, sum) || solveRecursive(A, n - 1, sum - A[n - 1]);
	}
}