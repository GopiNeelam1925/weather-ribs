package me.niccorder.weather.data.remote.api

import io.reactivex.Flowable
import me.niccorder.weather.BuildConfig
import me.niccorder.weather.data.remote.model.Location
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Our [retrofit2.Retrofit] REST api contract. Retrofit2 will generate the code necessary to allow
 * us to easily hit an endpoint.
 */
interface LocationApi {

    /**
     * Get's human readable information pertaining to the given zip code.
     */
    @GET("/rest/${BuildConfig.LOCATION_API_KEY}/info.json/{zip}/degrees")
    fun getLocationInfo(
            @Path("zip") zipCode: String
    ): Flowable<Location>
}