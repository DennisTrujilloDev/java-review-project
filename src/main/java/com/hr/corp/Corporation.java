package com.hr.corp;

import gov.irs.TaxPayer;

public class Corporation implements TaxPayer {

  String name = "";
  double monthlyIncome = 0.0;

  public void setName(String name) {
    this.name = name;
  }

  public void setMonthlyIncome(double monthlyIncome) {
    this.monthlyIncome = monthlyIncome;
  }

  public String getName() {
    return name;
  }

  public double getMonthlyIncome() {
    return monthlyIncome;
  }

  public Corporation(double monthlyIncome){
    this.monthlyIncome = monthlyIncome;
  }

  public Corporation(){
  }

  public double computeMonthlyTaxToPay(){
    return monthlyIncome *  CORP_TAX_RATE;
  }

}
