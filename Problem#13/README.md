## Roman to Integer

#### Enunciado.
Los numeros romanos son representados por siete diferentes simbolos I, V, X, L, C, D y M.

| Simbolo   | Valor |
|-----------|-------|
| I         | 1     |
| V         | 5     |
| X         | 10    |
| L         | 50    |
| C         | 100   |
| D         | 500   |
| M         | 1000  |

Dado un numero romano retornar su conversion a entero ejemplo "LVIII" = 58

#### Codigo Java
```Java
public int romanToInt(String s) {
        int num = 0;
        int sum = 0;
        
        for(int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            sum += num;
        }
        
        for(int i = s.length() - 1; i > 0; i--) {
            if( (s.charAt(i) == 'V') && (s.charAt(i - 1) == 'I') ) sum -= 2;
            if( (s.charAt(i) == 'X') && (s.charAt(i - 1) == 'I') ) sum -= 2;
            if( (s.charAt(i) == 'L') && (s.charAt(i - 1) == 'X') ) sum -= 20;
            if( (s.charAt(i) == 'C') && (s.charAt(i - 1) == 'X') ) sum -= 20;
            if( (s.charAt(i) == 'M') && (s.charAt(i - 1) == 'C') ) sum -= 200;
            if( (s.charAt(i) == 'D') && (s.charAt(i - 1) == 'C') ) sum -= 200;
        }
        return sum;
    }
```