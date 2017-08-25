package org.numisoft.test.inject;

import org.numisoft.test.model.DataSource;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by kurilenok on 8/25/17.
 */

@Module
public class AppModule {

    @Singleton
    @Provides
    public DataSource provideDataSource() {
        return new DataSource();
    }

}
