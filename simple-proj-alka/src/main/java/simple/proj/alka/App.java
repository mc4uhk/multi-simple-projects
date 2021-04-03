package simple.proj.alka;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.Random;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {
	private final static Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	public static void main(String[] args) throws IOException {
		log.info("Hello World!");
		log.info("{}", String.class.getClassLoader());
		log.info("{}", Logger.class.getClassLoader());

		String input = "JavaInterviewPoint:";

		// Pass input text to md5Hex() method
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			Random rand = new Random();
			String hash = Long.toString(rand.nextLong());
			String key = input + rand.nextLong();
			hash = new String(DigestUtils.md5(key.getBytes()));
			String hash64 = getUniqueId(key);
			// log.info("{}:{}:{}", key,hash, hash64 );
			System.out.println("'" + hash64 + "',");

		}

		long stop = System.currentTimeMillis();
		log.info("Time elapsed: {}", stop - start);

	}

	private static String getUniqueId(String key) {
		String hash64 = Base64.encodeBase64String(DigestUtils.md5(key.getBytes()));
		return hash64;
	}
}
