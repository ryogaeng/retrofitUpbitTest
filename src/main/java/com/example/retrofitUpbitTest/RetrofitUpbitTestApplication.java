package com.example.retrofitUpbitTest;

import com.example.retrofitUpbitTest.MarketInfo;
import com.example.retrofitUpbitTest.RetrofitClient;
import com.example.retrofitUpbitTest.RetrofitUpbitTest;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

//@SpringBootApplication
public class RetrofitUpbitTestApplication {

	public static void main(String[] args) {
//		SpringApplication.run(RetrofitUpbitTestApplication.class, args);

		// Retrofit 클라이언트 인스턴스 가져오기
		RetrofitUpbitTest retrofitUpbitTest = RetrofitClient.getInstance();

		// API 호출
		Call<List<MarketInfo>> call = retrofitUpbitTest.getMarketInfo();

		try {
			Response<List<MarketInfo>> response = call.execute();
			if (response.isSuccessful()) {
				List<MarketInfo> marketInfoList = response.body();
				// 데이터 처리
				for (MarketInfo marketInfo : marketInfoList) {
					System.out.println("Market: " + marketInfo.getMarket());
					System.out.println("Korean Name: " + marketInfo.getKorean_name());
					System.out.println("English Name: " + marketInfo.getEnglish_name());
				}
			} else {
				System.err.println("API 호출 실패: " + response.code() + " - " + response.message());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

