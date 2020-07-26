package edu.uog.timetable;

public class WeekDay {
private int TIMESLOT_ID;
private WeekDay WEEKDAY_ID;
private String TIME_START;
private String TIME_END;

public int getTIMESLOT_ID() {
	return TIMESLOT_ID;
}
public void setTIMESLOT_ID(int tIMESLOT_ID) {
	TIMESLOT_ID = tIMESLOT_ID;
}
public WeekDay getWEEKDAY_ID() {
	return WEEKDAY_ID;
}
public void setWEEKDAY_ID(WeekDay wEEKDAY_ID) {
	WEEKDAY_ID = wEEKDAY_ID;
}
public String getTIME_START() {
	return TIME_START;
}
public void setTIME_START(String tIME_START) {
	TIME_START = tIME_START;
}
public String getTIME_END() {
	return TIME_END;
}
public void setTIME_END(String tIME_END) {
	TIME_END = tIME_END;
}
public String toString(){
    String str=null;
    str =this.WEEKDAY_ID
    +","+ this.TIMESLOT_ID
    +","+ this.TIME_END
    +","+ this.TIME_START;
    
	  return str;  
}
}
