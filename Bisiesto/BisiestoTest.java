import static org.junit.Assert.*;
import org.junit.*;

public class BisiestoTest
{
	@Test public void testAnyoCero()
	{
		assertTrue("Es bisiesto cero", true == Bisiesto.EsBisiesto(0));
	}

	@Test public void testAnyoPositivo()
	{
		assertTrue("Es bisiesto 1", false == Bisiesto.EsBisiesto(1));
	}

	@Test public void testAnyoNegativo()
	{
		assertTrue("Es bisiesto -1", false == Bisiesto.EsBisiesto(-1));
	}

	@Test public void testAnyoCien()
	{
		assertTrue("Es bisiesto 100", false == Bisiesto.EsBisiesto(100));
	}

	@Test public void testAnyoCuatro()
	{
		assertTrue("Es bisiesto 4", true == Bisiesto.EsBisiesto(4));
	}

	@Test public void testAnyoCuatrocientos()
	{
		assertTrue("Es bisiesto 400", true == Bisiesto.EsBisiesto(400));
	}
}
