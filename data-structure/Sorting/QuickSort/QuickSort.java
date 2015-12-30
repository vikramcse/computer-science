class QuickSort {
    
    public static void sort(int[] a, int low, int high) {
        int index = partition(a, low, high);
        if(low < index - 1) sort(a, low, index - 1);
        if(index < high) sort(a, index, high);
    }
    
    public static int partition(int[] a, int l, int h) {
        int pivot = a[l];
        
        while(l <= h) {
            
            while(a[l] < pivot) l++;
            
            while(a[h] > pivot) h--;
            
            if(l <= h) {
                swap(a, l, h);
                l++;
                h--;
            }
        }
        
        return l;
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
        int[] a = {4, 3, 5, 2, 1};
        QuickSort.sort(a, 0, a.length - 1);
        QuickSort.print(a);
    }
}