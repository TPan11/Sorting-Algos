package quicksort;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickHelper help = new QuickHelper();
		
		System.out.println("Now starting A");
		int A[] = {5,2,12,7,9,6};
		help.print(A);
		int n= A.length;
		help.sort(A, 0, n-1);
		help.print(A);
		
		System.out.println("\nNow starting B");
		int B[] = {1,2,3,4};
		help.print(B);
		n = B.length;
		help.tailrecursivesort(B, 0, n-1);
		help.print(B);
		
		System.out.println("\nNow starting C");
		int C[] = {1,2,3,4};
		help.print(C);
		n = C.length;
		help.improvedtailrecursivesort(C, 0, n-1);
		help.print(C);
	}

}
