package com.meudominio.api.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class SenhaUtilsTest {
	
	private final String senhaInt = "123456";
	private final String senhaString = "abcdef";

	@Test
	public void testSenhaValida() {
		String senhaIntEncoded = SenhaUtils.gerarBCrypt(senhaInt);
		assertTrue(SenhaUtils.senhaValida(senhaInt, senhaIntEncoded));
	}
	
	@Test
	public void testSenhaInvalida() {
		String senhaIntEncoded = SenhaUtils.gerarBCrypt(senhaInt);
		assertFalse(SenhaUtils.senhaValida(senhaString, senhaIntEncoded));
	}
}
