/**
 * @param {number} x
 * @return {boolean}
 */
 var isPalindrome = function(x) {
    let number = x.toString();
    let numberReverse = stringReverse(number);
    return number == numberReverse;
};

function stringReverse(s) {
     return s.split('').reverse().join('');
}