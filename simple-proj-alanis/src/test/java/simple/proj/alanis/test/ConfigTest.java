package simple.proj.alanis.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.commons.configuration2.Configuration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import simple.proj.alanis.App;

public class ConfigTest {

	@Test
	@DisplayName("Test loading Config")
	public void test01()
	{
		App app = new App();
		String configFile = "application.properties";
		Configuration config = app.loadConfig(configFile);
		
		assertThat(config)
			.isNotNull();

		assertThat(config.getString("config.id"))
			.isNotBlank();

	}

}
