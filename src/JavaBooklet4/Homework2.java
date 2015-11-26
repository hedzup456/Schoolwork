/**
 * 
 */
package JavaBooklet4;

/**
 * @author Richard
 *
 */
public class Homework2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		int l  = data.length;
		int[] result = new int[l];
	    // copy the data in reversed order to result
	    for ( int j=0; j < l; j++) {
	    	result[j] = data[(l-1)-j];
	    }
	    // write out the result
	    for ( int j=0; j < result.length; j++)System.out.println(result[j]);

	}

}
