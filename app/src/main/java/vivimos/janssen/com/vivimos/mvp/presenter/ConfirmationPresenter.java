package vivimos.janssen.com.vivimos.mvp.presenter;

import vivimos.janssen.com.vivimos.mvp.model.ConfirmationModel;
import vivimos.janssen.com.vivimos.mvp.view.ConfirmationView;

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
