package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickels = JOptionPane.showInputDialog("how many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
		int n=Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
		String dime = JOptionPane.showInputDialog("how many dimes do you have?");
		int d=Integer.parseInt(dime);
		// Ask the user how many quarters they have, and convert their answer
		String quarters = JOptionPane.showInputDialog("how many quarters do you have");
		int q=Integer.parseInt(quarters);
		// Calculate how much money the user has.  Hint: Use a double variable
	double totalMoney=(q*.25)+(d*.10)+(n*.05);
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
		JOptionPane.showMessageDialog(null, totalMoney);
	}
}

