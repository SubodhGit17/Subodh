class Calculator{
	
	int num1 = 10;
	int num2 = 2;
	
	void add(){
		int total = num1 + num2;
		System.out.println("Addition of two number is " + total);
	}
	
	void sub(){
		int total = num1 - num2;
		System.out.println("Subtraction of two number is " + total);
	}
	
	void div(){
		int total = num1 / num2;
		System.out.println("Division of two number is " + total);
	}
	
	void mul(){
		int total = num1 * num2;
		System.out.println("Multiplication of two number is " + total);
	}
		
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.div();
		calculator.mul();
	}
}