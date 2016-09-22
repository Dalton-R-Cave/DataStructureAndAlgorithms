import java.util.HashMap;

public class UniqueCharacters {

	public static void main(String[] args){
		String toCheck = "How areyu";
		System.out.println(uniqueCharacters(toCheck));
	}

	/*
	 * Check to see if all characters are unique.
	 * Capital letters are considered different from their
	 * lower case counterparts.  This would be easy to modify
	 * if desired, simply by first converting all of the
	 * characters in the string to lower case if they are letters.
	 */
	protected static boolean uniqueCharacters(String toCheck){
		HashMap<Character, Integer> numChars = new HashMap<>();
		
		for(int i = 0; i < toCheck.length(); i++){			
			Character singChar = toCheck.charAt(i);
			Integer priorCount = numChars.get(singChar);
			
			if(priorCount == null){
				numChars.put(singChar, 1);
			}
			else{
				return false;
			}			
		}		
		return true;
	}
}
