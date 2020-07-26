package edu.uog.timetable;

import edu.uog.teacher.Teacher_Course;

public class TimeTable {
	private int TIMETABLE_ID;
	private Teacher_Course TEACHERCOURSE_ID;
	private TimeSlot TIMESLOT_ID;
	public int getTIMETABLE_ID() {
		return TIMETABLE_ID;
	}
	public void setTIMETABLE_ID(int tIMETABLE_ID) {
		TIMETABLE_ID = tIMETABLE_ID;
	}
	public Teacher_Course getTEACHERCOURSE_ID() {
		return TEACHERCOURSE_ID;
	}
	public void setTEACHERCOURSE_ID(Teacher_Course tEACHERCOURSE_ID) {
		TEACHERCOURSE_ID = tEACHERCOURSE_ID;
	}
	public TimeSlot getTIMESLOT_ID() {
		return TIMESLOT_ID;
	}
	public void setTIMESLOT_ID(TimeSlot tIMESLOT_ID) {
		TIMESLOT_ID = tIMESLOT_ID;
	}
}
