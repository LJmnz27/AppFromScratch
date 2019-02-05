package org.pursuit.appfromscratch020419;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.pursuit.appfromscratch020419.models.Planet;
import org.pursuit.appfromscratch020419.models.Planets;
import org.pursuit.appfromscratch020419.network.PlanetService;
import org.pursuit.appfromscratch020419.network.RetrofitSingleton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit retrofit = RetrofitSingleton.getInstance();
        PlanetService planetService = retrofit.create(PlanetService.class);
        Call<Planets> planetsCall = planetService.getPlanets();
        planetsCall.enqueue(new Callback<Planets>() {
            @Override
            public void onResponse(Call<Planets> call, Response<Planets> response) {

            }

            @Override
            public void onFailure(Call<Planets> call, Throwable t) {

            }
        });
    }


}
