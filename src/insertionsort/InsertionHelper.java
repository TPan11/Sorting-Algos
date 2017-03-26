package insertionsort;
import helper.*;

public class InsertionHelper extends Helper{
	public void sort(int A[]){
		for(int i=1; i<A.length; i++){
			int x = A[i];
			int j = i-1;
			while(j>=0 & A[j]>x){
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = x;
		}
	}
	
	public void print(int A[]){
		super.print(A);
	}
}
