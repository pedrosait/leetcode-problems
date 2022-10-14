## Longest Common Prefix

#### Enunciado
Escribir una funcion que encuentre el prefijo comun mas largo en un arreglo de strings.

Retornar un string vacio si no hay un prefijo en comun

#### Codigo C#
```C#
public class Solution {
    public string LongestCommonPrefix(string[] strs) {
        if(strs.Length == 0) return "";
        string prefix = strs[0];
        
        for(int i = 1; i < strs.Length; i++) {
            while(strs[i].IndexOf(prefix) != 0) {
                prefix = prefix.Substring(0, prefix.Length - 1);
            }
        }
        return prefix;
    }
}
```

#### Codigo Java
```Java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String prefix = strs[0];
        
        for(int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
```
