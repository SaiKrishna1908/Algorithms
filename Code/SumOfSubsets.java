import java.util.*;

public class SumOfSubsets {
    int[] w;
    static int[] x;
    static int n;
    int sum;

    public void process() {
        getData();
    }

    private void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number of elements:");
        n = sc.nextInt();
        w = new int[n + 1];
        x = new int[n + 1];
        int total = 0;
        System.out.println(" Enter "
                + n + " Elements:");
        for (int i = 1; i < n + 1;
             i++) {
            w[i] = sc.nextInt();
            total += w[i];
        }
        System.out.println(" Enter the sum to be obtained: ");
        sum = sc.nextInt();
        if (total <
                sum) {
            System.out.println(" Not possible to obtain the subset !!! ");
            System.exit(1);
        }
        subset(0, 1, total);

    }

    private void subset(int s, int k, int r) {
        int i = 0;
        x[k] = 1;
        if (s + w[k] == sum) {
            System.out.println();
            for (i = 1; i <= n;
                 i++) {
                System.out.print("\t "
                        + x[i]);

            }
        } else if ((s + w[k] + w[k + 1]) <= sum) {
            subset(s + w[k], k + 1, r - w[k]);
        }
        if ((s + r - w[k]) >= sum &&
                (s + w[k + 1]) <= sum) {
            x[k] = 0;
            subset(s, k + 1, r - w[k]);
        }
    }

    public static void main(String[] args) {
        SumOfSubsets ob = new SumOfSubsets();

        ob.process();
    }
}
