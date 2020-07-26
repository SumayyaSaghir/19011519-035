package edu.uog.teacher;

import edu.uog.course.course;
import edu.uog.student.student;

public class Teacher_Course {
	private int TEACHERCOURSE_ID;
	private student STUDENT_ID;
	private course COURSE_ID;
	private String SECTION;
	private teacher TEACHER_ID;
	
		    public int getTEACHERCOURSE_ID() {
		return TEACHERCOURSE_ID;
	}

	public void setTEACHERCOURSE_ID(int tEACHERCOURSE_ID) {
		TEACHERCOURSE_ID = tEACHERCOURSE_ID;
	}

	public student getSTUDENT_ID() {
		return STUDENT_ID;
	}

	public void setSTUDENT_ID(student sTUDENT_ID) {
		STUDENT_ID = sTUDENT_ID;
	}

	public course getCOURSE_ID() {
		return COURSE_ID;
	}

	public void setCOURSE_ID(course cOURSE_ID) {
		COURSE_ID = cOURSE_ID;
	}

	public String getSECTION() {
		return SECTION;
	}

	public void setSECTION(String sECTION) {
		SECTION = sECTION;
	}

	public teacher getTEACHER_ID() {
		return TEACHER_ID;
	}

	public void setTEACHER_ID(teacher tEACHER_ID) {
		TEACHER_ID = tEACHER_ID;
	}
	public String toString(){
			String str=null;
		    str =this.TEACHERCOURSE_ID
		    +","+ this.STUDENT_ID.getSTUDENT_ID()
		    +","+ this.COURSE_ID
		    +","+ this.SECTION;
			  return str;  
		
	
	 }	
}