package simple.proj.alanis.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Storage<T> {
	List<T> list = new ArrayList<>();
}
