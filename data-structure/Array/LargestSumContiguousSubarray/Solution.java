// sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum.
// if the array is {-2, -3, 4, -1, -2, 1, 5, -3} then the latgest sum contiguous subarray is 7

import java.util.*;
class Solution {
	public static void main(String[] args) {
		int[] A = {-2, -3, 4, -1, -2, 1, 5, -3};
		Solution.solveDP(A);
	}

	public static void solveDP(int[] A) {
		int len = A.length;
		int max = -1;
		int[] dp = new int[len];

		if (A[0] < -1)
			dp[0] = 0;
		else
			dp[0] = A[0];

		for (int i = 1; i < len; i++) {
			int temp = A[i] + dp[i - 1];
			if (temp < 0) {
				dp[i] = 0;
			} else {
				dp[i] = temp;
			}
		}

		for (int i = 0; i < dp.length; i++) {
			if(max < A[i])
				max = dp[i];
		}

		if (max != -1)
			System.out.println("Max sum is " + max);
	}
}