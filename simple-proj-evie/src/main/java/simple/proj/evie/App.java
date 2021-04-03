package simple.proj.evie;

import java.util.concurrent.CompletableFuture;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
	public static void main(String[] args) {

		CompletableFuture.supplyAsync(() -> 10)
			.thenApply(i -> i * 10)
			.thenApply(i -> i - 1)
			.thenAccept(System.out::println)
			.thenRun(() -> log.info("run..."));
	}
}
