package com.company.common;

public class Solution {
    public static int solution(int[] array) {
        int maxNum = 0;
        int increasingTheNumOfElements = 1;
        int departingTheNumOfElements = 1;
        for(int i = 0; i < array.length-1; i++) {
            if (array[i+1] > array[i]) {
                increasingTheNumOfElements ++;
                if (maxNum < departingTheNumOfElements)
                    maxNum = departingTheNumOfElements;
                departingTheNumOfElements = 1;
            }
            if (array[i+1] < array[i]) {
                departingTheNumOfElements ++;
                if (maxNum < increasingTheNumOfElements)
                    maxNum = increasingTheNumOfElements;
                increasingTheNumOfElements = 1;
            }
            if (array[i+1] == array[i]) {
                departingTheNumOfElements ++;
                increasingTheNumOfElements ++;
            }
        }
        if (departingTheNumOfElements > maxNum)
            maxNum = departingTheNumOfElements;
        if (increasingTheNumOfElements > maxNum)
            maxNum = increasingTheNumOfElements;
        return maxNum;
    }
}