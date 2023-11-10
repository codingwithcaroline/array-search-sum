/**
 * Provides a sum function on arrays.
 *
 * @author Caroline Kirkconnell (CarolineKirkconnell8@gmail.com)
 * @version final
 */
public class ArraySum {

	/** Returns the sum of values in the given array. 
   *@return sum - used
   *@param a - used
   *@param left - unused
   *@param right unused
   */
   public static int sum(int[] a, int left, int right) {
      int sum = 0;
      int i;
      for (i = 0; i < a.length; i++) {
         sum += a[i];
      }     
      return sum;
   }
}
