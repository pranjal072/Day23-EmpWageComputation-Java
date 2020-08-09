import java.util.ArrayList;
import java.util.HashMap;

public class EmpWage implements IComputeEmpWage
{
	public static final int fullTime = 1;
	public static final int partTime = 2;

	private ArrayList<Company> compList;
	private HashMap<String, Company> companyToSalaryMap;

	public EmpWage()
	{
		compList = new ArrayList<>();
		companyToSalaryMap = new HashMap<>();
	}

	public void addCompany(String compName, int rateperHr, int maxDays, int maxHr)
	{
		Company compNew = new Company(compName, rateperHr, maxDays, maxHr);
		compList.add(compNew);
		companyToSalaryMap.put(compName, compNew);
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

	public ArrayList<Integer> computeEmpWage( Company comp )
	{
		int workHr,wage;
		int totHr = 0, totDays = 0;
		ArrayList<Integer> dailyWageArray = new ArrayList<Integer>();


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
			dailyWageArray.add(wage);
      }

		return dailyWageArray;
	}

	public int getSalary(String compName)
	{
		return companyToSalaryMap.get(compName).salary;
	}

	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Calculation !! \n");

		EmpWage empWageBuilder = new EmpWage();
		empWageBuilder.addCompany("abc",20,4,10);
      empWageBuilder.addCompany("xyz",40,6,20);
		empWageBuilder.addCompany("def",50,8,25);
		empWageBuilder.computeEmpWage();

		System.out.println("Total Wage for abc Company is : " + empWageBuilder.getSalary("abc"));

   }
}
