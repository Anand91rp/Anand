package org.sel.jav.test;

public class CourseDetails {

	public void javaCourse(){
		System.out.println("java");
		}

		public void seleniumCourse(){
		System.out.println("selinium");
		}

		public void oracleCourse(){
		System.out.println("oracle");
		}

		public static void main(String[] args){

		//Create an object == ClassName Obj/refname = new  ClassName();

		CourseDetails cou = new CourseDetails();

		// Call the methods===Obj/refname.methodName


		cou.javaCourse();
		cou.seleniumCourse();
		cou.oracleCourse();
		}

}
