package by.htp.catalog.service.impl;

import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import by.htp.catalog.domain.vo.Catalog;
import by.htp.catalog.service.CatalogService;

public class CatalogServiceTest {
	
	
	private static CatalogService service;

	@BeforeClass
	public static void initTest(){
		service = new SimpleCatalogImpl();
	}
	
	
	@Test
	public  void testCatalogNotNull(){
		assertNotNull("catalog was not created", service.getCatalog());
	}
	
	@Test
	public  void testCatalogFilled(){
		Catalog catalog= service.getCatalog();
		assertNotNull("impossible catalog is null", catalog);
		assertNotNull("catalog title is null", catalog.getTitle());
		assertNotNull("catalog books is empty", catalog.getBooks());
		
	}

}
