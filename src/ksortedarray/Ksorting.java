package ksortedarray;

import java.util.*;

public class Ksorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KsortingHelper help = new KsortingHelper();
		int A[] = new int [5];
		Scanner sc = new Scanner(System.in);
		int i=0;
		while(true){
			System.out.print("Enter a number : ");
			if(i<A.length){
				A[i] = sc.nextInt();
			}
			else{
				System.out.println("\n" + A[0]);
				help.rearrange(A);
				i--;
				A[i] = sc.nextInt();
			}
			if(A[i]<0){
				break;
			}
			i++;
			help.min_Buildheap(A, i);
		}
		sc.close();
	}
}
