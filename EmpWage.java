public class EmpWage implements IComputeEmpWage
{
	public static final int fullTime = 1;
	public static final int partTime = 2;

	private int compNum = 0;
	private Company[] compArray;

	public EmpWage()
	{
		compArray = new Company[5];
	}

	public void addCompany(String compName, int rateperHr, int maxDays, int maxHr)
	{
		compArray[compNum] = new Company(compName, rateperHr, maxDays, maxHr);
		compNum++;
	}

	public void computeEmpWage()
	{
		for (int i =0; i < compNum; i++)
		{
			compArray[i].eWage(this.computeEmpWage(compArray[i]));
			System.out.println(compArray[i]);
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

		empWageBuilder.computeEmpWage();

   }
}
