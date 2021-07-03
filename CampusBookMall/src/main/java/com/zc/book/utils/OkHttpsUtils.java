package com.zc.book.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class OkHttpsUtils {
    public static String doGet(String url) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                return response.body().string();
            } else {
                throw new IOException("Unexpected code " + response);
            }
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(doGet("http:127.0.0.1:8080/web" +
                    "/user/queryEvaluation?pageNum=1&pageSize=10"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
