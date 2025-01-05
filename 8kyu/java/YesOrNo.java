class YesOrNo {
    // simple if condition
    public static String ifBoolToWord(boolean b) {
        if (b) return "Yes";
        return "No";
    }

    // ternary operator
    public static String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }
}