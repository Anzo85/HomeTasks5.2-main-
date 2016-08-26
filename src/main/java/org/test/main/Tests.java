package org.test.main;


import org.anzo.CheckArray;
import org.anzo.SumArray;

public class Tests {

    public static void main(String[] args) {

        int[] array1 = {1, 5, 7, 15};
        int[] array2 = {2, 4, 6,};

        SumArray.summary(array1, array2);

        System.out.println(CheckArray.result(array1));
    }
}
