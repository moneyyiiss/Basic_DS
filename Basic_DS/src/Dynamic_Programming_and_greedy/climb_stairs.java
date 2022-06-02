package Dynamic_Programming_and_greedy;

import java.util.Scanner;

public class climb_stairs {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] qb = new int[n+1];
		int paths = countPaths(n, qb);
		System.out.println(paths);
		
		scn.close();
	}
	public static int countPaths(int n, int[] qb) {
		if(n == 0) {
			return 1;
		}else if(n<0) {
			return 0;
		}
		
		if(qb[n] != 0) {
			return qb[n];
		}
		int p1 = countPaths(n-1, qb);
		int p2 = countPaths(n-2, qb);
		int p3 = countPaths(n-3, qb);
		return p1 + p2 + p3;
	}
	
}

