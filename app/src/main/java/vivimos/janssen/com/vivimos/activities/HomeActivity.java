package vivimos.janssen.com.vivimos.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import timber.log.Timber;
import vivimos.janssen.com.vivimos.R;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.activity_home) TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        Timber.d(textView.getText().toString());

    }
}
