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
		this.theView.subtractCalculationListener(new SubCalculateListener());
		this.theView.multCalculationListener(new MultCalculateListener());
		this.theView.divCalculationListener(new DivCalculateListener());
		this.theView.modCalculationListener(new ModCalculateListener());
		this.theView.factCalculationListener(new FactCalculateListener());
		this.theView.fibCalculationListener(new FibCalculateListener());

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
			}		
	}
	
	class SubCalculateListener implements ActionListener{
				
			public void actionPerformed(ActionEvent arg0) {
					
					int subFirstNum = theView.getSubFirstNum();
					int subSecondNum = theView.getSubSecondNum();
					
					try {
					theModel.subtractTwoNumbers(subFirstNum,subSecondNum);
					
					theView.setCalcSubtractSolution(theModel.getSubtractCalculationValue());
					}
					catch(NumberFormatException ex) {
						theView.displayErrorMessage("You need to enter 2 integers.");
					}
			}	
	}
	
	class MultCalculateListener implements ActionListener{
		
		public void actionPerformed(ActionEvent arg0) {
			

			int thirdNum = theView.getThirdNum();
			int  fourthNum = theView.getFourthNum();
			
			try {
				theModel.multTwoNumbers(thirdNum,fourthNum);
				
				theView.setCalcMultSolution(theModel.getMultCalculationValue());
				}
				catch(NumberFormatException ex) {
					theView.displayErrorMessage("You need to enter 2 integers.");
				}
		}
	 }	

	class DivCalculateListener implements ActionListener{
		
		public void actionPerformed(ActionEvent arg0) {
			
			int fifthNum = theView.getFifthNum();
			int sixthNum = theView.getSixthNum();
			
			try {
				theModel.divTwoNumbers(fifthNum,sixthNum);
				
				theView.setCalcDivSolution(theModel.getDivCalculationValue());
				}
				catch(NumberFormatException ex) {
					theView.displayErrorMessage("You need to enter 2 integers.");
				}

		}
	 }	

	class ModCalculateListener implements ActionListener{
		
		public void actionPerformed(ActionEvent arg0) {

			int seventhNum = theView.getSeventhNum();
			int eigthNum = theView.getEigthNum();
			
			try {
				theModel.modTwoNumbers(seventhNum,eigthNum);
				
				theView.setCalcModSolution(theModel.getModCalculationValue());
				}
				catch(NumberFormatException ex) {
					theView.displayErrorMessage("You need to enter 2 integers.");
				}
		}
	 }	

	class FactCalculateListener implements ActionListener{
		
		public void actionPerformed(ActionEvent arg0) {
	
			int ninthNum = theView.getNinthNum();
			theModel.factorial(ninthNum);	
			theView.setCalcFactSolution(theModel.getFactCalculationValue());
		}
	}	

	
	class FibCalculateListener implements ActionListener{
	
		public void actionPerformed(ActionEvent arg0) {
		
			int tenthNum = theView.getTenthNum();
			theModel.fib(tenthNum);	
			theView.setCalcFibSolution(theModel.getFibCalculationValue());
		}
	}
}
				
				
				
