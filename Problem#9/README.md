## 9. Palindrome Number

#### Enunciado.
Dado un numero entero, retornar true si el numero entero es un palindromo.

#### Solucion
Gracias al curso de Java de Udemy recorde que Java con la clase StringBuilder tenia la posibilidad de invertir cadenas de texto, con esto en mente se me ocurrio compara dos string una cadena sera el numero entero convertido a string y la otra cadena sera el mismo numero pero invertido. Si son equivalentes la funcion retorna True.

#### Codigo Java
```Java
class Solution {
    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        String numberReverse = new StringBuilder(number).reverse().toString();
        return numberReverse.equals(number);
    }
}
```

#### Codigo C#
```C#
public class Solution {
    public bool IsPalindrome(int x) {
        string number = x.ToString();
        string numberReverse = new String(number.Reverse().ToArray());
        return number.Equals(numberReverse);
    }
}
```

#### Codigo Python3
```Python
class Solution:
    def isPalindrome(self, x: int) -> bool:
        number = str(x)
        numberReverse = ''.join(reversed(number))
        return number == numberReverse
```

#### Codigo JavaScript
```JS
 var isPalindrome = function(x) {
    let number = x.toString();
    let numberReverse = stringReverse(number);
    return number == numberReverse;
};

function stringReverse(s) {
     return s.split('').reverse().join('');
}
```

#### Codigo TypeScript
```TS
function isPalindrome(x: number): boolean {
    let number = String(x);
    let numberReverse = stringReverse(number);
    return number == numberReverse;
};

function stringReverse(s: string): string {
     return s.split('').reverse().join('');
}
```
#### Codigo PHP
```php
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
```

#### Codigo Kotlin
```js
class Solution {
    fun isPalindrome(x: Int): Boolean {
        var number = x.toString();
        var numberReverse = number.reversed();
        return number.equals(numberReverse);
    }
}
```