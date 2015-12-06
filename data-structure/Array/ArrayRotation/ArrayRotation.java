// http://www.geeksforgeeks.org/array-rotation/

import java.util.*;

class ArrayRotation {
    
    public void solveM1(int[] a, int d) {
        // create a temp array for storing d elements
        int[] temp = new int[d];
        int n = a.length;
        
        for(int i = 0; i < d; i++) {
            temp[i] = a[i];
        }
        
        // shift the remaining elements
        for(int i = d; i < n; i++) {
            a[i - d] = a[i]; 
        }
        
        int j = 0;
        for(int i = n - d; i < n; i++) {
            a[i] = temp[j++];
        }
        
        System.out.println(Arrays.toString(a));
    }

    public static void main(String ss[]) {
        int[] A = {1,2,3,4,5,6,7};
        new ArrayRotation().solveM1(A, 6);
    }
}