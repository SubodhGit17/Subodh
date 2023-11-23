class Example11{
	
	int i;
	
	void processData(){
		for(i=0; i<=200; i++){
			if(i%3 == 0 && i % 5 ==0){
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args){
		Example11 exm = new Example11();
		exm.processData();
	}
}





































