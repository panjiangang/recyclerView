package panjiangang.bwie.com.lianxi2;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * Created by muhanxi on 17/11/8.
 */

public class IApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ImageLoaderConfiguration configuration =
                new ImageLoaderConfiguration.Builder(this).build();
        ImageLoader.getInstance().init(configuration );

    }
}
