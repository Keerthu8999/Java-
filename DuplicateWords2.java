import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class DuplicateWords2 {
public static void main(String[] args) {

	        System.out.print("Enter string to analyse:");

	        Scanner sn = new Scanner(System.in);

	        String input = sn.nextLine();

	         

	        // first let us split string into words

	        String[] words = input.split(" ");

	         

	        // adds all words into a map

	        // we also check whether the word is already in map!

	        Map<String,String> w = new HashMap<String,String>();               

	        Map<String,String> a = new HashMap<String,String>();

	 

	        for(int i=0;i<words.length;i++) {

	            String word = words[i].toLowerCase(); // for case insensitive comparison

	            if(w.get(word)!=null) {

	                // we found a duplicated word!

	                if(a.get(word)==null) { // first check if it is printed already!

	                    System.out.println("Duplicated/Repeated word:"+word);

	                    a.put(word, word);
	                }

	            }else {

	                w.put(word, word);

	            }

	        }

	    }

	     

	}
