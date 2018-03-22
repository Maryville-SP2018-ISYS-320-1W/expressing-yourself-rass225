/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

public class ComputePay {
	public static void main(String[] args) {
		int hoursWorked = (4 + 5 + 8 + 4);
		double hourlySalary = (8.75);
		System.out.println("My total hours worked:");
		System.out.println(hoursWorked);
		
		System.out.println("My hourly salary:");
		System.out.println(hourlySalary);
		
		System.out.println("My total pay:");
		System.out.println(hoursWorked * hourlySalary);
	}
}