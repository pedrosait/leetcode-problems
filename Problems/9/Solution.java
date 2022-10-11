class Solution {
    public boolean isPalindrome(int x) {
        // convert to int x
        String number = String.valueOf(x);
        // Reversing the order of the string
        String numberReverse = new StringBuilder(number).reverse().toString();
        // comparing if the strings are equal
        return numberReverse.equals(number);
        
    }
}