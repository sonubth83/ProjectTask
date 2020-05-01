package in.project.pizza.task1;

import java.util.LinkedList;
import java.util.Scanner;

public class KattisFSProblem {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		LinkedList<Integer> A = new LinkedList<Integer>();
		LinkedList<Integer> B = new LinkedList<Integer>();
		LinkedList<Integer> C = new LinkedList<Integer>();
															
		int n = in.nextInt();
		for (int i = 0; i < n; i++)
			A.addLast(new Integer(in.nextInt()));
		n = in.nextInt();
		for (int i = 0; i < n; i++)
			B.addLast(new Integer(in.nextInt()));
		n = in.nextInt();
		for (int i = 0; i < n; i++)
			C.addLast(new Integer(in.nextInt()));
		n = A.size() + B.size() + C.size();
		long num = solve(A, B, C, n);
		System.out.println(num == -1 ? "No" : (long) Math.pow(2, n) - 1 - num);
	}

	public static long solve(LinkedList<Integer> A, LinkedList<Integer> B, LinkedList<Integer> C,int n) {
		if (n == 0)
			return 0;
		if (A.size() != 0 && (int) A.getFirst() == n) {
			A.removeFirst();
			return solve(A, C, B, n - 1);
		} 
		else {
			if (C.size() != 0 && (int) C.getFirst() == n) {
				C.removeFirst();
				long ret = solve(B, A, C, n - 1);
				return (ret == -1 ? -1 : (long) Math.pow(2, n - 1) + ret);
			} else {
				return -1;
			}
		}
	}
}
