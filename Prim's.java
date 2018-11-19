import java.util.Scanner;
public class Prims
{
public int isVisited[] = new int[15];
public int cost[][] = new int[10][10];
public int minimum_cost;
public void calc(int n)
{
int flag[] = new int[n+1];
int i,j,min=999,num_edges=1,a=1,b=1,minpos_i=1,minpos_j=1;
while(num_edges &lt; n)
{
for(i=1,min=999;i&lt;=n;i++)
for(j=1;j&lt;=n;j++)
if(this.cost[i][j]&lt;min)
if(this.isVisited[i]!=0)
{
min=this.cost[i][j];
a=minpos_i=i;
b=minpos_j=j;
}

if(this.isVisited[minpos_i]==0 || this.isVisited[minpos_j]==0)
{

System.out.println(&quot;Edge Number \t&quot;+num_edges+&quot;\t from
Vertex \t&quot;+a+&quot;\t to Vertex \t&quot;+b+&quot;-mincost:&quot;+min+&quot; \n&quot;);
this.minimum_cost=this.minimum_cost+min;
num_edges=num_edges+1;
this.isVisited[b]=1;
}
this.cost[a][b]=this.cost[b][a]=999;

}

System.out.println(&quot;Minimum Cost= &quot;+minimum_cost);
}
public static void main(String args[])
{

int nodes,i,j;
Scanner in = new Scanner(System.in);
System.out.println(&quot;Enter the Number of Nodes \n&quot;);
nodes = in.nextInt();
Prims p = new Prims();
System.out.println(&quot;Enter the Cost Matrix Weights : \n&quot;);
for(i=1;i&lt;=nodes;i++)
for(j=1;j&lt;=nodes;j++)

{
p.cost[i][j]=in.nextInt();
if(p.cost[i][j]==0)
p.cost[i][j]=999;
}
p.isVisited[1]=1; // Initialization
p.calc(nodes);
}
}
