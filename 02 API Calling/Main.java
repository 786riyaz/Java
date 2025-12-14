import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

    public static void main(String[] args) throws Exception {

        // Create HTTP client
        HttpClient client = HttpClient.newHttpClient();

        // Create HTTP request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                .GET()
                .build();

        // Send request (BLOCKING)
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        // Print response
        System.out.println(response.body());
    }
}
