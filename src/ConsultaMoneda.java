import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public double consultaDeMoneda(String origen, String destino, double monto) throws IOException, InterruptedException {
        // 1. Armamos la URL base con el código ISO de origen
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/193ddeeecb5173ebd5cf0562/latest/" + origen);

        // 2. Creamos el cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        // 3. Creamos la petición
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Monedas datos = new Gson().fromJson(response.body(), Monedas.class);

            Double tasa = datos.conversion_rates().get(destino);

            if (tasa == null) {
                throw new IllegalArgumentException("Código de moneda destino no válido: " + destino);
            }

            return monto * tasa;

        } catch (IOException | InterruptedException e) {
            throw e;
        } catch (Exception e) {
            throw new NullPointerException("Error inesperado al hacer la conversión: " + e.getMessage());
        }
    }
}

