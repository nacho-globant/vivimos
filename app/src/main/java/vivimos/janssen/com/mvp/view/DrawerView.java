package vivimos.janssen.com.mvp.view;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.squareup.otto.Bus;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import vivimos.janssen.com.R;
import vivimos.janssen.com.adapters.DrawerListAdapter;
import vivimos.janssen.com.adapters.NavItem;

public class DrawerView extends  ActivityView {

    @BindView(R.id.navList) ListView drawerList;
    @BindView(R.id.drawerPane) RelativeLayout drawerPane;
    @BindView(R.id.drawerLayout)  DrawerLayout drawerLayout;

    private  ActionBarDrawerToggle drawerToggle;
    private Bus bus;

    public DrawerView(AppCompatActivity activity, final Bus bus, ArrayList<NavItem> mNavItems) {
        super(activity);
        this.bus = bus;

        ButterKnife.bind(this, activity);
        initToolbar(activity, mNavItems);
    }

    public ActionBarDrawerToggle getDrawerToggle() {
        return drawerToggle;
    }

    public void initToolbar(final AppCompatActivity activity, final ArrayList<NavItem> mNavItems) {
        DrawerListAdapter adapter = new DrawerListAdapter(activity, mNavItems);
        drawerList.setAdapter(adapter);

        // Drawer Item click listeners
        drawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                selectItemFromDrawer(activity, mNavItems, position);
            }
        });

        drawerToggle = new ActionBarDrawerToggle(
                activity,                  /* host Activity */
                drawerLayout,         /* DrawerLayout object */
                R.string.drawer_open,  /* "open drawer" description */
                R.string.drawer_close  /* "close drawer" description */
        );

        // Set the drawer toggle as the DrawerListener
        drawerLayout.addDrawerListener(drawerToggle);
    }

    /*
    * Called when a particular item from the navigation drawer
    * is selected.
    * */
    private void selectItemFromDrawer(AppCompatActivity activity, ArrayList<NavItem> mNavItems, int position) {
        //   Intent intent = new Intent(this, HomeActivity.class);
        // startActivity(intent);

        drawerList.setItemChecked(position, true);
        activity.setTitle(mNavItems.get(position).getTitle());

        // Close the drawer
        drawerLayout.closeDrawer(drawerPane);
    }
}
