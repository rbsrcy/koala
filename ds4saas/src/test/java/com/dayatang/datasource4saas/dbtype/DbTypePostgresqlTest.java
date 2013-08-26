package com.dayatang.datasource4saas.dbtype;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dayatang.datasource4saas.dscreator.DbType;

public class DbTypePostgresqlTest extends AbstractDbTypeTest {
	
	@Before
	public void setUp() throws Exception {
		instance = DbType.POSTGRESQL;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getDriverClaaaName() {
		assertEquals("org.postgresql.Driver", instance.getDriverClassName());
	}

	@Test
	public void getUrlWithoutExtraString() {
		assertEquals("jdbc:postgresql://localhost:3306/test_db", instance.getUrl(host, port, dbname, dbInstance, username, null));
	}

	@Test
	public void getUrlWithExtraString() {
		assertEquals("jdbc:postgresql://localhost:3306/test_db?useUnicode=true&characterEncoding=utf-8", 
				instance.getUrl(host, port, dbname, dbInstance, username, extraUrlString));
		assertEquals("jdbc:postgresql://localhost:3306/test_db?useUnicode=true&characterEncoding=utf-8", 
				instance.getUrl(host, port, dbname, dbInstance, username, "?" + extraUrlString));
	}
}