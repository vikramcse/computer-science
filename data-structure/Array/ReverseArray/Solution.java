import java.util.*;

class Solution {
	public static void main(String[] args) {
		int[] A = {1,2,3,4,5,6};
		// Solution.iterativeReverse(A);
		Solution.recursiveReverse(A);
	}

	public static void iterativeReverse(int[] A) {
		int i = 0;
		int len = A.length;
		int last = len;

		while (i < last) {
			int temp = A[last - 1];
			A[last - 1] = A[i];
			A[i] = temp;
			i++;
			last--;
		}

		System.out.println(Arrays.toString(A));
	}

	public static void recursiveReverse(int[] A) {
		recursiveReverseUtil(A, 0, A.length);
		System.out.println(Arrays.toString(A));
	}

	public static void recursiveReverseUtil(int[] A, int start, int end) {
		if (start >= end)
			return;

		int temp = A[end - 1];
		A[end - 1] = A[start];
		A[start] = temp;
		recursiveReverseUtil(A, start + 1, end - 1);
	}
}