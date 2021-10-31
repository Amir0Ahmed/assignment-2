
package assignment;

public class student extends person {
  

    public  final String FRESHMAN = "Freshman";
    public  final String SOPHOMORE = "Sophomore";
    public  final String JUNIOR = "Junior";
    public  final String SENIOR = "Senior";

    protected String status;

    
   
    public student(String name,String address,int phoneNumber,String email,String status)
    {
        super(name,address,phoneNumber,email);
        this.status = status;
      
    }
    @Override
    public String toString() {
     
          return "the class name is student and "+"the person is name is "+getname();
    }
    
}
