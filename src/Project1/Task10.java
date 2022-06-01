package Project1;

public class Task10 {

	public static void main(String[] args) {
		
		// Write a java program to find the second largest number in the array
		
				// an array that holds the numbers
				int[] num = {1, 9, 5, 18, 8, 3}; // {1, 3, 5, 8, 9, 18}
				
				int n = num.length;
				
				// create two variables to hold largest and 2nd largest variables
				int largest = 0; // Integer.MIN_VALUE can also be used
				int secondLargest = 0; //Integer.MIN_VALUE can also be used
				
				// traversing an array
				for (int i = 0; i < n; i++) {
					
					if (num[i] > largest) {
						secondLargest = largest;
						largest = num [i];
					}
					
					if (num[i] < largest && num[i] > secondLargest) {
						secondLargest = num[i];
					}
					
				}
				System.out.println("The second largest number is: " + secondLargest);


	}

}
