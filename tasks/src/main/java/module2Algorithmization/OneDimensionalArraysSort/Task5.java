package module2Algorithmization.OneDimensionalArraysSort;

import java.util.Arrays;

import static module2Algorithmization.Service.getArrayInt;
import static module2Algorithmization.Service.getIncreasingArrayOfInt;


/**
 * Сортировка вставками. Дана последовательность чисел a[1]<=a[2]<=...<=a[n]. Требуется переставить числа
 * в порядке возрастания. Делается это следующим образом. Пусть a[1]<=a[2]<=...<=a[i] - упорядоченная последовательность,
 * т.е. a[1]<=a[2]<=...<=a[n]. Берется следующее число a[i+1] и вставляется в последовательность так, чтобы
 * новая последовательность была уже возрастающей. Процесс производится до тех пор, пока все элементы от i+1
 * до n не будут перебраны.
 * Примечание: место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска.
 * Двоичный поиск оформить в виде отдельной функции.
 */
public class Task5 {
    public static void main(String[] args) {
        int[] a;

        a = getIncreasingArrayOfInt("Input the number of elements in the  array a ");
        int[] end = new int[a.length];

        end[0] = a[0];

        int index;

        for (int i = 1; i < a.length; i++) {

            index = binarySearch(end, a[i], i);

            if (index != i) {

                for (int j = end.length - 1; j > index; j--) {

                    end[j] = end[j - 1];

                }
            }
            end[index] = a[i];

        }


        System.out.println("Sorted mass- " + Arrays.toString(end));

    }

    private static int binarySearch(int[] a, int val, int last) {
        int first = 0;

        while (true) {

            int middle = first + (last - first) / 2;

            if (a[middle] == val) {
                return middle;
            }

            if (first >= last) {
                return first;
            }

            if (a[middle] > val) {
                last = middle;
            } else {
                first = middle + 1;
            }

        }

    }


}
