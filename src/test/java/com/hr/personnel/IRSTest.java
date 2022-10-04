package com.hr.personnel;

import com.hr.corp.Corporation;
import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;

public class IRSTest {
  @Test
  public void computeMonthlyTaxToCollectTest() {
    SalariedEmployee salariedEmp = new SalariedEmployee(2000);
    HourlyEmployee hourlyEmp = new HourlyEmployee("Tom", LocalDate.of(2022, 1, 1), 160, 52.0);
    Corporation newCorporation = new Corporation(20000);

    double salariedEmpExpectedTaxToPay = salariedEmp.computeMonthlyTaxToPay();
    double hourlyEmpExpectedTaxToPay = hourlyEmp.computeMonthlyTaxToPay();
    double newCorporationExpectedTaxToPay = newCorporation.computeMonthlyTaxToPay();

    Assert.assertEquals(salariedEmpExpectedTaxToPay, 0.3 * 2000, 0.1);
    Assert.assertEquals(hourlyEmpExpectedTaxToPay, 0.25 * 160 * 52, 0.1);
    Assert.assertEquals(newCorporationExpectedTaxToPay, 0.1* 20000, 0.1);

  }

}
