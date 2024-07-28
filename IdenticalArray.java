/****************************************
*
* Student Name: Andrew Cart
* Date Due: 12/04/23
* Date Submitted:12/01/23
* Program Name:Identical Arrays
* Program Description: A program where the user enters two lists of integers and it says if the lists are identical
*
*
****************************************/
package Chapter7Homework;
import java.util.Scanner;
public class IdenticalArray {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.println("Enter list1");
		int numberofvalues1 = user.nextInt();
		int[] list1 = new int[numberofvalues1];
		for(int i = 0; i< numberofvalues1; i++) {
			list1[i] = user.nextInt();
		}
		System.out.println("Enter list2");
		int numberofvalues2 = user.nextInt();
		int[] list2 = new int[numberofvalues2];
		for(int i = 0; i<numberofvalues2; i++) {
			list2[i] = user.nextInt();
		}
		
		
		
		if(equals(list1, list2))
			System.out.println("Two lists are identical");
		else
			System.out.println("Two lists are not identical");
		
	}
	public static boolean equals(int[] list1, int[] list2) {
		
		
			if(list1.length == list2.length) {
			for(int i=0; i<list1.length;i++) {
				if(list1[i] == list2[i]) {
			}
				else
					return false;
				
		}
			return true;
		
			}
		
	
		
			return false;

}
}
