// 1.Declare and print an array
//8.Print elements at even indices
package Array_Problems;
import java.util.*;
public class EvenElementIndices{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i =0; i<n; i++) {
			a[i] = s.nextInt();
		}
		int even = 0;
		int odd = 0;
		System.out.println("Elements of the array:");

		for (int i =0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");

		System.out.println("Elements at even indices of the array:");

		for (int i =0; i<n; i++) {
			if (i % 2 ==0) {
				System.out.print(a[i] + " ");
			}
		}
	}
}