import java.util.*;

public class MergeSort {
    public static void main(String args[]) {
        int i, n, size;
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter N (how many numbers to be sorted)");
        n = sc.nextInt();
        int a[] = new int[20];
        System.out.println(" Enter "
                + n + " numbers 1 by 1 ");
        for (i = 0; i < n;
             i++) {
            int number = sc.nextInt();
            a[i] = number;
        }
        size = n - 1;
        mergeSort(a, 0, size);
        System.out.println(" Sorted array : ");
        for (i = 0; i < n;
             i++)
            System.out.print(" "
                    + a[i]);

    }

    public static void mergeSort(int[] array, int low, int high) {
        if (low <
                high) {
            int middle = (low + high) / 2;
            mergeSort(array, low, middle);
            mergeSort(array, middle + 1, high);
            merge(array, low, middle, high);
        }

    }

    public static void merge(int[] array, int low, int middle, int high) {
        int[] helper = new int[array.length];
        for (int i = low; i <= high;
             i++) {
            helper[i] = array[i];
        }
        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        while (helperLeft <= middle &&
                helperRight <= high) {
            if (helper[helperLeft] <= helper[helperRight]) {
                array[current] = helper[helperLeft];
                helperLeft++;
            } else {
                array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }
        int remaining = middle - helperLeft;
        for (int i = 0; i <= remaining;
             i++) {
            array[current + i] = helper[helperLeft + i];
        }
    }
}
