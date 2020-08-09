public class Company
{
	public final String compName;
	public final int rateperHr;
	public final int maxDays;
	public final int maxHr;
	public int salary;
	public Company(String compName, int rateperHr, int maxDays, int maxHr)
	{
		this.compName = compName;
		this.rateperHr =rateperHr;
		this.maxDays = maxDays;
		this.maxHr = maxHr;
	}

	public void eWage(int salary)
	{
		this.salary = salary;
	}

	public String toString()
	{
		return "Total Emp Wage for " + compName + " is : " + salary + "\n";
	}
}
