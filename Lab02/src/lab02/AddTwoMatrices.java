package lab02;

import java.util.Arrays;
import java.util.Scanner;
public class AddTwoMatrices {
	public static void getInput(double[][] a,int n, int m) {
		Scanner sc1 = new Scanner(System.in);
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
			{
				System.out.println("Enter the [" + i + "][" + j + "]: ");
				a[i][j] = sc1.nextDouble();
			}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isValid = false;
		int rows = 0, cols = 0;
		while (!isValid) {
		System.out.println("Enter number of rows: ");
		rows = sc.nextInt();
		if (rows <= 0)	
		{
			System.out.println("Number of rows is invalid!");
			continue;
		}
		System.out.println("Enter number of colums: ");
		cols = sc.nextInt();
		if (cols <= 0)	
		{
			System.out.println("Number of colums is invalid!");
			continue;
		}
		isValid = true;
		}
		double[][] matrice1 = new double[rows][cols];
		double[][] matrice2 = new double[rows][cols];
		double[][] matrice3 = new double[rows][cols];
		System.out.println("Enter the matrices 1:");
		getInput(matrice1, rows, cols);
		System.out.println("Enter the matrices 2:");
		getInput(matrice2, rows, cols);
		System.out.println("Sum of two matrices: ");
		for (int i = 0; i < rows; i++)
			{
			for (int j = 0; j < cols; j++)
				{
					matrice3[i][j] =  matrice1[i][j] + matrice2[i][j];
				}
			String temp = Arrays.toString(matrice3[i]);
			System.out.println(temp);
			}	
		sc.close();
	}
}
