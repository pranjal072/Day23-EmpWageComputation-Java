import java.util.ArrayList;

public class EmpWage implements IComputeEmpWage
{
	public static final int fullTime = 1;
	public static final int partTime = 2;

	private ArrayList<Company> compList;

	public EmpWage()
	{
		compList = new ArrayList<>();
	}

	public void addCompany(String compName, int rateperHr, int maxDays, int maxHr)
	{
		Company compNew = new Company(compName, rateperHr, maxDays, maxHr);
		compList.add(compNew);
	}

	public void computeEmpWage()
	{
		for (int i =0; i < compList.size(); i++)
		{
			Company company = compList.get(i);
			company.eWage(this.computeEmpWage(company));
			System.out.println(company);
		}
	}

	public int computeEmpWage( Company comp )
	{
		int workHr,wage;
		int Salary = 0, totHr = 0, totDays = 0;

		System.out.println("COMPANY : " + comp.compName);

		while ( totHr < comp.maxHr && totDays < comp.maxDays )
		{

			int empCheck = (int) Math.floor(Math.random() * 10 ) % 3;
			switch (empCheck)
			{
				case fullTime:
					workHr=8;
					break;
				case partTime:
					workHr=4;
					break;
				default:
					workHr=0;
			}

			totDays++;
			totHr += workHr;
			wage = workHr * comp.rateperHr;
			System.out.println("Day "+ totDays + " wage is " + wage);
			Salary += wage;
      }

		return Salary;
	}

	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Calculation !! \n");

		EmpWage empWageBuilder = new EmpWage();
		empWageBuilder.addCompany("abc",20,4,10);
      empWageBuilder.addCompany("xyz",40,6,20);
		empWageBuilder.addCompany("def",50,8,25);
		empWageBuilder.computeEmpWage();

   }
}
