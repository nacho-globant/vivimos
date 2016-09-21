package vivimos.janssen.com.mvp.presenter;

import android.support.v7.app.ActionBarDrawerToggle;

import com.squareup.otto.Bus;

import vivimos.janssen.com.mvp.model.DrawerModel;
import vivimos.janssen.com.mvp.view.DrawerView;

public class DrawerPresenter {

    private DrawerModel model;
    private DrawerView view;
    private Bus bus;

    public DrawerPresenter(DrawerModel model, DrawerView view, Bus bus) {
        this.model = model;
        this.view = view;
        this.bus = bus;
    }

    public ActionBarDrawerToggle getDrawerToggle() {
        return view.getDrawerToggle();
    }

}
