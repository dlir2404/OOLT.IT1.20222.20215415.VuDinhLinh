package lab02;

import java.util.Scanner;
public class DisplayTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of the triangle (n>0): ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
		{
			for (int j = 0;j < 2*n-1; j++)
				if(j >= (n-1-i)&& j <= (n-1+i))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
		sc.close();
	}

}
