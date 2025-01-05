## [Reversed Strings](https://www.codewars.com/kata/5168bb5dfe9a00b126000018)

#### Java:
```java
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
```
#### Tests:
```java
public class SolutionTest {
    // Reference implementation for random tests
    public static String _solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    @Test
    public void sampleTests() {
        assertEquals("dlrow", Kata.solution("world"));
        assertEquals("olleh", Kata.solution("hello"));
        assertEquals("", Kata.solution(""));
        assertEquals("h", Kata.solution("h"));
        assertEquals("selur srawedoC", Kata.solution("Codewars rules"));
    }

    @Test
    public void randomTests() {
        String chars = "abcdefghijklmnopqrstuvwxyz    ,./';123456789!?";
        Random random = new Random();

        for (int i = 0; i < 100; ++i) {
            String test = IntStream.range(1, random.nextInt(100))
                    .mapToObj(x -> Character.toString(chars.charAt(random.nextInt(chars.length()))))
                    .collect(Collectors.joining());

            String expected = _solution(test);
            String actual = Kata.solution(test);

            assertEquals(expected, actual);
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