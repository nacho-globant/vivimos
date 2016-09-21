package vivimos.janssen.com.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import vivimos.janssen.com.R;
import vivimos.janssen.com.mvp.model.DrawerModel;
import vivimos.janssen.com.mvp.presenter.DrawerPresenter;
import vivimos.janssen.com.mvp.view.DrawerView;
import vivimos.janssen.com.utils.BusProvider;

public class DrawerBaseActivity extends AppCompatActivity {

    private DrawerPresenter drawerPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        createDrawerPresenter();
    }

    private void createDrawerPresenter() {
        if (drawerPresenter == null) {
            DrawerModel drawerModel = new DrawerModel(getResources(), BusProvider.getInstance());
            DrawerView drawerView = new DrawerView(this, BusProvider.getInstance(), drawerModel.getmNavItems());
            drawerPresenter = new DrawerPresenter(
                    drawerModel,
                    drawerView,
                    BusProvider.getInstance()
            );
        }
    }
    @Override
    protected void onResume() {
        super.onResume();
        BusProvider.register(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        BusProvider.unregister(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        BusProvider.unregister(drawerPresenter);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Pass the event to ActionBarDrawerToggle
        // If it returns true, then it has handled
        // the nav drawer indicator touch event
        if (drawerPresenter.getDrawerToggle().onOptionsItemSelected(item)) {
            return true;
        }

        // Handle your other action bar items...

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerPresenter.getDrawerToggle().syncState();
    }
}
