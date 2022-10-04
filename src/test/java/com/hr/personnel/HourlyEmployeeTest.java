package com.hr.personnel;

import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;

public class HourlyEmployeeTest {
  @Test
  public void computeMonthlyCompensationTest(){
    HourlyEmployee Sam = new HourlyEmployee("Sam", LocalDate.of(2020, 3, 4), 160, 48.0);
    double monthlyCompSamActual = 48 * 160;
    double monthlyCompSamTesting = Sam.computeMonthlyCompensation();

    Assert.assertEquals(monthlyCompSamTesting, monthlyCompSamActual, 0.01);
  }

  @Test
  public void getEmployeeInfoReturnsNameHireDateHourlyRateHoursWorkedPerMonth(){
    HourlyEmployee Marta = new HourlyEmployee("Marta", LocalDate.of(2021, 1, 1), 160, 53.0);
    String empInfoExpected = Marta.getEmployeeInfo();
    String empInfoActual = "Name Marta, hireDate: 2021-01-01, hours worked/month: 160, hourly rate: 53.0";

    Assert.assertEquals(empInfoExpected, empInfoActual);
  }

  @Test
  public void computeMonthlyTaxToPayTest(){
    HourlyEmployee Marta = new HourlyEmployee("Marta", LocalDate.of(2021, 1, 1), 160, 53.0);
    double empTaxExpected = Marta.computeMonthlyTaxToPay();
    double empTaxActual = 0.25 * 160 * 53;

    Assert.assertEquals(empTaxExpected, empTaxActual, 0.01);

  }

}
