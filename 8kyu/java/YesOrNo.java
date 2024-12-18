class YesOrNo {
    // simple if condition
    public static String ifBoolToWord(boolean b) {
        if (!b) return "No";
        return "Yes";
    }
    // ternary operator
    public static String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }
}