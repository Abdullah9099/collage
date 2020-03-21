class Collage
{
	String name;
	Collage(String name)
	{
		this.name=name;
		
	}
	
}
class Student
{
	int studentID;
	String studentName;
	Collage studentcollage;
	Student(int studentId, String studentName, Collage studentcollage){
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentcollage = studentcollage;
		
		
	}
	public static void main(String[]arg) {
		Collage collage1 = new Collage("Computer Science and Information System College");
		Collage collage2 = new Collage ("Medicine College");
		
		Student obj1 =new Student(43211234, "Mohammed",collage1);
		Student obj2 =new Student(4123456, "Saleh", collage2);
		
		System.out.println(obj1 .studentID+",");
		  System.out.println(obj1.studentName);
		  System.out.println(obj1.studentcollage.name+",");
		  System.out.println(obj2.studentID);
		  System.out.println(obj2.studentName);
		  System.out.println(obj2.studentcollage.name);
		  
		
	}
}