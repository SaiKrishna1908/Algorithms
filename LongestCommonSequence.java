package DynamicProgramming;
import java.util.Scanner;
public class LongestCommonSequence {
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]){
		LongestCommonSequence ob = new LongestCommonSequence(); 
		System.out.print("Enter First String");
		String A = scan.nextLine().trim();
		//scan.nextLine();
		System.out.println("Enter Second String");
		String B = scan.nextLine();
		int sol = ob.lcs(A,B,A.length(),B.length());
		System.out.println(sol);
	}
	int lcs(String A,String B,int m, int n){
		//Base Case for Recursion
		if(m==0||n==0)
			return 0;
		//if Character is equal
		if(A.charAt(m-1)== B.charAt(n-1)){
			return lcs(A,B,m-1,n-1)+1;
		}
			//if they are not equal
		return Integer.max(lcs(A,B,m,n-1),lcs(A,B,m-1,n));
	}
}
