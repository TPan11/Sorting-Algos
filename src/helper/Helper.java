package helper;

public class Helper {
	protected void print(int A[]){
		for(int i=0; i<A.length; i++){
			System.out.print(A[i] + "  ");
		}
		System.out.println();
	}
	
	protected void print(int A[], int size){
		for(int i=0; i<size; i++){
			System.out.print(A[i] + "  ");
		}
		System.out.println();
	}
}
