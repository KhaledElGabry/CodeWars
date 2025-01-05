## [Reversed Words](https://www.codewars.com/kata/51c8991dee245d7ddf00000e)

#### Java:
```java
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
```
#### Tests:
```java
class SolutionTest {
    @Test
    void fixedTests() {
        assertEquals("world! hello", ReverseWords.reverseWords("hello world!"));
        assertEquals("this like speak doesn't yoda", ReverseWords.reverseWords("yoda doesn't speak like this"));
        assertEquals("foobar", ReverseWords.reverseWords("foobar"));
        assertEquals("editor kata", ReverseWords.reverseWords("kata editor"));
        assertEquals("boat your row row row", ReverseWords.reverseWords("row row row your boat"));
        assertEquals("", ReverseWords.reverseWords(""));
    }

    @Test
    void randomTests() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        for(int run = 0; run < 40; ++run) {
            String input = IntStream.range(0, rnd.nextInt(12)).mapToObj(i -> rnd.ints(rnd.nextInt(1,12), 'a', 'z'+1).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)).collect(Collectors.joining(" "));
            String[] words = input.split(" ");
            Collections.reverse(Arrays.asList(words));
            String expected = String.join(" ", words);
            assertEquals(expected, ReverseWords.reverseWords(input), String.format("For input \"%s\"", input));
        }
    }
}
```

<!-- #### Go:
```go
func solution() {

}
```

#### Tests:
```go
func solution() {

}
``` -->

### Complexity Analysis:

- *Time Complexity:* $O(n)$
- *Space Complexity:* $O(n)$


---