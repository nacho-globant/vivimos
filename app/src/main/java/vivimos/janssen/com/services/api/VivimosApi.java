package vivimos.janssen.com.services.api;

import retrofit2.Call;
import retrofit2.http.POST;
import vivimos.janssen.com.services.response.RegisterPSPResponse;

public interface VivimosApi {


    @POST("")
    Call<RegisterPSPResponse> registerPatientPSP();
}
