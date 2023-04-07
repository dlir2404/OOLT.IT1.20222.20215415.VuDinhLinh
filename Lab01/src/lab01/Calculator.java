package lab01;

import javax.swing.JOptionPane;

class Calculator {
	public static void main(String[] args) {
		String strNum1, strNum2;
		
		strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ",
				"Input the first number", JOptionPane.INFORMATION_MESSAGE);

		strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ",
				"Input the second number", JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		
		String strSum = Double.toString(num1 + num2);
		String sum = strNum1 + " + "+  strNum2 +  " = " + strSum;
		String strDiff1 = Double.toString(num1 - num2);
		String diff1 = strNum1 + " - " + strNum2 + " = " + strDiff1;
		String strDiff2 = Double.toString(num2 - num1);
		String diff2 = strNum2 + " - " + strNum1 + " = " + strDiff2;
		String strProd = Double.toString(num1*num2);
		String prod = strNum1 + "*" + strNum2 + " = " + strProd;
		String quot1, quot2;
		if (num2 == 0) {
			quot1 = strNum1 + "/" + strNum2 + " does not exits";
		}
		else 
		{
			String strQuot1 = Double.toString(num1/num2);
			quot1 = strNum1 + "/" + strNum2 + " = " + strQuot1;
		}	
		if (num1 == 0) 
			quot2 = strNum2 + "/" + strNum1 + " does not exit";
		else
		{
			String strQuot2 = Double.toString(num2/num1);
			quot2 = strNum2 + "/" + strNum1 + " = " + strQuot2;
		}	
		
			JOptionPane.showMessageDialog(null, sum + "\n" + diff1 + "\n" + diff2 
					+ "\n" + prod + "\n" + quot1 + "\n" + quot2);
	}
}
