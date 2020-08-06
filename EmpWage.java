public class EmpWage
{
   public static final int fullTime = 1;
   public static final int partTime = 2;

   public static void computeEmpWage(String compName, int rateperHr, int maxDays, int maxHr)
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
      computeEmpWage("abc",20,4,10);
      computeEmpWage("xyz",40,6,20);

   }
}
