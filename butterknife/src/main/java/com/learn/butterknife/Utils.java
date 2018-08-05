package com.learn.butterknife;

import android.app.Activity;
import android.view.View;

/**
* Author: WJ
* Date: 2018/8/5
* Description: view
* VersionCode: 1.0
*/

public class Utils {
    public static final <T extends View> T findViewById(Activity activity, int viewId) {
        return (T) activity.findViewById(viewId);
    }
}
