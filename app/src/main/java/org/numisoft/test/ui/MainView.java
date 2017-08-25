package org.numisoft.test.ui;

import com.arellomobile.mvp.MvpView;

/**
 * Created by kurilenok on 8/25/17.
 */

public interface MainView extends MvpView {

    void changeToTabThree();

    void changeText(String lastName);
}
