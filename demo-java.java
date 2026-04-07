// 引入依赖
// implementation 'com.squareup.okhttp3:okhttp:4.12.0'

import okhttp3.*;
import com.google.gson.Gson;

public class ChatApiDemo {
    public static void main(String[] args) {
        String url = "https://chat-completion.p.rapidapi.com/chat/completions";
        Gson gson = new Gson();
        
        RequestBody body = RequestBody.create(
            gson.toJson(new Request("DeepSeek-R1-Distill-Qwen-7B", new Message[]{new Message("user", "Hello")})),
            MediaType.get("application/json; charset=utf-8")
        );

        Request request = new Request.Builder()
            .url(url)
            .addHeader("X-API-Key", "YOUR_RAPIDAPI_KEY")
            .addHeader("X-RapidAPI-Host", "chat-completion.p.rapidapi.com")
            .post(body)
            .build();

        try (Response response = new OkHttpClient().newCall(request).execute()) {
            System.out.println(response.body().string());
        } catch (Exception e) { e.printStackTrace(); }
    }
}

class Request {
    public String model;
    public Message[] messages;
    public Request(String m, Message[] msgs) { model = m; messages = msgs; }
}
class Message {
    public String role, content;
    public Message(String r, String c) { role = r; content = c; }
}
