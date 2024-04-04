import java.io.*;
import java.util.*;

class DuplicateCharacter {
    static void findDuplicateChar(String str) {
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        
        Set<Character> printedChars = new HashSet<>();
        
        for (int i = 0; i < charArr.length - 1; i++) {
            if (charArr[i] == charArr[i + 1] && !printedChars.contains(charArr[i])) {
                System.out.println(charArr[i]);
                printedChars.add(charArr[i]);
            }
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String :");
        String str = br.readLine();
        findDuplicateChar(str);
    }
}
