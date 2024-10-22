package practise_ques;

public class PatternSearch {

    public static boolean isPatternPresent(char[] arr1, char[] arr2, int i, int j) {
        // Base case: if the entire pattern is found
        if (j == arr2.length) {
            return true;
        }
        // Base case: if the end of the string is reached without finding the pattern
        if (i == arr1.length) {
            return false;
        }

        // If characters match, continue checking the rest
        if (arr1[i] == arr2[j]) {
            return isPatternPresent(arr1, arr2, i + 1, j + 1);
        } else {
            // If characters don't match, restart the search from the next character of the string
            return isPatternPresent(arr1, arr2, i + 1, 0);
        }
    }

    public static void main(String[] args) {
        String str = "this is a test text";
        char[] arr1 = str.toCharArray();
        String pattern = "test";
        char[] arr2 = pattern.toCharArray();

        boolean result = isPatternPresent(arr1, arr2, 0, 0);

        if (result) {
            System.out.println("Pattern found in the string.");
        } else {
            System.out.println("Pattern not found in the string.");
        }
    }
}
