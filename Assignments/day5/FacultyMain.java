/*
Create three classes
-Faculty with two data members facultyId and salary and two methods, one intput() method for accepting facultyId as input and another printSalary() to print salary.
-FullTimeFaculty that inherits class Faculty with two data members’ basicSalary and allowance. Override input() method in this class that calls super class inut() method and accepts basicSalary and allowance as input. Salary should not be accepted as input but should be calculated using formula (basicSalary + allowance)
-PartTimeFaculty that inherits class Faculty with two data members’ workingHours, ratePerHour. Override input() method in this class that calls super class inut() method and accepts workingHours and ratePerHour as input. Salary should not be accepted as input but should be calculated using formula ( workingHour * ratePerHour )

*/


import java.util.Scanner;
class Faculty{
	private int fId;
	private float fSalary;

	public void input(int fid){
		this.fId = fid;
	}

	public void printSalary(){
		System.out.println("Salary is: "+this.fSalary);
	} 

}

class FullTimeFaculty extends Faculty {
	private float basicSalary;
	private int allowance;

	public void input(int fid ){
		super.input(fid);
		
	}
	
	public FullTimeFaculty(float basicSalary, int allowance){
		this.allowance = allowance;
		this.basicSalary = basicSalary;
		calFtSal();
	}
	
	void calFtSal(){
		float result = this.basicSalary+this.allowance;
		
		System.out.println("\nFulltime Salary: "+result);
	}
	
	//public getSal()
}

class PartTimeFaculty extends Faculty{
	private int workingHour;
	private float ratePerHour;
	
	public void input(int fid ){
		super.input(fid);	
	}
	
	public PartTimeFaculty(int workingHour,float ratePerHour){
		this.workingHour = workingHour;
		this.ratePerHour = ratePerHour;
		calPtSal();
	}
	
	void calPtSal(){
		float result =this.workingHour*this.ratePerHour;
		
		System.out.println("\npart time salary: "+result);
		
	}
	
	
	
}
	class FacultyMain{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter data fulltime faculty: ");
		System.out.println("Enter faculty id: ");
		int fid = sc.nextInt();
		System.out.println("Enter basic salary: ");
		float bsal = sc.nextFloat();
		System.out.println("Enter allowance: ");
		int alw = sc.nextInt();
		
		Faculty f = new FullTimeFaculty(bsal,alw);
			f.input(fid);
			//f.calFtSal();
			
		System.out.println("Enter data Part time faculty: ");
		System.out.println("Enter faculty id: ");
		fid = sc.nextInt();
		System.out.println("Enter working Hour: ");
		int wh = sc.nextInt();
		System.out.println("Enter rate per hour: ");
		float rph = sc.nextFloat();

		Faculty f1 = new PartTimeFaculty(wh,rph);
			f1.input(fid);
		}
	
}
