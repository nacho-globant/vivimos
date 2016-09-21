package vivimos.janssen.com.mvp.presenter;

import android.app.Activity;
import android.content.Intent;

import vivimos.janssen.com.activities.DrawerBaseActivity;
import vivimos.janssen.com.mvp.model.LoginModel;
import vivimos.janssen.com.mvp.view.LoginView;

public class LoginPresenter {

    LoginView view;
    LoginModel model;

    public LoginPresenter(LoginView view, LoginModel model) {
        this.view = view;
        this.model = model;
    }

    public void login() {
        final Activity activity = view.getActivity();
        if (activity == null) {
            return;
        }
        final String user = view.getUser();
        final String password = view.getPassword();

        //TODO change this verification just to change the user pass screen
      /*  if (!model.isValidUser(user, password)) {

            view.showError();
            return;
        }*/

        Intent intent = new Intent(activity, DrawerBaseActivity.class);
        activity.startActivity(intent);
    }
}
