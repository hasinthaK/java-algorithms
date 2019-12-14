package khk.interview;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class strings {

    public static ArrayList separated(String sentence, String separator) {
        ArrayList list = new ArrayList();
        String[] words = sentence.split(separator);

        for(String word:words){
            list.add(word);
        }

        return list;
    }

    public static int toInt(String str){

        char ch[] = str.toCharArray();
        int asciizero = (int)'0';
        int number = 0;

        for(char out:ch){
            int current = (int)out;
            number = (number * 10) + (current - asciizero);
        }
        return number;
    }

    public static char[] reverse(String toBeReversed) {
        int length = toBeReversed.length();
        char arr[] = toBeReversed.toCharArray();

        for(int i = 0; i < length/2; i++) {
           char current = arr[i];
           arr[i] = arr[length-(i+1)];
           arr[length-(i+1)] = current;
       }
        return arr;
    }

    public static boolean isPalindrome(String str) {
        return (str.toCharArray() == reverse(str));
    }

}
