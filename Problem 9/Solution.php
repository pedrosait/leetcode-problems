class Solution {

/**
 * @param Integer $x
 * @return Boolean
 */
function isPalindrome($x) {
    $number = strval($x);
    $numberReverse = strrev($number);
    return $number == $numberReverse;
    }
}