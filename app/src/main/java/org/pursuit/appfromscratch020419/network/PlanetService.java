package org.pursuit.appfromscratch020419.network;

import org.pursuit.appfromscratch020419.models.Planet;
import org.pursuit.appfromscratch020419.models.Planets;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PlanetService {
    @GET("JDVila/storybook/master/planets.json")
    Call<Planets> getPlanets();

    @GET("api/breed/{type}/images/random")
    Call<Planet> getPlanetImage(@Path("type") String image);
}
