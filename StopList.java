/**
 * This is my code! Its goal is to create a StopList.
 * CS 312 - Assignment 9
 * @author Hannah Mannering
 * @version 1.1 
 */
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.Files;
import java.lang.Throwable;
/**
  * a simple stopList program
  */
public class StopList
{
  /** List of stopwords.*/
  protected List<String> stoplist;
  
  /**
   * Create a StopList. 
   * Complexity - O(n)
   * @param a filename/
   */
  public void create(String filename)
  {
    try
    {
      stoplist = Files.readAllLines(Paths.get(filename));
    }

    catch (Exception ex)
    {
      System.out.println("An error occured.");
      ex.printStackTrace( );
    }


  }

  /**
   * Determine if word is a stopword.
   * Complexity - O(n)
   * @param the word you want to check
   * @return if the stoplist contains the word 
   */
  public boolean isStopWord(String w)
  {
      return stoplist.contains((w));
  }

  /**
   * Display a list of stopwords.
   * Complexity - 
   */
  public void displayList( )
  {
    for (String s : stoplist)
      System.out.print(stoplist.toString());
  }


}

