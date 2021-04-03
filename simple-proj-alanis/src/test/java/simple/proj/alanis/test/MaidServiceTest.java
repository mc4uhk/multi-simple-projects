package simple.proj.alanis.test;



import static org.assertj.core.api.Assertions.assertThat;

import java.util.Random;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import simple.proj.alanis.model.Storage;
import simple.proj.alanis.model.Toy;
import simple.proj.alanis.service.MaidService;

public class MaidServiceTest {

	@Test
	@DisplayName("MaidService count Test")
	public void test01() {
		Storage<Toy> toybox = new Storage<>();

		MaidService maid = new MaidService();
		
		Random rand = new Random();
		int randInt = rand.nextInt(15)+3;
		for(int i =0 ; i < randInt; i++) {
			maid.packup(toybox, new Toy("random toy"));
		}
		int count = maid.count(toybox);
		
		assertThat(toybox)
			.isNotNull();
		assertThat(count)
			.isEqualTo(randInt);
	}
}
