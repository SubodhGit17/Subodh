class Month{
	//NESTED if else 
	void month(int num1){
		if(num1 >= 1 && num1 <=3){
			System.out.println("Q1");
			System.out.println("WINTER");
		}
		else if(num1 >= 4 && num1 <=6){
			System.out.println("Q2");
			System.out.println("SUMMER");
		}
		else if(num1 >= 7 && num1 <=9){
			System.out.println("Q3");
			System.out.println("MONSOON");
		}
		else if(num1 >= 10 && num1 <=12){
			System.out.println("Q4");
			System.out.println("WINTER");
		}
		else{
			System.out.println("Invalid Value");
		}
		if(num1 == 1){
			System.out.println("JANUARY");
		}
		if(num1 == 2){
			System.out.println("FEBRUARY");
		}
		if(num1 == 3){
			System.out.println("MARCH");
		}
		if(num1 == 4){
			System.out.println("APRIL");
		}
		if(num1 == 5){
			System.out.println("MAY");
		}
		if(num1 == 6){
			System.out.println("JUNE");
		}
		if(num1 == 7){
			System.out.println("JULY");
		}
		if(num1 == 8){
			System.out.println("AUGUST");
		}
		if(num1 == 9){
			System.out.println("SEPTEMBER");
		}
		if(num1 == 10){
			System.out.println("OCTOBER");
		}
		if(num1 == 11){
			System.out.println("NOVEMBER");
		}
		if(num1 == 12){
			System.out.println("DECEMBER");
		}
	
	}
	
	public static void main(String[] args){
		Month monthIndex = new Month();
		monthIndex.month(12);
	}
}



































































































