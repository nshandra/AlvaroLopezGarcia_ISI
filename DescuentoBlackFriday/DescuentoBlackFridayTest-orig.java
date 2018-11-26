import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DescuentoBlackFridayTest
{

	private DescuentoBlackFriday precio;

 	@Before      // Set up - Called before every test method.
    public void setUp()
    {
	  precio = new DescuentoBlackFriday();//Hay que hacer un constructor con una fecha que sea por ejemplo la fecha actual
	}


	@Test (expected = ClassCastException.class)
    @SuppressWarnings ("unchecked")
	public void testprecionegativo()
	{
		precio.PrecioFinal(-5.0);
	}

	@Test public void testlimitesuperior()
	{
		double valor = 15.2;
		precio.fecha = LocalDate.parse("1914-24-11",precio.f);
		assertTrue("El total es 15.2", valor == precio.PrecioFinal(valor));
	}

	@Test public void testlimiteinferior()
	{
		double valor = 15.2;
		precio.fecha = LocalDate.parse("1914-22-11",precio.f);
		assertTrue("El total es 15.2", valor == precio.PrecioFinal(valor));
	}

	@Test public void testcorrectofunc()
	{
		double valor = 15.2;
		precio.fecha = LocalDate.parse("1954-23-11",precio.f);
		assertTrue("El total es 15.2", 0.7*valor == precio.PrecioFinal(valor));
	}
}		
