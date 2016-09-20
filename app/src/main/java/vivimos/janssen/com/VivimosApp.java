package vivimos.janssen.com;

import android.app.Application;

import timber.log.Timber;


public class VivimosApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initTimber();
    }

    private void initTimber() {
        Timber.plant(new Timber.DebugTree());
        Timber.d("On create");
    }
}
