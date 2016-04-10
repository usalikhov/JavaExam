package oop.design;

public interface Employee {

    /*Employee is an Interface which contains multiple unimplemented methods.Again few methods
	has been declared in below. you need to brainstorm to add more methods to meet the business requirements.
     */
    //please read the following method and understand the business requirements of these following methods
    //and then implement these in a concrete class.
    //employeeId() will return employee id.
    public int getEmployeeId();

    //employeeName() will return employee name
    public String getEmployeeName();

    //assignDepartment() will assign employee to departments
    public void assignDepartment(String departmentName);

    //calculate employee salary
    public double calculateSalary(int years, double salary);


}
