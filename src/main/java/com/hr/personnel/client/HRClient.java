

package com.hr.personnel.client;
import com.hr.personnel.Employee;
import java.time.LocalDate;

public class HRClient {

  public static void main(String[] args) {
    Employee employee1 = new Employee();
    employee1.setName("Yina");
    employee1.setHireDate(LocalDate.of(2022, 3, 10));
    System.out.println(employee1.getName());
    System.out.println(employee1.getHireDate());

    Employee employee2 = new Employee();
    employee2.setName("Dennis");
    employee2.setHireDate(LocalDate.of(2022, 7, 8));
    System.out.println(employee2.getName());
    System.out.println(employee2.getHireDate());
  }
}
