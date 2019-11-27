package module2Algorithmization.oneDimensionalArray;

import static module2Algorithmization.Service.getArrayInt;


/**
 * Даны целые числа а[1], а[2], а[3],..., а[n].
 * Вывести на печать только те числа, для которых ai>i
 */
public class Task5 {
    public static void main(String[] args) {

        int[] a;

        a=getArrayInt("Input  array");

        System.out.print("a[i]>i - ");
        for (int i = 0; i < a.length; i++) {
            if (a[i]>i){
                System.out.print(a[i]+", ");
            }
        }
    }



}
