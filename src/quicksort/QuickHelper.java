package quicksort;

import helper.*;

public class QuickHelper extends Helper{
	static private int maxstacksize = 0;
	static private int stacksize = 0;
	
	int partition(int A[], int p, int r){
		int x = A[r];
		int i = p-1;
		for(int j=p; j<=r-1; j++){
			if(A[j]<=x){
				i++;
				int temp = A[j];
				A[j]=A[i];
				A[i] =temp;
			}
		}
		int temp = A[i+1];
		A[i+1] = A[r];
		A[r] = temp;
		return i+1;
	}
	
	void sort(int A[], int p, int r){
		if(p<r){
			int q = partition(A, p, r);
			sort(A,p,q-1);
			sort(A,q+1,r);
		}
	}
	
	void tailrecursivesort(int A[], int p, int r){
		stackdepth();
		while(p<r){
			int q = partition(A, p, r);
			tailrecursivesort(A, p, q-1);
			p = q+1;
		}
		stacksize--;
	}
	
	void improvedtailrecursivesort(int A[], int p, int r){
		stackdepth();
		while(p<r){
			int q = partition(A, p, r);
			System.out.println("q: "+q+ " p: "+p + " r: "+ r);
			if(q<(p+r)/2){
				improvedtailrecursivesort(A, p, q-1);
				p=q;
			}
			else{
				improvedtailrecursivesort(A, q+1, r);
				r=q-1;
			}
		}
		stacksize--;
	}
	
	private void stackdepth(){
		stacksize++;
		if(maxstacksize<stacksize)
			maxstacksize = stacksize;
	}
	protected void print(int A[]){
		System.out.println("Max stack size : " + maxstacksize);
		super.print(A);
		stacksize = 0;
		maxstacksize = 0;
	}
}
