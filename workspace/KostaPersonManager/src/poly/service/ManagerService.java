package poly.service;

import poly.child.Student;
import poly.course.Course;
import poly.parent.Person;

public class ManagerService {
	// 선생님, 학생 추가--김민영
		public void addPerson(Person[] people, Person person) {
			int count = 0;
			for (int i = 0; i < people.length; i++) {
				if (people[i].equals(null)) {
					continue;
				} else {
					count++;
				}
			} // for
			people[count] = person;
			System.out.println(people + "이(가) 성공적으로 추가되었습니다.");
		}

		// 선생님, 학생 삭제--김보경
		public void deletePerson(Person[] people, Person person) {
			int index = 0;

			for (int i = 0; i < people.length; i++) {
				if (people[i].equals(null)) {
					for (int j = 0; j < people.length - 1; j++) {
						people[j] = people[j + 1];
						break;
					}
					continue;
				}
			} // for
			//System.out.println(people + "이(가) 성공적으로 삭제되었습니다.");

		}

	 // course추가--박세진
	public void createCourse(Course[] courses, Course course) {
	  int count = 0;
	  for (int i = 0; i < courses.length; i++) {
	   if (courses[i].equals(null)) {
	    continue;
	   } else {
	    count++;
	   }
	  }
	  courses[count] = course;
	  System.out.println("강좌"+ course +"이(가) 성공적으로 등록되었습니다.");
	 }
	 public void deleteCourse(Course[] courses, Course course) {
	  int index = 0 ;
	  for (int i = 0; i < courses.length; i++) {
	   if (courses[i].equals(null)) {
	    for (int j = 0; j < courses.length-1; j++) {
	     courses[j] = courses[j+1];
	     break;
	    }
	    continue;
	   }
	  }
	  System.out.println("강좌" + course +"이(가) 성공적으로 삭제되었습니다.");
	 }



	// id�� Ư������� ã�Ƽ� Person�� ����--��� ����
	public Person findPerson(String personId) {
		return null;
	}

	// Ư������� ������� ã�Ƽ� Person[]�� ����--��� ����
	public Person[] findPerson(char grade) {
		return null;
	}

	// �ش� ���¸� ��� �л�, ��簭�縦 ����--��� ����
	public Person[] findPerson(Course course) {
		return null;
	}

	Course[] c;

	// course�߰�--�ڼ���
	public void createCourse(Course course) {

	}

	// ������û--����
	public void approveCourseApply(Student student, Course course) {

	}

	
	public void inputRandomAttendance(Student[] students){
		int randomIndex = 0;
		int temp[] = new int[30];
		for (int i = 0; i < students.length; i++){
			temp = new int[30];
			for(int j = 0; j < 30; j++){
				randomIndex = (int)((Math.random()*10 + 1))%3;
				temp[j] = randomIndex;
			}
			students[i].setAttendance(temp);
		}
	}
	// ������ ���� �⼮,����,����,�Ἦ-�ּ���
	

	// 출력용
	public void countAttendance(Student student) {
		int attendCount = 0;
		int lateCount = 0;
		int absentCount = 0;
		int[] temp = student.getAttendance();
		
		for(int i = 0; i < 30; i++){
			switch(temp[i]) {
				case Student.ATTEND: {
					attendCount++;
					break;
				}
				case Student.LATE: {
					lateCount++;
					break;
				}
				case Student.ABSENT: {
					absentCount++;
					break;
				}
			}
		}
		
		System.out.println("Student : " + student.getName() + 
				"\n-Attendence : " + attendCount +
				"\n-Late : " + lateCount +
				"\n-Absent : " + absentCount +"\n");
	}
	

	public void manageAttendance(Student[] students) throws InterruptedException{
		
		int attendCount;
		int lateCount;
		System.out.println("학생 출결 정보 기입 중...");

		//학생들에게 정보 기입 
		inputRandomAttendance(students);
		Thread.sleep(3000);
		
		// 출력용 (필요하다면 주석 제거 시 전체 학생 출결 사항도 확인 가능)
		
			for(Student student : students)
				countAttendance(student);
		
		
		// 제적 기준 : 출석률 70%미만
		System.out.println("\n제적 될 학생 목록 입니다..");
		for(Student stu : students){
			int[] temp = stu.getAttendance();
			attendCount = 0;
			lateCount = 0;
			for(int i = 0 ; i < 30; i++){
				if(temp[i] == 0) {
					attendCount++;
				} else if(temp[i] == 1){
					lateCount++;
				}
			}
			// 이부분만 정의하면 적정 수준 결석사람 보여
			if ( (attendCount + lateCount*0.5) <= 12 ){
				System.out.println("-" + stu.getName() );
				deletePerson(students, stu);
			}
		}
	}
	

}
