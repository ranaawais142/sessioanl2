public class Main {

	/** @return the sum of the numbers in the array */
	public static int sum(int[] arr) {
	    int sum = 0;
	   // for (int x : list)
	    for (int i = 0; i < arr.length; ++i)
	        sum += arr[i];
	    return sum;
	}
	/** @return the sum of the absolute values of the numbers in the array */
	public static int sumAbsolute(int[] arr) {
	    // let's reuse sum(), because DRY, so first we take absolute values
	    for (int i = 0; i < arr.length; ++i)
	    	arr[i]= Math.abs(arr[i]);
	    return sum(arr);
	}
	public static void main(String[] args) {
		
	    int[] myData={-5,-3,-2};
	    System.out.println(sum(myData));

		System.out.println(sumAbsolute(myData));
	    System.out.println(sum(myData));
	}

}
