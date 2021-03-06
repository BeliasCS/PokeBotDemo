package fr.univaix.iut.pokebattle.twitter;

import fr.univaix.iut.pokebattle.tuse.Credentials;
import org.junit.Test;

import java.io.InputStream;

import static org.fest.assertions.Assertions.assertThat;

public class CredentialsTest {
	@Test
	public void testLoadCredentialsGivenValidPropertiesFileShouldBeValid() throws Exception {
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("./testCredentials.properties");
		Credentials credentials = Credentials.loadCredentials(inputStream);
		assertThat(credentials.getConsumerKey()).isEqualTo("*******");
		assertThat(credentials.getConsumerSecret()).isEqualTo("*******");
		assertThat(credentials.getToken()).isEqualTo("*******");
		assertThat(credentials.getTokenSecret()).isEqualTo("*******");
	}
}
