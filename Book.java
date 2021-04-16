
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    ArrayList list  = new ArrayList();
    public ArrayList<String> author;
    public ArrayList<String> isbn;
    public ArrayList<Integer> noOfpages;
    public ArrayList<String> publisher;
    public ArrayList<String> title;
    public ArrayList<String> item_code;
    public ArrayList<Integer> cost;
    public ArrayList<Integer> time_borrow;
    public ArrayList<Boolean> borrow;
    File Text;
    
    public Book(String text2) {
        author = new ArrayList<>();
        isbn = new ArrayList<>();
        noOfpages = new ArrayList<>();
        publisher = new ArrayList<>();
        title = new ArrayList<>();
        item_code = new ArrayList<>();
        cost = new ArrayList<>();
        time_borrow = new ArrayList<>();
        borrow = new ArrayList<>();            
        Text = new File(text2);
    }
    
    
    public void read_book() {        
          try{    
              int couter = 0;
//            File Text= new File("C:\\Users\\user\\eclipse-workspace\\library\\src\\library\\item_data_2 (1).TXT");                
               @SuppressWarnings("resource")
            Scanner input = new Scanner(Text);                              
              input.useDelimiter("");               
              while (input.hasNext()){                            
                  String txt = input.nextLine();
                 if(txt.contains("[")) {
                     couter++;
                     if (couter==2) {
                         break;
                     }
                     continue;
                 }
                 if (!txt.contains("//") || !txt.contains(" ")){                  
                Scanner in = new Scanner(txt).useDelimiter(",") ;
                   
                   while(in.hasNext()){
                      author.add(in.next());
                      isbn.add(in.next().replaceAll("\\s", ""));
                      noOfpages.add(in.nextInt());
                      publisher.add(in.next().replaceFirst("\\s", ""));
                      title.add(in.next().replaceFirst("\\s", ""));                      
                      item_code.add(in.next().replaceFirst("\\s", ""));
                      cost.add(in.nextInt());
                      time_borrow.add(in.nextInt());
                      borrow .add(in.nextBoolean());

                    }
                   in.close();
                
                   
            }
        }
              input.close();

            }
            
            catch(FileNotFoundException e)
            {
                          System.out.println(e);

            }  
            }
        
    public ArrayList<String> gettitle()
    {
        return title;
    }
    
    
    public ArrayList<String> getitemCode(){
        
        return item_code;
        
    }
    public ArrayList<Integer> getcost()
    
    {
        return cost;
        
    }
    public ArrayList<Integer> gettimesBorrowed()
    
    {
        return time_borrow;
        
    }
    public ArrayList<Boolean> getonLoan()
    {

        return borrow;
        
    }
    
   public ArrayList<String> getAuthor() {
       return author;
   }
   
   public ArrayList<String> getIsbn() {
       return isbn;
   }
    
  public ArrayList<Integer> getnoOfpage() {
      return noOfpages;
  }
  
  public ArrayList<String> getPublisher() {
      return publisher;
  }
  
  
  public void view() {
     
      for (int i=0;i<author.size();i++) {
          System.out.println("Author: "+author.get(i)+"\t--isbn: "+isbn.get(i)+"\t--no of page: "+noOfpages.get(i)+"\t--publisher: "+publisher.get(i)+"\t--price :"+cost.get(i)+"\n");
      }
      
  }
  
  
}

     


