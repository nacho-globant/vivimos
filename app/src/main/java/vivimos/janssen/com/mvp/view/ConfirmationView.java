package vivimos.janssen.com.mvp.view;


import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import vivimos.janssen.com.R;

public class ConfirmationView extends ActivityView {

    @BindView(R.id.confirmation_message) TextView confirmationMessage;
    @BindView(R.id.perfil_image) ImageView perfilImageView;
    @BindView(R.id.email_textview) TextView emailTextView;
    @BindView(R.id.email_edittext) EditText emailEditView;


    public ConfirmationView(AppCompatActivity activity) {
        super(activity);
        ButterKnife.bind(this, activity);
    }


    public void showConfirmationMessage() {
        confirmationMessage.setVisibility(View.VISIBLE);
        perfilImageView.setVisibility(View.GONE);
        emailTextView.setVisibility(View.GONE);
        emailEditView.setVisibility(View.GONE);

    }
}
