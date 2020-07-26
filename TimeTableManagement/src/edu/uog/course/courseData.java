package edu.uog.course;
import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.io.File;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;

import java.util.ArrayList;

import java.util.List;


import edu.uog.course.course;


public class courseData {

	
@SuppressWarnings("resource")
	
public List<course> findAll()  {
		
List<course> courses = new ArrayList<course>();
		
String line;
		
		
try {
			
BufferedReader bufferreader = new BufferedReader(new FileReader(course.csvFile));
			
// reading data from file and storing it in a List to be displayed
			
while ((line = bufferreader.readLine()) != null) {
				
course course = new course();//				
course prerequistcourse = new course();
				
				
String[] courseRow = line.split(",");
				
				
course.setCOURSE_ID(Integer.parseInt(courseRow[0]));
				
course.setCOURSE_CODE(courseRow[1]);
				
course.setCOURSE_TITLE(courseRow[2]);
				
course.setCOURSE_DESK(courseRow[3]);
				
course.setCOURSE_CREDITHOURS(Integer.parseInt(courseRow[4]));

//				if (courseRow.length>5) 
{
//					courseData cdata = new courseData();

//					prerequistcourse = cdata.findOne(Integer.parseInt(courseRow[5]));

//					course.setCOURSEPRERQUIST_ID(prerequistcourse);

//				}
				
				
courses.add(course);
			
}
			catch (IOException e) {
			
e.printStackTrace();
		
}
		
		
return courses;
	
}

	
@SuppressWarnings("resource")
	
public course findOne(int course_ID)  

{
		
String line;
		
		
try {
			
BufferedReader bufferreader = new BufferedReader(new FileReader(Course.csvFile));
			
			
while ((line = bufferreader.readLine()) != null) {
				
course course = new course();
				
course prerequistcourse = new course();
				
String[] courseRow = line.split(",");
				
				
if (Integer.parseInt(courseRow[0]) == course_ID) {
					
course.setCOURSE_ID(Integer.parseInt(courseRow[0]));
					
course.setCOURSE_CODE(courseRow[1]);
					
course.setCOURSE_TITLE(courseRow[2]);
					
course.setCOURSE_DESK(courseRow[3]);
					
course.setCOURSE_CREDITHOURS(Integer.parseInt(courseRow[4]));
										
					return course;
				}
				
				if (courseRow.length>5) {
					courseData cdata = new courseData();
					prerequistcourse = cdata.findOne(Integer.parseInt(courseRow[5]));
					course.setCOURSEPREQUEST_ID(prerequistcourse);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@SuppressWarnings("resource")
	public List<course> search(String search)  {
		List<course> courses = new ArrayList<course>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(Course.csvFile));
			
			while ((line = bufferreader.readLine()) != null) {
				course course = new course();
				
				String[] courseRow = line.split(",");
				
				if (courseRow[1].contains(search) == true) {
					course.setCOURSE_ID(Integer.parseInt(courseRow[0]));
					course.setCOURSE_CODE(courseRow[1]);
					course.setCOURSE_TITLE(courseRow[2]);
					course.setCOURSE_DESK(courseRow[3]);
					course.setCOURSE_CREDITHOURS(Integer.parseInt(courseRow[4]));
					
					
courses.add(course);
				
}
			
}
			
		
} catch (IOException e) {
			
e.printStackTrace();
		
}
		
		
return courses;
	}

	
public course Save(course course) {
		
FileWriter filewriter;

		
List<course> courses = findAll();

		
try {
			
filewriter = new FileWriter(Course.csvFile);

			
for (int i=0; i<courses.size(); i++) {
				
filewriter.append(courses.get(i).toString());
				
filewriter.append("\n");
			}
			
if (courses.size()>0)
				
course.setCOURSE_ID(courses.get(courses.size()-1).getCOURSE_ID()+1);
			
else
				
course.setCOURSE_ID(1);
			
filewriter.append(course.toString());
			
filewriter.append("\n");
			
filewriter.flush();
			
filewriter.close();
		
} catch (IOException e) {
			
e.printStackTrace();
		}
		
		
		
return course;
	}
	
	
public void deleteRecord(int ID) throws Exception{
	
String temp = "temp.txt";
		
File fileMain = new File(Course.csvFile);
		
File fileTemp = new File(temp);
		
BufferedReader breader = new BufferedReader(new FileReader (fileMain));
		
BufferedWriter bwriter = new BufferedWriter(new FileWriter (fileTemp,true));
		
String line;
		
		
while((line = breader.readLine()) != null) {
			
String[] roomRow = line.split(",");
			
if(!(Integer.parseInt(roomRow[0]) == ID)) {
				
bwriter.write(line);
				
bwriter.write("\n");
			
}
		
}
		
System.out.println("data deleted");
		
breader.close();
		
bwriter.flush();
		
bwriter.close();
		
fileMain.delete();
		
fileTemp.renameTo(fileMain);
	
}
}
