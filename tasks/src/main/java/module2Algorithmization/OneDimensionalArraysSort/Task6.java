package module2Algorithmization.OneDimensionalArraysSort;

import module2Algorithmization.Service;

import java.util.Arrays;


/**
 * Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по
 * возрастанию. Делается это следующим образом: сравниваются два соседних элемента a[i] и
 * a[i+1]. Если a[i]<=a[i+1], то продввигаются на один элемент вперед. Если a]i]> a[i+1],
 * то производится перестановка и сдвигаются на один элемент назад. Составить алгоритм
 * этой сортировки
 */
public class Task6 {
    public static void main(String[] args) {
        int[] a;

        a = Service.getIncreasingArrayOfInt("Input the array ");

        System.out.println(Arrays.toString(sortByShella(a)));

    }


    private static int[] sortByShella(int a[]) {
        while (true) {
            boolean isIncreasingNot = true;

            for (int i = 1; i < a.length; i++) {
                if (a[i - 1] > a[i]) {
                    int r = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = r;
                    int k = i - 1;
                    while (k > 0) {
                        if (a[k - 1] > a[k]) {
                            int p = a[k];
                            a[k] = a[k - 1];
                            a[k - 1] = p;
                        }
                        k--;
                    }
                    isIncreasingNot = false;
                }


            }
            if (isIncreasingNot) {
                break;
            }
        }
        return a;
    }
}
