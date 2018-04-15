package com.leqienglish.mybook.controller;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.leqienglish.mybook.R;
import com.leqienglish.mybook.sf.LQService;
import com.leqienglish.mybook.util.LQHandler;

/**
 * Created by zhuqing on 2017/8/19.
 */

public class SecondViewController extends Controller<View> {
    private TextView textView;
    private Button button;
    public SecondViewController(View fragment) {
        super(fragment);
    }

    @Override
    public void init() {

    }
}
