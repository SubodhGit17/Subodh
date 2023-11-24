class Calendar1{
	
	void printDay(int dayIndex){
		if(dayIndex <= 7 || dayIndex > 0){
			System.out.println("Invalid Day");			
		}
		else if(dayIndex <=5 && dayIndex <=1){
			System.out.println("Week Day");	
		}
		else if(dayIndex <=5 && dayIndex <=1){
			System.out.println("Weekend");	
		}
	}
	
	public static void main(String[] args){
		Calendar1 cal = new Calendar1();
		cal.printDay(1);
	}
}