package edu.uog.student;

import edu.uog.person.Person;

public class student extends Person {
private static final int STUDENT_CREDITHOURS = 0;
private int STUDENT_ID;
private String STUDENT_ROLLNO;
private String STUDENT_PROGRAM;
private String STUDENT_YEAR;
public int getSTUDENT_ID() {
	return STUDENT_ID;
}
public void setSTUDENT_ID(int sTUDENT_ID) {
	STUDENT_ID = sTUDENT_ID;
}
public String getSTUDENT_ROLLNO() {
	return STUDENT_ROLLNO;
}
public void setSTUDENT_ROLLNO(String sTUDENT_ROLLNO) {
	STUDENT_ROLLNO = sTUDENT_ROLLNO;
}
public String getSTUDENT_PROGRAM() {
	return STUDENT_PROGRAM;
}
public void setSTUDENT_PROGRAM(String sTUDENT_PROGRAM) {
	STUDENT_PROGRAM = sTUDENT_PROGRAM;
}
public String getSTUDENT_YEAR() {
	return STUDENT_YEAR;
}
public void setSTUDENT_YEAR(String sTUDENT_YEAR) {
	STUDENT_YEAR = sTUDENT_YEAR;
}
public String toString(){
    String str=null;
    str =this.STUDENT_ID
    +","+ this.STUDENT_PROGRAM
    +","+ this.STUDENT_ROLLNO
    +","+ this.STUDENT_YEAR;
 return str;  
	
}
}