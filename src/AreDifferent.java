
public class AreDifferent {

	public static void main(String[] args) {
		int[] A = new int[] {9,32,2,5,23,1};
		int n = A.length;
		System.out.println(areDifferent(A, n));

	}
	/*
	 * Method areDifferent returns true if all cells in array A are different values
	 */
	public static boolean areDifferent(int[] A, int n) {
		for (int i=0; i<n; i++) { //goes through every single value in the array
			for (int j=i+1; j<n; j++) { //compares every cell after the focused cell to check if the value is different
				if (A[i]==A[j]) return false; // if the value is the same, return false
			}
		}
		return true; //when the loop is done and all entries are the different, return true
	}

}
