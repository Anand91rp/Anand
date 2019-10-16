package org.sel.jav.test;

public class ClientDetails {

	public void cliName(){
		System.out.println("Tmx");
		}

		public void cliID(){
		System.out.println("45454");
		}

		public void cliLocation(){
		System.out.println("US");
		}

		public static void main(String[] args){

		ClientDetails cli = new ClientDetails();

		cli.cliName();
	    cli.cliID();
	    cli.cliLocation();

		CourseDetails co = new CourseDetails();

	co.javaCourse();
	co.seleniumCourse();
		
		}
}
