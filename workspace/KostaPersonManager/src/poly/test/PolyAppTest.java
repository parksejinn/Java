package poly.test;
import poly.child.Manager;
import poly.child.Student;
import poly.child.Teacher;
import poly.course.Course;
// import poly.list.Applies;
import poly.parent.Person;
import poly.service.ManagerService;
public class PolyAppTest {
 public static void main(String[] args) {
  
  ManagerService ms = new ManagerService();
  // TODO Auto-generated method stub
//  Person[] person = {
//    new Student("Peter", "S001", "New York", "010-1322-2323"),
//    new Student("Tony", "S002", "San Francisco", "010-7777-7777"),
//    new Student("Merry", "S003", "Paris", "010-8550-9488"),
//    new Manager("White", "M001", "Dokyo", "010-2883-4343"),
//    new Teacher("Jake", "T001", "Rome", "010-3394-8111"),
//    new Teacher("Jane", "T002", "Seoul", "010-8722-2887"),
//    new Teacher("Lily", "T003", "Beijing", "010-1199-9382"),
//    new Student("Sonya", "S004", "Moon", "010-4333-2400"),
//    new Student("May", "S005", "Paris", "010-2333-4482")
//  };
  
  Person[] people = new Person[30];
  for(int i=0; i < people.length; i++) {
	  people[i] = new Person();
  }
  
//  Student student = new Student();
//  person[0] = student;
  
  Course[] course = new Course[10];
  for(int i=0; i < course.length; i++) {
   course[i] = new Course();
  }
  
  ms.createCourse(course, new Course("JAVA PROGRAMMING", 4));
  

//  Applies[] applies = {
//    new Applies((Student)person[0], course[0]),
//    new Applies((Student)person[1], course[0]),
//    new Applies((Student)person[2], course[0]),
//    new Applies((Student)person[7], course[0])
//  };
  
  
  
  
  
 }
}
