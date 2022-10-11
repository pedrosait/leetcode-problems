class Solution:
    def isPalindrome(self, x: int) -> bool:
        number = str(x)
        # reverse the string
        numberReverse = ''.join(reversed(number))
        # check if are equals
        return number == numberReverse