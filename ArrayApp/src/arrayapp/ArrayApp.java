/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayapp;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[10];
        int min = 0; 
        int max=0;
        double average= 0;
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Please Enter a number of your choice: ");
            array[i] = console.nextInt();
            
            
        }
        min = arrayMin(array);
        max= arrayMax(array);
        average= average(array);
        
        System.out.println(Arrays.toString(array));
        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);
        System.out.println("The average value in the array is: " + average);
        reverse(array);
        System.out.println("Here is the reversed array: " + Arrays.toString(array));
    }

    public static int arrayMin(int[] array) {
        int min = 1000000000;
        for (int i = 0; i < 9 ;i++) {
            if (array[i] < min)
                min = array[i];

        }
        return min;
    }
    public static int arrayMax(int[] array) {
        int max = 0;
        for (int i = 0; i < 9 ;i++) {
             if (array[i] > max)
                max = array[i];

        }
        return max;
   }
    
    public static double average(int[] array) {
        int sum= 0;
        double average=0.0;
        for (int i = 0; i < 9 ;i++) {
            sum= sum + array[i];
                average = sum/10.0;

        }
        return average;
   }
    public static void reverse(int[] array) {
        int temp= 0;
        
        for (int i = 0; i < array.length/2 ;i++) {
            temp= array[array.length-1-i];
            array[array.length-1-i]=array[i];
            array[i]= temp;

        }
        
     
    }
}
