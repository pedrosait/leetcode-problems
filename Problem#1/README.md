## Two Sum

#### Enunciado.
Dado una arreglo de interos y un entero objetivo retornar los indices que dado su suma es igual el numero objetivo.

#### Solucion
La idea es simple, iteramos el array con dos ciclos for para cubrir todas las posible combinaciones y en cada iteracion comprobar que las variables que controlan el ciclo no tengan el mismo valor y que la suma del valor de la posicion i mas la suma del valor de la posicion j sea igual al numero objetivo.

#### Codigo de CSharp
```C#
public class Solution {
    int[] result = new int[2];
    
    public int[] TwoSum(int[] nums, int target) {
        for(int i = 0; i <= nums.Length - 1; i++) {
            for(int j = 0; j <= nums.Length - 1; j++) {
                if(i != j && (nums[i] + nums[j]) == target) {
                    return new int[2] { i, j};
                }
            }
        }
        result = new int[1] { 0 };
		return result;
    }
}
```