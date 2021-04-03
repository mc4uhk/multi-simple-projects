package simple.proj.alanis;

import java.io.File;
import java.util.Iterator;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

import lombok.extern.slf4j.Slf4j;
import simple.proj.alanis.model.Storage;
import simple.proj.alanis.model.Toy;
import simple.proj.alanis.service.MaidService;

@Slf4j
public class App {

	public static void main(String[] args) {
		log.info("App started");
		String configFile ="application.properties";
		App homekeeping = new App();
		homekeeping.loadConfig(configFile);
		homekeeping.doSomeWork();
	}

	public void doSomeWork() {
		Toy doll = new Toy("Doll");
		Toy car = new Toy("Toy Car");
		Toy train = new Toy("Toy Train");
		Toy drawbroad = new Toy("Drawing Broad");

		Storage<Toy> toybox = new Storage<>();

		MaidService maid = new MaidService();
		maid.packup(toybox, doll);
		maid.packup(toybox, car);
		maid.packup(toybox, drawbroad);
		maid.packup(toybox, train);

		maid.count(toybox);
	}

	public Configuration loadConfig(String configFile) {
		log.info("\nRead Config ------------------------");
		Configurations configs = new Configurations();
		Configuration config = null;
		try {
			config = configs.properties(new File(configFile));

			Iterator<String> keys = config.getKeys();
			
		    while(keys.hasNext()){
		      String key = (String) keys.next();
		      log.info("{}: {}", key, config.getProperty(key).toString());
		    }
			
		} catch (ConfigurationException e) {
			log.error(e.getMessage());
			e.printStackTrace();
		}
		log.info("\n------------------------------------");
		return config;
	}

}
