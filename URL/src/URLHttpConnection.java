import okhttp3.*;

import java.io.IOException;

public class URLHttpConnection {


    private final OkHttpClient httpClient = new OkHttpClient();

    public static void main(String[] args) throws Exception {

        URLHttpConnection obj = new URLHttpConnection();

        System.out.println("Testing 1 - Send Http GET request");
        obj.sendGet();

        System.out.println("Testing 2 - Send Http POST request");
        obj.sendPost();

    }

    private void sendGet() throws Exception {

        Request request = new Request.Builder()
                .url("https://www.google.com/search?q=familysearch")
                .addHeader("custom-key", "familysearch")
                .addHeader("User-Agent", "OkHttp Bot")
                .build();

        try (Response response = httpClient.newCall(request).execute()) {

            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);


            System.out.println(response.body().string());
        }

    }

    private void sendPost() throws Exception {


        RequestBody formBody = new FormBody.Builder()
                .add("username", "moscosohd")
                .add("password", "62kiwitube62")
                .add("custom", "secret")
                .build();

        Request request = new Request.Builder()
                .url("https://ident.familysearch.org/cis-web/oauth2/v3/authorization?client_secret")
                .addHeader("User-Agent", "OkHttp Bot")
                .post(formBody)
                .build();

        try (Response response = httpClient.newCall(request).execute()) {

            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);


            System.out.println(response.body().string());
        }

    }

}