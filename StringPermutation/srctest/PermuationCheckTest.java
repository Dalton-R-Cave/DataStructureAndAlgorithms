import java.util.HashMap;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PermuationCheckTest {

	@Test
	public void testFillHmWithString() {
		String testString = "abbcccddddeeeee";
		HashMap<Character, Integer> testHM = new HashMap<Character, Integer>();
	    
		PermutationCheck.fillHMWithString(testHM, testString);

        System.out.println(buildStringFromHM(testHM));
        assertEquals(testString, buildStringFromHM(testHM));
	}

	@Test
    public void testAdequateChars(){
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        hm1.put('d', 3);
        hm1.put('a', 1);
        hm1.put('l', 1);
        hm1.put('t', 5);
        hm1.put('o', 1);
        hm1.put('n', 2);

        PermutationCheck.fillHMWithString(hm2, "dalton");

        assertTrue(PermutationCheck.adequateChars(hm2, hm1)); //adequate chars checks the to see if count of characters in the second hashMap can support those in the first

        assertFalse(PermutationCheck.adequateChars(hm1, hm2));
    }

    @Test
    public void testIsPermutation(){
        String str1 = "dalton";
        String str2 = "123ad444ltvcvdozxcvzxcvnnnn";

        boolean check = PermutationCheck.isPermuation(str1, str2);

        assertTrue(check);

        str1 = "jeff";
        str2 = "dalton";

        check = PermutationCheck.isPermuation(str1, str2);

        assertFalse(check);
    }

	public String buildStringFromHM(HashMap<Character, Integer> hm){
        StringBuilder sb = new StringBuilder();

        for(char i: hm.keySet()){
            for(int j = 0; j < hm.get(i); j++){
                sb.append(i);
            }
        }

        return sb.toString();
    }

}
