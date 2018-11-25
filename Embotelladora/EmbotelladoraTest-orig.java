import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class EmbotelladoraTest
{

	private Embotelladora litros;

 	@Before      // Set up - Called before every test method.
    public void setUp()
    {
	  litros = new Embotelladora();
	}	

	@Test public void testtotalCero()
	{
		assertTrue("El total es 0", 0 == litros.calcBotellasPequenyas(3,5,0));
	}

	@Test (expected = ClassCastException.class)
    @SuppressWarnings ("unchecked")
	public void testtotalnegativo()
	{
		litros.calcBotellasPequenyas(4,5,-1);
	}

	@Test public void testgrandescero()
	{
		assertTrue("El total es 6", 6 == litros.calcBotellasPequenyas(7,0,6));
	}

	@Test public void testpequenyascero()
	{
		assertTrue("El total es 0", 0 == litros.calcBotellasPequenyas(0,6,7));
	}

	@Test (expected = ClassCastException.class)
    @SuppressWarnings ("unchecked")
	public void testgrandesnegativo()
	{
		litros.calcBotellasPequenyas(5,-4,5);
	}

	@Test (expected = ClassCastException.class)
    @SuppressWarnings ("unchecked")
	public void testpequenyasnegativo()
	{
		litros.calcBotellasPequenyas(-5,4,5);
	}

	@Test public void testfaltaespacio()
	{
		assertTrue("El total es 5", 5 == litros.calcBotellasPequenyas(5,1,17));
	}

	@Test public void testlimiteinferior()
	{
		assertTrue("El total es 4", 4 == litros.calcBotellasPequenyas(5,2,9));
	}

	@Test public void testlimitesuperior()
	{
		assertTrue("El total es 1", 1 == litros.calcBotellasPequenyas(5,2,11));
	}

}
