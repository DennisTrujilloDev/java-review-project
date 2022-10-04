package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

  private int hoursWorkedPerMonth = 0;
  private double hourlyRate = 0.0;

  public HourlyEmployee() {
  }

  public HourlyEmployee(String name, LocalDate hireDate, int hoursWorkedPerMonth,
      double hourlyRate) {
    super(name, hireDate);
    setHourlyRate(hourlyRate);
    setHoursWorkedPerMonth(hoursWorkedPerMonth);
  }

  @Override
  public double computeMonthlyTaxToPay(){
    return HOURLY_TAX_RATE * computeMonthlyCompensation();
  }

  @Override
  public String getEmployeeInfo() {
    return "Name " + getName() + ", hireDate: " + getHireDate() +
        ", hours worked/month: " + getHoursWorkedPerMonth() +
        ", hourly rate: " + getHourlyRate();
  }

  public int getHoursWorkedPerMonth() {
    return hoursWorkedPerMonth;
  }

  public void setHoursWorkedPerMonth(int hoursWorkedPerMonth) {
    this.hoursWorkedPerMonth = hoursWorkedPerMonth;
  }

  public double getHourlyRate() {
    return hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }

@Override
  public double computeMonthlyCompensation() {
    return hourlyRate * hoursWorkedPerMonth;
  }

}