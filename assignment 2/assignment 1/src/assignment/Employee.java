
package assignment;

public class Employee extends person {
    
    protected double salary;
    protected String office;
    protected  mydate datehired;
   
    
   public Employee(String name,String address,int phoneNumber,String email,String office,double salary,mydate dateHired)
    {
       super(name,address,phoneNumber,email);
        this.office = office;
        this.salary = salary;
        this.datehired = dateHired;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }
    @Override
    public String toString() {
     
          return "the class name is Employee and "+"the person is name is "+getname();
    }
    
}
