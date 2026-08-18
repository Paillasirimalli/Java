class student{
final String rollno;
int marks;
student(String rollno,int marks){
this.rollno=rollno;
this.marks=marks;
}
String grading(){
if(marks>=90) return "o";
else if(marks>=80) return "A+";
else if(marks>=70) return "A";
else if(marks>=60) return "B+";
else if(marks>=50) return "B";
else if(marks>=40) return "C";
else return "F";
}
void show(){
	System.out.println("rollno : "+rollno);
	System.out.println("marks : "+marks);
	System.out.println("grading : "+grading());
}
}
class Ex04{
	public static void main(String[] args){
		student s1 = new student("H2" , 83);
		student s2 = new student("H9" , 91);
		s1.show();
		s2.show();
	}
}