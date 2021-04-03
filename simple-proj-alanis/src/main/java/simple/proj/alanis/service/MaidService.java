package simple.proj.alanis.service;

import lombok.extern.slf4j.Slf4j;
import simple.proj.alanis.model.Storage;

@Slf4j
public class MaidService {

	public <T> boolean packup(Storage<T> storage, T thing) {
		storage.getList().add(thing);
		return true;
	}

	public <T> int count(Storage<T> storage) {
		storage.getList().stream().forEach(t -> log.info(t.toString()));
		return storage.getList().size();
	}
}