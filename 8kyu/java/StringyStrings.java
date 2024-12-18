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