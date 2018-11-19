import java.util.*;
class HamiltonianCycle
{
private int adj[][],x[],n;
public HamiltonianCycle()
{
Scanner src = new Scanner(System.in);
System.out.println(&quot;Enter the number of nodes&quot;);
n=src.nextInt();
x=new int[n];
x[0]=0;
for (int i=1;i&lt;n; i++)
x[i]=-1;
adj=new int[n][n];
System.out.println(&quot;Enter the adjacency matrix&quot;);
for (int i=0;i&lt;n; i++)
for (int j=0; j&lt;n; j++)
adj[i][j]=src.nextInt();

}
public void nextValue (int k)
{
int i=0;
while(true)
{
x[k]=x[k]+1;
if (x[k]==n)
x[k]=-1;
if (x[k]==-1)
return;
if (adj[x[k-1]][x[k]]==1)
for (i=0; i&lt;k; i++)
if (x[i]==x[k])
break;

if (i==k)
if (k&lt;n-1 || k==n-1 &amp;&amp; adj[x[n-1]][0]==1)

return;

}
}
public void getHCycle(int k)
{
while(true)
{

nextValue(k);
if (x[k]==-1)
return;
if (k==n-1)
{
System.out.println(&quot;\nSolution : &quot;);
for (int i=0; i&lt;n; i++)
System.out.print((x[i]+1)+&quot; &quot;);
System.out.println(1);
}
else
getHCycle(k+1);

}
}
}
class HamiltonianCycleExp
{
public static void main(String args[])
{
HamiltonianCycle obj=new HamiltonianCycle();
obj.getHCycle(1);
}
}
