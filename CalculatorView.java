package calculator;



//This will be the user interface
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorView extends JFrame {
	
	private JTextField firstNum = new JTextField(10);	
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNum = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate Addition");
	private JTextField calcSolution = new JTextField(10);
	
	private JTextField subFirstNum = new JTextField(10);
	private JLabel subtractLabel = new JLabel("-");
	private JTextField subSecondNum = new JTextField(10);
	private JButton calculateSubtractButton = new JButton("Calculate Subtraction");
	private JTextField calcSubtractSolution = new JTextField(10);
	
	private JTextField thirdNum = new JTextField(9);
	private JLabel multLabel = new JLabel("*");
	private JTextField fourthNum = new JTextField(9);
	private JButton calculateMultButton = new JButton("Calculate Multiplication");
	private JTextField calcMultSolution = new JTextField(10);

	private JTextField fifthNum = new JTextField(10);
	private JLabel divLabel = new JLabel("/");
	private JTextField sixthNum = new JTextField(10);
	private JButton calculateDivButton = new JButton("Calculate Division");
	private JTextField calcDivSolution = new JTextField(10);
	
	private JTextField seventhNum = new JTextField(10);
	private JLabel modLabel = new JLabel("%");
	private JTextField eigthNum = new JTextField(10);
	private JButton calculateModButton = new JButton("Calculate Mod");
	private JTextField calcModSolution = new JTextField(10);
	
	private JButton calculateFactButton = new JButton("Calculate Factorial");
	private JTextField ninthNum = new JTextField(15);
	private JLabel factEqualLabel = new JLabel("=");
	private JTextField calcFactSolution = new JTextField(10);
	
	private JButton calculateFibButton = new JButton("Calculate Fibonacci");
	private JTextField tenthNum = new JTextField(15);
	private JLabel fibEqualLabel = new JLabel("=");
	private JTextField calcFibSolution = new JTextField(10);
	
	private JLabel mainLabel = new JLabel("------------------------------------------CALCULATOR------------------------------------------");

	
	//Constructor
	CalculatorView(){
	
		
			JPanel calcPanel = new JPanel();
			//CLick x on panel and then it will make sure it closed
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			calcPanel.add(mainLabel);

			//Lets give the panel an order
			calcPanel.add(firstNum);
			calcPanel.add(additionLabel);
			calcPanel.add(secondNum);
			calcPanel.add(calculateButton);
			calcPanel.add(calcSolution);
			
			calcPanel.add(subFirstNum);
			calcPanel.add(subtractLabel);
			calcPanel.add(subSecondNum);
			calcPanel.add(calculateSubtractButton);
			calcPanel.add(calcSubtractSolution);
			
			calcPanel.add(thirdNum);
			calcPanel.add(multLabel);
			calcPanel.add(fourthNum);
			calcPanel.add(calculateMultButton);
			calcPanel.add(calcMultSolution);
			
			calcPanel.add(fifthNum);
			calcPanel.add(divLabel);
			calcPanel.add(sixthNum);
			calcPanel.add(calculateDivButton);
			calcPanel.add(calcDivSolution);
			
			calcPanel.add(seventhNum);
			calcPanel.add(modLabel);
			calcPanel.add(eigthNum);
			calcPanel.add(calculateModButton);
			calcPanel.add(calcModSolution);
			
			
			calcPanel.add(ninthNum);
			calcPanel.add(calculateFactButton);
			calcPanel.add(calcFactSolution);
			
			calcPanel.add(tenthNum);
			calcPanel.add(calculateFibButton);
			calcPanel.add(calcFibSolution);
		
			

			
			//We are done with the order and now we have to 
			//Add this to the current JFrame
			
			this.add(calcPanel);
			
			
	}
	
	
	//Note that when we get the text input then we have to convert it to an integer
	public int getFirstNum() {
		return Integer.parseInt(firstNum.getText());
	}
	public int getSecondNum() {
		return Integer.parseInt(secondNum.getText());
	}
	public int getCalcSolution() {
		return Integer.parseInt(calcSolution.getText());
	}
	
	public int getSubFirstNum() {
		return Integer.parseInt(subFirstNum.getText());
	}
	public int getSubSecondNum() {
		return Integer.parseInt(subSecondNum.getText());
	}
	public int getCalcSubtractionSolution() {
		return Integer.parseInt(calcSubtractSolution.getText());
	}
	
	public int getThirdNum() {
		return Integer.parseInt(thirdNum.getText());
	}
	public int getFourthNum() {
		return Integer.parseInt(fourthNum.getText());
	}
	public int getCalcMultSolution() {
		return Integer.parseInt(calcMultSolution.getText());
	}
	
	public int getFifthNum() {
		return Integer.parseInt(fifthNum.getText());
	}
	public int getSixthNum() {
		return Integer.parseInt(sixthNum.getText());
	}
	public int getCalcDivSolution() {
		return Integer.parseInt(calcDivSolution.getText());
	}
	
	public int getSeventhNum() {
		return Integer.parseInt(seventhNum.getText());
	}
	public int getEigthNum() {
		return Integer.parseInt(eigthNum.getText());
	}
	public int getCalcModSolution() {
		return Integer.parseInt(calcModSolution.getText());
	}
	
	public int getNinthNum() {
		return Integer.parseInt(ninthNum.getText());
	}
	public int getTenthNum() {
		return Integer.parseInt(tenthNum.getText());
	}
	
	public int getCalcFibSolution() {
		return Integer.parseInt(calcFibSolution.getText());
	}
	public int getCalcFactSolution() {
		return Integer.parseInt(calcFactSolution.getText());
	}
	
	
	
	
	
	
	
	//We should set the calculation solution, but the model will do this
	public void setCalcSolution(int solution) {
		calcSolution.setText(Integer.toString(solution));
	}
	
	void addCalculationListener(ActionListener listenerForCalcButton) {
		calculateButton.addActionListener(listenerForCalcButton);
	}
	
	void displayErrorMessage(String errorMessage) {
			JOptionPane.showMessageDialog(this, errorMessage);
	}
	
	
	
	public void setCalcSubtractSolution(int solution) {
		calcSubtractSolution.setText(Integer.toString(solution));
	}
	
	void subtractCalculationListener(ActionListener listenerForCalcMultButton) {
		calculateSubtractButton.addActionListener(listenerForCalcMultButton);
	}
	
	
	
	public void setCalcMultSolution(int solution) {
		calcMultSolution.setText(Integer.toString(solution));
	}
	
	void multCalculationListener(ActionListener listenerForCalcMultButton) {
		calculateMultButton.addActionListener(listenerForCalcMultButton);
	}
	
	
	
	public void setCalcDivSolution(int solution) {
		calcDivSolution.setText(Integer.toString(solution));
	}
	
	void divCalculationListener(ActionListener listenerForCalcButton) {
		calculateDivButton.addActionListener(listenerForCalcButton);
	}
	
	
	public void setCalcModSolution(int solution) {
		calcModSolution.setText(Integer.toString(solution));
	}
	
	void modCalculationListener(ActionListener listenerForCalcButton) {
		calculateModButton.addActionListener(listenerForCalcButton);
	}
	
	public void setCalcFibSolution(int solution) {
		calcFibSolution.setText(Integer.toString(solution));
	}
	
	void fibCalculationListener(ActionListener listenerForCalcButton) {
		calculateFibButton.addActionListener(listenerForCalcButton);
	}
	
	public void setCalcFactSolution(int solution) {
		calcFactSolution.setText(Integer.toString(solution));
	}
	
	void factCalculationListener(ActionListener listenerForCalcButton) {
		calculateFactButton.addActionListener(listenerForCalcButton);
	}
	
	
	
	
}
