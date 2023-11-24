class Calendar{
	
	void printDay(int dayIndex){
		
		if(dayIndex < 8 && dayIndex < 0){	
			System.out.println("Invalid Day");
		}
		else if(dayIndex == 7){
			System.out.println("Saturday");	
		}
		else if(dayIndex == 6){
			System.out.println("Friday");	
		}
		else if(dayIndex == 5){
			System.out.println("Thursday");	
		}
		else if(dayIndex == 4){
			System.out.println("Wednesday");	
		}
		else if(dayIndex == 3){
			System.out.println("Tuesday");	
		}
		else if(dayIndex == 2){
			System.out.println("Monday");	
		}
		else if(dayIndex == 1){
			System.out.println("Sunday");	
		}
	}
	
	public static void main(String[] args){
		Calendar cal = new Calendar();
		cal.printDay(8);
		cal.printDay(-1);
	}
}





































