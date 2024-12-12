<h1 align="center">Algorithm Analysis</h1>

## [Opposites Attract](https://www.codewars.com/kata/555086d53eac039a2a000083/train/)

#### Java:
```java
public class OppositesAttract {
    public static boolean isLove(final int flower1, final int flower2) {
        return flower1 % 2 != flower2 % 2;
    }
}
```
#### Tests:
```java
public class OppositesAttractTest {

  @Test
  public void testOddAndEven() {
    assertEquals(true, OppositesAttract.isLove(1, 4));
  }
  
  @Test
  public void testEvenAndEven() {
    assertEquals(false, OppositesAttract.isLove(2, 2));
  }
  
  @Test
  public void testOddAndOdd() {
    assertEquals(false, OppositesAttract.isLove(1, 1));
  }
  
  @Test
  public void testEvenAndOdd() {
    assertEquals(true, OppositesAttract.isLove(0, 1));
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
