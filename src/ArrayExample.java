/**
 * 
 * ArrayExample from https://techfornontechies.com/programming-non-techies-arrays/
 *
 */
public class ArrayExample {

	public static void main(String[] args) {
		int[] intArray = new int[3];
		
		intArray[0] = 22;
		intArray[1] = 33;
		intArray[2] = 44;
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println("intArray[" + i + "] = " + intArray[i]);
		}
	}
}
