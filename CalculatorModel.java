package calculator;

public class CalculatorModel {
	
	private int calculationValue;
	private int subtractSolution;
	private int multSolution;
	private int divSolution;
	private int modSolution;
	private int factSolution;
	private int fibSolution;
	
	
	
	
	//Setter Functions
	public void addTwoNumbers(int firstNum, int secondNum) {
		calculationValue = firstNum+secondNum;
	}
	
	public void subtractTwoNumbers(int firstNum, int secondNum) {
		subtractSolution = firstNum-secondNum;
	}
	public void multTwoNumbers(int firstNum, int secondNum) {
		multSolution = firstNum*secondNum;
	}
	
	public void divTwoNumbers(int firstNum, int secondNum) {
		
		if(secondNum <= 0) {
			divSolution = -1;
			return;
		}
		
		int sum = secondNum;
		int counter = 0;
		
		while( sum <= firstNum) {
			
			sum = sum + secondNum;
			++counter;
		}	
		divSolution = counter;
		return;
	}
	
	public void modTwoNumbers(int firstNum, int secondNum) {
		
		if( secondNum <= 0) {
			modSolution = -1;
			return;
		}
		
		int div = firstNum / secondNum;
		int rem = firstNum - (secondNum* div);
		
		modSolution = rem;
		return;
	}
	
	
	
	public int recursiveFact(int n) {
		if(n <= 0) {
			return 1;
		}
		return n * recursiveFact(n-1);
	}
	
	
	
	public int dynamicFib(int n) {
		if(n<=0) {
			return 0;
		}
		
		int arr[] = new int[n+1];
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		return arr[n];
	}
	
	
	public void factorial(int n) {
		factSolution = recursiveFact(n);
		return;
	}
	
	public void fib(int n) {
		fibSolution = dynamicFib(n);
		return;
	}
	
	
	//Getter Functions
	public int getCalculationValue() {
		return calculationValue;
	}
	public int getSubtractCalculationValue() {
		return subtractSolution;
	}
	public int getMultCalculationValue() {
		return multSolution;
	}
	public int getDivCalculationValue() {
		return divSolution;
	}
	public int getModCalculationValue() {
		return modSolution;
	}
	public int getFactCalculationValue() {
		return factSolution;
	}
	public int getFibCalculationValue() {
		return fibSolution;
	}
	
}
