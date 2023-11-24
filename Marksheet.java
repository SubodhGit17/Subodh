class Marksheet{
	
	
	void calculateGrade(int mark){
		if(mark < 0 || mark > 100){
			System.out.println("Invalid Score");
		}
		else if(mark <= 100 && mark >= 90){
			System.out.println("O Grade");
		}
		else if(mark <= 90 && mark >= 80){
			System.out.println("A+ Grade");
		}
		else if(mark <= 80 && mark >= 70){
			System.out.println("A Grade");
		}
		else if(mark <= 70 && mark >= 60){
			System.out.println("B Grade");
		}
		else{
			System.out.println("You need to work hard");
		}
	}
		
	public static void main(String[] args){
		Marksheet marksheet = new Marksheet();
		marksheet.calculateGrade(0);
	
	}
	
	
	
	
	
}
