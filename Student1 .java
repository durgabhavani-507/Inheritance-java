5. Student Hierarchy
package com.secnarios;
public class Student1{
public static void main(String[] args) {
Student undergraduate = new UnderGraduate("XYZ", "X12345", "Maths");
undergraduate.displayStudentInfo();
((UnderGraduate) undergraduate).displayundergraduateInfo();
Student graduate = new Graduate("PQR", "Y67890", "Science");
graduate.displayStudentInfo();
((Graduate) graduate).displayGraduateInfo();
Student phdStudent = new PhDStudent("MNO", "Z1234", "Javaprogramming");
phdStudent.displayStudentInfo();
((PhDStudent) phdStudent).displayPhDStudentInfo();
}
}
class Student{
String name;
String studentID;
public void displayStudentInfo() {
System.out.println("Student Name:"+name+" , Student ID:"+studentID);
}
}
class UnderGraduate extends Student{
String major;
public UnderGraduate(String name,String studentID,String major){
this.name=name;
this.studentID=studentID;
this.major=major;
}
public void displayundergraduateInfo() {
System.out.println("Major is:"+major);
}
}
class Graduate extends Student{
String thesisTopic;
public Graduate(String name,String studentID,String thesisTopic) {
this.name=name;
this.studentID=studentID;
this.thesisTopic=thesisTopic;
}
public void displayGraduateInfo() {
System.out.println("Thesis Topic:"+thesisTopic);
}
}
class PhDStudent extends Student{
String researchArea;
public PhDStudent(String name,String studentID,String researchArea) {
this.name=name;
this.studentID=studentID;
this.researchArea=researchArea;
}
public void displayPhDStudentInfo() {
System.out.println("Research Area:"+researchArea);
}
}