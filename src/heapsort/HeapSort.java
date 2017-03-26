package heapsort;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeapHelper help = new HeapHelper();
		int A[] = {1,9,7,5,2,3,6,4,8};
		System.out.println("For descending sort");
		help.print(A);
		help.max_Buildheap(A);
		help.print(A);
		int B[] = help.max_Sort(A);
		help.print(B);
		
		System.out.println("For ascending sort");
		int C[] = {1,9,7,5,2,3,6,4,8};
		help.print(C);
		help.min_Buildheap(C);
		help.print(C);
		int D[] = help.min_Sort(C);
		help.print(D);
	}
}
