package dam2.add.p7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) {
		String url = "https://raw.githubusercontent.com/IagoLast/pselect/master/data/provincias.json";

		String cadenaJson = leerUrl(url);

		Provincias[] provincias = new Gson().fromJson(cadenaJson, Provincias[].class);

		for (Provincias provincia : provincias) {
				String name = provincia.getNm();
				String id = provincia.getId();
				System.out.println(id + ".- " + name);
		}

		leerMunicipios();
	}

	public static void leerMunicipios() {
		Scanner sc = new Scanner(System.in);
		String url = "https://raw.githubusercontent.com/IagoLast/pselect/master/data/municipios.json";

		System.out.println("Elige el numero de la provincia para ver sus municipios: ");
		String codigo = sc.nextLine();

		String cadenaJson = leerUrl(url);

		Municipios[] municipios = new Gson().fromJson(cadenaJson, Municipios[].class);

		for (Municipios municipio : municipios) {
			String nombre = municipio.getNm();
			String id = municipio.getId();

			if (codigo.equals(id.substring(0, 2))) {
				System.out.println(nombre);
			}

		}
	}

	public static String leerUrl(String sUrl) {
		String output = "";

		try {
			URL url = new URL(sUrl);

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			// conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				// si la respuesta del servidor es distinta al codigo 200 lanzaremos una
				// exception
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			// creamos un StringBuilder para almacenar la respuesta del web service
			StringBuilder sb = new StringBuilder();
			int cp;
			while ((cp = br.read()) != -1) {
				sb.append((char) cp);
			}
			// en la cadena output almacenamos toda la respuesta del servidor
			output = sb.toString();
			// System.out.println(output);

			conn.disconnect();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return output;
	}

}
