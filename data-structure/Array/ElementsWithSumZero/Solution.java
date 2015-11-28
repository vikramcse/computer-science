// find the two elements such that their sum is closest to zero
// {1, 60, -10, 70, -80, 85} -> program should print -80 and 85

import java.util.*;
class Solution {
	public static void main(String[] args) {
		int[] A = {1, 60, -10, 70, -80, 85};
		Solution.solve(A);
	}

	public static void solve(int[] A) {
		int min = A[0] + A[1];
		int len = A.length;
		int min_one = 0;
		int min_two = 0;

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				int sum = A[i] + A[j];
				// System.out.println(A[i] + " " + A[j] + " -> " + sum);
				if (Math.abs(min) > Math.abs(sum)) {
					min = sum;
					min_one = A[i];
					min_two = A[j];
				}
			}
		}
		System.out.println(min_one + " and " + min_two + " -> " + min);
	}
}