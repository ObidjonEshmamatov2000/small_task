package com.epam.esm;

/**
 * @author Obidjon Eshmamatov
 * @project java_interview_prep
 * @created 03/07/2022 - 10:23 AM
 */
public class FirstTask {
    public static void main(String[] args) {
        int[][] cube = new int[7][7];
        cube[4][0] = 1;
        System.out.println(findSmallestSteps(cube));
    }
    public static int findSmallestSteps(int[][] cube) {
        int indexX = 0, indexY = 0;
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube.length; j++) {
                if (cube[i][j] == 1) {
                    indexX = i;
                    indexY = j;
                    break;
                }
            }
        }
        return Math.abs(3-indexX) + Math.abs(3-indexY);
    }
}
