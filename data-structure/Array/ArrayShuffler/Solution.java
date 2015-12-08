// Program to shuffel array.

import java.util.*;
class Solution {
    public static void main(String ss[]) {
        Random r = new Random();
        int[] array = {1,2,3,4,5,6};
        for (int i=0; i< array.length; i++) {
            int randomNumber = r.nextInt(array.length);
            int temp = array[i];
            array[i] = array[randomNumber];
            array[randomNumber] = temp;
        }
        
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }  
    }
}