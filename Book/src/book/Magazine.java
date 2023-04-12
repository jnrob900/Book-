//Robert Jones
//Saeid Samadidana
//Assign 2
//9/25/20

package book;

/**

*

* @author jnrob

*/

public class Magazine 
{

    /**
     *
     * @param args
     */
    public static void main(String[] args)
{
    //  String name;

     // String author;

      //int publishYear;

      //int pages;
      
}
    
    private String author;
    private int publishYear;
    private int pages;
    private String name;

    
    public Magazine(String name, String author, int publishYear, int pages)

                  throws Exception// constructors

      {

            // check if name is Empty

            if ("".equals(name)) 
            {

                  throw new Exception("EmptyStringException");

            }

            // check if author is Empty

            if ("".equals(author)) 
            {

                  throw new Exception("EmptyStringException");

            }

            // check if publishYear is less than 1900

            if (publishYear < 2000) 
            {

                  throw new Exception("InvalidPublishYearException");

            }

            this.author = author;

            this.name = name;

            this.publishYear = publishYear;

            this.pages = pages;

            System.out.println("GOOD JOB ");

      }

      public String getName() // return values

      {

            return name;

      }

      public String getAuthor() 
      {

            return author;

      }

      public int getPublishYear() 
      {

            return publishYear;

      }

      public int getPages() {

            return pages;

      }

}