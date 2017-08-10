/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.ArrayList;

/**
 *
 * @author kailabillie
 */
public class Week3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4};
        int size = 3;
        int n = arr.length;
        Print(arr, n, size);

    }

   static void MakeCombinations(int arr[], int temp[], int start, int end, int index, int size) {
       
       ArrayList<int[]> allCombinations = new ArrayList<int[]>();
       
       int[] threeElements = new int[3];
       if (index == size) {
           for (int i = 0; i<size; i++) {
               System.out.print(temp[i] + " ");
               threeElements[i] = temp[i];
           }
           allCombinations.add(threeElements);
           System.out.println("");
           return;
       }
       for (int i = start; i <= end && end - i + 1 >= size - index; i++) {
           temp[index] = arr[i];
           MakeCombinations(arr, temp, i+1, end, index+1, size);
       }
       
       
   }
   
   static void Print(int arr[], int n, int size) {
       int temp[] = new int[size];
       MakeCombinations(arr, temp, 0, n-1, 0, size);
   }

}
