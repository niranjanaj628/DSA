// 5.Find the minimum element
package Array_Problems;
import java.util.*;
public class MinOfElements{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i =0; i<n; i++) {
			a[i] = s.nextInt();
		}
		int min = a[0];
		System.out.println("Elements of the array:");

		for (int i =0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");
		
		for (int i =1; i<n; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}

		System.out.println("Minimum element in the array = " + min);

	}
}