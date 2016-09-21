package vivimos.janssen.com.mvp.model;

import android.content.res.Resources;

import com.squareup.otto.Bus;

import java.util.ArrayList;

import vivimos.janssen.com.R;
import vivimos.janssen.com.adapters.NavItem;

public class DrawerModel {

    ArrayList<NavItem> mNavItems = new ArrayList<NavItem>();
    private Bus bus;

    public DrawerModel(Resources res, Bus bus) {
        this.bus = bus;
        populateDrawerList(res);
    }

    public ArrayList<NavItem> getmNavItems() {
        return mNavItems;
    }

    private void populateDrawerList(Resources res) {
        mNavItems.add(new NavItem(res.getString(R.string.drawer_request), R.mipmap.ic_launcher));
        mNavItems.add(new NavItem(res.getString(R.string.drawer_contact), R.mipmap.ic_launcher));
        mNavItems.add(new NavItem(res.getString(R.string.drawer_following), R.mipmap.ic_launcher));
        mNavItems.add(new NavItem(res.getString(R.string.drawer_medicine), R.mipmap.ic_launcher));
        mNavItems.add(new NavItem(res.getString(R.string.drawer_warning), R.mipmap.ic_launcher));
        mNavItems.add(new NavItem(res.getString(R.string.drawer_privacy), R.mipmap.ic_launcher));
        mNavItems.add(new NavItem(res.getString(R.string.drawer_logout), R.mipmap.ic_launcher));
    }



}
