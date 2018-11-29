package ARRAYS.school;

public class School {
	private Classroom[] rooms;
	
	public School(int size) {
		rooms = new Classroom[size];
	}
	
	public String findStudent(String teacherID, int stuID) {
		
		for(Classroom c : rooms) {
			if(c.getTeacher().equals(teacherID)) {
				return c.lookUpStudent(stuID);
			}
		}
		return "Student Not Found";
	
	}
}
