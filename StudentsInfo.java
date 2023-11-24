
class StudentsInfo{
	String name;
	String middleName;
	String surname; 
	String birthDate; 
	String address; 
	int rollNo;
	
	void setData(String fname, String mname, String sname, String bod, String add, int rno){
		name = fname;
		middleName = mname;
		surname = sname;
		birthDate = bod;
		address = add;
		rollNo = rno;
	}
	
	void studentName(){
		System.out.println(name + middleName + surname);
	}
	
	void studentOtherDetails(){
		System.out.println(birthDate + address + rollNo);
	}
	
	public static void main (String[] a){
		StudentsInfo std = new StudentsInfo();
		std.setData("Shikha","Amit","Patel","19th Nov 1998","XYZ address",18);
		std.studentName();
		std.studentOtherDetails();
		
	}
}