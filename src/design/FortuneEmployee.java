package design;

import static design.EmployeeInfo.employeeId;

public class FortuneEmployee extends EmployeeService  {

    /**
     * FortuneEmployee class has a main methods where you will be able to create Object from
     * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
     * to use with proper business work flow.Think as a Software Architect, Product Designer and
     * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
     * more to design an application that will meet for fortune 500 Employee Information
     * Services.
     * <p>
     * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
     **/

    public static void main(String[] args) {
		employeeId();
		employeeName();
		assignDepartment();
		calculateSalary();
		benefitLayout();
    }

    public static int employeeId() {
        EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.setName("Rana");
        employeeInfo.setEmployeeId(10);
		System.out.println("employeeId"+ employeeInfo.getEmployeeId());
        return employeeInfo.getEmployeeId();
    }

    public static String employeeName() {
        EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.setName("Rana");
        employeeInfo.setEmployeeId(10);
		System.out.println("name"+ employeeInfo.getName());

		return employeeInfo.getName();
    }

    public static void assignDepartment() {
        EmployeeInfo employeeInfo = new EmployeeInfo();
		employeeInfo.setName("Rana");
        employeeInfo.setEmployeeId(10);
        employeeInfo.setAssignDepartment("Human Resources Management");
        System.out.println("Department: " + employeeInfo.getAssignDepartment());
    }

    public static int calculateSalary() {
        int grossSalary = 0;
        int basicSalary = 4000;
        int medicalAllowances = 2000;
        int houseAllowances = 2000;
        int otherAllowances = 1000;
        grossSalary = basicSalary + houseAllowances + medicalAllowances + otherAllowances;
		System.out.println("grossSalary: " + grossSalary);
		return grossSalary;
    }

    public static void benefitLayout() {
		int providentFund = 900;
		int gratuity = 5000;
		System.out.println("Benefit: "+ providentFund + gratuity);
    }
}
