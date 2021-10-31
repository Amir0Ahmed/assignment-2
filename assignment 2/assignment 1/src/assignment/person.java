
package assignment;

public class person {

    
    protected String name;
  
    protected String address;
    protected int phoneNumber;
    protected String email;

   


      public  person(String name,String address,int phoneNumber,String email) {
                this.name = name;
          this.address = address;
        this.phoneNumber = phoneNumber;
         this.email = email;

      }
      public String getname() {
        return name;
        
    }
     
      public  String tostring(){
          return "the class name is person and "+"the person is name is "+getname();
      }
      
}