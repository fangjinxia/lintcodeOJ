package lintcode;

public class Subarray_Sum {
	/*
     * @param A: A list of integers
     * @param elem: An integer
     * @return: The new length after remove
     */
    public int removeElement(int[] A, int elem) {
        int res = 0;
        for(int i = 0; i < A.length; ++i){
            if(A[i] != elem){
                A[res++] = A[i];
            } 
        }
        return res;
    }
}
