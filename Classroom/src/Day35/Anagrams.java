package Day35;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {

        String str1 = "no";
        String str2 = "ot";

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);
        boolean isAnagram = false;

        if (chars1.length == chars2.length) {

            for (int i = chars1.length -1; i >= 0; i--) {
                if (chars1[i] != chars2[i]) {
                        isAnagram = false;
                        break;
                }
                else {
                    isAnagram = true;
                }
            }
        }

        System.out.println("Are anagrams: " + isAnagram);


    }
}
