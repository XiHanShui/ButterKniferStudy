package com.learn.butterknife;

import android.support.annotation.UiThread;
/**
* Author: WJ
* Date: 2018/8/5
* Description: 解绑
* VersionCode: 1.0
*/

public interface Unbinder {
    @UiThread
    void unbind();

    Unbinder EMPTY = new Unbinder() {
        @Override
        public void unbind() {
        }
    };
}
