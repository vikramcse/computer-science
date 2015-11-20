// Find the Number Occurring Odd Number of Times
class Solution {
	public static void main(String args[]) {
		int[] A = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
		// Solution.findOdd(A);
		Solution.findOddByExOR(A);
	}

	public static void findOdd(int[] A) {
		int len = A.length;
		for (int i = 0; i < len; i++) {
			int count = 0;
			int item = A[i];
			for (int j = 0; j < len; j++) {
				if(item == A[j]) {
					count++;
				}
			}
			if(count % 2 != 0) {
				System.out.println("Odd element found " + item);
				break;
			}
		}
	}

	public static void findOddByExOR(int[] A) {
		int x = 0;
		for (int i = 0; i < A.length; i++) {
			x = x ^ A[i];
		}
		if (x != 0)
			System.out.println("Odd element found " + x);
	}
}