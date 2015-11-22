class Solution {
	public static void main(String ss[]) {
		int[] A = {1, 2, 4 ,6, 3, 7, 8};
		Solution.find(A);
	}

	public static void find(int[] A) {
		int n = A.length;

		// Actual formula is n*(n-1)/2 but one no is missing
		// therefore adding one
		int formulaSum = (n + 1) * (n + 2) / 2;

		for(int i = 0; i < n; i++) {
			formulaSum = formulaSum - A[i];
		}

		System.out.println("the missing number is " + formulaSum);
	}
}