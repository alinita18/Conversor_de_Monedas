import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultExchange {
    public Conversion convertir(String moneda1, String moneda2, double monto){
        URI address =URI.create("https://v6.exchangerate-api.com/v6/40da805707fdfbf84392976d/pair/" + moneda1 + "/" + moneda2 + "/" + monto);
        System.out.println(address.toString());
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(address).build();

        HttpResponse<String> response = null;
        try{
            response =client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch(IOException | InterruptedException e){
            System.out.println("Monedas no encontradas");
        }
        return new Gson().fromJson(response.body(), Conversion.class);
    }

}
