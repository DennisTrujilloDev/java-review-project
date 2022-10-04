package com.hr.personnel;

import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DepartmentTest {

  private Department anotherDpt;
  private Employee anotherEmp;


  @Before
      public void setUp() throws Exception{
    anotherDpt = new Department("marketing", "LA");
    anotherEmp = new HourlyEmployee("Mike", LocalDate.of(2022, 3, 4), 160, 50.0);
  }

  @Test
  public void addEmployeeAndCurrentIndexIncrements() {
    int indexBeforeAddingEmployee = anotherDpt.getCurrentIndex();
    anotherDpt.addEmployee(anotherEmp);
    int indexAfterAddingEmployee = anotherDpt.getCurrentIndex();

    Assert.assertEquals(indexBeforeAddingEmployee, indexAfterAddingEmployee-1);
  }

  public void letEmployeesWorkAndReturnNumberOfEmployeesWhoWorkedTest(){
    anotherDpt.addEmployee(anotherEmp);
    int numberOfEmpsThatWorked = anotherDpt.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();

    Assert.assertEquals(numberOfEmpsThatWorked, 1);

  }

}
