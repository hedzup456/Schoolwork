/**
 * 
 */
package JavaBooklet4;

/**
 * @author Richard
 *
 */
public class Homework1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
	    // reverse the data
		int l = data.length-1;
	    for ( int j=0; j < (l/2)+1; j++){
	    	int t = data[j];
	    	data[j] = data[l-j];
	    	data[l-j] = t;
	    }
	    // write out the new data
	    for ( int j=0; j < data.length; j++) System.out.println(data[j]);
	}

}
