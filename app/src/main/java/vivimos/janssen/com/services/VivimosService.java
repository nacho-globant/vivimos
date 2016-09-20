package vivimos.janssen.com.services;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import vivimos.janssen.com.services.response.RegisterPSPResponse;
import vivimos.janssen.com.utils.ServiceUtils;

public class VivimosService {

    public void registerPatientPSP() {
        Call<RegisterPSPResponse> call = ServiceUtils.getApi().registerPatientPSP();
        call.enqueue(new Callback<RegisterPSPResponse>() {
            @Override public void onResponse(Call<RegisterPSPResponse> call, Response<RegisterPSPResponse> response) {

            }

            @Override public void onFailure(Call<RegisterPSPResponse> call, Throwable t) {

            }
        });
    }

}
