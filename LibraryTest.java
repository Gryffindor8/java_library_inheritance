import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;


public class LibraryTest
{
  private Library lib;

  private ArrayList<Integer> cst= new ArrayList<Integer>();


    @Before
    public void setUp()
    {
        lib = new Library();
        lib.readItemData();
    }



    @Test
    public void Test_cost()
    {
        int i = lib.cost().get(0);
        assertEquals(3989, i);        
    }
    
    @Test
    public void Test_title()
    {
        String i = lib.title().get(0);
        assertEquals("Objects First with Java", i);        
    }
}

