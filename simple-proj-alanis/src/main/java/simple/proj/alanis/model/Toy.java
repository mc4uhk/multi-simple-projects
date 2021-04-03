package simple.proj.alanis.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Toy {
	String name;
	LocalDate purchaseDate = LocalDate.now();
	
	public Toy() {
	}
	
	public Toy(String name) {
		this.name = name;
	}
	
}
