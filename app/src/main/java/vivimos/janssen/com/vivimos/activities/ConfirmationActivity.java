package vivimos.janssen.com.vivimos.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;
import vivimos.janssen.com.vivimos.R;
import vivimos.janssen.com.vivimos.mvp.model.ConfirmationModel;
import vivimos.janssen.com.vivimos.mvp.presenter.ConfirmationPresenter;
import vivimos.janssen.com.vivimos.mvp.view.ConfirmationView;

public class ConfirmationActivity extends AppCompatActivity {

    ConfirmationPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);
        ButterKnife.bind(this);
        createPresenter();
    }

    private void createPresenter() {
        if (presenter == null) {
            presenter = new ConfirmationPresenter(new ConfirmationModel(), new ConfirmationView(this));
        }
    }

    @OnClick(R.id.continue_button)
    public void onLoginClick() {
        presenter.continueClick();
    }
}
