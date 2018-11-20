import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

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

	@Test public void testfechanegativa()
	{
		int valor = 15.2;
		precio.fecha = (poner fecha con blackfriday con año negativo);
		assertTrue("El total es 15.2", 0.7*valor == precio.PrecioFinal(valor));
	}

	@Test public void testlimitesuperior()
	{
		int valor = 15.2;
		precio.fecha = (poner fecha sin blackfriday cercano a blackfriday);
		assertTrue("El total es 15.2", valor == precio.PrecioFinal(valor));
	}

	@Test public void testlimiteinferior()
	{
		int valor = 15.2;
		precio.fecha = (poner fecha sin blackfriday cercano a blackfriday);
		assertTrue("El total es 15.2", valor == precio.PrecioFinal(valor));
	}

	@Test public void testcorrectofunc()
	{
		int valor = 15.2;
		precio.fecha = (poner fecha con blackfriday con año positivo);
		assertTrue("El total es 15.2", 0.7*valor == precio.PrecioFinal(valor));
	}		
