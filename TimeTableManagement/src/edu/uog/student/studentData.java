package edu.uog.student;


import java.io.BufferedReader;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;

import java.util.ArrayList;

import java.util.List;


public class studentData {
@SuppressWarnings("resource")
	
public List<student> findAll()  {
		
List<student> students = new ArrayList<student>();
		
String line;
		
		
try {
			
BufferedReader bufferreader = new BufferedReader(new FileReader(student.csvFile));
			
// reading data from file and storing it in a List to be displayed
			
while ((line = bufferreader.readLine()) != null) {
				
student student = new student();
				
				
String[] studentRow = line.split(",");
				
				
student.setSTUDENT_ID(Integer.parseInt(studentRow[0]));
				
student.setSTUDENT_ROLLNO(studentRow[1]);
				
student.setSTUDENT_PROGRAM(studentRow[2]);
				
student.setSTUDENT_YEAR(studentRow[3]);
				
				
students.add(student);
			
}
			
		
} catch (IOException e) {
			
e.printStackTrace();
		}
		
		
return students;
	
}

	
@SuppressWarnings("resource")
	
public student findOne(int student_ID)  {
		
String line;
		
		
try {
			
BufferedReader bufferreader = new BufferedReader(new FileReader(student.csvFile));
			
			
while ((line = bufferreader.readLine()) != null) {
				
student student = new student();
				
String[] studentRow = line.split(",");
				
				
if (Integer.parseInt(studentRow[0]) == student_ID) {
					
student.setSTUDENT_ID(Integer.parseInt(studentRow[0]));
					
student.setSTUDENT_ROLLNO(studentRow[1]);
					
student.setSTUDENT_PROGRAM(studentRow[2]);

student.setSTUDENT_YEAR(studentRow[3]);
		
					
return student;
			
}
				
				
			
}
		
} catch (IOException e) {
			
System.out.println("the record does not exist!!!");
			
		
} finally {
			
System.out.println("enter again");
			
studentOptions.StudentsDataOptions();
		}
		
		
return null;
	}

	
@SuppressWarnings("resource")
	
public List<student> search(String search)  {
		
List<student> students = new ArrayList<student>();
		
String line;
		
		
try {
			
BufferedReader bufferreader = new BufferedReader(new FileReader(student.csvFile));
			
			
while ((line = bufferreader.readLine()) != null) {
				
student student = new student();
				
				
String[] studentRow = line.split(",");
				
				
if (studentRow[1].contains(search) == true) {
					
student.setSTUDENT_ID(Integer.parseInt(studentRow[0]));
					
student.setSTUDENT_ROLLNO(studentRow[1]);
					
student.setSTUDENT_PROGRAM(studentRow[2]);
					
student.setSTUDENT_YEAR(studentRow[3]);
					
					
students.add(student);
					
return students;
				
}
				
			
}
			
		
} catch (IOException e) {
			
e.printStackTrace();
		}
		
		
return students;
	}

	
@SuppressWarnings("static-access")
	
public student Save(student student) {
		
FileWriter filewriter;

		
List<student> students = findAll();

		
try {
			
filewriter = new FileWriter(student.csvFile);

			
for (int i=0; i<students.size(); i++) {
				
filewriter.append(students.get(i).toString());
				
filewriter.append("\n");
			}
			
if (students.size()>0)
				
student.setstudent_ID(students.get(students.size()-1).getstudent_ID()+1);
			
else
				
student.setSTUDENT_ID(1);
			
filewriter.append(student.toString());
			
filewriter.append("\n");
			
filewriter.flush();
			
filewriter.close();
		
} catch (IOException e) {
			
e.printStackTrace();
		
}
		
		
		
return student;
	}
}
