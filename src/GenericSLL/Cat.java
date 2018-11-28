package GenericSLL;

public class Cat 
{
	private String name;
	private int age;
	private String color;
    
    public Cat(String name, int age, String color)
	{
		this.name = name;
		this.age = age;
		this.color = color;
	}
	public Cat() 
	{
		this.name = "cat";
		this.age = 0;
		this.color = "black";
	}
	
	public String getName() {
		return this.name;
		}
	public int getAge() {
		return this.age;
		}
	public String getColor() {
		return this.color;
		}
	public void setName(String name) {
		this.name=name;
		}
	public void setAge(int age) {
		this.age=age;
		}
	public void setColor(String color) {
		this.color=color;
		}
	public String toString() {
		return this.name+"-"+this.age+"-"+this.color;
		}
	
	public boolean equals(Cat c)
	{
		return (age == c.getAge() && name == c.getName() && color == c.getColor());
	}

	public int compareTo(Cat c) {
		if(this.age == c.age)
			return 0;
		else if(this.age < c.age)
			return -1;
		else 
			return 1;
		
	}
}
