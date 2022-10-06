### Two Sum

Este problema es de la pagina LeetCode.

Enunciado.
Dado un arreglo de numeros enteros y un numero entero objetivo, retornar los dos indices dado que su suma sea igual al numero objetivo, se puede retornar la solucion en el orden que sea.

Mi pensamiento.
Lo que se me ocurrio fue iterar el arreglo y en cada iteracion compara si el valor de la posicion actual del arreglo mas la siguiente posicion es igual al numero objetivo, entoces guardar dichas posiciones en el arreglo result y retornarlo.

Solucion en codigo Java

``` Java
class Solution {
    int pos = 0, aux = 0;
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++) {
            if( (nums[i] + nums[i + 1]) == target) {
                pos = i;
                aux = i + 1;
                break;
            }
        }
        return new int[]{pos, aux};
    }
} 
```
