
class Task06{
	float percentage;
     int  totalmarks=300;
	int  obtainmarks;
    String grade;
    void percentage(){
    	this.percentage=(float)obtainmarks*100/totalmarks;
        // System.out.print("Percentage:"+percentage);
    }
    void totalmarks(){
    	int computer_Programming=87;
    	int dcld=70;
    	int electronics=70;
    	this.obtainmarks=computer_Programming+dcld+electronics;
    	 // System.out.println("Obtain-Marks:"+obtainmarks);


    }
    void grade(){
    	if(percentage>=80 && percentage>=100){
          System.out.println("A-1 Grade");
    	}
    	if(percentage>=70 && percentage<=85){
    		System.out.println("A-Grade");
    	}
    	if(percentage>=60 && percentage<=70){
    		System.out.println("B-Grade");
    	}
    	if(percentage<=60){
    		System.out.println("C-Grade");
    	}
    }
}
  
    class Student{
	String name;
	String dept;
	String rollno;
	Student(String name,String dept,String rollno){
		this.name=name;
		this.dept=dept;
		this.rollno=rollno;
		// System.out.print(name+" "+dept+" "+rollno);
     

	}
}
	class Result{
	       String name;
	       String dept;
	       String rollno;
	       float percentage;
	       String grade;
	       int  totalmarks;
	       int obtainmarks;
	       Result(Student s1,Task06 marksheet){
	       	this.name=s1.name;
	       	this.dept=s1.dept;
	       	this.rollno=s1.rollno;
	      
	       	this.grade=marksheet.grade;
	       	marksheet.totalmarks();
	       	this.totalmarks=marksheet.obtainmarks;
	       	marksheet.percentage();
	       	this.percentage=marksheet.percentage;
	       		
	      	marksheet.grade();
            
	       	// this.obtainmarks=marksheet.totalmarks;	       	
	       }
	      void createStudentResult(Student s1,Task06 marksheet){
	      
	      	
          	      System.out.print(this.name+" "+this.dept+" "+this.rollno+" "+percentage);
             


	      }
	}
	class mainclass{
	public static void main(String talha[]){
		Student s1=new Student("Talha","Software engineering","18SW37");
		Task06 marksheet=new Task06();
         Result r1=new Result(s1,marksheet);

       r1.createStudentResult(s1, marksheet);
	}
}
