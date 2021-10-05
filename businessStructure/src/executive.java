public class Executive extends Manager
{
	private double totalComp;
	public Executive(String name, String title, int ID, int age, double salary)
	{
		super(name, title, ID, age, salary);
	}
	public void setTotalComp(double compProfit, double percentBonus)
	{
		totalComp = getSalary() + (compProfit*(percentBonus/100.0));
	}
	public double getTotalComp()
	{
		return totalComp;
	}
	public String toString()
	{
		String str = String.format("The executive name and title are %s %s\n", getName(), getTitle());
		str = str + String.format("The executive ID is %d  The executive age is %d\n", getID(), getAge());
		str = str + String.format("The executive salry and total compensation are %.2f and %.2f\n", getSalary(), totalComp);
		return str;
	}
}