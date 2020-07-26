package edu.uog.campus;

public class Room {


	private String csvFile="C:\\Users\\ss1\\MyDocuments\\Roomcsv.csv";
	private int ROOM_ID;
	private String ROOM_NAME;
	private String ROOM_FLOUR;
	private int ROOM_CAPACITY;
	private String ROOM_TYPE;
	public int getROOM_ID() {
		return ROOM_ID;
	}
	public void setROOM_ID(int rOOM_ID) {
		ROOM_ID = rOOM_ID;
	}
	public String getROOM_NAME() {
		return ROOM_NAME;
	}
	public void setROOM_NAME(String rOOM_NAME) {
		ROOM_NAME = rOOM_NAME;
	}
	public String getROOM_FLOUR() {
		return ROOM_FLOUR;
	}
	public void setROOM_FLOUR(String rOOM_FLOUR) {
		ROOM_FLOUR = rOOM_FLOUR;
	}
	public int getROOM_CAPACITY() {
		return ROOM_CAPACITY;
	}
	public void setROOM_CAPACITY(int rOOM_CAPACITY) {
		ROOM_CAPACITY = rOOM_CAPACITY;
	}
	public String getROOM_TYPE() {
		return ROOM_TYPE;
	}
	public void setROOM_TYPE(String rOOM_TYPE) {
		ROOM_TYPE = rOOM_TYPE;
	}
	  public String toString(){
		    String str=null;
		    str =this.ROOM_ID
		    +","+ this.ROOM_FLOUR
		    +","+ this.ROOM_CAPACITY
		    +","+ this.ROOM_NAME
		    +","+ this.ROOM_TYPE;
			  return str;  
		
	  }
}