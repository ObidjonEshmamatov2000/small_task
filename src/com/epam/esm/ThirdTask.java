package com.epam.esm;

/**
 * @author Obidjon Eshmamatov
 * @project java_interview_prep
 * @created 03/07/2022 - 10:25 AM
 */
public class ThirdTask {
    private static final int[] chars = new int[26];

    public static void main(String[] args) {
        findEncryptionAlgorithm("robocontest", "slcldlkepte");
        findEncryptionAlgorithm("dasturchi", "ottefsdef");
        findEncryptionAlgorithm("shifrlash", "tefysatte");
        findEncryptionAlgorithm("abc", "tcd");
        findEncryptionAlgorithm("kj", "po");
        findEncryptionAlgorithm("hello", "epaal");


        System.out.println(convertToEncryptedText("kelajak"));
    }

    public static void findEncryptionAlgorithm(String plainText, String encryptedText) {
        for(int i=0; i<plainText.length(); i++) {
            int index = (int) plainText.charAt(i) - 'a';
            if (index < 26) {
                chars[index] = encryptedText.charAt(i);
            } else throw new RuntimeException("no such alphabetic character");
        }
    }

    public static String convertToEncryptedText(String plainText) {
        StringBuilder sb = new StringBuilder();
        for (char c : plainText.toCharArray()) {
            int index = c - 'a';
            if (index < 26) {
                sb.append((char)chars[index]);
            } else throw new RuntimeException("no such alphabetic character");
        }
        return sb.toString();
    }
}
