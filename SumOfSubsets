import java.util.*;
public class sumofsubsets
{
  int[] w;
  static int[] x;
  static int n;
  int sum;
public void process(){
  getData();
  }
private void getData()
{
  Scanner sc = new Scanner(System.in);
  System.out.print(&quot;Enter the number of elements:&quot;);
  n = sc.nextInt();
  w = new int[n + 1];
  x = new int[n + 1];
  int total = 0;
  System.out.println(&quot;Enter &quot; + n + &quot; Elements :&quot;);
  for (int i = 1; i &lt; n + 1; i++)
  {
    w[i] = sc.nextInt();
    total += w[i];
  }
  System.out.println(&quot;Enter the sum to be obtained: &quot;);
  sum = sc.nextInt();
    if (total &lt; sum)
      { 
        System.out.println(&quot;Not possible to obtain the subset!!!&quot;);
        System.exit(1);
    }
subset(0, 1, total);

}

private void subset(int s, int k, int r)
{
int i = 0;
x[k] = 1;
if (s + w[k] == sum)
{
System.out.println();
for (i = 1; i &lt;= n; i++)

{
System.out.print(&quot;\t&quot; + x[i]);

}
}
else if ((s + w[k] + w[k + 1]) &lt;= sum)
{
subset(s + w[k], k + 1, r - w[k]);
}
if ((s + r - w[k]) &gt;= sum &amp;&amp; (s + w[k + 1]) &lt;= sum)
{
x[k] = 0;
subset(s, k + 1, r - w[k]);
}
}
public static void main(String[] args)
{
sumofsubsets ob=new sumofsubsets();

ob.process();
}
}
