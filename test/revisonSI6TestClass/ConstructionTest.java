package revisonSI6TestClass;

import org.junit.Assert;
import org.junit.Test;

import revisonSI6Test.Aeroport;
import revisonSI6Test.Construction;
import revisonSI6Test.Gare;

public class ConstructionTest {
	
	Construction cons1 = new Construction();
	
	@Test
	public void construireAeroport(){
		
		Aeroport aero1 = new Aeroport(3);
		Assert.assertEquals(3, aero1.nbPistes);
		
	}
	
	@Test
	public void construireGare(){
		
		Gare gare = new Gare(5);
		Assert.assertEquals(5, gare.nbVoie);
		
	}

}
