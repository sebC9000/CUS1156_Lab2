import java.util.ArrayList;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
	  int count = 0;
	  
      for (int i = 1; i < list.size(); i++) {
    	  
    	  for (int j = 0; j < i; j++) {    	   
    	    //If two words are the same, the counter increments.
    		//---------------------------------//
			if(list.get(i).equals(list.get(j))) {		
				count++;				
				break;				
			}			
		 }
      }
      
      //Subtracts the size of the list with the number of repetitions. 
      //---------------------------------------//
	  return list.size() - count;
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon"); 	 
	  
	  int unique = countUnique(words);
	  
      System.out.println(words + " has " + unique + " unique words");
   }
}

