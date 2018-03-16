package programs_Interview;

import java.util.HashSet;

public class SubString {
    public static String subString(String input){

        HashSet<Character> set = new HashSet<Character>();

        String longestOverAll = "";
        String longestTillNow = "";

        for (int i = 0; i < input.length(); i++) {  // input given is : stackoverflow;
            char c = input.charAt(i);//t

            if (set.contains(c)) { 
                longestTillNow = "";
                set.clear();
            }
            longestTillNow += c; //s
            set.add(c);
            if (longestTillNow.length() > longestOverAll.length()) {
                longestOverAll = longestTillNow;
            }
        }

        return longestOverAll;
    }

    public static void main(String[] args) {
        String input = "stackoverflow";
        System.out.println(subString(input));
    }
}