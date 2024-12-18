## [Yes Or No](https://www.codewars.com/kata/53369039d7ab3ac506000467/)

#### Java: simple if condition | ternary operator
```java
class YesOrNo {
    public static String boolToWord(boolean b) {
        if (!b) return "No";
        return "Yes";
    }
}
```
```java
class YesOrNo {
    public static String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }
}
```
#### Tests:
```java
public class BoolTest {
    @Test
    public void testBoolToWord() {
        assertEquals(YesOrNo.boolToWord(true),"Yes");
        assertEquals(YesOrNo.boolToWord(false),"No");
    }
}
```

#### Go:
```go
func BoolToWord(word bool) string {
	if !word {
		return "No"
	}
	return "Yes"
}
```

#### Tests:
```go
var _ = Describe("Test Example", func() {
  It("should test that the solution returns the correct value", func() {
    Expect(BoolToWord(true)).To(Equal("Yes"))
    Expect(BoolToWord(false)).To(Equal("No"))
  })
})
```

### Complexity Analysis:

- *Time Complexity:* $O(1)$
- *Space Complexity:* $O(1)$

---