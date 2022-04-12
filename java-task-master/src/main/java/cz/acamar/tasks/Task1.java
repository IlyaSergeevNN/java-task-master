package cz.acamar.tasks;

public class Task1 {

    /**
     * Task 1. Length of the last word.
     * <p>
     * Given a string s consisting of some words separated by some number of spaces,
     * return the length of the last word in the string.
     * <p>
     * A word is a maximal substring consisting of non-space characters only.
     * <p>
     * Example input: "Hello World"
     * Expected output: 5
     *
     * @param str - a string s consisting of some words separated by some number of spaces.
     * @return - the length of the last word in the string.
     */
    //solution with str.trim()
    public int lengthOfLastWord(String str) {
        char[] charArray = str.trim().toCharArray();
        int result = 0;
        for (int i = charArray.length-1; i >= 0; i--) {
            if(charArray[i] == ' ') {
                return result;
            } else {
                result++;
            }
        }
        return result;
    }
      //solution without str.trim()
//    public int lengthOfLastWord(String str) {
//        char[] charArray = str.toCharArray();
//        int result = 0;
//        for (int i = charArray.length-1; i >= 0; i--) {
//            if (charArray[i] == ' ' && result != 0) {
//                return result;
//            } else if (charArray[i] != ' ') {
//                result++;
//            }
//        }
//        return result;
//    }
}
