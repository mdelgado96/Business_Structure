public class Employee
{
	private String name;
	private String title;
	private int ID;
	private int age;
	private double salary;
	public Employee(String name, String title, int ID, int age, double salary)
	{
		setName(name);
		setTitle(title);
		setID(ID);
		setAge(age);
		setSalary(salary);
	}
	//mutators
	public void setName(String name)
	{
		this.name = name;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public void setID(int ID)
	{
		this.ID = ID;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public void changeSalary(double percent)
	{
		salary = salary*(1.0 +(percent/100.0));
	}
	
	//accessors
	public String getName()
	{
		return name;
	}
	public String getTitle()
	{
		return title;
	}
	public int getID()
	{
		return ID;
	}
	public int getAge()
	{
		return age;
	}
	public double getSalary()
	{
		return salary;
	}
	
	public String toString()
	{
		String str = String.format("The employee name and title are %s %s\n", name, title);
		str = str + String.format("The employee ID is %d  The employee age is %d\n", ID, age);
		str = str + String.format("The employee salary is %.2f\n", salary);
		return str;
	}
}