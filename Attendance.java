import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
import java.util.*;
class Attendance { // class to store the attendance details

    LocalDateTime timeIn;
    LocalDateTime timeOut;

    public Attendance() {
    }
    
    public Attendance(LocalDateTime timeIn, LocalDateTime timeOut) {
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }

    void setTimes(LocalDateTime timeIn, LocalDateTime timeOut) {
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }
}