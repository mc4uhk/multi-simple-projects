package simple.proj.alka.test;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HttpClientTest {

	@Test
	public void test() throws Exception {
		get("http://www.google.com");
		
	}
	
	public void get(String uri) throws Exception {
	    HttpClient client = HttpClient.newHttpClient();
	    HttpRequest request = HttpRequest.newBuilder()
	          .uri(URI.create(uri))
	          .build();

	    HttpResponse<String> response =
	          client.send(request, BodyHandlers.ofString());

	    log.info(response.body());
	}	
}
