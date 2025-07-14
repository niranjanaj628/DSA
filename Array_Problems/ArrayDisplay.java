// 1.Declare and print an array
package Array_Problems;
import java.util.*;
public class ArrayDisplay{
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		System.out.println("Elements of the array:");
		for (int i =0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}