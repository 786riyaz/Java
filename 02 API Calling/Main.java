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


/*
E:\GIT\Java>cd "e:\GIT\Java\02 API Calling\" && javac Main.java && java Main
{
  "userId": 1,
  "id": 1,
  "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
  "body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
}
*/