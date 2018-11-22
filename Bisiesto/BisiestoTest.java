import static org.junit.Assert.*;
import org.junit.*;

public class BisiestoTest
{

    private Bisiesto anyo;

    @Before      // Set up - Called before every test method.
    public void setUp()
    {
       anyo = new Bisiesto();
    }

	@Test public void testAnyoCero()
	{
		assertTrue("Es bisiesto cero", true == anyo.EsBisiesto(0));
	}

	@Test public void testAnyoPositivo()
	{
		assertTrue("Es bisiesto 1", false == anyo.EsBisiesto(1));
	}

	@Test public void testAnyoNegativo()
	{
		assertTrue("Es bisiesto -1", false == anyo.EsBisiesto(-1));
	}

	@Test public void testAnyoCien()
	{
		assertTrue("Es bisiesto 100", false == anyo.EsBisiesto(100));
	}

	@Test public void testAnyoCuatro()
	{
		assertTrue("Es bisiesto 4", true == anyo.EsBisiesto(4));
	}

	@Test public void testAnyoCuatrocientos()
	{
		assertTrue("Es bisiesto 400", true == anyo.EsBisiesto(400));
	}
}
