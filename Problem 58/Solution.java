class Solution {
    public int lengthOfLastWord(String s) {
        String[] lastWord = s.split("\\s+");
        return  lastWord[lastWord.length-1].length();
    }
}