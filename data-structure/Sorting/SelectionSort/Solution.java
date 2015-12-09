// Selection sort: In each iteration it finds min element and swaps with current one
// it has complexity O(n^2)

class Solution {
    public static void sort(int[] a) {
        int n = a.length;
        for(int i = 0; i < n; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if(a[min] > a[j]) {
                    min = j;
                }
            }
            swap(a, i, min);
        }
        
        print(a);
    }
    
    
    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public static void print(int[] a) {
        for(int i : a)
            System.out.print(i + " ");
    }
    public static void main(String ss[]) {
        int[] a = {4 ,5, 8, 1, 7, 55, 0, 78, 8};
        Solution.sort(a);
    }
}