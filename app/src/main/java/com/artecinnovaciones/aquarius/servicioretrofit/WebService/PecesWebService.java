package com.artecinnovaciones.aquarius.servicioretrofit.WebService;

import com.artecinnovaciones.aquarius.objetos.Peces;
import com.artecinnovaciones.aquarius.servicioretrofit.constants.ConstantsService;
import com.artecinnovaciones.aquarius.servicioretrofit.modelresponse.PecesResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;

/**
 * Created by Geovany.Chin on 23/06/2016.
 */
public interface PecesWebService {

    @GET(ConstantsService.GET.VALIDATE_LOGIN)
        // void getListPeces(Callback<PecesResponse>peces);
        // Call<PecesResponse> getListPeces();
    Call<PecesResponse> getListPeces();
}
