// element is leader if it is greater than all the elements to its right side.
// For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.

import java.util.*;
class Solution {
	public static void main(String[] args) {
		int[] A = {16, 17, 4, 3, 5, 2};
		Solution.solve(A);
	}

	public static void solve(int[] A) {
		int len = A.length;
		System.out.print(A[len - 1] + " "); // last element is always a leader.

		for(int i = len - 2; i >=0; i--) {
			for (int j = i + 1; j < len; j++) {
				if (A[i] <= A[j]) {
					break;
				}
				if (j == len - 1) {
					System.out.print(A[i] + " ");
				}
			}
		}
	}
}