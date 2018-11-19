import java.util.*;
public class Dijkstra
{
public int distance[] = new int[10];
public int cost[][] = new int[10][10];
public void calc(int n,int s)
{
int flag[] = new int[n+1];
int i,minpos=1,k,c,minimum;
for(i=1;i&lt;=n;i++)
{
flag[i]=0;
this.distance[i]=this.cost[s][i];
}
c=2;
while(c&lt;=n)
{
minimum=99;
for(k=1;k&lt;=n;k++)
{
if(this.distance[k]&lt;minimum &amp;&amp; flag[k]!=1)
{

minimum=this.distance[i];
minpos=k;

}

}

flag[minpos]=1;
c++;
for(k=1;k&lt;=n;k++)
{
if(this.distance[minpos]+this.cost[minpos][k] &lt; this.distance[k] &amp;&amp;
flag[k]!=1 )

this.distance[k]=this.distance[minpos]+this.cost[minpos][k];

}
}
}

public static void main(String args[])
{
int nodes,source,i,j;
Scanner in = new Scanner(System.in);
System.out.println(&quot;Enter the Number of Nodes \n&quot;);
nodes = in.nextInt();
Dijkstra d = new Dijkstra();

System.out.println(&quot;Enter the Cost Matrix Weights: \n&quot;);
for(i=1;i&lt;=nodes;i++)
for(j=1;j&lt;=nodes;j++)
{
d.cost[i][j]=in.nextInt();
if(d.cost[i][j]==0)
d.cost[i][j]=999;

}
System.out.println(&quot;Enter the Source Vertex :\n&quot;);
source=in.nextInt();
d.calc(nodes,source);
System.out.println(&quot;The Shortest Path from Source \t&quot;+source+&quot;\t to all other vertices are : \n&quot;);
for(i=1;i&lt;=nodes;i++)
if(i!=source)

System.out.println(&quot;source :&quot;+source+&quot;\t destination :&quot;+i+&quot;\t
MinCost is :&quot;+d.distance[i]+&quot;\t&quot;);

}
}
