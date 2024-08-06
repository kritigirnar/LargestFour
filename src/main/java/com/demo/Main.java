package com.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Integer arr[] = {4, 5, -2, 3, 1, 2, 6, 6};
        int result = calculateSumForLargestFour(arr);
        System.out.println("Sum of the four largest elements: " + result);
    }

    private static int calculateSumForLargestFour(Integer[] arr) {

        List<Integer> intList = Arrays.asList(arr);
        Collections.sort(intList, Collections.reverseOrder());
        int sum = 0;

        if (intList.size() <= 4) {
            return intList.stream().mapToInt(Integer::intValue).sum();
        }

        for (int i = 0; i < 4; i++) {
            sum += intList.get(i);
        }

        return sum;

    }


}