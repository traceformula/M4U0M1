package lesson4.labsolns.probC;

import java.time.LocalDate;

abstract public class Employee {
	private String empId;
	public Employee(String empId) {
		this.empId = empId;
	}
	public void print(int month, int year) {
		LocalDate now = LocalDate.now();
		// LocalDate firstOfCurrentMonth = LocalDate.of(year, month, 1);
	//	System.out.println("Paycheck for " + );
		System.out.println("Employee Id : " + this.empId);
		System.out.println(calcCompensation(month,year));
		//System.out.println(calcCompensation(now.getMonthValue(), now.getYear()));
	}
	public Paycheck calcCompensation(int month, int year) {
		double grossPay = calcGrossPay(month, year);
		return new Paycheck(grossPay, Tax.FICA, Tax.State, 
				Tax.Local, Tax.Medicare, Tax.SocialSecurity);
	}

	abstract public double calcGrossPay(int month, int year);
}
