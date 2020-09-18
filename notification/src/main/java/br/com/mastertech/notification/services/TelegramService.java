package br.com.mastertech.notification.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

@Service
public class TelegramService {

    @Value("${pixbot.url}")
    private static String urlString;

    @Value("${pixbot.api.token}")
    private static String apiToken;

    public void pixTelegramBotSendMessage(String message) throws IOException {
        ApiContextInitializer.init();

        TelegramBotsApi botsApi = new TelegramBotsApi();

        //Add chatId (given chatId is fake)
        String chatId = "405985684";

        urlString = String.format(urlString, apiToken, chatId, message);

        try {
            URL url = new URL(urlString);
            URLConnection conn = url.openConnection();
            InputStream is = new BufferedInputStream(conn.getInputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String inputLine = "";
            StringBuilder sb = new StringBuilder();
            while ((inputLine = br.readLine()) != null) {
                sb.append(inputLine);
            }
            String response = sb.toString();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
