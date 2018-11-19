import java.util.Scanner;
public class Kruskal
{
static int path[];
static int n, m, mincost, i, j;
public static void main (String args[]) throws Exception
{
Scanner s=new Scanner(System.in);
// Creating graph of &#39;n&#39; vertices &amp; &#39;m&#39; edges
System.out.print(&quot;Enter the number of vertices in the graph: &quot;);
n = s.nextInt();
System.out.print(&quot;Enter the number of edges in the graph: &quot;);
m = s.nextInt();
path = new int[n+1];
Edge e[] = new Edge[m];
Edge t = new Edge();
for (i=0; i&lt;m; i++)
{
e[i] = new Edge();
System.out.println(&quot;Enter 2 vertices and weight of edge: &quot;);
System.out.print(&quot;First vertex: &quot;);
e[i].u = s.nextInt();
System.out.print(&quot;Second vertex: &quot;);
e[i].v = s.nextInt();
System.out.print(&quot;Weight: &quot;);
e[i].wt = s.nextInt();
}
// Sorting the edges in ascending order of weights
for (i=0; i&lt;=m-1; i++)
{
for (j=0; j&lt;m-i-1; j++)
{
if (e[j].wt &gt; e[j+1].wt)
{
t = e[j];
e[j] = e[j+1];
e[j+1] = t;
}
}
}
// Initializing the path array
for (i=1; i&lt;=n; i++)

{
path[i] = 0;
}
// Counts the number of edges selected in the tree
i = 0;
// Counts the number of edges selected or discarded
j = 0;
mincost = 0;
System.out.println();
while ((i!=n-1) &amp;&amp; (j!=m))
{
System.out.print(&quot;Edge (&quot;+ e[j].u + &quot;, &quot; + e[j].v + &quot;) &quot;
+ &quot;with weight &quot; + e[j].wt + &quot; &quot;);
if (checkCycle(e[j]))
{
mincost = mincost + e[j].wt;
i++;
System.out.println(&quot;is selected&quot;);
}
else
{
System.out.println(&quot;is discarded&quot;);
}
j++;
}
if (i!=n-1)
{
System.out.println(&quot;Minimum spanning tree cannot be formed &quot;);
}
System.out.println(&quot;Minimum cost=&quot;+mincost);
s.close();
}

public static boolean checkCycle(Edge e)

{
int u = e.u, v = e.v;
while (path[u] &gt; 0)
u = path[u];
while (path[v] &gt; 0)
v = path[v];
if (u != v)
{
path[u] = v;
return true;
}
return false;

}

static class Edge
{
int u, v, wt;
}
}
