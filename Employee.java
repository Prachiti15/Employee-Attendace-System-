import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
import java.util.*;

public class Employee {// Employee class
    int age, id;
    String name, designation;
    float salary;

    public Employee(int age, int id, String name, String designation, float salary) {// constructor to initialize the
                                                                                     // variables
        this.age = age;
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public Employee() {
    }// empty constructor

    public void display() {// method to display the details of the employee
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {// method to set the name of the employee
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    String monthArr[] = { "January-01 ", "February-02 ", "March-03 ", "April-04 ", "May-05 ", "June-06 ", "July-07 ",
            "Aug-08 ", "Sep-09 ", "Oct-10 ", "Nov-11 ", "Dec-12 " };// array to store months

    Attendance[][] a = new Attendance[12][10]; // 2D array to store attendance for an year and a month of 10 days

    LocalDateTime timeIn, timeOut;// stores time in and out for a particular date
    public Attendance setAttendance;

    void setAttendance(int year, int month, int day, int inHour, int inMinutes, int outHour, int outMinutes) {

        timeIn = LocalDateTime.of(year, month, day, inHour, inMinutes);
        timeOut = LocalDateTime.of(year, month, day, outHour, outMinutes);
        setAttendance = new Attendance(timeIn, timeOut);
        a[month - 1][day - 1] = setAttendance;
    }

    public void displayAttendance() {// method to display the attendance of the employee for the month
        for (int i = 0; i < 12; i++) {
            System.out.println("\n" + monthArr[i]);
            for (int j = 0; j < 10; j++) {
                if (a[i][j] != null) {
                    System.out.println("Day " + (j + 1) + ": " + a[i][j].timeIn + " - " + a[i][j].timeOut);
                } else
                    System.out.println("Day " + (j + 1) + ": Absent");

            }
        }
    }

    public void printWorkingDays() {// method to print the working days of a month
        int workingDays = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 10; j++) {
                if (a[i][j] != null) {
                    workingDays++;
                }
            }
        }
        System.out.println("\nTotal working days for the year are: " + workingDays);
    }

    void displayWorkingHours(int month, int day) {// method to display the working hours of a day
        int workingHours = 0;
        System.out.println("\nAttendance for the Given Date:\t\t");
        int inHour, inMinutes, outHour, outMinutes;
        if (a[month - 1][day - 1] != null) {
            inHour = a[month - 1][day - 1].timeIn.getHour();
            inMinutes = a[month - 1][day - 1].timeIn.getMinute();
            outHour = a[month - 1][day - 1].timeOut.getHour();
            outMinutes = a[month - 1][day - 1].timeOut.getMinute();
            workingHours = ((outHour * 60 + outMinutes) - (inHour * 60 + inMinutes)) / 60;
            System.out.println(
                    "Attendance for the day" + day + " of the month " + month + "are: " + workingHours + " hours\n");
        } else {
            System.out.println("No attendance for the day" + day + " of the month " + month + "\n");
        }

    }
}
