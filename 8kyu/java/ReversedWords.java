public class ReversedWords {
    public static String reverseWords(String str) {

        //validations
        if (str == null) return null;
        //if (str.charAt(0) == ' ' || str.charAt(str.length() - 1) == ' ') {
        //    throw new IllegalArgumentException("Invalid, Text is leading or trailing spaces, try again!");
        //}

        String[] words = str.split(" ");
        int left = 0;
        int right = words.length - 1;

        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;
        }
        String reversedStr = String.join(" ", words);

        return reversedStr;
    }
}