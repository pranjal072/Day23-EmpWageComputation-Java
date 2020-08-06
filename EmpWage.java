public class EmpWage
{
   public static final int fullTime = 1;
   public static final int partTime = 2;

	private final String compName;
	private final int rateperHr;
	private final int maxDays;
	private final int maxHr;

   public EmpWage(String compName, int rateperHr, int maxDays, int maxHr)
	{
		this.compName = compName;
		this.rateperHr = rateperHr;
		this.maxDays = maxDays;
		this.maxHr = maxHr;
	}

	public void computeEmpWage()
   {
      int workHr,wage;
      int Salary = 0, totHr = 0, totDays = 0;

      System.out.println("COMPANY : " + compName);

      while ( totHr < maxHr && totDays < maxDays )
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
         wage = workHr * rateperHr;
         System.out.println("Day "+ totDays + " wage is " + wage);
         Salary += wage;
      }

      System.out.println("For Company : " + compName + " ,Total Salary of this Month is : " + Salary + "\n");
   }

   public static void main(String[] args)
   {
      System.out.println("Welcome to Employee Wage Calculation !! \n");

		EmpWage abc = new EmpWage("abc",20,4,10);
      EmpWage xyz = new EmpWage("xyz",40,6,20);

		abc.computeEmpWage();
		xyz.computeEmpWage();

   }
}
