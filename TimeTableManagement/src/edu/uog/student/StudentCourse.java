package edu.uog.student;

import edu.uog.course.course;
import edu.uog.teacher.Teacher_Course;

public class StudentCourse {
	private int STUDENTCOURSE_ID;
	private course COURSE_ID;
	private student STUDENT_ID;
	private Teacher_Course SECTION;
	public int getSTUDENTCOURSE_ID() {
		return STUDENTCOURSE_ID;
	}
	public void setSTUDENTCOURSE_ID(int sTUDENTCOURSE_ID) {
		STUDENTCOURSE_ID = sTUDENTCOURSE_ID;
	}
	public course getCOURSE_ID() {
		return COURSE_ID;
	}
	public void setCOURSE_ID(course cOURSE_ID) {
		COURSE_ID = cOURSE_ID;
	}
	public student getSTUDENT_ID() {
		return STUDENT_ID;
	}
	public void setSTUDENT_ID(student sTUDENT_ID) {
		STUDENT_ID = sTUDENT_ID;
	}
	public Teacher_Course getSECTION() {
		return SECTION;
	}
	public void setSECTION(Teacher_Course sECTION) {
		SECTION = sECTION;
	}

	 public String toString(){
		    String str=null;
		    str =this.COURSE_ID.getCOURSE_ID()
		    +","+ this.STUDENT_ID
		  
		    +","+ this.SECTION;
		    
			  return str;  
		
	 }		 
}
