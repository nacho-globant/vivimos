package vivimos.janssen.com.mvp.presenter;

import vivimos.janssen.com.mvp.model.ConfirmationModel;
import vivimos.janssen.com.mvp.view.ConfirmationView;

public class ConfirmationPresenter {
    ConfirmationModel model;
    ConfirmationView view;

    public ConfirmationPresenter(ConfirmationModel model, ConfirmationView view) {
        this.model = model;
        this.view = view;
    }

    public void continueClick() {
        view.showConfirmationMessage();
    }
}
