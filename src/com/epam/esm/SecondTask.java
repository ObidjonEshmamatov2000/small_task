package com.epam.esm;

/**
 * @author Obidjon Eshmamatov
 * @project java_interview_prep
 * @created 03/07/2022 - 10:24 AM
 */
public class SecondTask {
    public static void main(String[] args) {
        int N = 5;
        System.out.println("The N of ending zeros is : " + findTotalEndingZeros(N));
    }


    // among prime numbers only 2 and 5 can make zero ending therefore for all cases there will be only 1 zero
    public static int findTotalEndingZeros(int n) {
        return n < 5 ? 0 : 1;
    }
}



