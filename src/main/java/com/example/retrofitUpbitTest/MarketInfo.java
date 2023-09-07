package com.example.retrofitUpbitTest;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MarketInfo {
    /*
    JSON 반환된 데이터의 키값을 모델 클래스 작성 시 변경하고 싶으면
    @SerializedName을 사용하면 된다!

    @SerializedName("market")
    private String market;

    @SerializedName("korean_name")
    private String koreanName;

    @SerializedName("english_name")
    private String englishName;
    */

    private String market;
    private String korean_name;
    private String english_name;
}

