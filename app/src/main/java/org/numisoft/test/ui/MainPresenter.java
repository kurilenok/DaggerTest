package org.numisoft.test.ui;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import org.numisoft.test.DaggerApplication;
import org.numisoft.test.model.DataSource;

import javax.inject.Inject;

/**
 * Created by kurilenok on 8/25/17.
 */

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {

    @Inject
    DataSource dataSource;

    MainPresenter() {
        DaggerApplication.getDaggerComponent().inject(this);
    }

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().changeToTabThree();
        getViewState().changeText(dataSource.getLastName());
        System.out.println(dataSource.getFirstName());

    }
}
