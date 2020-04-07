package application;

import entities.Contracts;
import entities.Department;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String strDepartment = scan.next();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = scan.next();
        System.out.print("Level: ");
        String strLevel = scan.next();
        WorkerLevel level = WorkerLevel.valueOf(strLevel);
        System.out.print("Base salary: ");
        Double salary = scan.nextDouble();
        Worker worker = new Worker(name, level, salary, new Department(strDepartment));
        System.out.println(worker.toString());
        System.out.println("How many contracts to this worker? ");
        int numberContracts = scan.nextInt();
        for(int i = 1; i <= numberContracts; i++){
            System.out.println("Enter contract #"+i+" data:");
            System.out.print("Date (DD/MM/YYYY): ");
            String strDate = scan.next();
            Date date = dateFormat.parse(strDate); //new date from string receive
            System.out.print("Value per hour: ");
            Double valueHour = scan.nextDouble();
            System.out.print("Duration: ");
            int hours = scan.nextInt();
            Contracts contract = new Contracts(date, valueHour, hours);
            worker.addContract(contract); //Association contract with worker, add worker contract
        }
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scan.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2)); //cut int values from string, month
        int year = Integer.parseInt(monthAndYear.substring(3)); //cut int values from string, year
        System.out.println("Name: "+worker.getName());
        System.out.println("Department: "+worker.getDepartment().getName());
        System.out.println("Income for "+monthAndYear+": "+worker.income(month, year));
        System.out.println(worker.toString());
        worker.showContracts();
    }
}
