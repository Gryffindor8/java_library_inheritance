
import java.util.ArrayList;

public class LibraryItem
{
    Book book;
    Periodical period;
    public static String path = "";
    
    public LibraryItem(String path)
    {
    	
    book = new Book(path);
    period = new Periodical(path);
    
    book.read_book();
    period.periodical_read();
    }
    
    
    public void PrintBookDetails()
    
    {
       System.out.print("\t\t\tBook Details\t\t\n");
       book.view();
    }
    public void PrintPeriodDetails()
    
    {
       System.out.print("\t\t\tPeriodical Details\t\t\n");
       period.view();
    }
          
    
    public ArrayList<String> gettitle()
    {
        return book.gettitle();
    }
    
    
    public ArrayList<String> getitemCode(){
        
        return book.item_code;
        
    }
    public ArrayList<Integer> getcost()
    
    {
        return book.cost;
        
    }
    public ArrayList<Boolean> gettimesBorrowed()
    
    {
        return book.borrow;
        
    }
       
    
}
