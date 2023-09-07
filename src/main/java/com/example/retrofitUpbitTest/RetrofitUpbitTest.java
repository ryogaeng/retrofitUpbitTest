package com.example.retrofitUpbitTest;

/*
    Retrofit 인터페이스 파일

    업비트 API의 endpoint, 요청 메서드를 정의하는 인터페이스
    -> API호출을 위한 인터페이스를 정의
 */
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface RetrofitUpbitTest {
    @GET("v1/market/all")
    Call<List<MarketInfo>> getMarketInfo();

}
