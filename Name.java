 

public class Name
{
   private String first, last;
   public Name(String first, String last)
   {
       this.first = first;
       this.last = last;
   }
   
   public String toString() 
   { 
       return first + " " + last; 
   }
   
   public String getFirst()
   {
       return first;
   }
   public String getLast()
   {
       return last;
   }
   public boolean equals(Object o) { 
        if(!(o instanceof Name))
        {
            return false;
        }
        Name other = (Name) o;
        if(other.getFirst().equals(first) && other.getLast().equals(last))
        {
            return true;
        }
        return false; 
   }
}
