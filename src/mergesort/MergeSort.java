package mergesort;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,9,7,5,2,3,6,4,8};
		MergeHelper help = new MergeHelper();
		help.print(A);
		help.sort(A, 0, A.length-1);
		help.print(A);
	}
}
