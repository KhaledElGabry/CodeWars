<h1 align="center">Algorithm Analysis</h1>

## [Even Or Odd](https://www.codewars.com/kata/53da3dbb4a5168369a0000fe/train/)

#### Java:
```java
public class EvenOrOdd {
    public static String evenOrOdd(int number) {
        if (number % 2 == 0) return "Even";
        else return "Odd";
    }
}
```
#### Tests:
```java
public class EvenOrOddTest {
    
  @Test @DisplayName("Should return \"Odd\" for num = 1")
  public void testPositiveOddNumbers() {
    assertEquals("Odd", Kata.evenOrOdd(1));
  }
  
  @Test @DisplayName("Should return \"Even\" for num = 2")
  public void testPositiveEvenNumbers() {
    assertEquals("Even", Kata.evenOrOdd(2));
  }
  
  @Test @DisplayName("Should return \"Odd\" for num = -1")
  public void testNegativeOddNumbers() {
    assertEquals("Odd", Kata.evenOrOdd(-1));
  }
  
  @Test @DisplayName("Should return \"Even\" for num = -2")
  public void testNegativeEvenNumbers() {
    assertEquals("Even", Kata.evenOrOdd(-2));
  }
  
  @Test @DisplayName("Should return \"Even\" for num = 0")
  public void testZero() {
    assertEquals("Even", Kata.evenOrOdd(0));
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

- *Time Complexity:* $O(1)$
- *Space Complexity:* $O(1)$


---