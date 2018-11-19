import java.io.*;
class operation
{
int x[]=new int[20];
int count=0;
public boolean place(int row,int column)
{
int i;
for(i=1;i&lt;=row-1;i++)
{ //checking for column and diagonal conflicts
if(x[i] == column)
return false;

else
if(Math.abs(x[i] - column) == Math.abs(i - row))
return false;

}
return true;
}
public void Queen(int row,int n)
{
int column;
for(column=1;column&lt;=n;column++)
{
if(place(row,column))
{
x[row] = column;
if(row==n)
print_board(n);//printing the board configuration
else //try next queen with next position
Queen(row+1,n);

}
}
}
public void print_board(int n)
{
int i;
System.out.println(&quot;\n\nSolution :&quot;+(++count));
for(i=1;i&lt;=n;i++)
{
System.out.print(&quot; &quot;+i);
}
for(i=1;i&lt;=n;i++)
{

System.out.print(&quot;\n\n&quot;+i);
for(int j=1;j&lt;=n;j++)// for nXn board
{
if(x[i]==j)
System.out.print(&quot; Q&quot;);
else
System.out.print(&quot; -&quot;);

}
}
}
}
class Backtrackqueen
{
public static void main (String args[] )throws IOException
{
DataInputStream in=new DataInputStream(System.in);
System.out.println(&quot;Enter no Of Queens&quot;);
int n=Integer.parseInt(in.readLine());
operation op=new operation();
op.Queen(1,n);
}
}
