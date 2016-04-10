package oop.design;

public class EmployeeInfo implements Employee {

    /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to CnnEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 *
     */

 /*
	 * declare few static and final fields and some non-static fields
     */
    private static String _companyName;

    public static String getCompanyName() {
        return _companyName;
    }

    public static void setCompanyName(String aCompanyName) {
        _companyName = aCompanyName;
    }
    private int _employeeId;
    private String _employeeName;
    private String _department;
    private static Double _salary;
    private int _yearsAtCompany;

    /*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
     */
 /*
	 * you must have multiple constructor.
	 * Must implement below constructor.
     */
    public int getYearsAtCompany() {
        return _yearsAtCompany;
    }

    public void setYearsAtCompany(int _yearsAtCompany) {
        this._yearsAtCompany = _yearsAtCompany;
    }

    public EmployeeInfo() {
    }

    public EmployeeInfo(int employeeId) {
        this._employeeId = employeeId;
    }

    public EmployeeInfo(String name, int employeeId) {
        this._employeeId = employeeId;
        this._employeeName = name;
    }

    public EmployeeInfo(int _employeeId, String _employeeName, String _department, Double _salary) {
        this._employeeId = _employeeId;
        this._employeeName = _employeeName;
        this._department = _department;
        this._salary = _salary;
    }

    /*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
     */
    public double calculateEmployeBonus(double atrb) {
        return (atrb * getSalary()) * 12;
    }

    /*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * So you probably need to send 2 arguments.
	 * 
     */
    public double calculateEmployePension(int years, double salary) {
        double pensionPercent;
        switch (years) {
            case 0:
                pensionPercent = 0;
                break;
            case 1:
                pensionPercent = 0.05;
                break;
            case 2:
                pensionPercent = 0.1;
                break;
            case 3:
                pensionPercent = 0.15;
                break;
            case 4:
                pensionPercent = 0.2;
                break;
            case 5:
                pensionPercent = 0.25;
                break;
            case 6:
                pensionPercent = 0.3;
                break;
            case 7:
                pensionPercent = 0.35;
                break;
            case 8:
                pensionPercent = 0.4;
                break;
            default:
                pensionPercent = 0.45;
                break;
        }
        return (double) pensionPercent * salary;
    }

    @Override
    public void assignDepartment(String departmentName) {
        setDepartment(departmentName);
    }


    @Override
    public double calculateSalary(int years, double salary) {
        return years * salary;
    }

    @Override
    public int getEmployeeId() {
        return _employeeId;
    }

    public void setEmployeeId(int _employeeId) {
        this._employeeId = _employeeId;
    }

    @Override
    public String getEmployeeName() {
        return _employeeName;
    }

    public void setEmployeeName(String _employeeName) {
        this._employeeName = _employeeName;
    }

    public String getDepartment() {
        return _department;
    }

    public void setDepartment(String _department) {
        this._department = _department;
    }

    public  Double getSalary() {
        return _salary;
    }

    public void setSalary(Double _salary) {
        this._salary = _salary;
    }

}
