package telran.java53.student.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Comment {
	Long id;
    String date;
    String text;
    String author;
}
