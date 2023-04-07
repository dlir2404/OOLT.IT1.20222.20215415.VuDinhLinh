package lab01;

import javax.swing.JOptionPane;

public class SolveDegreeEquation {
	public static double[] getInput1() {
		double[] input = new double[2];
		String stra = JOptionPane.showInputDialog(null, "Enter a: ", "Input a", JOptionPane.INFORMATION_MESSAGE);
		String strb = JOptionPane.showInputDialog(null, "Enter b: ", "Input b", JOptionPane.INFORMATION_MESSAGE);
		input[0] = Double.parseDouble(stra);
		input[1] = Double.parseDouble(strb);
		return input;
	}
	public static double[] getInput2() {
		double[] input = new double[3];
		String stra = JOptionPane.showInputDialog(null, "Enter a: ", "Input a", JOptionPane.INFORMATION_MESSAGE);
		String strb = JOptionPane.showInputDialog(null, "Enter b: ", "Input b", JOptionPane.INFORMATION_MESSAGE);
		String strc = JOptionPane.showInputDialog(null, "Enter c: ", "Input c", JOptionPane.INFORMATION_MESSAGE);
		input[0] = Double.parseDouble(stra);
		input[1] = Double.parseDouble(strb);
		input[2] = Double.parseDouble(strc);
		return input;
	}
	public static void solveFirstDegEquat1(double a, double b) {
		if (a == 0 && b == 0) {
	        JOptionPane.showMessageDialog(null, "The equation has infinitely many solutions");
	    } else if (a == 0) {
	        JOptionPane.showMessageDialog(null, "The equation has no solution");
	    } else {
	        double x = -b/a;
	        JOptionPane.showMessageDialog(null, "The solution is: " + x);
	    }
	}
	public static void solveFirstDegEquat2(double a, double b, double c) {
		if (a == 0 && b ==0 )
			if (c==0)
			JOptionPane.showMessageDialog(null, "This equation is always true");
			else
			JOptionPane.showMessageDialog(null, "The equation has no solution");
		else if (a == 0 && b !=0 )
			solveFirstDegEquat1(b, c);
		else if (a != 0 && b ==0)
			solveFirstDegEquat1(a, c);
		else {
			JOptionPane.showMessageDialog(null, "x = t;\n" + "y = " + (-a/b) + "t + " + (-c/b));
		}
	}
	public static void solveSecDegEquat(double a,double b,double c) {
		if (a == 0)
			solveFirstDegEquat1(b, c);
		else
		{
			double d = b*b - 4*a*c;
			if (d < 0)
				JOptionPane.showMessageDialog(null, "The equation has no solution");
			else if (d == 0)
				JOptionPane.showMessageDialog(null, "x = " + (-b/(2*a)));
			else {
				double sqrtd = Math.sqrt(d);
				JOptionPane.showMessageDialog(null, "x1 = " + (-b+sqrtd)/(2*a) 
						+ "\nx2 = " + (-b-sqrtd)/(2*a));
			}
		}
	}
	public static void main(String[] args) {
		String choice;
		choice = JOptionPane.showInputDialog(null, "Which degree equation do you want to solve?\n 1. ax + b = 0 \n 2. ax + by + c = 0 \n 3. ax^2 + bx + c = 0");
	switch (choice) {
	case "1":
	{	
		double[] input1 = new double[2];
		input1 = getInput1();
		solveFirstDegEquat1(input1[0], input1[1]);
		break;
	}
	case "2":
	{
		double[] input2 = new double[3];
		input2 = getInput2();
		solveFirstDegEquat2(input2[0], input2[1], input2[2]);
			break;
	}
	case "3":
	{
		double[] input3 = new double[3];
		input3 = getInput2();
		solveSecDegEquat(input3[0], input3[1], input3[2]);
		break;
	}
	default: 
		JOptionPane.showMessageDialog(null, "Inputs are invalid!");
	}
	}
}
