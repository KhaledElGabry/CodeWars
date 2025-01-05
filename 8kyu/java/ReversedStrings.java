public class ReversedStrings {
    public static String solution(String str) {

        //validations
        if (str == null) return null;

        char[] characters = str.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            left++;
            right--;
        }

        return String.valueOf(characters);
    }
}