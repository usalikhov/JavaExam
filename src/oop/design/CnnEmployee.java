package oop.design;

public class CnnEmployee {

    /**
     * CnnEmployee class has a main methods where you will be able to create
     * Object from EmployeeInfo class to use fields and attributes.Demonstrate
     * as many methods as possible to use with proper business work flow.Think
     * as a Software Architect, Product Designer and as a Software
     * Developer.(employee.info.system) package is given as an outline,you need
     * to elaborate more to design an application that will meet for fortune 500
     * Employee Information Services.
     *
     *
     */
    public static void main(String[] args) {
        EmployeeInfo ob = new EmployeeInfo();

        ob.setEmployeeName("John Marcus");
        ob.setEmployeeId(777);
        ob.setCompanyName("Microsoft");
        ob.setSalary(2324.24);
        ob.setYearsAtCompany(3);
        
        System.out.println(ob.getEmployeeName());
        System.out.println(ob.calculateSalary(24, ob.getSalary()));
        System.out.println(ob.calculateEmployeBonus(0.1));
        System.out.println(ob.calculateEmployePension(ob.getYearsAtCompany(), ob.getSalary()));
        
    }

}
