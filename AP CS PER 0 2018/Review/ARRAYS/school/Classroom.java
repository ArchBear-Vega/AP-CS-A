package ARRAYS.school;

public class Classroom {
	private Student[] students;
	private String teacherId;
	
	public Classroom(String teacher, int size) {
		students = new Student[size];
		teacherId = teacher;
		fillClass();
	}
	
	private void fillClass() {
		
	}
	
	public String lookUpStudent(int id) {
		int i = 0;
		while(i < students.length && students[i].getId() != id) {
			
			if(students[i].getId() == id) {
				return students[i].getName();
			}
		}
		
		return "Student Not Found";
	}
	
	public String getTeacher() {
		return teacherId;
	}
	
}
