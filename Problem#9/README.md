## 9. Palindrome Number

#### Enunciado.
Dado un numero entero, retornar true si el numero entero es un palindromo.

#### Solucion
Gracias al curso de Java de Udemy recorde que Java con la clase StringBuilder tenia la posibilidad de invertir cadenas de texto, con esto en mente se me ocurrio compara dos string una cadena sera el numero entero convertido a string y la otra cadena sera el mismo numero pero invertido. Si son equivalentes la funcion retorna True.

```Java
class Solution {
    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        String numberReverse = new StringBuilder(number).reverse().toString();
        return numberReverse.equals(number);
    }
}
```

