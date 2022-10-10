## Length of Last Word

#### Enunciado
Dado un string que contiene espacios en blanco y palabras, retornar la longitud de la ultima palabra.

#### Solucion
Primero convertir el string en un arreglo quitando los espacios en blanco
Segundo retornar la longitud de la ultima posicion del arreglo

#### Solucion Java
```Java
class Solution {
    public int lengthOfLastWord(String s) {
        String[] lastWord = s.split("\\s+");
        return  lastWord[lastWord.length-1].length();
    }
}
```