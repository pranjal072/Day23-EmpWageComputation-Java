import java.util.ArrayList;
public class Company
{
	public final String compName;
	public final int rateperHr;
	public final int maxDays;
	public final int maxHr;
	public int salary = 0;
	public ArrayList<Integer> dailyWageArray = new ArrayList<Integer>();
	public Company(String compName, int rateperHr, int maxDays, int maxHr)
	{
		this.compName = compName;
		this.rateperHr =rateperHr;
		this.maxDays = maxDays;
		this.maxHr = maxHr;
	}

	public void eWage(ArrayList<Integer> dailyWageArray)
	{
		this.dailyWageArray = dailyWageArray;
		for (int i = 0; i < dailyWageArray.size(); i++ )
		{
			int dailyWage = dailyWageArray.get(i);
			System.out.println("Day " + (i+1) + " wage is " + dailyWage);
			salary += dailyWage;
		}
	}

	public String toString()
	{
		return "Total Emp Wage for " + compName + " is : " + salary + "\n";
	}
}
