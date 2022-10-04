package com.hr.personnel;

import com.hr.corp.Corporation;
import org.junit.Assert;
import org.junit.Test;

public class CorpTest {

  @Test
  public void computeMonthlyTaxToPayTest(){
    Corporation corp = new Corporation();
    corp.setMonthlyIncome(10000);
    double corpTaxRateExpected = corp.computeMonthlyTaxToPay();
    double corpTaxRateActual = 10000 * 0.1;

    Assert.assertEquals(corpTaxRateExpected, corpTaxRateActual, 0.1);
  }

}
