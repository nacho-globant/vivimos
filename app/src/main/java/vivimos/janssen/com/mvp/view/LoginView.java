package vivimos.janssen.com.mvp.view;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import vivimos.janssen.com.R;

public class LoginView extends ActivityView {
    @BindView(R.id.forget_pass_textview) TextView forgetPassTextView;
    @BindView(R.id.user_edittext) EditText userEditText;
    @BindView(R.id.pass_edittext) EditText passEditText;

    public LoginView(AppCompatActivity activity) {
        super(activity);
        ButterKnife.bind(this, activity);
    }


    public String getUser() {
        return userEditText.getText().toString();
    }

    public String getPassword() {
        return passEditText.getText().toString();
    }

    public void showError() {
        final Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        Toast.makeText(activity, R.string.login_error, Toast.LENGTH_SHORT).show();
    }
}
