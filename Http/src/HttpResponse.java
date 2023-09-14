import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Optional;

import org.json.JSONObject;

public class HttpResponse {

//	void getJson(String reader) {
//		JSONObject jo = new JSONObject(reader);
//		System.out.println(jo.toString());
//	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Optional<HttpURLConnection> connection = java.util.Optional.empty();
		try {
			// Create URL object with the end point you want to access
			URL url = new URL("http://10.10.10.126:8081/masterservice/get/products");

			// Open the connection
			connection = Optional.ofNullable((HttpURLConnection) url.openConnection());

			// Set request method (GET, POST, etc.)
			connection.get().setRequestMethod("GET");
			if (connection.get().getResponseCode() == 200) {
				// Get the response code
				// int responseCode = connection.get().getResponseCode();
				// System.out.println("Response Code: " + responseCode);

				// Read the response body
				Optional<BufferedReader> reader = Optional
						.ofNullable(new BufferedReader(new InputStreamReader(connection.get().getInputStream())));
				JSONObject jo = new JSONObject(reader.get().readLine());
				System.out.println(jo.toString());
				reader.get().close();
				// Print the response body
				// Disconnect the connection
				connection.get().disconnect();
			} else
				System.out.println(connection.get().HTTP_BAD_REQUEST);

		} catch (Exception e) {

		}
	}
}
