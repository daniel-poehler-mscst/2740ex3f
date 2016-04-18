package dpoehler2740ex3f;

public class Employee {
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdNumber() {
		return this.idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return this.position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	public String toString() {
		StringBuilder str = new StringBuilder("ID: ");
		str.append(this.idNumber);
		str.append(", Name: ");
		if (this.name != null) {
		str.append(this.name);}
		str.append(", Dept: ");
		if (this.department != null) {
		str.append(this.department);}
		str.append(", Position: ");
		if (this.position != null) {
		str.append(this.position);}
		
		return str.toString();
	}
	public Employee() {
		super();
	}
	public Employee(int idNumber, String name) {
		super();
		this.idNumber = idNumber;
		this.name = name;
	}
	public Employee(int idNumber, String name, String department, String position) {
		super();
		this.idNumber = idNumber;		
		this.name = name;
		this.department = department;
		this.position = position;
	}
}
