package insertionsort;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionHelper help = new InsertionHelper();
		int A[] = {1,9,7,5,2,3,6,4,8};
		help.print(A);
		help.sort(A);
		help.print(A);
	}

}
