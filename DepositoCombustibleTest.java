import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testGetDepositoNivel() {
		DepositoCombustible tank = new DepositoCombustible(30.7,17.8);
		assertEquals(17.8,tank.getDepositoNivel());
	}

	@Test
	public void testGetDepositoMax() {
		DepositoCombustible tank = new DepositoCombustible(30.7,17.8);
		assertEquals(30.7,tank.getDepositoMax());
	}

	@Test
	public void testEstaVacio() {
		DepositoCombustible tank = new DepositoCombustible(30.7,17.8);
		assertEquals(true,tank.estaVacio());
	}

	@Test
	public void testEstaLleno() {
		DepositoCombustible tank = new DepositoCombustible(30.7,17.8);
		double div = 30.7/2;
		assertEquals(30.7/2,tank.getDepositoNivel()/2);
	}

	@Test
	public void testFill() {
		DepositoCombustible tank = new DepositoCombustible(30.7,17.8);
		tank.fill(6.0);
		assertEquals(11.7,tank.getDepositoNivel());
	}

	@Test
	public void testConsumir() {
		DepositoCombustible tank = new DepositoCombustible(30.7,17.8);
		tank.consumir(6.0);
		assertEquals(11.8,tank.getDepositoNivel());
	}
}
