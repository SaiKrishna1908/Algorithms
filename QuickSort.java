import java.util.Scanner;
public class qsort
{
public static void sort(int[] arr)
{

quickSort(arr, 0, arr.length - 1);
}
public static void quickSort(int arr[], int low, int high)
{
int i = low, j = high;
int temp;
int pivot = arr[(low + high) / 2];
while (i &lt;= j)
{
while (arr[i] &lt; pivot)
i++;
while (arr[j] &gt; pivot)
j--;
if (i &lt;= j)
{
temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
i++;
j--;
}
}
if (low &lt; j)
quickSort(arr, low, j);
if (i &lt; high)
quickSort(arr, i, high);
}
public static void main(String[] args)
{
Scanner scan = new Scanner( System.in );
System.out.println(&quot;Quick Sort Test\n&quot;);
int n, i;
System.out.println(&quot;Enter number of integer elements&quot;);
n = scan.nextInt();
int arr[] = new int[ n ];
System.out.println(&quot;\nEnter &quot;+ n +&quot; integer elements&quot;);
for (i = 0; i &lt; n; i++)
arr[i] = scan.nextInt();
sort(arr);

System.out.println(&quot;\nElements after sorting &quot;);
for (i = 0; i &lt; n; i++)
System.out.print(arr[i]+&quot; &quot;);
System.out.println();
}
}
