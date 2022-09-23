package oveloading; 

public class Students {

		
		public void getStudentInfo(int id) {
			System.out.println("Id of student is " + " " + id);
		}
		
		public void getStudentInfo(String name ) {
//			System.out.println("Id of student is " + " " + id );
			System.out.println("Name of Student is: " + " " + name);
		}
		public void getStudentInfo(String email, String phNo) {
			System.out.println("Email Id is: " +" " + email);
			System.out.println("Phone number is:" + " " + phNo);
		}
		
		public static void main(String[] args) {
			Students stu = new Students();
			stu.getStudentInfo(12345);
			stu.getStudentInfo("Prudvi");
			stu.getStudentInfo("prudvi@xyz.com", "9848123456");
			System.out.println(stu);
		}
	}


