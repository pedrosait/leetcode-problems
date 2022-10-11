public class Solution {
    public bool IsPalindrome(int x) {
        string number = x.ToString();
        // creating a new instance of String with an array
        string numberReverse = new String(number.Reverse().ToArray());
        // return ture of number equals to numberReverse
        return number.Equals(numberReverse);
    }
}