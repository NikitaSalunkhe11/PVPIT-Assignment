import java.util.HashMap;
import java.io.*;


 class WordCount {
    static int countWords(String str) {
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        int wordCount = 0;
        String[] words = str.split("\\s+");
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                wordCount++;
            }
        }

        return wordCount;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the String:");
        String str = br.readLine();
        int wordCount = countWords(str);
        System.out.println("Number of words: " + wordCount);
    }
}