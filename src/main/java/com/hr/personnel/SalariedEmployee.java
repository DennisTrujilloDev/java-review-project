package com.hr.personnel;

public class SalariedEmployee extends Employee {
  private double monthlySalary = 0.0;

  public SalariedEmployee(int monthlySalary){
    this.monthlySalary = monthlySalary;
  }

  public SalariedEmployee(){

  }
  public double getMonthlySalary(){
    return monthlySalary;
  }

  public void setMonthlySalary(double monthlySalary){
    this.monthlySalary = monthlySalary;
  }

  @Override
  public double computeMonthlyCompensation(){
    return monthlySalary;
  }

  @Override
  public String getEmployeeInfo(){
    return "name: " + getName() + ", hire date: " + getHireDate() + ", monthly salary: " + monthlySalary ;
  }

  @Override
  public double computeMonthlyTaxToPay(){
    return SALARIED_TAX_RATE * computeMonthlyCompensation();
  }
}
