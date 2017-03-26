package ksortedarray;

import helper.Helper;

public class KsortingHelper extends Helper{
	
	void sort(int A[], int size){
		int key, j;
		for(int i=1; i<size; i++){
			key = A[i];
			j = i-1;
			
			while(j>=0 && A[j] > key){
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = key;
		}
	}
	
	void rearrange(int A[]){
		for(int i=0; i<A.length-1;i++){
			A[i] = A[i+1];
		}
	}
	
	
	void min_Heapify(int i, int A[], int size){
		if(2*i<=size){
			int j=0;
			if((2*i)+1 <= size){
				j = min_index((2*i)-1,2*i, A);
			}
			else{
				j = (2*i)-1;
			}
			if(A[i-1] > A[j]){
				int temp = A[i-1];
				A[i-1] = A[j];
				A[j] = temp;
				min_Heapify(j+1, A, size);
			}
		}
		//return A;
	}
	
	void min_Buildheap(int A[], int size){
		for(int i=size; i>=1; i--){
			min_Heapify(i, A, size);
		}
		//return A;
	}
	
	int min_index(int a, int b, int A[]){
		return A[a]<A[b]?a:b;
	}
	
	protected void print(int A[], int size){
		super.print(A,size);
	}
}
