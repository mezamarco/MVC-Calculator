package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

	private CalculatorView theView;
	private CalculatorModel theModel;
	
	//Constructor
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.addCalculationListener(new CalculateListener());
		this.theView.subtractCalculationListener(new CalculateListener());
		this.theView.multCalculationListener(new CalculateListener());
		this.theView.divCalculationListener(new CalculateListener());
		this.theView.modCalculationListener(new CalculateListener());
		this.theView.factCalculationListener(new CalculateListener());
		this.theView.fibCalculationListener(new CalculateListener());

	}
	
	//We will have an inner class
	class CalculateListener implements ActionListener{
		
			public void actionPerformed(ActionEvent arg0) {
				
				
				int firstNum = theView.getFirstNum();
				int secondNum = theView.getSecondNum();
				
				try {
				theModel.addTwoNumbers(firstNum,secondNum);
				
				theView.setCalcSolution(theModel.getCalculationValue());
				}
				catch(NumberFormatException ex) {
					theView.displayErrorMessage("You need to enter 2 integers.");
				}
		
				int subFirstNum = theView.getSubFirstNum();
				int subSecondNum = theView.getSubSecondNum();
				
				try {
				theModel.subtractTwoNumbers(subFirstNum,subSecondNum);
				
				theView.setCalcSubtractSolution(theModel.getSubtractCalculationValue());
				}
				catch(NumberFormatException ex) {
					theView.displayErrorMessage("You need to enter 2 integers.");
				}
				
				
				int thirdNum = theView.getThirdNum();
				int  fourthNum = theView.getFourthNum();
				
				try {
					theModel.multTwoNumbers(thirdNum,fourthNum);
					
					theView.setCalcMultSolution(theModel.getMultCalculationValue());
					}
					catch(NumberFormatException ex) {
						theView.displayErrorMessage("You need to enter 2 integers.");
					}
				
				int fifthNum = theView.getFifthNum();
				int sixthNum = theView.getSixthNum();
				
				try {
					theModel.divTwoNumbers(fifthNum,sixthNum);
					
					theView.setCalcDivSolution(theModel.getDivCalculationValue());
					}
					catch(NumberFormatException ex) {
						theView.displayErrorMessage("You need to enter 2 integers.");
					}
				
				
				int seventhNum = theView.getSeventhNum();
				int eigthNum = theView.getEigthNum();
				
				try {
					theModel.modTwoNumbers(seventhNum,eigthNum);
					
					theView.setCalcModSolution(theModel.getModCalculationValue());
					}
					catch(NumberFormatException ex) {
						theView.displayErrorMessage("You need to enter 2 integers.");
					}
				
				int ninthNum = theView.getNinthNum();
				
				
					theModel.factorial(ninthNum);
					
					theView.setCalcFactSolution(theModel.getFactCalculationValue());
				
					
				
				int tenthNum = theView.getTenthNum();
				
				
					theModel.fib(tenthNum);
					
					theView.setCalcFibSolution(theModel.getFibCalculationValue());
					
				
				
				
				
			}
	}
}
