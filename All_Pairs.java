import java.util.Scanner;
public class AllPairShortestPath
{
private int distancematrix[][];
private int numberofvertices;
public static final int INFINITY = 999;
public AllPairShortestPath(int numberofvertices)
{
distancematrix = new int[numberofvertices + 1][numberofvertices + 1];
this.numberofvertices = numberofvertices;
}
public void allPairShortestPath(int adjacencymatrix[][])
{
for (int source = 1; source &lt;= numberofvertices; source++)
{
for (int destination = 1; destination &lt;= numberofvertices; destination++)
{
distancematrix[source][destination] = adjacencymatrix[source][destination];
}
}

for (int intermediate = 1; intermediate &lt;= numberofvertices; intermediate++)
{
for (int source = 1; source &lt;= numberofvertices; source++)
{
for (int destination = 1; destination &lt;= numberofvertices; destination++)
{

if (distancematrix[source][intermediate] + distancematrix[intermediate][destination]
&lt; distancematrix[source][destination])
distancematrix[source][destination] = distancematrix[source][intermediate]
+ distancematrix[intermediate][destination];
}
}
}
for (int source = 1; source &lt;= numberofvertices; source++)
System.out.print(&quot;\t&quot; + source);
System.out.println();
for (int source = 1; source &lt;= numberofvertices; source++)
{
System.out.print(source + &quot;\t&quot;);
for (int destination = 1; destination &lt;= numberofvertices; destination++)
{
System.out.print(distancematrix[source][destination] + &quot;\t&quot;);
}
System.out.println();

}
}
public static void main(String... arg)
{
int adjacency_matrix[][];
int numberofvertices;
Scanner scan = new Scanner(System.in);
System.out.println(&quot;Enter the number of vertices&quot;);
numberofvertices = scan.nextInt();
adjacency_matrix = new int[numberofvertices + 1][numberofvertices + 1];
System.out.println(&quot;Enter the Weighted Matrix for the graph&quot;);
for (int source = 1; source &lt;= numberofvertices; source++)
{
for (int destination = 1; destination &lt;= numberofvertices; destination++)
{

adjacency_matrix[source][destination] = scan.nextInt();
if (source == destination)
{
adjacency_matrix[source][destination] = 0;
continue;
}
if (adjacency_matrix[source][destination] == 0)
{
adjacency_matrix[source][destination] = INFINITY;
}
}
}
System.out.println(&quot;The Transitive Closure of the Graph&quot;);
AllPairShortestPath allPairShortestPath= new AllPairShortestPath(numberofvertices);
allPairShortestPath.allPairShortestPath(adjacency_matrix);
scan.close();
}
}
