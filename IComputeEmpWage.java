public interface IComputeEmpWage
{
	public void addCompany(String compName, int rateperHr, int maxDays, int maxHr);
	public void computeEmpWage();
	public int getSalary(String compName);
}
