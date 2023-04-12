import java.time.LocalDateTime;

public class Test {
  public static void main(String[] args) {
    Employee e1 = new Employee(19, 58, "Ruchi", "Developer", 2500000); // creating object of Employee class

    e1.display(); // calling display method
    // year, month, day, inhour, inminutes, outhour, outminutes
    // ASSUMPTION: A month is of 10 days
    e1.setAttendance(2019, 8, 8, 8, 30, 15, 30); // calling setAttendance method
    e1.setAttendance(2019, 8, 5, 7, 30, 14, 16);
    e1.setAttendance(2019, 1, 1, 9, 3, 16, 30);
    e1.setAttendance(2019, 1, 2, 8, 48, 15, 30);
    e1.setAttendance(2019, 2, 3, 8, 30, 15, 30);
    e1.setAttendance(2019, 2, 4, 8, 30, 18, 30);
    e1.setAttendance(2019, 3, 1, 7, 30, 14, 16);
    e1.setAttendance(2019, 3, 6, 8, 17, 15, 30);
    e1.setAttendance(2019, 3, 7, 8, 30, 15, 30);
    e1.setAttendance(2019, 4, 1, 9, 3, 16, 30);
    e1.setAttendance(2019, 5, 2, 8, 19, 15, 30);
    e1.setAttendance(2019, 5, 3, 8, 30, 15, 30);
    e1.setAttendance(2019, 5, 4, 8, 30, 15, 30);
    e1.setAttendance(2019, 6, 5, 7, 30, 14, 16);
    e1.setAttendance(2019, 7, 1, 9, 3, 16, 30); // calling setAttendance method for the same employee
    e1.displayAttendance(); // calling displayAttendance method
    e1.printWorkingDays(); // calling printWorkingDays method
    e1.displayWorkingHours(8, 8); // calling displayWorkingHours method "FOR A GIVEN DATE"
    e1.displayWorkingHours(8, 4);
    e1.displayWorkingHours(1, 1);
    e1.displayWorkingHours(2, 2);
    e1.displayWorkingHours(3, 1);

  }

}
