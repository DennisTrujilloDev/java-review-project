package com.hr.personnel;

import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

  private Employee employee;

  @Before
  public void setUp() throws Exception{
    employee = new Employee("Yina", LocalDate.of(2022, 3, 4));

  }

  @Test
  public void getEmployeeInfoTest(){
    String empInfoString = employee.getEmployeeInfo();

    Assert.assertEquals("name = Yina, hireDate = 2022-03-04", empInfoString);

  }

  @Test
  public void getEmployeeWorkTest(){
    String empWorkString = employee.work();

    Assert.assertEquals("Yina worked.", empWorkString);
  }
}
