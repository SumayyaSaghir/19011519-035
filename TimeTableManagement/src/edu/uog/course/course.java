package edu.uog.course;

public class course {
		private int COURSE_ID;
		private String COURSE_CODE;
		private String COURSE_TITLE;
		private String COURSE_DESK;
		private int COURSE_CREDITHOURS;
		private  course COURSEPREQUEST_ID;
		public int getCOURSE_ID() {
			return COURSE_ID;
		}
		public void setCOURSE_ID(int cOURSE_ID) {
			COURSE_ID = cOURSE_ID;
		}
		public String getCOURSE_CODE() {
			return COURSE_CODE;
		}
		public void setCOURSE_CODE(String cOURSE_CODE) {
			COURSE_CODE = cOURSE_CODE;
		}
		public String getCOURSE_TITLE() {
			return COURSE_TITLE;
		}
		public void setCOURSE_TITLE(String cOURSE_TITLE) {
			COURSE_TITLE = cOURSE_TITLE;
		}
		public String getCOURSE_DESK() {
			return COURSE_DESK;
		}
		public void setCOURSE_DESK(String cOURSE_DESK) {
			COURSE_DESK = cOURSE_DESK;
		}
		public int getCOURSE_CREDITHOURS() {
			return COURSE_CREDITHOURS;
		}
		public void setCOURSE_CREDITHOURS(int cOURSE_CREDITHOURS) {
			COURSE_CREDITHOURS = cOURSE_CREDITHOURS;
		}
		public course getCOURSEPREQUEST_ID() {
			return COURSEPREQUEST_ID;
		}
		public void setCOURSEPREQUEST_ID(course cOURSEPREQUEST_ID) {
			COURSEPREQUEST_ID = cOURSEPREQUEST_ID;
		}
		 public String toString(){
			    String str=null;
			    str =this.COURSE_ID
			    +","+ this.COURSE_CODE
			    +","+ this.COURSE_TITLE
			    +","+ this.COURSE_DESK
			    +","+ this.COURSE_CREDITHOURS
			    +","+ this.COURSEPREQUEST_ID;
			    
				  return str;  
			
			 
		
}
}