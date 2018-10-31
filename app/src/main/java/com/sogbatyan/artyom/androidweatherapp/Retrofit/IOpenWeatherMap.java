package com.sogbatyan.artyom.androidweatherapp.Retrofit;

import com.sogbatyan.artyom.androidweatherapp.Model.WeatherResult;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IOpenWeatherMap {
    @GET("weather")
    Observable<WeatherResult> getWeatheByLatLng(@Query("lat") String lat,
                                                @Query("lon") String lng,
                                                @Query("appid") String appid,
                                                @Query("units") String unit);
}
