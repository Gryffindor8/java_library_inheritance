 
import java.awt.*;
import java.util.ArrayList;

import javax.swing.JFrame;


public class Library
{      
	
	public static String path = "";
	public LibraryItem item;
	
	
    public void readItemData()
    {
            JFrame frame = new JFrame("File Dialog Box");          
            FileDialog fileBox = new FileDialog(frame,"Open", FileDialog.LOAD);          
            fileBox.setVisible(true);
            String pat = fileBox.getDirectory()+fileBox.getFile();
            path = pat;
            this.item= new LibraryItem(path);
        }
    
    
    public void showdata() {
    	
    	item.PrintBookDetails();
    	item.PrintPeriodDetails();    	
    	
    }
    
    public ArrayList<Integer> cost() {
    	return item.getcost();   	
    }
    public ArrayList<String> title() {
    	return item.gettitle();   	
    }
    
    
              
        public static void main(String []args){
        	    	
        	Library lib = new Library();
        	lib.readItemData();
        	lib.showdata();

        
        }
        
     
    }




