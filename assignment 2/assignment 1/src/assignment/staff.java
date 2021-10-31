
package assignment;

public class staff extends Employee {

    protected String title;

   

    public staff(String name,String address,int phoneNumber,String email,String office, double salary, mydate datehired,String title) {
       
        super(name,address,phoneNumber,email,office,salary,datehired);
        this.title = title;
        
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
     
          return "the class name is staff and "+"the person is name is "+getname();
    }
    
}


