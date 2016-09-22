import java.util.HashMap;

public class PermutationCheck {
	public static void main(String[] args){
		String str1 = "abac";
		String str2 = "abcd";
		
		boolean check = isPermuation(str1, str2);
		
		System.out.println(check);
	}

	/*
	 *  Takes in two strings and determines if the Strings are permuations of one another
	 */
	public static boolean isPermuation(String str1, String str2){
		if(isEmpty(str1) || isEmpty(str2)) return true; //empty set is considered permutation often
		
		boolean isPermutation = false;
		
		HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> hm2 = new HashMap<Character, Integer>();
		
		fillHMWithString(hm1, str1);
		fillHMWithString(hm2, str2);	
		
		if(adequateChars(hm1, hm2)){
			isPermutation = true;
			System.out.println("String 1 is a permutation of String 2");
		}
		
		if(adequateChars(hm2, hm1)){
			isPermutation = true;
			System.out.println("String 2 is a permutation of String 1");
		}
		
		return isPermutation;
	}

	/*
	 * This method takes a string fills a hash map with the counts of each character.
	 * This allows us to check the characters very quickly later on
	 */
	protected static void fillHMWithString(HashMap<Character, Integer> hm, String str){
		Character currentLetter;
		Integer priorCount;
		Integer count;
		
		for(int i = 0; i < str.length(); i++){
			currentLetter = str.charAt(i);
			priorCount = hm.get(currentLetter);
			if (priorCount == null){
				count = 1;
			}
			else{
				count = priorCount + 1;
			}
			hm.put(currentLetter, count);
		}
	}

	/*
	 * Checks to see if there are enough characters in hm2 to support the characters in hm1.
	 * Loops through each key in hm1 and compares it to the size of that key in hm2
	 */
	protected static boolean adequateChars(HashMap<Character, Integer> hm1, HashMap<Character, Integer> hm2){
		for(char i: hm1.keySet()){
			if(!hm2.containsKey(i) || hm1.get(i) > hm2.get(i)) return false;
		}
		
		return true;
	}

	//String utility for checking if empty or null
	private static boolean isEmpty(String toCheck){		
		if(toCheck == null || toCheck.isEmpty()){ return true;}
		else{ return false;}
	}
}
