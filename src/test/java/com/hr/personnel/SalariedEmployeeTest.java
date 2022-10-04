package com.hr.personnel;

import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;

public class SalariedEmployeeTest {

  @Test
  public void computeMonthlyCompTest() {
    SalariedEmployee Matt = new SalariedEmployee(3000);
    double MattCompMonthlyTest = Matt.computeMonthlyCompensation();
    double MattCompMonthlyActual = 3000;
    Assert.assertEquals(MattCompMonthlyTest, MattCompMonthlyActual, 0.000001);
  }

  @Test
  public void getEmployeeInfoReturnsNameHireDateMonthlySalary(){
    SalariedEmployee Michelle = new SalariedEmployee(4000);
    Michelle.setHireDate(LocalDate.of(2020, 1, 1));
    Michelle.setName("Michelle");
    String infoExpected = Michelle.getEmployeeInfo();
    String infoActual = "name: Michelle, hire date: 2020-01-01, monthly salary: 4000.0";

    Assert.assertEquals(infoExpected, infoActual);
  }

  @Test
  public void computeMonthlyTaxToPayTest(){
    SalariedEmployee Michelle = new SalariedEmployee(4000);
    double empTaxToPayExpected = Michelle.computeMonthlyTaxToPay();
    double empTaxToPayActual = 0.3 * 4000;

    Assert.assertEquals(empTaxToPayExpected, empTaxToPayActual, 0.1);
  }

}
