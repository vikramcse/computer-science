/* given an array A[] of n numbers and another number x,
 * determines whether or not there exist two elements in S whose sum is exactly x
*/
import java.util.*;
class Solution {
	public static void main(String ss[]) {
		int[] A = {1, 4, 45, 6, 10, -8};
		Solution.solveByLeftRight(A, 46);
		Solution.solveByHashing(A, 46);
	}

	public static void solveByLeftRight(int[] A, int x) {
		// 1. sort the numbers
		// 2. add first and last numbers and if the sum is less than X then left++ else right--
		// 3. O(nlogn) for sorting + O(n) for searching number = O(nlogn)
		Arrays.sort(A);
		int len = A.length;
		int i = 0, j = len - 1;
		while(i < j) {
			int sum = A[i] + A[j];
			if(sum == x) {
				System.out.println("Found elements " + A[i] + " " + A[j]);
				return;
			}
			if(sum < x)
				i++;
			else
				j--;
		}
	}

	public static void solveByHashing(int[] A, int x) {
		// 1. I am not using HashMap here insted using boolean array
		// 2. Iterate through each number and check if A[x - A[i]] is set or not
		// 3. O(n) time complexity and O(n) space complexity for storing Map

		int len = A.length;
		boolean[] array = new boolean[1000];

		for(int i = 0; i < len; i++) {
			int check = x - A[i];
			if(check > 0 && array[check]) {
				System.out.println("The elements are " + A[i] + ", " + (x - A[i]));
				break;
			} else {
				array[A[i]] = true;
			}
		}
	}
}