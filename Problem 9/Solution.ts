function isPalindrome(x: number): boolean {
    let number = String(x);
    let numberReverse = stringReverse(number);
    return number == numberReverse;
};

function stringReverse(s: string): string {
     return s.split('').reverse().join('');
}