
package PPTI15.Ngide.Ngide2;

import java.io.*;
import java.net.URLEncoder;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;
import java.lang.*;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class okw {

public static void tanyadokternya(String prompt) {
        try {
            String url = "https://api.openai.com/v1/engines/davinci-codex/completions";
            // String url = "https://api.openai.com/v1/completions";
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            // add request header
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Authorization", "Bearer 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");

            // String prompt="apa obat untuk Pilek, Batuk, Flu, Pusing";

            // Send post request
            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes("{\r\n  \"prompt\": \"" + prompt + "\",\r\n  \"temperature\": 0.5,\r\n  \"max_tokens\": 200,\r\n  \"top_p\": 1,\r\n  \"frequency_penalty\": 0,\r\n  \"presence_penalty\": 0\r\n \"model\": text-davinci-003\r\n }");
            wr.flush();
            wr.close();

            int responseCode = con.getResponseCode();
            // System.out.println(responseCode);
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            String Pesan=response.toString();
            // System.out.println(Pesan);
            String[] parts = Pesan.split("\"text\":\"");
            int index = parts[1].indexOf(",\"index");
            // int lpo=parts[1].

            String[] charsToReplace = { "\\n", "#", "[", "]", "(", ")", ":", ",", ".", "!", "?", ";", "\"","\\","'"};
            String modified = parts[1].substring(0, index);
            for (String charToReplace : charsToReplace) {
                modified = modified.replace(charToReplace, " ");
            }

            System.out.println(modified);

            // // for (int i = 0; i < parts.length; i++) {
            //         String[] parts2 = parts[2].split(":");
            //         String[] parts3 = parts2[1].split("\n");
            //         System.out.println(parts3[0]);
            //     // }

            // System.out.println(response.capacity());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
// Pastikan untuk mengganti "YOUR_API_KEY" dengan kunci API yang Anda miliki. Kode di atas mengirimkan request ke API Chat GPT dengan prompt "What is the capital of France?" dan mencetak respon yang diterima dari server.  

// public static void tanyadokternya() {
//     try {
//         URL url = new URL("https://api.openai.com/v1/completions");
//         HttpURLConnection con = (HttpURLConnection) url.openConnection();

//         // Set request properties
//         con.setRequestMethod("POST");
//         con.setRequestProperty("Content-Type", "application/json");
//         con.setRequestProperty("Authorization", "Bearer " + System.getenv("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"));

//         // Set request body
//         Map<String, Object> requestBody = new HashMap<>();
//         requestBody.put("model", "text-davinci-003");
//         requestBody.put("prompt", "president pertama indonesia adalah");
//         requestBody.put("temperature", 0.7);
//         requestBody.put("max_tokens", 256);
//         requestBody.put("top_p", 1);
//         requestBody.put("frequency_penalty", 0);
//         requestBody.put("presence_penalty", 0);

//         con.setDoOutput(true);
//         DataOutputStream out = new DataOutputStream(con.getOutputStream());
//         out.writeBytes(requestBody.toString());
//         out.flush();
//         out.close();

//         // Get response
//         BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//         String inputLine;
//         StringBuffer response = new StringBuffer();
//         while ((inputLine = in.readLine()) != null) {
//             response.append(inputLine);
//         }
//         in.close();

//         // Print response
//         System.out.println(response.toString());
//     } catch (Exception e) {
//         e.printStackTrace();
//     }
// }

// }

