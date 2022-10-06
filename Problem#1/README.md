### Two Sum

Este problema es de la pagina LeetCode.

Enunciado.
Dado un arreglo de numeros enteros y un numero entero objetivo, retornar los dos indices dada su suma sea igual al numero objetivo, puedes retornar la solucion en el orden que quieras.

Solucion en codigo Java

``` Java
class Solution {
    // Array para guardar la solucion
    int[] result = new int[2];

    // Metodo a resolver
    public int[] twoSum(int[] nums, int target) {
        // Iteramos el array hasta su longitud menos 1 para evitar desbordamiento
        for(int i = 0; i < nums.length - 1; i++) {
            // si la suma de estos dos numeros es igual al numero objetivo
            if( (nums[i] + nums[i + 1]) == target) {
                // guardar la posicion de los numeros
                result[0] = i;
                result[1] = i + 1;
            }
        }
        // retornar la solucion
        return result;
    }
}
```
