class Solution {
    public static void sort(int[] a) {
        int size = a.length;
        // go through all passes
        for (int pass = 0; pass <= size - 1; pass++) {
            // as at each pass the largest element is at its respective position
            // so for that we dont need to re scan that position again
            // thats why (size - pass) is there
            for (int i = 0; i <= size - pass - 2; i++) {
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                }
            }
        }
        
        print(a);
    }
    
    public static void sortEfficient(int[] a) {
        int size = a.length;
        // go through all passes
        for (int pass = 0; pass <= size - 1; pass++) {
            // The falg will track that if the elements are not swaped then
            // the further elements are already sorted
            // so dont need to go further
            boolean flag = false;
            for (int i = 0; i <= size - pass - 2; i++) {
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                    flag = true;
                }
            }
            // if flag is false i.e array is sorted (no swaps) then break;
            if (!flag)
                break;
        }
        
        print(a);
    }
    
    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public static void print(int[] a) {
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }
    
    public static void main(String ss[]) {
        int[] array = {4, 8, 6, 1, 7, 10, 88, 9, 2};
        Solution.sortEfficient(array);
    }
}