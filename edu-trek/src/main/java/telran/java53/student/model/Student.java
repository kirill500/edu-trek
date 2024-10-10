package telran.java53.student.model;

import java.util.List;

public class Student {
	long studentId;
    String name;
    String surname;
    String phoneNumber;
    String email;
    String place;
    Enum<?> status;
    Enum<?> course;
    List<String> groups;
    List<String> comments;
    PaymentLog paymentLog;
    List<Integer> reminders;
    List<String> activityLog;
}
