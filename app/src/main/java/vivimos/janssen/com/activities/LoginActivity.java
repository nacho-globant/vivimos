package vivimos.janssen.com.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;
import vivimos.janssen.com.R;
import vivimos.janssen.com.mvp.model.LoginModel;
import vivimos.janssen.com.mvp.presenter.LoginPresenter;
import vivimos.janssen.com.mvp.view.LoginView;

public class LoginActivity extends AppCompatActivity {

    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        createPresenter();
    }

    private void createPresenter() {
        if (presenter == null) {
            presenter = new LoginPresenter(new LoginView(this), new LoginModel());
        }
    }

    @OnClick(R.id.login_button)
    public void onLoginClick() {
        presenter.login();
    }
}
