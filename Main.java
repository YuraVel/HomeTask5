package com.goit.online.mod5;

import java.util.Arrays;

/**
 * Created by pc on 10.06.2016.
 */
public class Main {

    public static void main(String[] args) {
        int[]arr={12,7,-77,9,9,13};
        System.out.println(ArrayAction.maxMin(arr));

        ArrayAction.sortArray(arr);
        System.out.printf(Arrays.toString(arr));

    }
}
