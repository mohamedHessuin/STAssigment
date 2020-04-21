package APITEST;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import javax.crypto.spec.ChaCha20ParameterSpec;

import org.junit.Test;
import org.mockito.Mockito;

import API.CachedDate;
import API.GetData;
import API.cacheddatabase;

public class CacheddataTest {
	
	/*@Test
	public void checkgetdata() {
		GetData  dt=new GetData("Egypt");
		GetData sp=Mockito.spy(dt);
		Mockito.doReturn(true).when(sp).checkdataincach();
		cacheddatabase db=Mockito.mock(cacheddatabase.class);
		//CachedDate cd=Mockito.mock(CachedDate.class);
		CachedDate cd=new CachedDate("","");
		CachedDate c=Mockito.mock(CachedDate.class);
		Mockito.doReturn(c).when(db).getdata(cd);
		Mockito.doReturn("").when(c).getJSO();
		sp.getdata();
		assertFalse(sp.isEstablishconnectionwithapi());
	}
	*/
	
	/*
	@Test
	public void checkgetdata() {
		GetData  dt=new GetData("france");
		GetData sp=Mockito.spy(dt);
		Mockito.doReturn(false).when(sp).checkdataincach();
		cacheddatabase db=Mockito.mock(cacheddatabase.class);
		//CachedDate cd=Mockito.mock(CachedDate.class);
		CachedDate cd=new CachedDate("","");
		CachedDate c=Mockito.mock(CachedDate.class);
		Mockito.doReturn(c).when(db).getdata(cd);
		Mockito.doReturn("").when(c).getJSO();
		sp.getdata();
		assertTrue(sp.isEstablishconnectionwithapi());
	}
	
*/

	
	@Test	
	public void checkgetdata3() {
		GetData  dt=new GetData("italy");
		dt.getdata();
		assertTrue(dt.isEstablishconnectionwithapi());
		dt.getdata();
		assertFalse(dt.isEstablishconnectionwithapi());
		
		
	}

	
	@Test
	public void checkdataincache() {
		GetData  dt=new GetData("spain");
		cacheddatabase db=Mockito.mock(cacheddatabase.class);
		 CachedDate cd=new CachedDate("", "spain");

		Mockito.doReturn(false).when(db).checkExistence(cd);
		assertFalse(dt.checkdataincach());
	}
	
	


	
	

}
