
package assignment;

public class Faculty extends Employee {
protected int officeHours;
    protected int rank;

  

   public Faculty(String name,String address,int phoneNumber,String email,String office, double salary, mydate datehired,int officeHours,int rank) {
       
        super(name,address,phoneNumber,email,office,salary,datehired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }    
     @Override
    public String toString() {
     
          return "the class name is Faculty and "+"the person is name is "+getname();
    }
}
