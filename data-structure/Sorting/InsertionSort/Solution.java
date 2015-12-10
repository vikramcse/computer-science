public class Solution {
    public static void sort(int[] a) {
        int n = a.length;
        for(int i = 1; i < n - 1; i++) {
            int key = a[i];
            int j = i - 1;
            
            while((j >= 0) && (a[j] > key)) {
                a[j + 1] = a[j];
                j--;
            }
            
            a[j + 1] = key;
        }
    }
    
    public static void print(int[] a) {
        for(int i : a)
            System.out.print(i + " ");
    }
    
    public static void main(String ss[]) {
        int[] a = {6, 3, 9, 8, 2, 7, 5};
        InsertionSort.sort(a);
        InsertionSort.print(a);
    }
}