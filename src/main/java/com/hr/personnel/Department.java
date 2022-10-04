package com.hr.personnel;

import java.util.ArrayList;
import java.util.List;

public class Department {

  private String name = "";
  private String location = "";
//  private Employee[] employeesArray = new Employee[100];
  List<Employee> employeesList = new ArrayList<>();

//  private int currentIndex = 0;


  public String getName() {
    return name;
  }

  public String getLocation() {
    return location;
  }

//  public int getCurrentIndex() {
//    return currentIndex;
//  }

  public void setName(String name) {
    this.name = name;
  }

  public void setLocation(String location) {
    this.location = location;
  }



  public Department(String name, String location){
    this.name = name;
    this.location = location;
  }

  public void addEmployee(Employee employee){
//    employeesArray[currentIndex++] = employee;
    employeesList.add(employee);
  }

  public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked(){
    int numOfWorkersWorked = 0;
    for (Employee employee: employeesList){
      if (employee.work().contains("work")){
        numOfWorkersWorked++;
      }
    }
//    int workersWhoWorked = 0;
//    for (int i=0; i<currentIndex; i++){
//      if(employeesArray[i].work().contains("worked")){
//        workersWhoWorked++;
//      }
//    }
    return numOfWorkersWorked;
  }


  public double computeDepartmentMonthlyTotalCompensation() {
    double totalMonthlyCompAllEmps = 0.0;
//    for (int i=0; i < currentIndex; i++){
//      totalMonthlyCompAllEmps += employeesArray[i].computeMonthlyCompensation();
//    }
    for(Employee employee: employeesList){
      double monthlyComp = employee.computeMonthlyCompensation();
      totalMonthlyCompAllEmps += monthlyComp;
    }
    return totalMonthlyCompAllEmps;
  }

}
