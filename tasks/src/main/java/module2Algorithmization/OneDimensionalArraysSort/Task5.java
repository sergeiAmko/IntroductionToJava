package module2Algorithmization.OneDimensionalArraysSort;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
//        int[] a;
//
//        a = getIncreasingArray("Input the number of elements in the  array a ");

        int[] a={1,20,60,2,4,12,5,6,15,7,3,8,9,10};
        int[] b=new int[a.length];
//        int[] a={1,2,3,4,5,7,9};

        for (int i = 0; i < a.length; i++) {
            if (i==0){
                b[i]=a[i];
            }else {
                int k=binarySearch(b,a[i],i);
                for (int j = i; j >k ; j--) {
                    b[j]=b[j-1];
                }
                b[k]=a[i];
            }
        }

        System.out.println(Arrays.toString(b));
//        System.out.println(binarySearch(a,6,a.length-1));

    }

    private static int binarySearch(int[] a,int val, int last){
        int l = 0, r = last;

        while (r > l) {
            int m = (l + r) / 2;

            if (a[m] < val) {
                l = m + 1;
            } else if (a[m] > val) {
                r = m - 1;
            } else {
                return m;
            }
        }
//        if (a[l] == val) {
//            return l;
//        } else {
//            return l-1;
//        }
        return l+1;
    }

    private static int[] sortExchannges(int[] a){
        while (true){
            boolean isChaotically=false;

            for (int i = 1; i < a.length; i++) {
                if (a[i-1]>a[i]){
                    int k=a[i];
                    a[i]=a[i-1];
                    a[i-1]=k;
                    isChaotically=true;
                }
            }

            if (!isChaotically){
                break;
            }
        }
        return a;
    }

    private static int getIntValue(Scanner scanner, String message) {
        System.out.println(message);
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }

    }

    private static int[] getIncreasingArray(String s) {
        int n = 0;
        int[] a;

        Scanner scanner = new Scanner(System.in);

        while (n <= 0) {
            n = getIntValue(scanner, s);
        }
        a = new int[n];

        for (int i = 0; i < n; i++) {
            String t = s, s1 = "Input the number more than previous-  ";
            boolean isMore = false;
            if (i == 0) {
                a[i] = getIntValue(scanner, "Input a[" + i + "] ");
            } else {
                while (!isMore) {
                    a[i] = getIntValue(scanner, t + a[i - 1]);
                    if (a[i] >= a[i - 1]) {
                        isMore = true;
                    }
                    t = s1;
                }
            }
        }
        return a;
    }

}
