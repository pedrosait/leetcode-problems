class Solution {
    fun isPalindrome(x: Int): Boolean {
        var number = x.toString();
        var numberReverse = number.reversed();
        return number.equals(numberReverse);
    }
}