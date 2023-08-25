/*  
    PROBLEM CODE: FINDK3
    Link: https://www.codechef.com/problems/FINDK3?tab=statement
    Difficulty Rating: 802

    Problem:
    You are given three distinct positive integers X,Y, andZ. Your task is to find integers A and B such that:
    - B is equal to one of the three given numbers;
    - A is equal to the product of remaining two numbers;
    - A is divisible by B.

    Print A and B which satisfy the given conditions. If no such pair of A and B exists, print -1 instead.

    Input Format:
    - The first line of input will contain a single integer T, denoting the number of test cases.
    - The only line of each test case contains three space-separated integers X, Y, and Z.

    Output Format:
    For each test case, print two space-separated integers A and B which satisfy the given conditions. 
    If no such pair of A and B exists, print -1 instead.

    - If there are multiple possible answers, you may print any one of them.

    Constraints:
    1 <= T <= 10^5
    1 <= X, Y, Z <= 10^4
    X, Y, Z are distinct.

    Sample:
    Input       Output

    6 2 4       12 4
    5 7 3       -1

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-- != 0) {
	        
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        int z = sc.nextInt();
	        
	        if((x * y) % z == 0)
	            System.out.println((x * y) + " " + z);
	        else if ((x * z) % y == 0)
	            System.out.println((x * z) + " " + y);
	        else if ((y * z) % x == 0)
	            System.out.println((y * z) + " " + x);
	        else
	            System.out.println(-1);
	        
	    }
	    
	}
}