package vivimos.janssen.com.vivimos.mvp.presenter;

import android.app.Activity;
import android.content.Intent;

import vivimos.janssen.com.vivimos.activities.ConfirmationActivity;
import vivimos.janssen.com.vivimos.mvp.model.LoginModel;
import vivimos.janssen.com.vivimos.mvp.view.LoginView;

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

        if (!model.isValidUser(user, password)) {

            view.showError();
            return;
        }

        Intent intent = new Intent(activity, ConfirmationActivity.class);
        activity.startActivity(intent);
    }
}
