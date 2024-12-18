## [StringyStrings](https://www.codewars.com/kata/563b74ddd19a3ad462000054/)

#### Java:
```java
public class StringyStrings {
    public static String stringy(int size) {
        if (size <= 0) throw new IllegalArgumentException("invalid size");

        StringBuilder result = new StringBuilder(size); // Preallocate capacity for size
        for (int i = 1; i <= size; i++) {
            result.append(i % 2); 
        }

        return result.toString();
    }
}
```
#### Tests:
```java
public class StringyStringsTest {
    
    @Test
    public void startTest() {
        assertEquals("Your string should start with a 1", '1', Kata.stringy(3).charAt(0));
    }

    @Test
    public void lengthTests() {
        Random randGen = new Random();
        for (int i = 0; i < 10; i++) {
            int size = randGen.nextInt(50);
            assertEquals("Wrong length using size " + size, size, Kata.stringy(size).length());
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