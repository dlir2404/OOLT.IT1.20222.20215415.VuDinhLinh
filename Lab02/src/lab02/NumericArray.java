package lab02;

import java.util.Arrays;

class NumericArray {
	public static void main(String[] args) {
		int[] my_array1 = {1789, 2035, 1899, 1456, 2013};
		int sum = 0;
		int n = my_array1.length;
		float average = 0;
		int tmp = 0;
		for (int i = 0; i < n-1; i++)
		{
			for (int j = n-1; j > i; j--)
				if (my_array1[j] < my_array1[j-1]) {
					tmp = my_array1[j];
					my_array1[j] = my_array1[j-1];
					my_array1[j-1] = tmp;
				}
		}
		for (int i = 0; i < n; i++)
			sum += my_array1[i];
		average = (float) sum/n;
		String test = Arrays.toString(my_array1);
		System.out.println(test + "\nSum = " + sum + "\nAverage = " + average );
	}
}
