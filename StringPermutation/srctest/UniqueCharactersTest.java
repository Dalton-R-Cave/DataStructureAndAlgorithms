import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UniqueCharactersTest {

    @Test
    public void testUniqueCharacters(){
        String str = "abcdefghijklmnopqrstuvwxyz1234567890";

        boolean check = UniqueCharacters.uniqueCharacters(str);

        assertTrue(check);

        str = "unique";

        check = UniqueCharacters.uniqueCharacters(str);

        assertFalse(check);
    }
}
