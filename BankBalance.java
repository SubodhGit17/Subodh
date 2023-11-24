
class BankBalance{
	int balance = 1000;
	
	void creditAmt(int amt){
		balance = balance + amt;
	}
	
	void debitAmt(int amt){
		if(balance >= amt){
			balance = balance - amt;
		}
		else{
			System.out.println("Insufficient Balance");
		}
	}
	
	void display(){
		System.out.println(balance);
	}
	
	public static void main(String[] args){
	BankBalance bankbalance = new BankBalance();
	bankbalance.debitAmt(1200);
	bankbalance.creditAmt(500);
	bankbalance.creditAmt(1000);
	bankbalance.debitAmt(300);
	bankbalance.creditAmt(4000);
	bankbalance.display();
	}
	
}























































