
public class Student {
	String name;
	Course[] takenCourse;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTakenCourseDesc() {
		int i = 0;
		String desc = "";
		for(i=0; i<this.takenCourse.length; i++) {
			desc += takenCourse[i].getCourseName() + " ";
		}
		return desc;
	}
	
	public void setTakenCourse(Course[] takenCourse) {
		this.takenCourse = takenCourse;
	}
}
