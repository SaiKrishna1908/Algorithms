import java.io.*;
import java.util.*;
class jobsequence
{
public static void main(String args[])
{
int m,n,i,j,temp,p,max=0,total_profit=0;
int profit[]=new int[20];
int deadline[]=new int[20];
int sort[]=new int[20];
//int total_profit[]=new int[20];
int lp[]=new int[20];
int up[]=new int[20];
int pos[]=new int[20];
Scanner s=new Scanner(System.in);
System.out.println(&quot;Enter the no of Jobs:&quot;);
n=s.nextInt();
System.out.println(&quot;Enter the Profits for each Jobs:&quot;);
for(i=0;i&lt;n;i++)
{
profit[i]=s.nextInt();
}
System.out.println(&quot;Enter the deadline for each Job:&quot;);
for(i=0;i&lt;n;i++)
{
deadline[i]=s.nextInt();
}
for(i=0;i&lt;n;i++)
{
sort[i]=profit[i];
}
for(i=0;i&lt;n;i++)
{
for(j=0;j&lt;n;j++)
{
if (sort[i]&gt;sort[j])
{
temp=sort[i];
sort[i]=sort[j];
sort[j]=temp;
}
}
}
System.out.println(&quot;Array in descending order:&quot;);

System.out.println();
for(i=0;i&lt;n;i++)
{
System.out.println(sort[i]);
}
for(i=0;i&lt;n;i++)
{
p=sort[i];
for(j=0;j&lt;n;j++)
{
if(p==profit[j])
{
pos[i]=j;
//System.out.println(&quot;pos=&quot;+pos[i]);
}
}
}
for(i=0;i&lt;n;i++)
{
for(j=0;j&lt;n;j++)
{
if (deadline[i]&gt;deadline[j])
{
temp=deadline[i];
deadline[i]=deadline[j];
deadline[j]=temp;
}
max=deadline[0];
//System.out.println(&quot;Max deadline=&quot;+max);
}
}
System.out.println(&quot;Allocating time are:&quot;);
System.out.println();
for(i=0;i&lt;max;i++)
{
lp[i]=i;
up[i]=i+1;
System.out.println(&quot; &quot;+lp[i]+&quot; &quot;+up[i]);
}
System.out.println();
for(i=0;i&lt;n;i++)
{
//pos[i]=b[i];
if(up[i]!=0)
{
System.out.println();

System.out.println(&quot;for job &quot;+pos[i]+&quot; profit is &quot;+sort[i]+&quot; and
dedline assign is &quot;+lp[i]+&quot;-&quot;+up[i]);
total_profit=total_profit+sort[i];
//System.out.println(&quot;total profit=&quot;+total_profit);
}
}
System.out.println();
System.out.println(&quot;total_profit=&quot;+total_profit);
}
}
