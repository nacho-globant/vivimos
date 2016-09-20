package vivimos.janssen.com.utils;


import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import vivimos.janssen.com.BuildConfig;
import vivimos.janssen.com.services.api.VivimosApi;

public final class ServiceUtils {

    private ServiceUtils() {
    }

    public static VivimosApi getApi() {
        final OkHttpClient.Builder builder = new OkHttpClient().newBuilder()
                .readTimeout(BuildConfig.READ_TIMEOUT, TimeUnit.SECONDS)
                .connectTimeout(BuildConfig.CONNECT_TIMEOUT, TimeUnit.SECONDS);
        OkHttpClient client = builder.build();
        final Retrofit retrofit = new Retrofit.Builder().
                baseUrl(BuildConfig.API_URL).
                addConverterFactory(GsonConverterFactory.create()).
                client(client)
                .build();
        return retrofit.create(VivimosApi.class);
    }
}
