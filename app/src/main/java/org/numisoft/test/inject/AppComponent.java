package org.numisoft.test.inject;

import org.numisoft.test.ui.MainPresenter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by kurilenok on 8/25/17.
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(MainPresenter presenter);

}
