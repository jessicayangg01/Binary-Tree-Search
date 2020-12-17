//CS2210a 2020
//Jessica Yang
//Student Number: 251083596
//ID: jyang762
//Date: September 23, 2020

public class Symmetric {	
	/*
	 * Method isSymmetric takes an array and its length, and returns true if the values of A[i] and A[n-1-i] is the same
	 */
	public boolean isSymmetric(int[] A, int n){
		// Input: Array A storing n >= 1 integer values
	    // Output: true if A is symmetric; false otherwise
		for (int i = 0; i<n/2; i++) { //loops through half of the array and checks to see if A[i] = A[n-1-i]
			if (A[i]!= A[n-i-1]) return false; //return false if the results do not match
		}
		return true; //all results match. return true
	}

}
