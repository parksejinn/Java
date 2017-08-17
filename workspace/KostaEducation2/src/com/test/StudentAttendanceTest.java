package com.test;
import com.vo.Student;
import com.service.ManageService;

public class StudentAttendanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] std = new Student[] {
			new Student("Jason", 24, "강남구"),
			new Student("Sunny", 23, "서초구")
		};
		
		ManageService temp = new ManageService();
		
		temp.inputRandomAttendance(std);
		
		for(Student stu : std){
			int[] tempArr = new int[30];
			for(int i = 0; i < 30; i++){
				tempArr = stu.getAttendances();
				System.out.print(tempArr[i] + " ");
			}
		}
		
		for(int i = 0; i < std.length; i++)
			System.out.println("\n======== " + std[i].getName() + " ========" +
					"\n" + temp.countAttendance(std[i]) + "\n");
	}

}
