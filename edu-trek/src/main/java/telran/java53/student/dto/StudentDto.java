package telran.java53.student.dto;

public class StudentDto {
	Long id;
    String name;
    String email;
    String status;
    String course;
    
	public StudentDto(Long id, String name, String email, String status, String course) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.status = status;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", name=" + name + ", email=" + email + ", status=" + status + ", course="
				+ course + "]";
	}
    
}
