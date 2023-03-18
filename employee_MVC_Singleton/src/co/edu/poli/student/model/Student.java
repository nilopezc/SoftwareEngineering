package co.edu.poli.student.model;

public class Student {

	private String emp_id;
	private String emp_name;
	private String emp_address;

	public Student(String emp_id,String emp_name, String emp_address) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_address = emp_address;
	}

	public String getStu_id() {
		return emp_id;
	}

	public void setStu_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public String getStu_name() {
		return emp_name;
	}

	public void setStu_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getStu_address() {
		return emp_address;
	}

	public void setStu_address(String emp_address) {
		this.emp_address = emp_address;
	}

	@Override
    public String toString()
    {
        return "Employee [emp_id=" + emp_id + 
        		", emp_name=" + emp_name + 
        		",emp_address=" + emp_address + "]";
    }

}
