class Example8{
	
	String name = "Farooque";
	int age = 21;
	Example7 exm1 = new Example7();
	
	
	void displayDetails(){
		System.out.println("Employee Details are: ");
		System.out.println("Manager name is " + name);
		System.out.println("Manager Age is " + age);
		exm1.displayInfo();
	}
	
	void displayColDetails(){
		System.out.println("Employee Company Details are: ");
		exm1.colDetails();
	}
	
	public static void main(String[] args){
		Example8 exm8 = new Example8();
		exm8.displayDetails();
		exm8.displayColDetails();
		
	}	
}