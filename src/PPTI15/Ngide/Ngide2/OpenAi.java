package PPTI15.Ngide.Ngide2;
import java.io.*;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OpenAi {
    private final static String API_KEY = "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";
    private final static String ENDPOINT = "https://api.openai.com/v1/engines/davinci-codex/completions";

    public static void generateResponse() {
        try {
            OkHttpClient client = new OkHttpClient().newBuilder().build();
            MediaType mediaType = MediaType.parse("application/json");
            RequestBody body = RequestBody.create(mediaType, "{\r\n  \"prompt\": \"sebutkan 1 nama rendom\",\r\n  \"temperature\": 0.28,\r\n  \"max_tokens\": 3406,\r\n  \"top_p\": 1,\r\n  \"frequency_penalty\": 0,\r\n  \"presence_penalty\": 0\r\n}");
            Request request = new Request.Builder()
                .url("https://api.openai.com/v1/engines/davinci-codex/completions")
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", "Bearer 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")
                .build();
            Response response = client.newCall(request).execute();
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }    
    }
}