import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Weather {
    @Scheduled(cron = "0 0 * * * *")
    public static void main(String[] args) throws IOException {
        FileOutputStream weatherToday = new FileOutputStream("weatherToday.txt");

        String url = "https://api.openweathermap.org/data/2.5/onecall?lat=59&lon=30&exclude=1586468027&appid=57e839140068ddde69d9c9550fac3718";

        URL obj = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

        connection.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        System.out.println(response.toString());
        weatherToday.write(Integer.parseInt(response.toString()));

    }
}

