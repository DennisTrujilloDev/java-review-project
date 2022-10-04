

package com.hr.personnel.client;
import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import java.time.LocalDate;

public class HRClient {

  public static void main(String[] args) {
    SalariedEmployee salariedEmp1 = new SalariedEmployee();
    salariedEmp1.setMonthlySalary(1000);
    salariedEmp1.setName("Sarah");

    SalariedEmployee salariedEmp2 = new SalariedEmployee();
    salariedEmp2.setMonthlySalary(1000);
    salariedEmp2.setName("Alex");

    HourlyEmployee hourlyEmp = new HourlyEmployee();
    hourlyEmp.setHoursWorkedPerMonth(160);
    hourlyEmp.setHourlyRate(50.2);
    hourlyEmp.setName("Amy");

    Department department = new Department("tech", "philly");
    department.addEmployee(salariedEmp1);
    department.addEmployee(salariedEmp2);
    department.addEmployee(hourlyEmp);

    int numEmpsWorked = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
//    System.out.println("num of emps who worked " + numEmpsWorked);

  }
}
