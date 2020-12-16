package com.company.common;

import com.company.common.Solution.solution;

public class Tests {
    public static boolean test1GetMaxIncreaseOrDescent() {
        int array[] = new int[]{6,5,7,5,3,3};
        int result = solution(array);
        if (3 == result)
            return true;
        else
            return false;
    }

    public static boolean test2GetMaxIncreaseOrDescent() {
        int array[] = new int[]{6,5,4,7,5,34,2,6,4,10};
        int result = solution(array);
        if (3 == result)
            return true;
        else
            return false;
    }

    public static boolean test3GetMaxIncreaseOrDescent() {
        int array[] = new int[]{5,5,5};
        int result = solution(array);
        if (3 == result)
            return true;
        else
            return false;
    }

    public static boolean test4GetMaxIncreaseOrDescent() {
        int array[] = new int[]{5,6,7,8,3,2};
        int result = solution(array);
        if (4 == result)
            return true;
        else
            return false;
    }

    public static boolean test5GetMaxIncreaseOrDescent() {
        int array[] = new int[]{6,5,7};
        int result = solution(array);
        if (2 == result)
            return true;
        else
            return false;
    }

    public static boolean test6GetMaxIncreaseOrDescent() {
        int array[] = new int[]{6,5,5,5,7,7};
        int result = solution(array);
        if (5 == result)
            return true;
        else
            return false;
    }

    public static boolean test7GetMaxIncreaseOrDescent() {
        int array[] = new int[]{6,5,7,8,3,3};
        int result = solution(array);
        if (3 == result)
            return true;
        else
            return false;
    }

    public static boolean test8GetMaxIncreaseOrDescent() {
        int array[] = new int[]{1,2,3,4,5,6};
        int result = solution(array);
        if (6 == result)
            return true;
        else
            return false;
    }

    public static boolean test9GetMaxIncreaseOrDescent() {
        int array[] = new int[]{8,7,8,7,8,7,8};
        int result = solution(array);
        if (2 == result)
            return true;
        else
            return false;
    }

    public static boolean test10GetMaxIncreaseOrDescent() {
        int array[] = new int[]{6,6,6,4,4,4,6};
        int result = solution(array);
        if (6 == result)
            return true;
        else
            return false;
    }

    public static boolean getResultTests() {
        boolean test1 = test1GetMaxIncreaseOrDescent();
        boolean test2 = test2GetMaxIncreaseOrDescent();
        boolean test3 = test3GetMaxIncreaseOrDescent();
        boolean test4 = test4GetMaxIncreaseOrDescent();
        boolean test5 = test5GetMaxIncreaseOrDescent();
        boolean test6 = test6GetMaxIncreaseOrDescent();
        boolean test7 = test7GetMaxIncreaseOrDescent();
        boolean test8 = test8GetMaxIncreaseOrDescent();
        boolean test9 = test9GetMaxIncreaseOrDescent();
        boolean test10 = test10GetMaxIncreaseOrDescent();
        return (test1 && test2 && test3 && test4 && test5 && test6 && test7 && test8 && test9 && test10);
    }

    public static void printResultTests() {
        boolean result = getResultTests();
        if (result) {
            System.out.println("Все тесты пройдены");
        }
        else {
            System.out.println("Не все тесты пройдены");
        }
    }
}
