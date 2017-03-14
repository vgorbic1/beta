package com.gorbich.beta;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gorbich.beta.web.i18n.I18nService;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Locale;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BetaApplicationTests {
	
	@Autowired
	private I18nService i18NService;
	
	@Test
	public void testMessageByLocaleService() throws Exception {
		String expected = "Site avec fonctionnalité de connexion";
		String messageId = "index.jumbotron.h1";
		Locale locale = new Locale("fr");
		String actual = i18NService.getMessage(messageId, locale);
		assertThat(actual).isEqualTo(expected);
	}

}
