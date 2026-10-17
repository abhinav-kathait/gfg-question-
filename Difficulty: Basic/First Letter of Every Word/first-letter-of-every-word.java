class Solution {
    String firstAlphabet(String s) {
        StringBuilder result = new StringBuilder();

        result.append(s.charAt(0));

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ') {
                result.append(s.charAt(i + 1));
            }
        }

        return result.toString();
    }
}