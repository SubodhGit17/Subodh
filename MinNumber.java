class MinNumber{
	
	
	void minNumber(int num1, int num2){
		
		if(num1 < num2){
			System.out.println(num1 + " Is minimum number");
		}
		else{
			System.out.println(num2 + " Is minimum number");
		}
	} 
	
	void maxNumber(int num1, int num2){
		
		if(num1 > num2){
			System.out.println(num1 + " Is maximum number");
		}
		else{
			System.out.println(num2 + " Is maximum number");
		}	

	}
	public static void main(String[] args){
		MinNumber min = new MinNumber();
		min.minNumber(20,30);
		min.maxNumber(20,30);
	}
}