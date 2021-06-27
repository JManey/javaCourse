package com.Justin;

public class TeenNumberChecker {
    public static boolean hasTeen(int x, int y, int z) {
        int[] input = new int[]{x,y,z};
        boolean returnValue = false;
        for(int val: input) {
            if (isTeen(val)) {
                returnValue = true;
                break;
            }
        }
        return returnValue;
    }

    public static boolean isTeen(int x) {
        return (x > 12 && x < 20);
    }
}
