package heapsort;

import helper.*;

public class HeapHelper extends Helper{
	void max_Heapify(int i, int A[]){
		if(2*i<=A.length){
			int j=0;
			if((2*i)+1 <= A.length){
				j = max_index((2*i)-1,2*i, A);
			}
			else{
				j = (2*i)-1;
			}
			if(A[i-1] < A[j]){
				int temp = A[i-1];
				A[i-1] = A[j];
				A[j] = temp;
				max_Heapify(j+1, A);
			}
		}
		//return A;
	}
	
	void max_Buildheap(int A[]){
		for(int i=A.length; i>=1; i--){
			max_Heapify(i, A);
		}
		//return A;
	}
	
	int[] max_Sort(int A[]){
		int i=0, n=A.length;
		int B[] = new int[n];
		while(A[0] != Integer.MIN_VALUE){
			B[i++] = A[0];
			A[0] = A[n-i];
			A[n-i] = Integer.MIN_VALUE;
			max_Heapify(1, A);
		}
		return B;
	}
	
	void min_Heapify(int i, int A[]){
		if(2*i<=A.length){
			int j=0;
			if((2*i)+1 <= A.length){
				j = min_index((2*i)-1,2*i, A);
			}
			else{
				j = (2*i)-1;
			}
			if(A[i-1] > A[j]){
				int temp = A[i-1];
				A[i-1] = A[j];
				A[j] = temp;
				min_Heapify(j+1, A);
			}
		}
		//return A;
	}
	
	void min_Buildheap(int A[]){
		for(int i=A.length; i>=1; i--){
			min_Heapify(i, A);
		}
		//return A;
	}
	
	int[] min_Sort(int A[]){
		int i=0, n=A.length;
		int B[] = new int[n];
		while(A[0] != Integer.MAX_VALUE){
			B[i++] = A[0];
			A[0] = A[n-i];
			A[n-i] = Integer.MAX_VALUE;
			min_Heapify(1, A);
		}
		return B;
	}
	
	
	
	
	int min_index(int a, int b, int A[]){
		return A[a]<A[b]?a:b;
	}
	
	int max_index(int a, int b, int A[]){
		return A[a]>A[b]?a:b;
	}
	
	protected void print(int A[]){
		super.print(A);
	}
}
