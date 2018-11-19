import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class RomanNumeralTest
{
	private String word;   // Test fixture

   @Before      // Set up - Called before every test method.
   public void setUp()
   {
      word = new String();
   }

   @After      // Tear down - Called after every test method.
   public void tearDown()
   {
      word = null;  // redundant in this example!
   }

	@Test
   public void testForNull()
   {
      word = null;
      try {
         RomanNumeral.convierte (word);
      } catch (NullPointerException e) {
         return;
      }
      fail ("NullPointerException expected");
   }
   
  /* @Test (expected = IllegalArgumentException.class)
   public void testEmptyList()
   {
      RomanNumeral.convierte(word);
   }*/
   
   @Test (expected = ClassCastException.class)
   @SuppressWarnings ("unchecked")
   public void testMutuallyIncomparable()
   {
   	word = "II1";
      RomanNumeral.convierte (word);
   }
   
   @Test (expected = CharRepeatException.class)
   @SuppressWarnings ("unchecked")
   public void testcuatroI()
   {
   	word = "IIII";
      RomanNumeral.convierte (word);
   }
   
   @Test (expected = CharRepeatException.class)
   @SuppressWarnings ("unchecked")
   public void testcuatroC()
   {
   	word = "CCCC";
      RomanNumeral.convierte (word);
   }
   
   @Test (expected = CharRepeatException.class)
   @SuppressWarnings ("unchecked")
   public void testcuatroX()
   {
   	word = "XXXX";
      RomanNumeral.convierte (word);
   }
   
   @Test (expected = CharRepeatException.class)
   @SuppressWarnings ("unchecked")
   public void testdosL()
   {
   	word = "LL";
      RomanNumeral.convierte (word);
   }
   
   @Test (expected = CharRepeatException.class)
   @SuppressWarnings ("unchecked")
   public void testdosV()
   {
   	word = "VV";
      RomanNumeral.convierte (word);
   }
   
   @Test (expected = CharRepeatException.class)
   @SuppressWarnings ("unchecked")
   public void testdosD()
   {
   	word = "DD";
      RomanNumeral.convierte (word);
   }
   
}
