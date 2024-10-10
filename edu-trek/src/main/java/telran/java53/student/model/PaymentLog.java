package telran.java53.student.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PaymentLog {
	Long id;
	String type;
    double amount;
    int installments;
    double each;
}
