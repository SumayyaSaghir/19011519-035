package edu.uog.teacher;

import edu.uog.person.Person;

public class teacher extends Person{
private int TEACHER_ID;

public int getTEACHER_ID() {
	return TEACHER_ID;
}

public void setTEACHER_ID(int tEACHER_ID) {
	TEACHER_ID = tEACHER_ID;
}
public String toString(){
    String str=null;
    str = "" + this.TEACHER_ID;
 return str;  
	
}

public void setTEACHER_NAME(String string) {
	// TODO Auto-generated method stub
	
}
}
