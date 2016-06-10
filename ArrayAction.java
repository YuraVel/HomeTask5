package com.goit.online.mod5;

/**
 * Created by pc on 10.06.2016.
 */
public class ArrayAction {


    public static String maxMin(int[] a) {
        int min = a[0];

        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];

            }
            if (max < a[i]) {
                max = a[i];
            }
        }
        return "Max number is " + max + "              Min number is " + min;
    }




    public static void sortArray(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int min_i = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }


    }
}
