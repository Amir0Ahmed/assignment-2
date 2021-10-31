
package assignment;


public class testprogram {
    public static void main(String[] args){
             person s = new person("amir ahmed","minya",01113165416,"amirmadian91@gmail.com");
       System.out.println(s.toString());

     student stu = new student("amir ahmed","minya",01113165416,"amirmadian91@gmail.com","Junior");
      
       System.out.println(stu.toString());
      
       mydate d = new mydate(5,12,2016);
      
       Employee e = new Employee("amir","egypt",01113165416,"amirmadian91@email.com","manger office",3000,d);
      
       System.out.println(e.toString());
    
           Faculty f = new Faculty("amir","egypt",01113165416,"amirmadian91@email.com","assitant office",3000,d,125,50);

                  System.out.println(f.toString());
                  staff st=new staff("amir","egypt",01113165416,"amirmadian91@email.com","genral office",3000,d,"manger");
       System.out.println(st.toString());

}
}