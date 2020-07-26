package edu.uog.student;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class studentCourseData {
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
	
public student findOne(int Student_ID) 
 {
String line;		
try {
BufferedReader bufferreader = new BufferedReader(new FileReader(Student.csvFile));
while ((line = bufferreader.readLine()) != null) {
student student = new student();
String[] studentRow = line.split(",");
if (Integer.parseInt(studentRow[0]) == Student_ID) {
student.setSTUDENT_ID(Integer.parseInt(studentRow[0]));					
student.setSTUDENT_ROLLNO(studentRow[1]);					
student.setSTUDENT_PROGRAM(studentRow[2]);					
student.setSTUDENT_YEAR(studentRow[3]);
return student;				
}			
}		
} catch (IOException e) {
			
e.printStackTrace();
		
}
		return null;
	}
@SuppressWarnings("resource")
	public List<student> search(String search)  {
		
List<student> students = new ArrayList<student>();
		String line;		
try {
			
BufferedReader bufferreader = new BufferedReader(new FileReader(Student.csvFile));
while ((line = bufferreader.readLine()) != null) {
	student student = new student();
String[] studentRow = line.split(",");				
if (studentRow[1].contains(search) == true) {					
student.setSTUDENT_ID(Integer.parseInt(studentRow[0]));				
student.setSTUDENT_ROLLNO(studentRow[1]);					
student.setSTUDENT_PROGRAM(studentRow[2]);					
student.setSTUDENT_YEAR(studentRow[3]);
students.add(student);
				}
			}
			} catch (IOException e) {
			
e.printStackTrace();
		
}
		
		
return students;
	
}

	
@SuppressWarnings("static-access")
	
public student Save(student Student) {
		
FileWriter filewriter;

		
List<student> students = findAll();

		
try {
			
filewriter = new FileWriter(Student.csvFile);

			
for (int i=0; i<students.size(); i++) {
				
filewriter.append(students.get(i).toString());
				
filewriter.append("\n");
			
}
			
if (students.size()>0)
				
Student.setSTUDENT_ID(students.get(students.size()-1).getSTUDENT_ID()+1);
			
else
				
Student.setSTUDENT_ID(1);
			
filewriter.append(Student.toString());
			
filewriter.append("\n");
			
filewriter.flush();
			
filewriter.close();
		
} catch (IOException e) {
			
e.printStackTrace();
		
}
return Student;
	
}
}
