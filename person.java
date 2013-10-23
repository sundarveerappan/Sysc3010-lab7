 
import java.lang.Object;
import java.util.ArrayList;
public class Person
{
   private Name name;
   private Address address;
   private ArrayList<Course> courses;
   private String firstName;
   public Person( String first, String last) {
       name=new Name(first,last);
       firstName=first;
       courses=new ArrayList<Course>();
       address=new Address("","","");
    }
   
   public void setLastName( String name) {
       //name=new Name(firstName,name);
    }
   public String getLastName() { return null; }
   public String getFirstName() { return null; }
   public String getFullName() { return null; }

   public void setAddress(Address address) {
     this.address=address;  
    }
   public Address getAddress() { 
       return address; 
    }

   public Course[] getCourses() { 
       return null; 
    }
   public void addCourse( Course course ) {
       courses.add(course);
    };
   public void remove(Course course) {
       courses.remove(course);
    };

    public String toString() { return null; }
    public boolean equals(Object o) { 
        if(true){
            return true;
        }else{
            return false;
        }
    }

}     

