package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double salary;
    private Department department;
    private List<Contracts> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, Double salary, Department department) {
        this.name = name;
        this.level = level;
        this.salary = salary;
        this.department = department;
    }

    public Worker(String name, WorkerLevel level, Double salary) {
        this.name = name;
        this.level = level;
        this.salary = salary;
    }

    public Worker() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Contracts> getContracts() {
        return contracts;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + getName() + '\'' +
                ", level=" + getLevel() +
                ", salary=" + getSalary() +
                ", department=" + getDepartment().getName() +
                '}';
    }

    public void showContracts (){
        for(Contracts contract : getContracts()){
            System.out.println(contract.toString());
        }
    }

    public void addContract(Contracts contract){
        this.contracts.add(contract);
    }

    public void removeContract(Contracts contract){
        this.contracts.remove(contract);
    }

    public Double income(int month, int year){
        double sum = getSalary();
        Calendar calendar = Calendar.getInstance();
        for(Contracts contract : getContracts()){
            calendar.setTime(contract.getDate());
            int contractMonth = 1 + calendar.get(calendar.MONTH);
            int contractYear = calendar.get(calendar.YEAR);
            if(contractMonth == month && contractYear == year)
                sum += contract.totalValue();
        }
        return sum;
    }
}
