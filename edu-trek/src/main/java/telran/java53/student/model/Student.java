package telran.java53.student.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter

public class Student {
	Long studentId;
    String name;
    String surname;
    String phoneNumber;
    String email;
    String place;
    Enum<?> status;
    Enum<?> course;
    List<String> groups;
    List<Comment> comments;
    List<PaymentLog> paymentLog;
    List<Remainder> reminders;
    List<ActivityLog> activityLog;
}
