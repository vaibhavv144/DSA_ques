//package practise_acc;
//
//public class longest_string {
//    public static void main(String[] args) {
//        String str="yes no";
//        int max=Integer.MIN_VALUE;
//        int c=0;
//        for(int i=0;i<str.length();i++){
//            c++;
//            if(str.charAt(i)==' '){
//                c=c-1;
//                max=Math.max(max,c);
//                c=0;
//            }
//
//
//        }
//        System.out.println(Math.max(max,c));
//    }
//}
package practise_acc;

public class longest_string {
    public static void main(String[] args) {
        String str = "yes no";
        int maxLen = 0;
        int c = 0;
        String longestWord = "";
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                c++;
                currentWord.append(str.charAt(i));
            } else {
                if (c > maxLen) {
                    maxLen = c;
                    longestWord = currentWord.toString();
                }
                c = 0; // Reset counter for the next word
                currentWord.setLength(0); // Clear the current word
            }
        }

        // Final comparison to account for the last word in the string
        if (c > maxLen) {
            longestWord = currentWord.toString();
        }

        System.out.println("Longest word: " + longestWord);
    }
}
