package com.example.retrofitUpbitTest;
/*
    Retrofit 클라이언트 파일

    RetrofitUpbitTest 인터페이스를 가져와 클래스를 생성
 */
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit;

    private RetrofitClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.upbit.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static RetrofitUpbitTest getInstance() {
        if (retrofit == null) {
            new RetrofitClient();
        }
        return retrofit.create(RetrofitUpbitTest.class);
    }
}

