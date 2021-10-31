
package assignment2;


public class student {
public String studentName;
public int studentID;
public double studentGPA;
public subject sub;
public address add;



   public student(String studentName, int studentID, Double studentGPA ,subject sub,address add)
    {
       
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentGPA = studentGPA;
    }
    
    public String getStudentName() 
    {
        return studentName;
    }

    public void setStudentName(String studentName) 
    {
        this.studentName = studentName;
    }

    public int getStudentID() 
    {
        return studentID;
    }

    public void setStudentID(int studentID) 
    {
        this.studentID = studentID;
    }

    public double getStudentGPA() 
    {
        return studentGPA;
    }

    public void setStudentGPA(double studentGPA)
    {
        this.studentGPA = studentGPA;
    }

public void print()
{
System.out.println("name is "+ studentName + "id is " + studentID +"gpa is  "+studentGPA);
}
}